/**
 * 
 */
package Head;

import java.awt.Graphics;
import java.util.Calendar;

/**
 * @author User
 *Задача 7
 *Создайть апплет на основе предыдущего задания и запустить его с помощью HTML - документа
 *
 */
public class Task7 extends javax.swing.JApplet {

    private Calendar calendar;

    public void init() {
        calendar = Calendar.getInstance();
        setSize(800, 250);
    }
    public void paint(Graphics g) {
        g.drawString("Апплет запущен:", 20, 15);
        Calendar cl = Calendar.getInstance();

        Task6NameUser nameUser = new Task6NameUser("Иванов Билл");
        g.drawString("Имя разроботчика " + nameUser.getName(), 20, 35);

        Task6SetTask taskSet = new Task6SetTask();
        cl.setTimeInMillis(taskSet.getTimeSetTask());
        g.drawString("Время получения задания " + cl.getTime(), 20, 55);

        Task6GetTask taskGet = new Task6GetTask();
        cl.setTimeInMillis(taskGet.getTimeGetTask());
        g.drawString("Время здачи задания " + cl.getTime(), 20, 75);
    }
    public void User() {

    }
}
