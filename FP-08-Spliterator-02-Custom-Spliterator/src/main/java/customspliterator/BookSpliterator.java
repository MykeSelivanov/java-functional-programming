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
        this.baseSpliterator.tryAdvance(name -> this.name = name);
        this.baseSpliterator.tryAdvance(name -> this.name = name);
        this.baseSpliterator.tryAdvance(name -> this.name = name);
        this.baseSpliterator.tryAdvance(name -> this.name = name);
        return false;
    }

    @Override
    public Spliterator<Book> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return 0;
    }

    @Override
    public int characteristics() {
        return 0;
    }


}
