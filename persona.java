package tp2;

public class persona {
    
    protected String nombre;
    protected int edad;

   
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " cumplió años. Ahora tiene " + edad + " años.");
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}