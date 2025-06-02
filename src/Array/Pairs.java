package Array;

public class Pairs {

    public static void makePair(int data[]){
        int i = 0;
        while (i< data.length-1){
            int j= i+1;
            while (j< data.length){
                System.out.println("("+data[i] + "," +data[j]+")");
                j++;
            }
            i++;
        }

    }
    public static void main(String[] args) {
        int[] data = {8,45,10,3,4,78};
        makePair(data);
    }
}
