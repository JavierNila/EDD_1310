package fes.aragon;

public class Main {
	public static void main(String[] args) throws Exception {
		ColaPrioridad<String> queue = new ColaPrioridad<String>(7);
		queue.enqueue(4, "Maestro");
		queue.enqueue(2, "Ni�os");
		queue.enqueue(4, "Mecanico");
		queue.enqueue(3, "Hombres");
		queue.enqueue(4, "Vigia");
		queue.enqueue(5, "Capitan");
		queue.enqueue(4, "Timonel");
		queue.enqueue(3, "Mujeres");
		queue.enqueue(2, "3ra edad");
		queue.enqueue(1, "Ni�as");
	}
}