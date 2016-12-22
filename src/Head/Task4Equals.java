/**
 * 
 */
package Head;

/**
 * Класс для сравнения двух паролей
 * @author User
 *
 */
public class Task4Equals {

    /**
     * Поле объекта хронящая результат сравнения
     */
    private boolean equalsKeys = false;
    /**
     * В конструкторе произвожу проверку двух строк на равенство 
     */
    public Task4Equals(String s1, String s2) {
        // TODO Auto-generated constructor stub
        //return s1 == null ? s2 == null : s1.equals(s2);
        if (s1 != null && s2 != null) {
           equalsKeys = s1.equals(s2);
        } else {
            System.out.println("Проверка входных параметров на null не пройдена ");
        }
    }
    
    public void printTask4Equals (){
        if(equalsKeys ){
            System.out.println("Пароли совпали");
        } else {
            System.out.println("А ключик то не тот )");
        }
    }

}
