
public class Cilindro {
	
	public float calcularVolumen(float radio, float altura) {
		float volumen = (float) (Math.PI * Math.pow(radio, 2)*altura); //pi*radio2*altura
		return volumen;		
	}

}
