public class User {
    //Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
    //All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
    private String nome;
    private Integer eta;

    private static User user;

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }


    public void stampaUser() {
        System.out.println("User: nome - " + getNome() + ", età - " + getEta());
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta='" + eta + '\'' +
                '}';
    }
}
