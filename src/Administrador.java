public class Administrador {
    private String identificador;
    private String contraseña;

    public Administrador(String identificador, String contraseña) {
        this.identificador = identificador;
        this.contraseña = contraseña;
    }

    // Getters y setters para acceder y modificar los atributos
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Puedes agregar otros métodos según sea necesario
}
