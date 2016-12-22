/**
 * 
 */
package Head;

import java.util.Calendar;
import java.util.Date;

/**
 * @author User
 * Задача 6
 * Создайте приложение выводящее фамилию разроботчика, дату и время получения задания а также дату и время сдачи задания
 * Для получения последней даты и времени используйте класс Calendar из пакета java.util
 */

public class Task6 {

    /**
     * @param args
     */
    public static void main(String args[]) {
        // TODO Auto-generated method stub

        Task6 t6 = new Task6();
        t6.start();

    }

    /**
     * метод start запускает приложения по задаче 6
     */
    public void start() {
        Date time1 = new Date();
        Task6SetTask setTask = new Task6SetTask(time1);
        Calendar cl1 = Calendar.getInstance();
        cl1.setTimeInMillis(setTask.getTimeSetTask());

        String name = "Иванов";
        Task6NameUser nameUser = new Task6NameUser(name);

        Date time2 = new Date();
        Task6GetTask getTask = new Task6GetTask(time2);
        Calendar cl2 = Calendar.getInstance();
        cl2.setTimeInMillis(getTask.getTimeGetTask());

        System.out.print("Имя разроботчика " + nameUser.getName() + " Время получение задание " + cl1.getTime());
        System.out.println(" Время выполнения задания "  + cl2.getTime());
        
        System.out.println("Время начало работы в милисекундах  " + cl1.getTimeInMillis());
        
        System.out.println("Время окончания работы в милисекундах  " + cl2.getTimeInMillis());
        
    }
}
