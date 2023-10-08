import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    private static ArrayList<Doctor> listadeDoctores = new ArrayList<>();
    private static ListaPacientes listaDePacientes = new ListaPacientes();
    private static ListaCitas listadeCitas = new ListaCitas();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrador administrador = new Administrador("admin", "admin123");

        while (true) {
            System.out.println("1. Iniciar sesión como administrador");
            System.out.println("2. Salir");
            int opcion = obtenerEnteroDesdeEntrada(scanner);

            if (opcion == 1) {
                System.out.print("Ingrese identificador de administrador: ");
                String identificador = scanner.next();
                System.out.print("Ingrese contraseña: ");
                String contraseña = scanner.next();

                if (autenticar(administrador, identificador, contraseña)) {
                    System.out.println("¡Inicio de sesión exitoso como administrador!");
                    while (true) {
                        System.out.println("1. Agregar doctor");
                        System.out.println("2. Eliminar doctor");
                        System.out.println("3. Agregar paciente");
                        System.out.println("4. Eliminar paciente");
                        System.out.println("5. Programar cita");
                        System.out.println("6. Cerrar sesión de administrador");
                        int opcionAdmin = obtenerEnteroDesdeEntrada(scanner);

                        // Implementa las acciones según la opción seleccionada por el administrador
                        switch (opcionAdmin) {
                            case 1:
                                // Solicitar al usuario los datos del doctor
                                System.out.println("Ingrese el nombre del doctor:");
                                String nombre = scanner.next();

                                // Solicitar al usuario que ingrese especialidad
                                System.out.println("Ingrese la especialidad del doctor:");
                                String especialidad = scanner.next();

                                // Solicitar al usuario que ingrese número de cédula del doctor
                                System.out.println("Ingrese el número de cédula del doctor:");
                                int numerocedula = obtenerEnteroDesdeEntrada (scanner);

                                // Crear un objeto Doctor con los datos ingresados
                                Doctor nuevoDoctor = new Doctor(nombre, especialidad, numerocedula);

                                // Agregar el doctor a la lista de doctores
                                listadeDoctores.add(nuevoDoctor);

                                // Informar al usuario que el doctor ha sido agregado
                                System.out.println("Doctor agregado con éxito");
                                break;
                            case 2:
                                // Lógica para eliminar un doctor
                                System.out.println("Ingrese el número de cédula del doctor que desea eliminar:");
                                int cedulaAEliminar = obtenerEnteroDesdeEntrada(scanner);

                                // Buscar y eliminar al doctor de la lista por número de cédula
                                boolean doctorEliminado = false;
                                for (Doctor doctor : listadeDoctores) {
                                    if (doctor.getNumeroCedula() == cedulaAEliminar) {
                                        listadeDoctores.remove(doctor);
                                        doctorEliminado = true;
                                        System.out.println("Doctor eliminado con éxito.");
                                        break; // Salir del bucle una vez que se elimine un doctor
                                    }
                                }

                                if (!doctorEliminado) {
                                    System.out.println("No se encontró ningún doctor con el número de cédula ingresado.");
                                }
                                break;        	
                            case 3:
                                // Lógica para agregar un paciente
                                System.out.println("Ingrese el nombre del paciente:");
                                String nombrePaciente = scanner.next();

                                System.out.println("Ingrese la fecha de nacimiento del paciente:");
                                String fechaNacimientoPaciente = scanner.next();

                                System.out.println("Ingrese el historial médico del paciente:");
                                String historialMedicoPaciente = scanner.next();

                                // Crear un objeto Paciente con los datos ingresados
                                Paciente nuevoPaciente = new Paciente(nombrePaciente, fechaNacimientoPaciente, historialMedicoPaciente);

                                // Agregar el paciente a la lista de pacientes
                                listaDePacientes.agregarPaciente(nuevoPaciente);	

                                // Informar al usuario que el paciente ha sido agregado
                                System.out.println("Paciente agregado con éxito.");
                                break;                           	
                            case 4:
                                // Lógica para eliminar un paciente
                                System.out.println("Ingrese el nombre del paciente que desea eliminar:");
                                String nombrePacienteAEliminar = scanner.next();

                                // Buscar y eliminar al paciente de la lista por nombre
                                boolean pacienteEliminado = false;
                                for (Paciente paciente : listaDePacientes.getPacientes()) {
                                    if (paciente.getNombre().equals(nombrePacienteAEliminar)) {
                                        listaDePacientes.eliminarPaciente(paciente);
                                        pacienteEliminado = true;
                                        System.out.println("Paciente eliminado con éxito.");
                                        break; // Salir del bucle una vez que se elimine un paciente
                                    }
                                }

                                if (!pacienteEliminado) {
                                    System.out.println("No se encontró ningún paciente con el nombre ingresado.");
                                }
                                break;                      	
                            case 5:
                                // Lógica para programar una cita
                                System.out.println("Ingrese la fecha de la cita (formato dd/mm/aaaa):");
                                String fechaCita = scanner.next();

                                System.out.println("Ingrese la hora de la cita (formato hh:mm):");
                                String horaCita = scanner.next();

                                // Mostrar la lista de doctores disponibles
                                System.out.println("Doctores disponibles para la cita:");
                                for (Doctor doctor : listadeDoctores) {
                                    System.out.println(doctor.getNombre() + " - " + doctor.getEspecialidad());
                                }

                                System.out.println("Ingrese el nombre del doctor para la cita:");
                                String nombreDoctorCita = scanner.next();

                                // Buscar al doctor por nombre
                                Doctor doctorSeleccionado = null;
                                for (Doctor doctor : listadeDoctores) {
                                    if (doctor.getNombre().equals(nombreDoctorCita)) {
                                        doctorSeleccionado = doctor;
                                        break;
                                    }
                                }

                                if (doctorSeleccionado == null) {
                                    System.out.println("No se encontró ningún doctor con el nombre ingresado.");
                                    break; // Salir del case 5
                                }

                                // Mostrar la lista de pacientes disponibles
                                System.out.println("Pacientes disponibles para la cita:");
                                for (Paciente paciente : listaDePacientes.getPacientes()) {
                                    System.out.println(paciente.getNombre());
                                }

                                System.out.println("Ingrese el nombre del paciente para la cita:");
                                String nombrePacienteCita = scanner.next();

                                // Buscar al paciente por nombre
                                Paciente pacienteSeleccionado = listaDePacientes.buscarPacientePorNombre(nombrePacienteCita);

                                if (pacienteSeleccionado == null) {
                                    System.out.println("No se encontró ningún paciente con el nombre ingresado.");
                                    break; // Salir del case 5
                                }

                                // Crear la cita y agregarla a la lista de citas
                                Cita nuevaCita = new Cita(fechaCita, horaCita, doctorSeleccionado, pacienteSeleccionado);
                                listadeCitas.agregarCita(nuevaCita); // Usa la instancia de ListaCitas

                                System.out.println("Cita programada con éxito.");
                                break;
                            case 6:
                                System.out.println("Cierre de sesión de administrador.");

                                // Exportar listas a archivos CSV antes de salir
                                CSVExporter.exportDoctores(listadeDoctores, "doctores.csv");
                                CSVExporter.exportPacientes(listaDePacientes.getPacientes(), "pacientes.csv");
                                CSVExporter.exportCitas(listadeCitas.obtenerCitas(), "citas.csv");

                                scanner.close(); // Cierra el objeto Scanner
                                return; // Salir del programa
                            default:
                                System.out.println("Opción no válida.");
                        }
                    }
                } else {
                    System.out.println("Inicio de sesión fallido. Verifique sus credenciales.");
                }
            } else if (opcion == 2) {
                System.out.println("Saliendo del programa.");
                scanner.close(); // Cierra el objeto Scanner
                return; // Salir del programa
            }
        }
    }

    private static boolean autenticar(Administrador administrador, String identificador, String contraseña) {
        // Implementa la lógica de autenticación
        return administrador.getIdentificador().equals(identificador) && administrador.getContraseña().equals(contraseña);
    }

    private static int obtenerEnteroDesdeEntrada(Scanner scanner) {
        int numero = 0;
        boolean entradaValida = false;

        do {
            try {
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.nextLine(); // Limpia el búfer del Scanner
            }
        } while (!entradaValida);

        return numero;
    }

    public static ArrayList<Doctor> getListadeDoctores() {
        return listadeDoctores;
    }

    public static void setListadeDoctores(ArrayList<Doctor> listadeDoctores) {
        MainClass.listadeDoctores = listadeDoctores;
    }
}
