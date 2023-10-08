public class Cita {
    private String fecha;
    private String hora;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(String fecha, String hora, Doctor doctor, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    // Método para obtener la fecha de la cita
    public String getFecha() {
        return fecha;
    }

    // Método para obtener la hora de la cita
    public String getHora() {
        return hora;
    }

    // Método para obtener el doctor de la cita
    public Doctor getDoctor() {
        return doctor;
    }

    // Método para obtener el paciente de la cita
    public Paciente getPaciente() {
        return paciente;
    }
}
