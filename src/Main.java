import qwe.WrongLogin;
import qwe.WrongPassword;
public class Main {
    public static void main(String[] args) {
        String login = "Saint_pant78";
        String password = "OrNIXCIo238";
        String confirmPassword = "S100292";


        try {
            checkData(login, password, confirmPassword);
        } catch (WrongLogin e){
            System.out.println("Логин или пароль более 20 символов");
        } catch (WrongPassword e) {
            System.out.println(" правильность написания пароля");
        } finally {
            System.out.println("BOOM");
        }
    }

    public static boolean checkData(String login, String password, String confirmPassword)
        throws WrongLogin, WrongPassword {

            int maxLoginLength = 20;
            int maxPassLength = 20;

            if (login.length() >= maxLoginLength || password.length() >= maxPassLength) {
                throw new WrongLogin();
            }
            if (!password.equals(confirmPassword) || !password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPassword();
            }
            return true;
        }
    }




