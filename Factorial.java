import java.util.*;
public class Factorial {
	
	public void ejecutarFactorial() {
		long total= 1;
//		contador=0;
System.out.println("Dame un numero");

Scanner numero = new Scanner(System.in);
int entrada=numero.nextInt();
if(entrada == 0 ) {
			System.out.println("El factorial es 1");
		}else {
			while(entrada != 0) {
				total = total * entrada;
				entrada--;
			}
			System.out.println("El factorial es: " + total);
		}
	}

}
