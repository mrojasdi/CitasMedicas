import java.util.List;
import java.util.ArrayList;

class ListaCitas {
    private List<Cita> citas;

    public ListaCitas() {
        citas = new ArrayList<>();
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void eliminarCita(Cita cita) {
        citas.remove(cita);
    }

    public Cita buscarCitaPorFechaYHora(String fecha, String hora) {
        for (Cita cita : citas) {
            if (cita.getFecha().equals(fecha) && cita.getHora().equals(hora)) {
                return cita;
            }
        }
        return null;
    }
// Método para obtener la lista de citas
public List<Cita> obtenerCitas() {
    return citas;
}
}