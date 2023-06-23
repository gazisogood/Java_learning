import java.util.Scanner;
import java.util.Arrays;

class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] num = new int[str.length];

        for(int i = 0; i < str.length; i++){
            num[i] = str[i].length();
        }

        for(int x: num) {
            System.out.println(x);
        }
    }
}