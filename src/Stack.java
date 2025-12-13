public class Stack {
    private int size;
    private int capacity;
    private Object[] stack;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new Object[capacity];
        this.size = 0;
    }

    public void push(Object value) {
        if (size == capacity) {
            grow();
        }
        stack[size] = value;
        size++;
    }

    public Object pop() {
        if (isEmpty()) return null;
        Object objectToReturn = stack[size - 1];
        stack[size - 1] = null;
        size--;
        return objectToReturn;
    }

    private void grow() {
        int newCapacity = capacity * 2;
        Object[] newStack = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;
    }

    public Object peek() {
        if (isEmpty()) return null;
        return stack[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

       StringBuilder stringToReturn = new StringBuilder("[");

       for (int i = 0; i < size; i++) {
            stringToReturn.append(stack[i] + ", ");
       }

       stringToReturn.delete(stringToReturn.length() - 2, stringToReturn.length());
       stringToReturn.append("]");

       return stringToReturn.toString();
    }
}
