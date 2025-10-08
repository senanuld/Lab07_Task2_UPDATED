import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("for 2 count down by 1 from 30 to 0: ");
        for (int i = 0; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}