/*Este programa nos ayudara 
para conocer mas de los pokemones*/

public class Pokemon{

    public Pokemon(int id, String nombre, int fuerza, int defensa, int vida, int ataque_principal, int ataque_secundario){
        this.id = id;
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.vida = vida;
        this.ataque_principal = ataque_principal;
        this.ataque_secundario = ataque_secundario;
    }
    
    private int id;
    private String nombre;
    private int fuerza;
    private int defensa;
    private int vida;
    private int ataque_principal;
    private int ataque_secundario;

    public int getId(){
        return this.id;
    }
    public String getFuerza(){
        return this.fuerza;
    }
}