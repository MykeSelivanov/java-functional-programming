package functionalqueue;

import java.util.function.Consumer;

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

    // enqueue
    public QueueFunc<T> enqueue(T t){
        return new QueueFunc<T>(this, t);
    }

    // dequeue
    private QueueFunc(ListFunc<T> front, ListFunc<T> rear){
        final boolean frontIsEmpty = front.isEmpty();
        this.front = frontIsEmpty ? rear.reverseList() : front;
        this.rear = frontIsEmpty ? front : rear;
    }

    public QueueFunc<T> dequeue() {
        return new QueueFunc<T>(this.front.tail(), rear);
    }

    void forEach(Consumer<? super T> action){
        T current = this.front.head();
        ListFunc<T> temp = ListFunc.concat(this.front.tail(), this.rear.reverseList());
        while(temp != null){
            action.accept(current);
            current = temp.head();
            temp = temp.tail();
        }
    }

    public int size(){
        return front.length() + rear.length();
    }

    public T peek(){
        if(this.size() == 0){
            return null;
        }
        return this.front.head();
    }

    public boolean isEmpty(){
        if(this.front.isEmpty() == this.rear.isEmpty() == true) {
            return true;
        } else {
            return false;
        }
    }



}
