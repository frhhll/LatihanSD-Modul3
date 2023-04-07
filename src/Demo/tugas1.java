package Demo;

import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata: ");
        String kata = input.nextLine();

        String kataTerbalik = "";
        for (int i = kata.length() - 1; i >= 0; i--) {
            kataTerbalik += kata.charAt(i);
        }

        System.out.println("Kata terbalik: " + kataTerbalik);
    }
}