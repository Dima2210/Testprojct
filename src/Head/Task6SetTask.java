/**
 * 
 */
package Head;

import java.util.Date;

/**
 * @author User
 *Задача 6
 * Создайте приложение выводящее фамилию разроботчика, дату и время получения задания а также дату и время сдачи задания
 * Для получения последней даты и времени используйте класс Calendar из пакета java.util 
 * 
 * В этом классе задаю значение переменной хронящей время выдочи задачи разработчику
 */
public class Task6SetTask {
    
    /**
     * Поле хронящие время выдочи задания разработчику в милисекундах
     */
    
    private long timeSetTask;

    /**
     * Присваеваем значения в поле timeSetTask Время передается из вне 
     */
    public Task6SetTask(Date time) {
        // TODO Auto-generated constructor stub
        timeSetTask = time.getTime();
    }
    
    /**
     * Конструктор пришлось добавить из-за задачи №7
     */
    public Task6SetTask(){
        Date time = new Date();
        timeSetTask = time.getTime();
    }
    
    /**
     * Выводим значение поля timeSetTask
     */
    public long getTimeSetTask(){
        return timeSetTask;
    }

}
