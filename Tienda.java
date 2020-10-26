import java.util.Scanner;

public class Tienda {

	
	public Articulo[] inicializaArticulos() {
		
		int contador = 10;
		Articulo[] arts = new Articulo[contador];
	    arts[0] = new Articulo(0,"JabonZote", 10.0f);
	    arts[1] = new Articulo(1,"Cereal" ,10.0f);
	    arts[2] = new Articulo(2,"Detergente" ,10.0f);
	    arts[3] = new Articulo(3,"Atun" ,10.0f);
	    arts[4] = new Articulo(4, "Arroz 1 kg",10.0f);
	    arts[5] = new Articulo(5,"Frijol 1 kg" ,10.0f);
	    arts[6] = new Articulo(6,"Pan de Caja",10.0f);
	    arts[7] = new Articulo(7,"Yoghurt",10.0f);
	    arts[8] = new Articulo(8,"Sardina",10.0f);
	    arts[9] = new Articulo(9,"Refresco",10.0f);
		
	    contador = 0;
	    while(contador < arts.length ) {
	    	System.out.println("("+arts[contador].getNumeroArticulo()+") " + arts[contador].getDescripcion() +" Precio:"+ arts[contador].getPrecio());
	    	contador++;		
	    }
		return arts;
	}
	
		
	public void ejecutaTienda() {
		float total = 0.0f;
		int numeroArticulo=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tienda de Lalo Todo al mismo Precio!!!");
		Articulo[] arts=inicializaArticulos();
		System.out.println("Ingrese el numero de articulos a comprar:");
		int numeroArticulos = scanner.nextInt();
		int contador=0;
		while(contador < numeroArticulos) {
			System.out.println("Ingrese el numero de articulo:");
			numeroArticulo=scanner.nextInt();
			System.out.println("Articulo Comprado: " + arts[numeroArticulo].getDescripcion() );
			total = total + arts[numeroArticulo].getPrecio();
		contador++;	
		}
		System.out.println("Monto Total comprado: " + total);
		
	}
	
	public static void main(String[] args) {
		new Tienda().ejecutaTienda();
	}
}