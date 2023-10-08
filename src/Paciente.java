public class Paciente {
    private String nombre;
    private String fechaNacimiento;
    private String historialMedico;

    // Constructor de la clase Paciente
    public Paciente(String nombre, String fechaNacimiento, String historialMedico) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.historialMedico = historialMedico;
    }

    // Método para obtener el nombre del paciente
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la fecha de nacimiento del paciente
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método para obtener el historial médico del paciente
    public String getHistorialMedico() {
        return historialMedico;
    }
}
