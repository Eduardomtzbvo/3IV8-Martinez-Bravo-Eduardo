/* Este programa le pedira al usuario su edad 
para ver que deccuento le van a dar*/

public class Usuario{

    private int edad = 0;
    private boolean socio = false;

    public Usuario (int edad,boolean isSocio){
        this.edad = edad;
        this.socio = isSocio;
    }

    public int getEdad (){
        return this.edad;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public boolean getSocio (){
        return this.socio;
    }

    public void setSocio (boolean socio){
        this.socio = socio;    
    }
}