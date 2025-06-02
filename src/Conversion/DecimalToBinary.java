package Conversion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        StringBuilder bin= new StringBuilder();
        int bit=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number :");
        int dec = scanner.nextInt();

        while(dec>0){
            bit=dec%2;
            bin.append(bit);
            dec /=2;
        }
//        char[] charArray = bin.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder(bin);
        bin.reverse();
//        stringBuilder.toString();

        System.out.println(bin.toString());
    }

//    public static String arrayToReverseString(char[] rawArray){
//        int i = 0;
//        int j = rawArray.length-1;
//        char temp;
//        System.out.println(rawArray);
//        while (i<=j){
//            temp = rawArray[i];
//            rawArray[i]=rawArray[j];
//            rawArray[j]=temp;
//            i++;
//            j--;
//        }
//
//        return rawArray.toString();
//
//    }
}
