import java.util.Scanner;

public class ConvierteDecimalBinario {
	
	public void ejecutaConvierteDecimalBinario() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa para convertir de Decimal a Binario");
		System.out.println("Dame un numero decimal: ");
		String entradaUsuario = scanner.nextLine();
		try {
			int numeroDecimal = Integer.parseInt(entradaUsuario);
			System.out.println("El número Decimal es:" + Integer.toBinaryString(numeroDecimal));
		}catch(NumberFormatException nfe) {
			System.out.println("El numero introducido no es un numero");
		}
		
		scanner.close();
		
	}

}
