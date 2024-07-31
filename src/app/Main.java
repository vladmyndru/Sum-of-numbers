package app;

public class Main {
    public static void main (String [] args) {

        int num01 = 1;
        int sum01 = 0;

        while (num01 <= 6) {
            sum01 += num01;
            System.out.println(num01 + ") Num is " + num01 + ", sum is " + sum01);
            num01++;
        }
        System.out.println("----------------");
        System.out.println("Sum of numbers is " + sum01);
    }
}
