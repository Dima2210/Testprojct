/**
 * 
 */
package Head;

import java.util.Calendar;
import java.util.Date;

/**
 * @author User
 * «адача 6
 * —оздайте приложение вывод€щее фамилию разроботчика, дату и врем€ получени€ задани€ а также дату и врем€ сдачи задани€
 * ƒл€ получени€ последней даты и времени используйте класс Calendar из пакета java.util 
 *  * 
 * ¬ этом классе задаю значение переменной хрон€щей врем€ выполнени€ задачи
 */
public class Task6GetTask {
    
    /**
     * ѕол€ timeGetTask хронит врем€ выполннение задани€ в милисекундах
     */
    private long timeGetTask;

    /**
     * «адаем значение пол€ timeGetTask 
     */
    public Task6GetTask(Date time) {
        // TODO Auto-generated constructor stub
        timeGetTask = time.getTime();
    }
    /**
     * ѕришлось добавит конструктор из за задачи є7
     * @param time
     */
    public Task6GetTask() {
        // TODO Auto-generated constructor stub
        Date time = new Date();
        timeGetTask = time.getTime();
    }
    /**
     * выводим врем€ выполннение задани€ в милисекундах
     * @return
     */
    public long getTimeGetTask(){
        return timeGetTask;
        
    }
    
    
    

}
