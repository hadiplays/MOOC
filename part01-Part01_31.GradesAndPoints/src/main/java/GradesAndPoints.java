
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scan.nextLine());

        if (points > 100) {
            System.out.println("incredible!");
        } else if (points > 49) {
            int grade = (points / 10) - 4;
            if (grade > 5) {
                System.out.println(5);
            } else {
                System.out.println(grade);
            }
        } else if (points >= 0) {
            System.out.println("failed");
        } else {
            System.out.println("impossible!");
        }
    }
}
