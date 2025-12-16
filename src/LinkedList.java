public class LinkedList {
    private int size;
    private LinearNode head, tail;

    public LinkedList() {
        this.size = 0;
        this.head = this.tail = null;
    }

    public void addFirst(Object element) {
        LinearNode node = new LinearNode(element);

        if (isEmpty()) {
            head = tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void addLast(Object element) {
        LinearNode node = new LinearNode(element);

        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
        size++;
    }

    public Object removeFirst() {
        if (isEmpty()) { return null; };

        Object elementToReturn = head.getElement();
        head = head.getNext();
        size--;
        return elementToReturn;
    }

    public Object removeLast() {
        if (isEmpty()) { return null; };

        Object elementToReturn = tail.getElement();
        tail = tail.getPrevious();
        size--;
        return elementToReturn;
    }

    public Object get(int index) {
        if (index > size) {
            return null;
        }
        LinearNode temporaryHead = head;
        for (int i = 0; i < index; i++) {
            temporaryHead = temporaryHead.getNext();
        }
        return temporaryHead.getElement();
    }

    public boolean contains(Object element) {
        if (isEmpty()) { return false; }
        LinearNode temporaryHead = head;
        for (int i = 0; i < size; i++) {
            if (temporaryHead.getElement().equals(element)) {
                return true;
            }
            temporaryHead = temporaryHead.getNext();
        }
        return false;
    }

    public int indexOf(Object element) {
        if (isEmpty()) { return -1; }
        LinearNode temporaryHead = head;
        for (int i = 0; i < size; i++) {
            if (temporaryHead.getElement().equals(element)) {
                return i;
            }
            temporaryHead = temporaryHead.getNext();
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = tail = null;
        size = 0;
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
