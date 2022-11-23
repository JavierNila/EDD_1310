package fes.aragon;

public class ColaPrioridad<T> {
    private ColaNodo<T>[] colaAcotada;
    private int size, length;

    @SuppressWarnings("unchecked")
	public ColaPrioridad(int size) {
    	colaAcotada = new ColaNodo[size];
        this.size = size;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void enqueue(int priority, T value) {
        if(priority < 0 && priority >= size) {
            throw new IllegalArgumentException("Prioridad entre 0 y " + (size - 1));
        }

        if(colaAcotada[priority] == null) {
        	colaAcotada[priority] = new ColaNodo<T>();
        }

        colaAcotada[priority].enqueue(value);
        length++;
    }

    public T dequeue() {
        if(isEmpty()) {
            return null;
        }

        for(int i = 0; i < size; i++) {
            if(colaAcotada[i] != null && !colaAcotada[i].isEmpty()) {
                length--;
                return colaAcotada[i].dequeue();
            }
        }

        return null;
    }

    public T front() {
        if(isEmpty()) {
            return null;
        }

        for(int i = 0; i < size; i++) {
            if(colaAcotada[i] != null && !colaAcotada[i].isEmpty()) {
                return colaAcotada[i].front();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String queueString = "";
        for(int i = 0; i < size; i++) {
            queueString += i + ": ";
            if (colaAcotada[i] != null && !colaAcotada[i].isEmpty()) {
                queueString += colaAcotada[i] + "\n";
            } else {
                queueString += "null\n";
            }
        }
        return queueString;
    }
}
