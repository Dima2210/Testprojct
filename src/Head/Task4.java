/**
 * 
 */
package Head;

/**
 * Создайте приложение для ввода пароля из командной строки и сравнения его со стракой - образцом
 * @author User
 *
 */
public class Task4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Task4 t4 = new Task4();
        t4.start();

    }
    
    public void start (){
        //Создаю пароль и помещаю его в Task4Keys tKeys
        String s = "121";
        
        Task4Keys tKeys = new Task4Keys(s);
        
        
        // Получаю пароль пользователя 
        Task4CommandLineInput user = new Task4CommandLineInput();
       // изминение от 28.11.16
        user.setKeyUser();
        // Сравниваю пароль пользователя с хронящимся в tKeys
        
        Task4Equals tequals = new Task4Equals(user.getKeysUser(),tKeys.getKeys());
        tequals.printTask4Equals();
    }

}
