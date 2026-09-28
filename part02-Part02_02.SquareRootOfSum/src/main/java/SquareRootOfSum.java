
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.valueOf(scanner.nextLine());
        double second = Double.valueOf(scanner.nextLine());

        System.out.println(Math.sqrt(first + second));

    }
}
