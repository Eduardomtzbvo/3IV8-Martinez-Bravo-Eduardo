/*Este programa ayudara a distintas personas
a poder conocer el mundo de pokemon*/
import java.util.*;

public class 3IV8_Examen_Martinez_Bravo_Eduardo{

    private Pokemon charmander
    private Pokemon bulbasaur
    private Pokemon squirtle

public static void main(String[] args) {
Pokemon charmander = new Pokemon(1, "charmander", 10, 7, 50, 10, 15);
Pokemon bulbasaur = new Pokemon(2, "squirtle", 8, 8, 50, 9, 20);
Pokemon squirtle = new Pokemon(3, "bulbasaur", 9, 10, 50, 8, 18);


    System.out.println("Escoge lo que quieras ver");
    System.out.println("1 charmander");
    System.out.println("2 bulbasaur");
    System.out.println("3 squirtle");
    System.out.println("4 pelea pokemon");
    System.out.println("Salir");
    Scanner entrada = new Scanner(System.in);

    if(entrada == 1){
        System.out.println("Pokemon:" + charmander.getId())
        System.out.println("Pokemon:" + charmander.getFuerza())
    }else{
        if(entrada ==2){
            System.out.println("Pokemon:" + bulbasaur.getId())
            System.out.println("Pokemon:" + bulbasaur.getFuerza())
        }else{
            if(entrada == 3){
                System.out.println("Pokemon:" + squirtle.getId())
                System.out.println("Pokemon:" + squirtle.getFuerza())
            }
        }
    }


    
}
}