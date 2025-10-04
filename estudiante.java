package tp2;

public class estudiante extends persona {
    
    private String curso;

    public estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + 
                           " años y estudio en el curso " + curso + ".");
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando para el examen del curso " + curso + ".");
    }
}