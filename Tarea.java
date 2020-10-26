/*Tarea hecha por Eduardo Martinez Bravo
Esta tarea es para Programacion Orientada a Objetos
Esta clase sirve para que la persona que usa el programa pueda elegir cual de los multiples programas quiere usar*/
import java.util.*; 
public class Tarea{

    public static void main(String[] args) {

        System.out.println("Bienvenido eliga la opcion deseada: ");
            System.out.println("1 Descuentos. ");
            System.out.println("2.Teclado Binario ");
            System.out.println("3. Temperatura ");
            System.out.println("4. Series de Numeros");
            System.out.println("5. Factura Total");
            System.out.println("6. Area y Perimetro");
            System.out.println("7. Tabla de valores");
            System.out.println("8. Factorial");
            System.out.println("9. Salir");
        
        Scanner entrada = new Scanner(System.in);

        Tarea1 tarea1 = new Tarea1();
        ConvierteDecimalBinario decimal = new ConvierteDecimalBinario();
        ConvertirGrados grados = new ConvertirGrados();
        ContarNumerosPositivosNegativos cuenta = new ContarNumerosPositivosNegativos();
        Tienda tienda = new Tienda();
        CalcularAreas area = new CalcularAreas();
        ImprimirTabla tabla = new ImprimirTabla();
        Factorial factorial = new Factorial();
        int numero = entrada.nextInt();

        while(numero != 9){
            
        //tarea1.ejecutatarea1 = new tarea1();
        if(numero==9){
            System.out.println("Ha finalizado el programa");
        }else{
            if(numero==1){
                tarea1.ejecutaTarea1();
            }else{
                if(numero==2){
                    decimal.ejecutaConvierteDecimalBinario();
                }else{
                    if(numero==3){
                        grados.ejecutaConversion();
                    }else{
                        if(numero==4){
                            cuenta.contarNumerosPositivosNegativos();
                        }else{
                            if(numero==5){
                                tienda.ejecutaTienda();
                            }else{
                                if(numero==6){
                                    area.calcularArea();
                                }else{
                                    if(numero==7){
                                        tabla.imprimeTabla();
                                    }else{
                                        if(numero==8){
                                            factorial.ejecutarFactorial();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }       
        }
        System.out.println("Bienvenido eliga la opcion deseada: ");
            System.out.println("1 Descuentos. ");
            System.out.println("2.Teclado Binario ");
            System.out.println("3. Temperatura ");
            System.out.println("4. Series de Numeros");
            System.out.println("5. Factura Total");
            System.out.println("6. Area y Perimetro");
            System.out.println("7. Tabla de valores");
            System.out.println("8. Factorial");
            System.out.println("9. Salir");
            numero = entrada.nextInt();
    }
}    
   
}