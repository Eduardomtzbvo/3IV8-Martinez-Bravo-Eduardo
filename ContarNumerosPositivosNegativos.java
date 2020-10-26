import java.util.Scanner;
import java.util.StringTokenizer;

public class ContarNumerosPositivosNegativos {

	
	public static void main(String[] args) {
		new ContarNumerosPositivosNegativos().contarNumerosPositivosNegativos();
	}
	
	public void contarNumerosPositivosNegativos() {
		System.out.println("Programa para contar numeros positivos y negativos");
		System.out.println("Dame los numeros separados por espacios : ");
		Scanner scanner = new Scanner(System.in);
		String numeros = scanner.nextLine();
		int contadorPositivos=0;
		int contadorNegativos=0;	
		StringTokenizer st = new  StringTokenizer(numeros);
		
		while(st.hasMoreElements()) {
			System.out.println();
			if (new Integer(st.nextToken()) > 0) {
				contadorPositivos++;
			}else {
				contadorNegativos++;
			}
		}
		scanner.close();
		System.out.println("El numero de numeros positivos son :" + contadorPositivos);
		System.out.println("El numero de numeros negativos son :" + contadorNegativos);
	}
	
}
