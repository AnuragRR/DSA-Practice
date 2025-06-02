package Recursion;

public class Recursion {

    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        return (n * fact(n-1));
    }

    public static int sumOfNatural(int n){
        if (n ==1){
            return 1;
        }
        return (n + sumOfNatural(n-1))  ;
    }

    public static int fib(int n){
         if (n == 1 || n == 0){
             return n;
         }

        int f1 = fib(n-1);
        int f2 = fib(n-2);
        return f1 + f2;
    }

    public static boolean isSorted(int[] arr , int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr , i+1);
    }

    public static void main(String[] args) {
//        System.out.println(fact(4));
//        System.out.println(sumOfNatural(5));
//        System.out.println(fib(6));4
        int[] arr = {1,2,3,7,90,10,13};
        System.out.println(isSorted(arr,1));
    }
}
