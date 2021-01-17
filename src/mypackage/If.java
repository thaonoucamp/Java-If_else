package mypackage;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x: ");
        int x = scanner.nextInt();

        if (x > 5) {
            System.out.println(x + " > 5");
        } else {
            if (x == 5) {
                System.out.println(x + " = 5");
            } else {
                System.out.println(x + " < 5");
            }
        }
        System.out.println("Ket thuc.");
    }
}
