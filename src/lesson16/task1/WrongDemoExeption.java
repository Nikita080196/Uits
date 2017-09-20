package lesson16.task1;

public class WrongDemoExeption {
    public static void main(String[] args) {
        validate("Nikita1231475", "12345678", "1234678");
        validate("barcik", "5252rfs", "5252rfs");
        validate("kolos", "4131145", "4131145");
    }

    private static void validate(String login, String password, String confirm) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginExeption("Ошибка логина");
            } else if (password.length() > 20) {
                throw new WrongPassExeption("Ошибка пароля");
            }
            if (password.equals(confirm)) {
                System.out.println("Пароль подтвержден");
            } else {
                throw new WrongPassExeption("Не верный пароль");
            }
        } catch (WrongLoginExeption e){
            System.out.println("Не верный логин");

        }
        catch (WrongPassExeption e){
            System.out.println("Не верный пароль");

        } finally {
            System.out.println(login + " " + password + " " + confirm);
        }
    }
}
