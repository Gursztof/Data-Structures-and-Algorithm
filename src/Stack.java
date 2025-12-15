public class Stack {
    private int size;
    private LinearNode head;

    Stack() {
        this.size = 0;
        this.head = null;
    }

    public void push(Object element) {
        LinearNode node = new LinearNode(element);

        if (isEmpty()) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public Object pop() {
        if (isEmpty()) return null;
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


    public boolean isEmpty() { return size == 0; }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
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
