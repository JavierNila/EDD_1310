package fes.aragon;

public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;

    public Nodo() {
    }

    public Nodo(T valor) {
        this.dato = valor;
    }

    public Nodo(T data, Nodo<T> siguiente) {
        this.dato = data;
        this.siguiente = siguiente;
    }

    public T getData() {
        return dato;
    }

    public void setData(T data) {
        this.dato = data;
    }

    public Nodo<T> getNext() {
        return siguiente;
    }

    public void setNext(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "|" + dato + "| --> ";
    }
}