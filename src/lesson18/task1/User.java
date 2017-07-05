package lesson18.task1;

public class User {
    private String login;
    private String password;

    public void createQuery() {
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

    public class Query {
        public void printToLog() {
            System.out.println("Пользователь c логином " + getLogin() + " и паролем " + getPassword() + " существует");
        }
    }

    public static void main(String[] args) {

        User user = new User();
        user.createQuery();
        Query query = user.new Query();
    }
}