
public class Esfera {

	public float calcularVolumen(float radio) {
		float volumen= 0.0f; //4*Pi*R3
		volumen = (float) (((4/3)*Math.PI * Math.pow(radio, 3)));
		return volumen;
	}
	
	
}
