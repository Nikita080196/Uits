package lesson18.task2;

public class User2 {
    private String login = "Никита";
    private String password = "sfscgs24";

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь c логином " + getLogin() + " и паролем " + getPassword() + " существует");
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {

        User2 user2 = new User2();
        user2.createQuery();
    }
}