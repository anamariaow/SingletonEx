public class Main {
    //Creare 2 oggetti User di cui creerà un'istanza.
    //Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video

    public static void main(String[] args) {
        User user1 = User.getUser();
        user1.stampaUser();
        User user2 = User.getUser();
        user2.setNome("Ana");
        user2.setEta(26);
        user2.stampaUser();
    }
}