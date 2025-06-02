package Array;

public class PlusOne {
    public static void main(String[] args) {
        String res= "";
        int[] arr = {2,4,5};
        if( arr[arr.length-1]==9){
            int[] data = new int[arr.length+1];
        }
        else {
            int[] data = new int[arr.length];
        }
        for (int i : arr){
            res= ((String)res)+i;
        }
        int data = Integer.parseInt(res)+1;

        String data2=""+data;
        System.out.println(data2.charAt(0) - '0');
    }
}
