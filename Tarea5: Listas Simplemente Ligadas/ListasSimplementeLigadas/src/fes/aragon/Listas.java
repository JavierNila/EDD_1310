package fes.aragon;

public class Listas<T> {
    private Nodo<T> head;

    public Listas() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        int size = 0;
        Nodo<T> aux = head;

        while(aux != null) {
            aux = aux.getNext();
            size++;
        }
        return size;
    }

    public int search(T valor) {
        int indexPosition = 0;
        Nodo<T> iteratorNode = head;
        while(iteratorNode != null){
            if(iteratorNode.getData() == valor) {
                return indexPosition;
            }
            iteratorNode = iteratorNode.getNext();
            indexPosition++;
        }
        return -1;
    }

    public void addLast(T valor) {
        if(isEmpty()) {
            Nodo<T> newNode = new Nodo<>(valor);
            head = newNode;
            return;
        }

        Nodo<T> iteratorNode = head;
        while(iteratorNode.getNext() != null){
            iteratorNode = iteratorNode.getNext();
        }
        Nodo<T> newNode = new Nodo<>(valor);
        iteratorNode.setNext(newNode);
    }

    public void addFirst(T valor) {
        Nodo<T> newNode = new Nodo<>(valor, head);
        head = newNode;
    }

    public void addAfter(T Vreferencia, T valor) {
        if(search(Vreferencia) < 0) return;

        Nodo<T> iteratorNode = head;
        while(iteratorNode.getNext() != null && iteratorNode.getData() != Vreferencia){
            iteratorNode = iteratorNode.getNext();
        }
        Nodo<T> newNode = new Nodo<>(valor, iteratorNode.getNext());
        iteratorNode.setNext(newNode);
    }

    public void deleteAt(int index) {
        if(this.getSize() <= index || isEmpty() || index < 0) return;
        if(index == 0) {
            deleteStart();
            return;
        }

        int indexPosition = 0;
        Nodo<T> prevNode = null;
        Nodo<T> iteratorNode = head;

        while(iteratorNode.getNext() != null && indexPosition < index){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
            indexPosition++;
        }
        prevNode.setNext(iteratorNode.getNext());
    }

    public void deleteStart() {
        if(isEmpty()) return;
        head = head.getNext();
    }

    public void deleteLast() {
        if(isEmpty()) return;
        if(getSize() == 1) {
            deleteStart();
            return;
        }
        Nodo<T> prevNode = null;
        Nodo<T> iteratorNode = head;
        while(iteratorNode.getNext() != null){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        prevNode.setNext(null);
    }

    public void update(T buscar, T valor){
        if(search(buscar) < 0) return;

        Nodo<T> iteratorNode = head;
        while(iteratorNode != null && iteratorNode.getData() != buscar){
            iteratorNode = iteratorNode.getNext();
        }
        if(iteratorNode.getData() != buscar) return;
        iteratorNode.setData(valor);
    }

    @Override
    public String toString() {
        String arrrayListString = "";
        Nodo<T> iteratorNode = head;
        while(iteratorNode != null){
            arrrayListString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return arrrayListString;
    }
}
