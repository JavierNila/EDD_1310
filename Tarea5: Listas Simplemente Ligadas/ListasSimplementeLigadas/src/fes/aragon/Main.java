package fes.aragon;

public class Main {
    public static void main(String[] args) {
        Listas<Integer> listaLigada = new Listas<>();
        System.out.println(listaLigada);

       
        System.out.println("La lista esta vacia");
        System.out.println(listaLigada.isEmpty());

       
        System.out.println("\nTamaño");
        System.out.println(listaLigada.getSize());

       
        System.out.println("\nAñade 26");
        listaLigada.addFirst(26);
        System.out.println(listaLigada);
        System.out.println("Añade 44");
        listaLigada.addFirst(44);
        System.out.println(listaLigada);
        System.out.println("Añade 32");
        listaLigada.addFirst(32);
        System.out.println(listaLigada);

       
        System.out.println("\nAñade 28 en el final");
        listaLigada.addLast(28);
        System.out.println(listaLigada);

       
        System.out.println("\nAñade 90 despues de 26");
        listaLigada.addAfter(26, 90);
        System.out.println(listaLigada);

       
        System.out.println("\nElimina en la posicion 3");
        listaLigada.deleteAt(3);
        System.out.println(listaLigada);

      
        System.out.println("\nElimina al inicio");
        listaLigada.deleteStart();
        System.out.println(listaLigada);

      
        System.out.println("\nElimina al final");
        listaLigada.deleteLast();
        System.out.println(listaLigada);

     
        System.out.println("\nBusca el 26");
        System.out.println("Resultado: " + listaLigada.search(26));

        
        System.out.println("\nCambia el 44 a 10");
        listaLigada.update(44, 10);
        System.out.println(listaLigada);
    }
}