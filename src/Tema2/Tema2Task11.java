package Tema2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� 2 ������ 1
 * @author User
 * ������ n ����� � �������, ����� ����� ������� ������. ������� �������� ������ � �� �����
 *
 */

public class Tema2Task11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("������� ���� �����");
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

                /* � ���� �� ��� ������
                Math.max(arrayString[index - 1].length(), arrayString[index].length());
                */
            }
        }
        System.out.println("� ��� ����� ������� ������ ))) " + maxString);
        //System.out.println("� ��� ����� ������� ������ ))) " + arrayString[maxindex]);
        for (int index = 0; index < arrayString.length; index++) {
            System.out.println(arrayString[index] + " ����� ������ ����� " + arrayString[index].length());
        }

    }

}
