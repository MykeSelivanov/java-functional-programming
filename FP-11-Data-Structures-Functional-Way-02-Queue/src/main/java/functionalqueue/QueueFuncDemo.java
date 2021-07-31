package functionalqueue;

public class QueueFuncDemo {
    public static void main(String[] args) {

        QueueFunc<String> q = QueueFunc.queue();

        QueueFunc<String> queueElements = q.enqueue("Hello").enqueue("World").enqueue("Test").enqueue("Functional").enqueue("Queue");
        queueElements.forEach(System.out::println);

        System.out.println("-----------------");

        QueueFunc<String> dequeueElements = queueElements.dequeue();
        dequeueElements.forEach(System.out::println);

        System.out.println("-----------------");

        System.out.println(dequeueElements.peek());

        System.out.println("-----------------");

        System.out.println(dequeueElements.isEmpty());

        System.out.println("-----------------");

        System.out.println(dequeueElements.size());

    }
}
