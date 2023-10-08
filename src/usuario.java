public abstract class usuario {
    private String identificador;
    private String contraseña;

    public usuario(String identificador, String contraseña) {
        this.identificador = identificador;
        this.contraseña = contraseña;
    }

    // Getters y setters para identificador y contraseña
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
}