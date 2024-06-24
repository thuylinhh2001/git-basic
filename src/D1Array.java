public class D1Array {
    public static void main(String[] args) {
        //alex의 점수
        int score1 = 85;
        //brand의 점수
        int score2 = 80;
        //chad의 점수
        int score3 = 90;
        //여러 데이터를 하나의 변수에 담고
        int[] scores = { 85, 80, 90 };
        //85, 80, 90
        //자료 상관없이
        double[] grades = { 3.0, 3.5, 4.0 };
        String[] names = {"alex", "brad", "chad"};

        //데이터를
        System.out.println(names[0]);
        System.out.println(scores[0]);
        System.out.println(grades[0]);

        //데이터를
        grades[0] = 4.0;
        System.out.println(names[0]);
        System.out.println(scores[0]);
        System.out.println(grades[0]);
                //index out of
        scores[3] = 10;
        System.out.println(scores[3]);

        //배열의
        //16칸짜리
        int[] arr = new int[16];
        //변수의
        int studentCount = 128;
        int[] ages = new int[studentCount];
        int[] ages2 = new int[studentCount];
        //배열의 크기
        System.out.println(ages.length);


    }
}
