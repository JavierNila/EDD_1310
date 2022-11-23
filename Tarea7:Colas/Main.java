package fes.aragon;

public class Main {
    public static void main(String[] args) throws Exception {
        Cola<Integer> nodeQueue = new Cola<>();
        System.out.println("1");
        nodeQueue.enqueue(1);
        System.out.println("2");
        nodeQueue.enqueue(2);
        System.out.println("3");
        nodeQueue.enqueue(3);
        System.out.println(nodeQueue);
        System.out.println("elementos en cola: " + nodeQueue.length());
        System.out.println("¿esta vacia?: " + nodeQueue.isEmpty());
        System.out.println("elemento al frente: " + nodeQueue.front());
        System.out.println("Quitar elemento: " + nodeQueue.dequeue());
        System.out.println("Quitar elemento: " + nodeQueue.dequeue());
        System.out.println("Quitar elemento: " + nodeQueue.dequeue());
        System.out.println("¿esta vacia?: " + nodeQueue.isEmpty());

        ColaArray<Integer> arrayQueue = new ColaArray<>(5);
        System.out.println("Cola");
        System.out.println("¿esta vacia?: " + arrayQueue.isEmpty());
        System.out.println("elemento(1)");
        arrayQueue.enqueue(1);
        System.out.println("elemento(2)");
        arrayQueue.enqueue(2);
        System.out.println("elemento(3)");
        arrayQueue.enqueue(3);
        System.out.println(arrayQueue);
        System.out.println("elementos en cola: " + arrayQueue.length());
        System.out.println("¿esta vacia?: " + arrayQueue.isEmpty());
        System.out.println("elemento al frente: " + arrayQueue.font());
        System.out.println("Quitar elemento: " + arrayQueue.dequeue());
        System.out.println("Quitar elemento: " + arrayQueue.dequeue());
        System.out.println("Quitar elemento: " + arrayQueue.dequeue());
        System.out.println("¿esta vacia?: " + arrayQueue.isEmpty());
    }
}