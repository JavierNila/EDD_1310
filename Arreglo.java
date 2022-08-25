package tarea.clase;

import java.lang.reflect.Array;

public class Arreglo {
	private int numero;

	public void setNumero(int numero) {
		this.numero = numero;

	}

	public int getNumero() {
		return numero;
	}

	public Arreglo(int tamanio) {

	}

	public static void main(String[] args) {
		int[] Alumnos = { 4, 7, 8, 23, 54, 12, 75 };

		System.out.println("Tamaño: " + Array.getLength(Alumnos));
		System.out.println(Alumnos);

	}
	/*void Limpiar(int valor) {
		int tamanio;
		for(int i=0;i<tamanio;i++)
			this.numero[i]=valor;
	}*/

	@Override
	public String toString() {
		return "Arreglo [numero=" + numero + "]";
	}

}
