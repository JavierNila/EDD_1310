package HashMap;

import java.util.HashMap;//se importa la libreria 

public class MapitaHash {

  public static void main(String[] args) {

      HashMap<String, String> mapita = new HashMap<>(); //creamos el objeto

      //Metodos principales
      mapita.isEmpty();//vacio

      //Con put, se agregan elementos a la tabla  
      mapita.put("Celular", "Xiaomi"); 
      mapita.put("Pais", "Irlanda");
      mapita.put("Fruta", "Guayaba");
      mapita.put("Pokemon", "Magikarp");

      //size da el tamaño del mapa
      System.out.println("Tamanio");
      System.out.println(mapita.size());

      //El get llama una clave del mapa
      System.out.println(mapita.get("Pokemon"));

      //El remove elimina una clave del mapa
      mapita.remove("Fruta");

      //Se verifica si se encuentra el valor 
      System.out.println("Se encuentra en venta el Xiamoi " + mapita.containsValue("Xiaomi"));

      //Muestra el mapa entero
      for (String clave : mapita.keySet()) {
          System.out.println("clave " + clave + " contenido " + mapita.get(clave));
      }

  }

}