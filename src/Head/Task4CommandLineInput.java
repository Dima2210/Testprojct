/**
 * 
 */
package Head;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore.SecretKeyEntry;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс для получения у пользователя пароля 
 * @author User
 *
 */
public class Task4CommandLineInput {

    /** 
     * Задача 4
     * Переменая класса хронящая пароль введеный пользователем 
     */
    private String keysUser; 
    /** Преступил 28.11.16
     * Задача 5
     *  Переменая класса хронящая целое число введеный пользователям 
     */
    
    private long numberUser;
    /**
     * Конструктор дает возможность получить у пользователя ключ  (String)
     * @
     */
    /* решение от 25.11.16
    public Task4CommandLineInput() {
        // TODO Auto-generated constructor stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите информацию ");
        try {
            keysUser = reader.readLine();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    */
    // решение от 28.11.16
    /**
     * Метод дающий возможность заполнить поле keysUser
     */
    public  void setKeyUser () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите код ");
        try {
            keysUser = reader.readLine();

        } catch (IOException e) {
            // TOsddsadDO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getKeysUser() {
        return keysUser;
    }
    
    //Решение к задаче №5 от 28.11.16
    public void setNumberUser(){
       // Не могу исчпользовать т.к не нашел метода для проверки был поток в переменую типа long или нет 
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число: ");
        
        try{
            String s = reader.readLine();
            long l = Long.parseUnsignedLong(s);
            numberUser = l;
        } catch (IOException e){
            //e.printStackTrace();
        }
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (sc.hasNextLong()){
            numberUser = sc.nextLong();
        } else {
            System.out.println("Проверьте введеный данные они не соответствуют целочисленому типу");
        }
    }

    /**
     * Заполнить
     * @return
     */
    public static void readNamber() {

        // Вариант до 09.12.16
    /*  public static long readNamber() {
        Scanner sc = new Scanner(System.in);
        long summa = 0;
       do {
            System.out.println("Введите целое число: ");
            if (sc.hasNextLong()) {
                summa = +sc.nextLong();
           // } else if ("Enter".equals(sc.nextLine())) {
           //     return summa;
            } else if (!"Enter".equals(sc.nextLine())){
                System.out.println("Проверьте введеный данные они не соответствуют целочисленому типу");
               // throw new RuntimeException(" Введеная информация не соответствует типу Long");

            } else {
                System.out.println("сумма равна " + summa);
            }
        } while(!"Enter".equals(sc.nextLine()));
       System.out.println("сумма равна " + summa);
        return summa;
        */
        //решение 09.12.16
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        long summa = 0;
        do {
            if (sc.hasNextLong()) {
                summa += sc.nextLong();
            } else {
String stt = sc.next();
                if ("Enter".equals(sc.nextLine())) {
                    System.out.print("Сумма введеных чисел равна " + summa);
                } else if (!"Enter2".equals(stt)) {
                    System.out.println("Введеное значение не соответствует типу long");
                    throw new RuntimeException("Введеное значение не соответствует типу long");
                }
            }
        } while (sc.hasNext());
        System.out.print("Упс сумма введеных чисел равна " + summa);
    }

    public long getNumberUser() {
        return numberUser;
    }
}
