/**
 *  Задачи по 2 теме Книго Блинов
 *  Во всех заданиях необходимо вывести внизу фамилию разроботчика, дату и время получения задания, а также дату и
 *  время сдачи задания. для получения последней даты и времени следует использовать класс Date. Добавить коментарии
 *  в программу ввиде , извлечь эту документацию в HTML-файл и просмотреть полученную страницу в Web-браузаром.
 */
package Tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Head.Task4CommandLineInput;
/**
 * Тема 2 задача 1
 * @author User
 * Ввести n строк с консоли, найти самую длинную строки. Вывести найденые строки и их длины
 *
 */
public class Tema2Task1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Ура");
        //создал поток 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        // Начало цикла не уверен в методе markSupported() надо пронего прочетать
        // Нехватает флага для завершения считывания с консоли  или поменять цикл на for с предварительным вводом с консоли кол-во строк
        while (reader.markSupported()) {
            try {
                list.add(reader.readLine());
            } catch (IOException e) {
                System.out.println("А тут засада Не прошли проверку на null");
            }
        }
        // Цикл для вывода на экран введеных строк с указанием их размера а также опредиления самой длиной строки
        for (int index = 0; index < list.size(); index ++) {
            System.out.println("Введеная строка; " + list.get(index) + "Её размер равен " );
        }
        
        

    }

}
