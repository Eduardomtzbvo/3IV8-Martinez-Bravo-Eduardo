//Este programa es para unir los dos anteriores problemas
import java.util.*;
public class Tarea1{

public void ejecutaTarea1() {
    System.out.println("¿Que edad tienes?");
    Scanner scanner = new Scanner(System.in);
    int edad =scanner.nextInt();
    System.out.println("¿Tus padres son socios?");
    scanner = new Scanner(System.in);
    String socio =scanner.nextLine();
    boolean isSocio =false;
    
    if(socio.equals("si")){
        isSocio=true;

    }
    Usuario usuario1 = new Usuario(edad,isSocio);

    if(usuario1.getEdad()>65){
        System.out.println("Tu descuento es de 40% ");
    }else{
       if(usuario1.getEdad()<21){
           if(usuario1.getSocio()==true){
            System.out.println("Tu descuento es de 45% ");
           }else{
            if(usuario1.getSocio()==false){
                System.out.println("Tu descuento es de 25% ");
            }else{
                if(usuario1.getEdad()>21 && usuario1.getEdad()<65){
                    System.out.println("No tienes descuento ");
                }
            }
           }
        }else{
            System.out.println("No tienes descuento "); 
        }   
    }
}
}