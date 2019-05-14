package ShortHandOperationANDMissilenous;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Example01();
        Example02();
        Example03();
    }

    private static void Example01(){
        int num =   25;
        boolean isPrime = true;

        for (int i=2 ; i<num; i++){
            if (num%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num +" is a Prime number");
        }else {
            System.out.println(num+" is not a Prime number");
        }

    }

    private static void Example02(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number value : ");
        int x = scanner.nextInt();
        boolean isPrime = true;

        for (int i=2 ; i<x; i++){
            if (x%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(x +" is a Prime number");
        }else {
            System.out.println(x+" is not a Prime number");
        }
    }
    private static void Example03(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number value : ");
        int x = scanner.nextInt();
        boolean isPrime = true;

        for (int i=2 ; i<Math.sqrt(x); i++){
            if (x%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(x +" is a Prime number");
        }else {
            System.out.println(x+" is not a Prime number");
        }
    }
}
