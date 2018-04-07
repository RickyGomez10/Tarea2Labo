package tarea2.labo;

public class Login {

    //atributos
    String usuario;
    String contrasena;

    //constructor
    public Login(String _usuario, String _contrasena) {
        this.usuario = _usuario;
        this.contrasena = _contrasena;
    }
    //getters

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    //setters
    public void setUsuario(String usuario) {

        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {

        this.contrasena = contrasena;

    }
}
