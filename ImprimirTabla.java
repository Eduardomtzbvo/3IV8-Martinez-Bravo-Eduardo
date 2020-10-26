
public class ImprimirTabla {
	
	
	public static void main(String[] args) {
		new ImprimirTabla().imprimeTabla();
	}
	public void imprimeTabla() {
		int numeros = 10;
		int contador = 0;
		String pipe = "|";
		System.out.println("_________________________");
		System.out.printf("%-1s%-5s%-1s%-5s%-1s%-5s%-1s%-5s%-1s%n" ,pipe,"N",pipe," ",pipe," ",pipe, " ", pipe);
		
		while(contador < numeros) {
			contador++;
			System.out.printf("%-1s%-5s%-1s%-5s%-1s%-5s%-1s%-5s%-1s%n" ,pipe,"_____",pipe,"_____",pipe,"_____",pipe, "_____", pipe);
			System.out.printf("%-1s%-5s%-1s%-5s%-1s%-5s%-1s%-5s%-1s%n" ,pipe,contador,pipe,contador*10,pipe,contador*100,pipe, contador*1000, pipe);
		}
		System.out.printf("%-1s%-5s%-1s%-5s%-1s%-5s%-1s%-5s%-1s%n" ,pipe,"_____",pipe,"_____",pipe,"_____",pipe, "_____", pipe);	
	}
}