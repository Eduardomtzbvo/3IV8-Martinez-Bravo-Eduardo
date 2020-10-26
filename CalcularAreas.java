import java.util.Scanner;

public class CalcularAreas {
	
	public void calcularArea() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calcular areas y volumen");
		System.out.println("(1) Triangulo Equilatero, (2) Rectangulo , (3)Volumen de Esfera, (4) Volumen Cilindro ");
		int operacion = scanner.nextInt();
		if(operacion == 1) {
			System.out.println("Dame la base:");
			float base = scanner.nextFloat();
			System.out.println("Dame la altura:");
			float altura = scanner.nextFloat();
			Triangulo triangulo = new Triangulo();
			System.out.println("El area del triangulo es : " + triangulo.calcularArea(base, altura));
			System.out.println("El perimetro del triangulo es : " + triangulo.calcularPerimetro(base));
		}else if (operacion ==2) {
			System.out.println("Dame la base:");
			float base = scanner.nextFloat();
			System.out.println("Dame la altura:");
			float altura = scanner.nextFloat();
			Rectangulo rectangulo = new Rectangulo();
			System.out.println("El area del rectangulo es : " + rectangulo.calcularArea(base, altura));
			System.out.println("El perimetro del triangulo es : " + rectangulo.calcularPerimetro(base, altura));
		}else if(operacion ==3 ) {
			Esfera esfera = new Esfera();
			System.out.println("Dame el radio:");
			float radio = scanner.nextFloat();
			System.out.println("El volumen de la esfera es : " + esfera.calcularVolumen(radio));			
		}else if (operacion == 4) {
			Cilindro cilindro = new Cilindro();
			System.out.println("Dame el radio:");
			float radio = scanner.nextFloat();
			System.out.println("Dame la altura:");
			float altura = scanner.nextFloat();
			System.out.println("El volumen de la esfera es : " + cilindro.calcularVolumen(radio, altura));	
		} 
		
	}

}
