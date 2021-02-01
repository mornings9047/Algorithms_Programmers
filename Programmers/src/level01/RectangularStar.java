package level01;

import java.util.Scanner;

public class RectangularStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < b; i++) {
            builder.append("*".repeat(Math.max(0, a)));
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}
