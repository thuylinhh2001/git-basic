public class D1StringAdv {
 public static void main(String[] args) {
     //hello;
     //System.out.println("Hello, thuylinh!!!");
     System.out.println("Hello, thuylinh!!!");
             System.out.println("//");
             //n;
     System.out.println("A와 B 싸이 \n를 넣었다.");
             //탭(Tab)
     System.out.println("A와 B 사이 \t를 넣었다.");
     System.out.println("name: \nthuylinh");
     System.out.println("name: \tthuylinh");
     //Carlage Return;
     System.out.println("abc\rdef");
     //String;
     int dust = 10;
     String status = "좋음";
     //hn;
     System.out.println("hn: dust (status)");
     String message = String.format(("hn: %d, (%s)"), dust, status);
     System.out.println(message);
     System.out.println(String.format("미세먼지 농도: %d, (%s)", dust, status));
     System.out.println(String.format("코드: %c", 'B'));
     System.out.println(String.format("오존: %f", 0.022));
     System.out.println(String.format("오존: %.4f", 0.022));

     //%hn
     System.out.println(String.format("%d, %d, %d", 1, 2));
     //%gn
     System.out.println(String.format("%d, %d, %d", 1, 2, 3, 4));
 }

}
