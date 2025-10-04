package tp1;

public class persona {
    
    private String nombre;
    private int edad;

    
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

    
    public void cumplirAnios() {
        this.edad++;
        System.out.println(nombre + " cumplió años. Ahora tiene " + edad + " años.");
    }

    public void saludar() {
        System.out.println("Hola Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}