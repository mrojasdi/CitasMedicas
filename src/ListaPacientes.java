import java.util.ArrayList;
import java.util.List; // Agrega esta línea de importación

class ListaPacientes {
    private List<Paciente> pacientes;

    public ListaPacientes() {
        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public Paciente buscarPacientePorNombre(String nombre) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNombre().equals(nombre)) { // Usa el getter para acceder al nombre
                return paciente;
            }
        }
        return null;
    }

	public List<Paciente> getPacientes() {
		return pacientes;
	}
}
