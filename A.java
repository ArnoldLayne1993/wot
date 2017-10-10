package dz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new BufferedReader(new FileReader("lab01.txt"))).useLocale(Locale.US);
        int even=0;
        int odd=0;
        int summEven=0;
        int summOdd=0;
        double summ=0;
        int word=0;
        sc.useDelimiter(" ");
        while(sc.hasNext()){
            if(sc.hasNextInt()) {
                int next=sc.nextInt();
                if(next%2==0) {
                    even++;
                    summEven+=next;

                }else{
                    odd++;
                    summOdd+=next;

                }
            }else if (sc.hasNextDouble()) {
                summ+=sc.nextDouble();
            }else {
                word++;

                sc.next();
            }
        }
        sc.close();
        System.out.println("Even: "+even+ "; Odd: "+odd);
        System.out.println("Сумма четных чисел равна = " + summEven);
        System.out.println("Сумма нечетных чисел равна = " + summOdd);
        System.out.println("Сумма дробных чисел равна = " + summ);
        System.out.println("Количество слов =" +word);

}vsdppsdkasdkfpsdkfsdpf
}
//fsdfsdfsdfsdfsdfsdc
