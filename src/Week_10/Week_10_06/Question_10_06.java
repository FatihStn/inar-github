package Week_10.Week_10_06;


import Week_10.Week_10_03.MyInteger;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        for (int i = 1; i < 120; i++) {
            if (MyInteger.isPrime(i)){
                stackOfIntegers.push(i);
            }
        }
        while (!stackOfIntegers.empty()){
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}