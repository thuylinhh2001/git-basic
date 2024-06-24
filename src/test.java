import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap c hihieu rongnh chu nhat");
        int unit = scanner.nextInt();
        System.out.println("nhap chieu dai himh chu  nhat");
        int chieuDai = scanner.nextInt();
        int chuVi = (unit + chieuDai) * 2;
        int dienTich = (unit * chieuDai);
        int canhMin = Math.min(unit, chieuDai);



    }
}
