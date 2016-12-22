/**
 * 
 */
package Head;

/**
 * @author User
 *Задача 6
 * Создайте приложение выводящее фамилию разроботчика, дату и время получения задания а также дату и время сдачи задания
 * Для получения последней даты и времени используйте класс Calendar из пакета java.util 
 * 
 * В этом классе хронится имя разроботчика
 */
public class Task6NameUser {
    /**
     * Поле для хранение имени разроботчика
     */
    private String name;
    
    public Task6NameUser(String s ){
        name = s;
    }
    /**
     * Возрпощает поле Name;
     * @return
     */
    public String getName(){
        return name;
    }

}
