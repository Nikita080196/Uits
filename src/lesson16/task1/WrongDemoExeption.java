package lesson16.task1;

public class WrongDemoExeption {
    public static void main(String[] args) {
        validate("Nikita12314", "12345678", "1234678");
        validate("barcik", "5252rfs", "5252rfs");
        validate("kolos", "4131145", "4131145");
    }

    private static void validate(String login, String password, String confirm) {
        try {
            if (login.length() > 20) {
                System.out.println("Логин");
                throw new WrongLoginExeption("Ошибка в пароле");
            } else if (password.length() > 20) {
                throw new WrongPassExeption("Ошибка в пароле");
            }
            if (password.equals(confirm)) {
                System.out.println("Пароль подтвержден");
            } else {
                System.out.println("Не верный логим или пароль");
            }
        } catch (WrongLoginExeption | WrongPassExeption e) {
            System.out.println("Не верный логин или пароль");

        } finally {
            System.out.println(login + " " + password + " " + confirm);
        }
    }
}