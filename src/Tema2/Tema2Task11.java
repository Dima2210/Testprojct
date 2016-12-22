package Tema2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * “ема 2 задача 1
 * @author User
 * ¬вести n строк с консоли, найти самую длинную строки. ¬ывести найденые строки и их длины
 *
 */

public class Tema2Task11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("¬ведите п€ть строк");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayString = new String[5];
        int maxindex = -1;
        String maxString = "-1";
        for (int index = 0; index < arrayString.length; index++) {
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                arrayString[index] = reader.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
            if (maxindex < arrayString[index].length()) {

                maxString = arrayString[index];
                maxindex = arrayString[index].length();

                /* а надо ли это делать
                Math.max(arrayString[index - 1].length(), arrayString[index].length());
                */
            }
        }
        System.out.println("а вот сама€ длинна€ строка ))) " + maxString);
        //System.out.println("а вот сама€ длинна€ строка ))) " + arrayString[maxindex]);
        for (int index = 0; index < arrayString.length; index++) {
            System.out.println(arrayString[index] + " ƒлина строки равна " + arrayString[index].length());
        }

    }

}
