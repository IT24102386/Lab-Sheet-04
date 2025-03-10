import java.util.LinkedList;
import java.util.Queue;

public class QueueArray {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        
        queue.add(10);
        queue.add(20);
        queue.add(30);

        
        System.out.print("Queue elements: ");
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();

        
        int removedElement = queue.poll();
        System.out.println("Removed: " + removedElement);

        
        System.out.print("Queue elements: ");
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();

        
        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        
        System.out.println("Queue Count: " + queue.size());
    }
}


