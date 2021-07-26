package functionalqueue;

import java.util.Collection;
import java.util.function.Consumer;

public abstract class ListFunc<T> {

    public abstract T head();

    public abstract ListFunc<T> tail();

    public abstract boolean isEmpty();

    @SuppressWarnings("rawtypes")
    public static final ListFunc NIL = new Nil();

    private static class Nil<T> extends ListFunc<T> {
        private Nil() {}

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

    public int length() {
        int l = 0;
        ListFunc<T> temp = this;
        while (!temp.equals(NIL)) {
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

    public static <T> ListFunc<T> list() {
        return NIL;
    }

    public static <T> ListFunc<T> list(T... t) {
        ListFunc<T> temp = list();

        for (int i = t.length - 1; i >= 0; i--) {
            temp = new Const<T>(t[i], temp);
        }
        return temp;
    }

    public ListFunc<T> addElement(T element) {
        return new Const<T>(element, this);
    }

    public void forEach(Consumer<? super T> action) {
        T current = this.head();
        ListFunc<T> temp = this;

        for (int i = 0; i < length(); i++) {
            action.accept(current);
            temp = temp.tail();
            current = temp.head();
        }
    }

    public ListFunc<T> removeElement(T element) {
        if (this.length() == 0) {
            return this;
        } else if (element.equals(this.head())) {
            return tail();
        } else {
            ListFunc<T> newTail = tail().removeElement(element);
            return new Const<T>(head(), newTail);
        }
    }

    public ListFunc<T> reverseList() {
        ListFunc<T> list = list();
        T current = this.head();
        ListFunc<T> temp = this;

        while (!temp.equals(NIL)) {
            list = list.addElement(current);
            temp = temp.tail();
            current = temp.head();
        }
        return list;
    }

    public static <T> ListFunc<T> concat(ListFunc<T> list1, ListFunc<T> list2) {
        return list1.isEmpty()
                ? list2
                : new Const<>(list1.head(), concat(list1.tail(), list2));
    }

    public ListFunc<T> addAllElements(final Collection<? extends T> collection) {
        ListFunc<T> result = this;
        for (T t : collection) {
            result = result.addElement(t);
        }
        return result;
    }
}
