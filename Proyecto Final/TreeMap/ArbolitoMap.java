package TreeMap;

import java.util.TreeMap;


public class ArbolitoMap {
     public static void main(String[] args) {
         TreeMap<String,String> mapita= new TreeMap<>();//Se crea el treemap
         
         //Metodos principales
         
         //El put añade claves al treemap
         mapita.put("1", "Javi");
         mapita.put("2", "Haziel");
         mapita.put("3", "Alexis");
         mapita.put("4", "Mau");
         mapita.put("5", "Oscar");
         
         //metodo remove elimina un elemnto segun su clave
         mapita.remove("Mau");
         
         //metodo get obtiene un valor
         System.out.println("Numero 3 de la lista: "+ mapita.get("3"));
         
         //Se muestra el tamaño 
         System.out.println("El tamaño del treemap es "+ mapita.size());
         
         //Se imprime
         for(String clave:mapita.keySet()){
             System.out.println("NumAlumno: "+clave+" Nombre: "+ mapita.get(clave));
         }
         
    }
     
      
}
