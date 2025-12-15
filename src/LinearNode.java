public class LinearNode {
    private LinearNode next;
    private Object element;

    public LinearNode() {
        next = null;
        element = null;
    }

    public LinearNode(Object elem) {
        next = null;
        element = elem;
    }

    public LinearNode getNext() {
        return next;
    }

    public void setNext(LinearNode node) {
        next = node;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object elem) {
        element = elem;
    }
}
