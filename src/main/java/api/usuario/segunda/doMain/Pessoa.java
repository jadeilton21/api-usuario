package api.usuario.segunda.doMain;

public class Pessoa {


    private String login;
    private String senha;


    public Pessoa(String login,String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + senha + '\'' +
                '}';
    }
}