
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while (true) {
            double input = Double.valueOf(scanner.nextLine());

            // Rejects negative input
            if (input < 0) {
                continue;
            }

            // Exits loop
            if (input == 0) {
                break;
            }

            sum = sum + input;
            count = count + 1;
        }

        // If no positive num inputted, print this error message
        // Else, return average
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / count);
        }
    }
}
