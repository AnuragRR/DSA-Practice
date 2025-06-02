package Conversion;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int pow = 0;
        int dec = 0;
        int last=0;
        int exp=1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number :");
        int bin = scanner.nextInt();
        System.out.println(bin);

        for (;bin>0;bin/=10){
            last = bin%10;
            dec= dec+last*exp;
            exp*=2;
//            dec= (int) (dec+last*Math.pow(2,pow));
            pow++;
        }
        System.out.println("The decimal value is :" + dec);
    }
}
