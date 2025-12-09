package pr23.Task1;

public interface Queue {
    void enqueue(Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
    void push(Object element);
    Object peek();
    Object remove();
    Queue getNth(int k);
    Queue removeNth(int k);
    void dropNth(int k);
    Object[] toArray();
    String toStr();
}
