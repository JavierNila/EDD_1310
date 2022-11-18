package puntitoextra;

public class StackN<T> {
    private Nodo<T> superior;
    private int largo;

    public StackN() {
    	superior = null;
    	largo = 0;
    }

    public boolean isEmpty() {
        return superior == null && largo == 0;
    }

    public int length() {
        return largo;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        }

        T topValue = superior.getData();
        superior = superior.getNext();
        largo--;
        return topValue;
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }

        return superior.getData();
    }

    public void push(T value) {
    	Nodo<T> newNode = new Nodo<T>(value);
        newNode.setNext(superior);
        superior = newNode;
        largo++;
    }

    @Override
    public String toString() {
        String stackString = "";
        Nodo<T> iteratorNode = superior;
        while(iteratorNode != null){
            stackString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return stackString;
    }
}