import java.util.Scanner;

public class ConvertirGrados {
	
	
	public void main(String[] args) {
		new ConvertirGrados().ejecutaConversion();
	}
	
	public void ejecutaConversion() {
		Scanner scanner = new Scanner(System.in);
		float grados= 0.0f;
		String sGrados= "";
		System.out.println("Programa para convertir Grados Celsius a Kelvin, Rankine o Fahrenheit");
		System.out.println("Dame los grados celcius: ");
		float gradosC = scanner.nextFloat();
		System.out.println("Selecciona el tipo de conversion (1) Kelvin, (2) Rankine  (3)Fahrenheit");
		int opcion = scanner.nextInt();
		if (opcion ==1) {
			grados=convertirKelvin(gradosC);
			sGrados= "K";
		}else if (opcion == 2) {
			grados=convertirRankine(gradosC);
			sGrados="R";
		}else if (opcion == 3) {
			grados=convertirFahrenheit(gradosC);
			sGrados="F";
		}
		scanner.close();
		System.out.println("El resultado es: " +grados+ "°"+ sGrados);
		
	}
	
	
	

	public float convertirKelvin(float gradosC) {
		float gradosK = (float) (gradosC + 273.15); // °K = °C + 273.15
		return gradosK;
	}

	public float convertirRankine(float gradosC) {
		float gradosR = (float) (9* gradosC /5 + 491.67) ; //(9*°C/5) + 491.67	 
	    return gradosR;
	}

	public float convertirFahrenheit(float gradosC) {
		float gradosF = (float) (gradosC * 1.8 + 32); // ºF = (ºC · 1,8) + 32
		//System.out.printf("Los grados cel son: %.3f \n Los grados kel son: %.3f", gradosF);
		return gradosF;
	}

}
