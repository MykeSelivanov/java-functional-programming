package customspliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book> {

    private String name;
    private String author;
    private String genre;
    private double rating;
    private Spliterator<String> baseSpliterator;

    public BookSpliterator(Spliterator<String> baseSpliterator) {
        this.baseSpliterator = baseSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Book> action) {
        // call the baseSpliterator which is reading file with data line by line
        if (
        this.baseSpliterator.tryAdvance(name -> this.name = name) &&
        this.baseSpliterator.tryAdvance(author -> this.author = author) &&
        this.baseSpliterator.tryAdvance(genre -> this.genre = genre) &&
        this.baseSpliterator.tryAdvance(rating -> this.rating = Double.valueOf(rating))
        ) {
            // if we're able to read all the data from baseSpliterator, than we can create new Book object
            action.accept(new Book(this.name, this.author, this.genre, this.rating));
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<Book> trySplit() {
        // there is no need to implement this one, unless you want to be able to run in parallel
        return null;
    }

    @Override
    public long estimateSize() {
        // estimate size - is the size of the stream that is going to be created
        // in this example, base spliterator reads line by line = 24 lines, but in order to get one book = 4 lines
        // which means base spliterator seize divided by 4
        return baseSpliterator.estimateSize() / 4;
    }

    @Override
    public int characteristics() {
        // since for this example no plans to change the stream characteristics, you can simply return the ones, that will
        // come form baseSpliterator
        return baseSpliterator.characteristics();
    }


}
