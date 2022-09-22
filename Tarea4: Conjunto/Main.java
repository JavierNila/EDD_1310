package fes.aragon.tarea4;

public class Main {
    public static void main(String[] args) {
    	
    Conjuntos<Integer> conjuntos_1 = new Conjuntos();
    Conjuntos<Integer> conjuntos_2 = new Conjuntos();

    
    System.out.println("\nAgrega elementos");
    conjuntos_1.add(0);
    conjuntos_1.add(1);
    conjuntos_1.add(2);
    conjuntos_1.add(3);
    conjuntos_1.add(4);
    conjuntos_2.add(3);
    conjuntos_2.add(4);
    conjuntos_2.add(5);
    conjuntos_2.add(6);
    conjuntos_2.add(7);
    System.out.println("conjuntos_1: " + conjuntos_1);
    System.out.println("conjuntos_2: " + conjuntos_2);

    System.out.println("\nTamaños");
    System.out.println("longitud conjuntos_1: " + conjuntos_1.lenght());
    System.out.println("longitud conjuntos_2: " + conjuntos_2.longitud());

    
    System.out.println("\nContiene");
    System.out.println("conjuntos_1 contiene 0: " + conjuntos_1.contiene(0));
    System.out.println("conjuntos_1 contiene 5: " + conjuntos_1.contiene(5));

   
    System.out.println("\nElimina 0 de conjuntos_1");
    conjuntos_1.eliminar(0);
    System.out.println(conjuntos_1);

  
    System.out.println("\nIgualdad");
    System.out.println("conjuntos_1 == conjuntos_2: " + conjuntos_1.igualA(conjuntos_2));

  
    System.out.println("\nSubconjunto");
    System.out.println("conjuntos_1 subconjunto conjuntos_2: " + conjuntos_1.esSubconjunto(conjuntos_2));

  
    System.out.println("\nUnion");
    conjuntos_1.union(conjuntos_2);
    System.out.println(conjuntos_1);

    System.out.println("\nInterseccion");
    Conjuntos<Integer> conjuntos_interseccion = conjuntos_1.interseccion(conjuntos_2);
    System.out.println("interseccion conjuntos_1 conjuntos_2: " + conjuntos_interseccion);

  
    System.out.println("\nDiferencia");
    Conjuntos<Integer> conjuntos_diferencia = conjuntos_1.diferencia(conjuntos_2);
    System.out.println("diferencia conjuntos_1 conjuntos_2: " + conjuntos_diferencia);

    System.out.println("\nIterador");
    for (Integer elemento : conjuntos_1) {
        System.out.println("elemento: " + elemento);
    }
    
   }
    
}