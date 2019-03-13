package dominio;

import java.util.HashMap;
import java.util.LinkedList;

public class login {

    private HashMap<String, String> logins = new HashMap<String, String>();

    public login(LinkedList<Usuario> usuarios) {
        for (Usuario i : usuarios) {
            logins.put(i.getUser(), i.getPass());
        }
    }

    public int signIn(String user, String pass) {
        int logged = 0;

        if (logins.containsKey(user)) {
            if (logins.get(user).equals(pass)) {
                logged = 1;
            } else {
                return -2;
            }
        } else {
            return -1;
        }
        
        /*  0 --> Error en el login 
         *  1 --> Login correcto 
         * -1 --> Usuario inexistente 
         * -2 --> Contraseña incorrecta
         */
        
        return logged;
    }

}
