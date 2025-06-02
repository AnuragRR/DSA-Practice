package Array;

public class SubArray {

    public static void subArray(int data[]){
        for (int i =0 ; i< data.length;i++){
            for(int j = i; j< data.length;j++){
                System.out.print("(");
                for(int k = i;k<=j;k++){
                    System.out.print(data[k]+",");
                }
                System.out.println(")");
            }
        }
    }
    public static void main(String[] args) {
        int[] data = {8,45,10,3,4,78,2,6};
        subArray(data);
    }
}
