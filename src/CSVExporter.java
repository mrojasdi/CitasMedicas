import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVExporter {
    public static void exportDoctores(List<Doctor> doctores, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Escribir encabezados
            writer.write("Cedula,Nombre,Especialidad");
            writer.newLine();

            // Escribir datos de doctores
            for (Doctor doctor : doctores) {
                writer.write(doctor.getNumeroCedula() + "," + doctor.getNombre() + "," + doctor.getEspecialidad());
                writer.newLine();
            }

            System.out.println("Datos de doctores exportados a " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exportPacientes(List<Paciente> pacientes, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Escribir encabezados
            writer.write("Nombre,FechaNacimiento,HistorialMedico");
            writer.newLine();

            // Escribir datos de pacientes
            for (Paciente paciente : pacientes) {
                writer.write(paciente.getNombre() + "," + paciente.getFechaNacimiento() + "," + paciente.getHistorialMedico());
                writer.newLine();
            }

            System.out.println("Datos de pacientes exportados a " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exportCitas(List<Cita> citas, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Escribir encabezados
            writer.write("Fecha,Hora,Doctor,Paciente");
            writer.newLine();

            // Escribir datos de citas
            for (Cita cita : citas) {
                writer.write(cita.getFecha() + "," + cita.getHora() + "," + cita.getDoctor().getNombre() + "," + cita.getPaciente().getNombre());
                writer.newLine();
            }

            System.out.println("Datos de citas exportados a " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
