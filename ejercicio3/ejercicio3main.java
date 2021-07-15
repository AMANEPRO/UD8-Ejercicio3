package ejercicio3;

public class ejercicio3main {

	public static void main(String[] args) {
		
		objetosejercicio3 electrodomestico1 = new objetosejercicio3();
		objetosejercicio3 electrodomestico2 = new objetosejercicio3(150, 60);
		objetosejercicio3 electrodomestico3 = new objetosejercicio3(50, "Gris", 'B', 20);
		
		System.out.println(electrodomestico1);
		System.out.println(electrodomestico2);
		System.out.println(electrodomestico3);

	}

}
