package Week_02;

import java.util.Scanner;

public class Question_01_01 {
    public static void main (String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a celcius degree:");
        double celcius = input.nextDouble();
        double fahreneit = (9 / 5.0) * celcius + 32;
        System.out.println(celcius + " Celcius is " + fahreneit + " Fahreneit");
    }
}
