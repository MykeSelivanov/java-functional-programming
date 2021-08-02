package functionaltree;

@SuppressWarnings("rawtypes")
public class TreeFunc<E extends Comparable<E>> {

    private final E value;
    private final TreeFunc<E> left;
    private final TreeFunc<E> right;
    public int size;
    public int height;

    private static final TreeFunc NIL = new TreeFunc();

    @SuppressWarnings("unchecked")
    private TreeFunc() {
        value = null;
        left = NIL;
        right = NIL;
        size = 0;
        height = -1;
    }


}
