package functionallist;

public abstract class ListFunc<T> {

    public abstract T head();

    public abstract ListFunc<T> tail();

    public int length;

    public abstract boolean isEmpty();

    @SuppressWarnings("rawtypes")
    public static final ListFunc NIL = new Nil();

    private static class Nil<T> extends ListFunc<T> {
        private Nil(){
        };

        @Override
        public T head() {
            return null;
        }

        @Override
        public ListFunc<T> tail() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }
    }

    public int length(){
        int l = 0;
        ListFunc<T> temp = this;
        while(!temp.equals(NIL)) {
            l++;
            temp = temp.tail();
        }
        return l;
    }

    private static class Const<T> extends ListFunc<T> {

        private final T head;
        private final ListFunc<T> tail;

        public Const(T element, ListFunc<T> list) {
            this.head = element;
            this.tail = list;
        }

        @Override
        public T head() {
            return head;
        }

        @Override
        public ListFunc<T> tail() {
            return tail;
        }

        @Override
        public boolean isEmpty() {
            return length() == 0 ? true : false;
        }
    }
}
