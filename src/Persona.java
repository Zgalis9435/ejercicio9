public class Persona {
    private int edad;
    private int telefono;
    private String nombre;

    public Persona(int edad, int telefono, String nombre){
        this.edad=edad;
        this.telefono=telefono;
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getNombre(){
        return nombre;
    }
}
