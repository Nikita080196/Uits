package lesson18.task3;

public class User3 {
    private String login = "Никита";
    private String password = "sfscgs24";

    public void createQuery() {
        User3.Query query = new User3.Query();
        query.printToLog(this);
    }

    public static class Query {
        public void printToLog(User3 user3) {
            System.out.println("Пользователь c логином " + user3.login + " и паролем " + user3.password + " существует");
        }
    }

    public static void main(String[] args) {
        User3 user3 = new User3();
        user3.createQuery();
    }
}