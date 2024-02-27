package yildizElmas;

import java.util.Scanner;

public class yildizElmas {
    public static void main(String[] args) {
    	
    	int sayi,i,j,k;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Elmasın uç kısmı ortaya kaç satır uzak olsun? : ");
        sayi = input.nextInt();
      
        for (i = 0; i < sayi; i++) {
            for (j = 0; j < sayi - i - 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (i = sayi - 2; i >= 0; i--) {
            for (j = 0; j < sayi - i - 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}