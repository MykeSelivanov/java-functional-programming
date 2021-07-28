package functionalqueue;

public final class QueueFunc<T> {

    private final ListFunc<T> front;
    private final ListFunc<T> rear;

    private QueueFunc() {
        this.front = ListFunc.list();
        this.rear = ListFunc.list();
    }

    // Empty Queue
    public static <T> QueueFunc<T> queue(){
        return new QueueFunc<T>();
    }

    private QueueFunc(QueueFunc<T> queue, T element){
        boolean frontIsEmpty = queue.front.isEmpty();
        this.front = frontIsEmpty ? queue.front.addElement(element) : queue.front;
        this.rear = frontIsEmpty ? queue.rear : queue.rear.addElement(element);
    }


}
