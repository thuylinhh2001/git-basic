import java.util.Scanner;

public class tsest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] me = new String[3];
        double[] em = new double[3];

        me[0] = scanner.nextLine();
        me[1] = scanner.nextLine();
        me[2] = scanner.nextLine();

        em[0] = scanner.nextDouble();
        em[1] = scanner.nextDouble();
        em[2] = scanner.nextDouble();

        System.out.println("name -" + me[0] + "," + "grade -" + em[0]);
        System.out.println("name -" + me[1] + "," + "grade -" + em[1]);
        System.out.println("name -" + me[2] + "," + "grade -" + em[2]);


    }
}
