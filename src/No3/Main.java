/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No3;

import java.util.Scanner;
/**
 *
 * @author UTRIA
 */

public class Main {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Bilangan Bulat: ");
        long number = masukan.nextLong();
        int sum = sumDigits(number);
        System.out.println("Jumlah digit dalam bilangan adalah: " +sum);
        masukan.close();
    }

public static int sumDigits(long n){
        int sum = 0;
        while (n != 0){
            int digit = (int) (n % 10);
            sum += digit;
            n /= 10;
        }
        return sum;

    }

}