/**
 * Daniel Schroeder
 * 4/18/2107
 * Section 201
 * Lab 7
 * version 1
 * Software Developement 1
 */
public class Queue {

  private int size;
  private int[] elements;
  public static final int DEFAULT_CAPACITY = 8;

  public Queue() {
    elements = new int[DEFAULT_CAPACITY];
    this.size = 0;
  }

  public void enQueue(int v) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length *2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    elements[size++] = v;
  }

  public int deQueue() {
    int element = elements[0];
    for (int i = 1; i < elements.length; i++) {
      elements[i-1] = elements[i];
    }
    elements[elements.length - 1] = 0;
    return element;
  }

  public boolean empty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);
    queue.enQueue(4);
    queue.enQueue(5);
    queue.enQueue(6);
    queue.enQueue(7);
    queue.enQueue(8);
    queue.enQueue(9);
    queue.enQueue(10);
    queue.enQueue(11);
    queue.enQueue(12);
    queue.enQueue(13);
    queue.enQueue(14);
    queue.enQueue(15);
    queue.enQueue(16);
    queue.enQueue(17);
    queue.enQueue(18);
    queue.enQueue(19);
    queue.enQueue(20);
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
  }
}
