import java.util.EmptyStackException;

public class Queue {
    private int size;
    private LinearNode head, tail;

    public Queue() {
        size = 0;
        head = null;
        tail = null;
    }

    public void enqueue(Object element) {
        LinearNode node = new LinearNode(element);

        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
        }

        tail = node;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) throw new EmptyStackException();
        Object elementToReturn = head.getElement();
        head = head.getNext();
        size--;
        return elementToReturn;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder stringToReturn = new StringBuilder("[");

        LinearNode temporaryHead = head;

        for (int i = 0; i < size; i++) {
            stringToReturn.append(temporaryHead.getElement() + ", ");
            temporaryHead = temporaryHead.getNext();
        }

        stringToReturn.delete(stringToReturn.length() - 2, stringToReturn.length());
        stringToReturn.append("]");

        return stringToReturn.toString();
    }
}
