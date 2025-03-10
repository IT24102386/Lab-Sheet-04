import java.util.Scanner;

public class CircularQueue {
    int[] queue;
    int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = -1;
        size = 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (rear == -1) { 
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;        }
        queue[rear] = element;
        size++;
    }
    public void dequeue() {
      if (isEmpty()) {
         System.out.println("Queue is empty");
         return;
      }  

      System.out.println("Removing: " + queue[front]); 
      if (front == rear) {
               front = rear = -1;
      } else {
         front = (front + 1) % capacity;
      }
      size--;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the circular queue: ");
        int capacity = scanner.nextInt();

        CircularQueue cq = new CircularQueue(capacity);

     
        for (int i = 0; i < capacity; i++) {
            System.out.print("Enter element to insert: ");
            int element = scanner.nextInt();
            cq.enqueue(element);
        }

        cq.display();
        System.out.print("Enter new element to insert: ");
        int newElement = scanner.nextInt();
        cq.enqueue(newElement);

        cq.dequeue();

      
        System.out.print("Enter another element to insert: ");
        int anotherElement = scanner.nextInt();
        cq.enqueue(anotherElement);

        cq.display();

      
        scanner.close();
    }
}
