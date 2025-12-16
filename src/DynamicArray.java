public class DynamicArray {
    private int size;
    private int capacity;
    private Object[] data;

    public DynamicArray() {
        this.size = 0;
        this.capacity = 5;
        data = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public void add(Object element) {
        if (size == capacity) {
            grow();
        }
        data[size] = element;
        size++;
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) { return; }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void removeLast() {
        data[size - 1] = null;
        size--;
    }

    public Object get(int index) {
        return data[index];
    }

    private void grow() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = data[i];
        }
        capacity = newCapacity;
        data = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder stringToReturn = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            stringToReturn.append(data[i] + ", ");
        }
        stringToReturn.delete(stringToReturn.length() - 2, stringToReturn.length());
        stringToReturn.append("]");

        return stringToReturn.toString();
    }
}
