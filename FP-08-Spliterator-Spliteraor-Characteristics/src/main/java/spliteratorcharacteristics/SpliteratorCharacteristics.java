package spliteratorcharacteristics;

import java.util.Spliterator;
import java.util.Spliterators;

public class SpliteratorCharacteristics {
    public static void main(String[] args) {

        /**
         * Spliterator (interface) is a special object, on which a stream is built, used to connect a stream on custom source
         * Spliterator is also used for other sources, like collections
         * Behind the scenes collections already have their own implementations of Spliterator, which used, when stream is created
         * But custom source requires custom implementation
         *
         * Spliterator characteristics are used to define the state of the stream
         * int characteristics() method returns the set of characteristics of the spliterator and its elements
         *
         * Constants below are actual spliterator characteristics from the Spliterator interface
         * These characteristics are used to define the state of a stream
         *  public static final int ORDERED    = 0x00000010; - value is a binary representation of a plain integer
         *  public static final int DISTINCT   = 0x00000001;
         *  public static final int SORTED     = 0x00000004;
         *  public static final int SIZED      = 0x00000040;
         *  public static final int NONNULL    = 0x00000100;
         *  public static final int IMMUTABLE  = 0x00000400;
         *  public static final int CONCURRENT = 0x00001000;
         *  public static final int SUBSIZED = 0x00004000;
         *
         *  int characteristics() { return Spliterator.ORDERED | Spliterator.DISTINCT |
         *                          Spliterator.SORTED | Spliterator.SIZED | Spliterator.SUBSIZED; }
         *
         *  method
         *
         */


    }

}
