//inline comments
/*@author Nidhi Gupta
 *@version 1.0
 */
package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));


        }
    }

}
