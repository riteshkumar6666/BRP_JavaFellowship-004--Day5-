//*** BRP_java fellowship-004 ***
//DAY5(PowerOf2.java )

import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num = 0;
        int i = 1;

        System.out.println("Enter the number for Calculate power of 2");
        Num = sc.nextInt();
        for (i = 1; i <= Num; i++) {
            double power = Math.pow(2, i);
            System.out.println("power of Two= " + power);
        }
        System.out.println();
    }
}


