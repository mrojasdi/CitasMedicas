public class Doctor {
    private String nombre;
    private String especialidad;
    private int numeroCedula;

    public Doctor(String nombre, String especialidad, int numeroCedula) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numeroCedula = numeroCedula;
    }

    // Getters y setters según sea necesario
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    // Puedes agregar otros métodos según sea necesario
}