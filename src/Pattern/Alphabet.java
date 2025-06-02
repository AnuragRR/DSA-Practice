package Pattern;

public class Alphabet {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5;
        for (int line = 1; line <= n; line++) {
            for (int i = 1; i <=line ; i++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
