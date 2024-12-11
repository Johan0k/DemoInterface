package ec.puce.interfaces;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hola puce");
		
		Rectangulo rectangulo1= new Rectangulo();
		rectangulo1.setAltura(25);
		rectangulo1.setBase(25);
		System.out.println("Area del Rectangulo" + rectangulo1.calcularArea());
		
		
	}

}
