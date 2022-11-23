package fes.aragon;

public class Cola<T> {
    private Nodo<T> front;
    private Nodo<T> back;
    private int length;

    public Cola() {
        front = back = null;
        length = 0;
    }

    public boolean isEmpty() {
        return front == null && length == 0;
    }

    public int length() {
        return length;
    }

    public T dequeue() {
        if(isEmpty()) {
            return null;
        }

        if(front == back) {
            back = null;
        }

        T topValue = front.getData();
        front = front.getNext();
        length--;
        return topValue;
    }

    public T front() {
        if(isEmpty()) {
            return null;
        }

        return front.getData();
    }

    public void enqueue(T value) {
        Nodo<T> newNode = new Nodo<T>(value);
        if(isEmpty()) {
            front = back = newNode;
        } else {
            back.setNext(newNode);
            back = newNode;
        }
        length++;
    }

    @Override
    public String toString() {
        String stackString = "";
        Nodo<T> iteratorNode = front;
        while(iteratorNode != null){
            stackString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return stackString;
    }
}