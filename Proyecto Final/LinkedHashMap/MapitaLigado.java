package LinkedHashMap;

import java.util.LinkedHashMap;


public class MapitaLigado {
    public static void main(String[] args) {
        LinkedHashMap<String,String> mapita =new LinkedHashMap<>(); //Se crea el mapita
        
        //Metodos Principales
        
        //Con put se agregan elementos
       mapita.put("Mentiras", "Loki");
       mapita.put("Padre de Todo", "Odin");
       mapita.put("Sabiduria", "Mimir");
       mapita.put("Rayo", "Thor");
       
       //Se elimina un elemento
       mapita.remove("Mentiras");
       
       //Se obtiene el tamaño
        System.out.println("tamanio: "+ mapita.size());
        
        //Se imprime 
        for(String clave:mapita.keySet() ){
            System.out.println("Dios Nordicos: " +clave+ "     Nombre: "+ mapita.get(clave)); 
        }
       
        
    }
}