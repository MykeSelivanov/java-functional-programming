package functionalqueue;

public final class QueueFunc<T> {

    private final ListFunc<T> front;
    private final ListFunc<T> rear;

    public QueueFunc() {
        this.front = ListFunc.list();
        this.rear = ListFunc.list();

    }


}
