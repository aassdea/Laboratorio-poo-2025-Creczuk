package tp2;

public class docente extends persona {
    
    private String materia;

    public docente(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy el profesor " + nombre + ", tengo " + edad + 
                           " años y enseño " + materia + ".");
    }

    public void evaluarEstudiante() {
        System.out.println(nombre + " está evaluando a sus estudiantes en " + materia + ".");
    }
}