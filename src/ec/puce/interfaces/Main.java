package ec.puce.interfaces;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hola puce");
		
		Rectangulo rectangulo1= new Rectangulo();
		rectangulo1.setAltura(4);
		rectangulo1.setBase(5);
		System.out.println("Area del Rectangulo " + rectangulo1.calcularArea());
		
		
		Triangulo triangulo1= new Triangulo();
		triangulo1.setAltura(5);
		triangulo1.setBase(25);
		System.out.println("Area del Triangulo " +triangulo1.calcularArea());
		
		
		Circulo circulo = new Circulo();
        circulo.setRadio(2);
        System.out.println("Área del círculo: " + circulo.calcularArea());
		
	}

}
