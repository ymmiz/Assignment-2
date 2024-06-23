package exercise;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int result = sumUsingForLoop(number);
        int result1 = sumUsingForLoop(number);
        System.out.println("Sum using for loop: "+ result);
        System.out.println("Sum using while loop: "+ result1 );
    }
    public static int sumUsingForLoop(int n){
        int num = 0;
        for (int i = 1; i <= n;i++){
            num += i;
        }
        return num;
    }
    public static int sumUsingWhileLoop(int n){
        int num1 = 0;
        int i = 1;
        while (i <= n){
            num1 += i;
            i++;
        }
        return num1;

    }
}
