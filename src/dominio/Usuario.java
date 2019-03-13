package dominio;

public class Usuario {
    private String id;
    private String nombre, apellidos;
    private String ultimoAcceso;
    private String user, pass;

    
    public Usuario(String id, String nombre, String apellidos, String ultimoAcceso, String user, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ultimoAcceso = ultimoAcceso;
        this.user = user;
        this.pass = pass;
    }
    
    public Usuario(String user,String pass) {
    	this.user=user;
    	this.pass=pass;
    }


    /**
     * @return the id
     */
    public final String getId() {
        return id;
    }


    /**
     * @param id the id to set
     */
    public final void setId(String id) {
        this.id = id;
    }


    /**
     * @return the ultimoAcceso
     */
    public final String getUltimoAcceso() {
        return ultimoAcceso;
    }


    /**
     * @param ultimoAcceso the ultimoAcceso to set
     */
    public final void setUltimoAcceso(String ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }


    /**
     * @return the nombre
     */
    public final String getNombre() {
        return nombre;
    }


    /**
     * @return the apellidos
     */
    public final String getApellidos() {
        return apellidos;
    }


    /**
     * @return the user
     */
    public final String getUser() {
        return user;
    }


    /**
     * @return the pass
     */
    public final String getPass() {
        return pass;
    }
    
    
}
