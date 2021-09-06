package poo.taller.punto1.domain;

public class Estudiante {
    public static final int NRO_MAX_ESTUDIANTES_PERMITIDOS = 3;
    private static int nroEstudiantes;

    private String identificacion;
    private String nombre;
    private int semestreActual;
    private char genero;
    private Nota nota;

    private Estudiante(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        nroEstudiantes++;
    }

    private Estudiante(String identificacion, String nombre, int semestreActual) {
        this(identificacion, nombre);
        this.semestreActual = semestreActual;
    }

    public static Estudiante matricular(String identificacion, String nombre) {
        if (nroEstudiantes < NRO_MAX_ESTUDIANTES_PERMITIDOS) {
            return new Estudiante(identificacion, nombre);
        } else {
            System.out.println("No es posible matricular más estudiantes.");
            return null;
        }
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public char getGenero() {
        return genero;
    }

    public Nota getNota() {
        return nota;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public static int getNroEstudiantes() {
        return nroEstudiantes;
    }
}
