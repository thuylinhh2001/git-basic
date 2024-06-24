import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
//        qs1
//        Scanner scanner = new Scanner(System.in);
//        String ab = scanner.nextLine();
//        System.out.println(ab);
//        System.out.println(ab);
//        System.out.println(ab);
//
//        qs2
//        Scanner scanner = new Scanner(System.in);
//        int num10 = scanner.nextInt();
//        int num20 = scanner.nextInt();
//        System.out.println(num20);
//        System.out.println(num10);

//        qs3
//        String Linh ="  *   *\n" +
//                " *** ***\n" +
//                "*********\n" +
//                "*********\n" +
//                "  *****\n" +
//                "    *";
//        System.out.println(Linh);

//        qs4
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
