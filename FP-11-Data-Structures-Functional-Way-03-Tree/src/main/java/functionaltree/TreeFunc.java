package functionaltree;

import java.util.stream.StreamSupport;

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

    private TreeFunc(TreeFunc<E> left, E value, TreeFunc<E> right) {
        this.left = left;
        this.value = value;
        this.right = right;
        this.size = 1 + this.left.size + this.right.size;
        this.height = 1 + Math.max(this.left.height, this.right.height);
    }

    @SafeVarargs
    public static <E extends Comparable<E>> TreeFunc<E> tree(E...es){
        TreeFunc<E> tree = NIL;
        for (int i = 0; i < es.length; i++){
            tree = tree.insert(es[i]);
        }
        return tree;
    }

    private TreeFunc<E> insert(E newValue){
        return isEmpty() ? new TreeFunc<E>(NIL, newValue, NIL)
                : newValue.compareTo(this.value) < 0 ? new TreeFunc<E>(left.insert(newValue), this.value, this.right)
                    : newValue.compareTo(this.value) > 0 ? new TreeFunc<E>(this.left, this.value, right.insert(newValue))
                        : new TreeFunc<E>(this.left, newValue, this.right);
    }

    private boolean isEmpty(){
        return size == 0 ? true : false;
    }

    public String toString(){
        return String.format("( %s %s %s )", left, value, right);
    }


}
