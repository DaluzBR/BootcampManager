package model;

import java.io.Serializable;

/**
 * Classe para representar um login de acesso.
 */
public class Login implements Serializable {
    private final String email;
    private final String pass;

    /**
     * Construtor da classe login.
     *
     * @param email E-mail do usuário.
     * @param pass  Senha do usuário.
     */
    public Login(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    /**
     * Verifica se o login passado corresponde a este login.
     *
     * @param o Login a ser comparado.
     * @return Retorna true se login passado for igual, false caso contrário.
     */
    public boolean checkLogin(Login o) {
        return (this.email.equals(o.getEmail()) &&
                this.pass.equals(o.getPass()));
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }
}
