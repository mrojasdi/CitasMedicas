import java.util.ArrayList;
import java.util.List;

public class listadeDoctores {
    private List<Doctor> doctores;

    public listadeDoctores() {
        doctores = new ArrayList<>();
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void eliminarDoctor(Doctor doctor) {
        doctores.remove(doctor);
    }

    public Doctor buscarDoctorPorNombre(String nombre) {
        for (Doctor doctor : doctores) {
            if (doctor.getNombre().equals(nombre)) {
                return doctor;
            }
        }
        return null;
    }

    // Puedes agregar otros métodos según sea necesario
    
	public List<Doctor> obtenerDoctores() {
        return doctores;
    }

    public static void main(String[] args) {
        listadeDoctores listaDoctores = new listadeDoctores();

        // Crear un objeto Doctor
        Doctor doctor1 = new Doctor("Dr. Juan Pérez", "Cardiología", 12345);

        // Agregar el doctor a la lista de doctores
        listaDoctores.agregarDoctor(doctor1);

        // Obtener la lista de doctores y mostrarla
        List<Doctor> doctores = listaDoctores.obtenerDoctores();
        for (Doctor doctor : doctores) {
            System.out.println("Cedula: " + doctor.getNumeroCedula());
            System.out.println("Nombre: " + doctor.getNombre());
            System.out.println("Especialidad: " + doctor.getEspecialidad());
        }
    }
}
