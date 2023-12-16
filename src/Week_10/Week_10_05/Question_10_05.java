package Week_10.Week_10_05;


import Week_10.Week_10_03.MyInteger;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int answer = input.nextInt();
        displayFactors(answer);
    }

    public static void displayFactors(int number) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        int divisor = 2;
        while (divisor <= number) {
            if (MyInteger.isPrime(divisor) && number % divisor == 0) {
                stackOfIntegers.push(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }
        while(!stackOfIntegers.empty()){
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}