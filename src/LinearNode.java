public class LinearNode {
    private LinearNode next;
    private LinearNode previous;
    private Object element;

    public LinearNode() {
        next = null;
        previous = null;
        element = null;
    }

    public LinearNode(Object elem) {
        next = null;
        previous = null;
        element = elem;
    }

    public LinearNode getNext() {
        return next;
    }

    public void setNext(LinearNode node) {
        next = node;
    }

    public LinearNode getPrevious() {
        return previous;
    }

    public void setPrevious(LinearNode node) {
        previous = node;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object elem) {
        element = elem;
    }
}
