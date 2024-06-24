public class Q1 {
    public static void main(String[] args) {
        // 느긋하면(남은시간 1시간 이상) 버스, 급하면 택시
        int current = 8;
        int goal = 9;
        if (goal - current >= 2) {
            System.out.println("Take Bus");
        }
        else if (goal - current >= 1) {
            System.out.println("Take Subway");
        }
        else {
            System.out.println("Take Cab");
        }

        // 미세먼지 농도에 따른 메시지 변경
        int dust = 62;
        if (dust <= 30) {
            System.out.println("Good");
        }
        else if(dust <= 80) {
            System.out.println("Normal");
        }
        else if (dust <= 150) {
            System.out.println("Bad");
        }
        else {
            System.out.println("Very Bad");
        }
    }
}
