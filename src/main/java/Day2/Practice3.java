package Day2;

public class Practice3 {
    public static void main (String[] args) {
        int age = 28;
        System.out.println("상익이의 나이는" + age + "세");
        System.out.printf("상익이의 나이는 %d세 입니다" , age);

        int result = 7/2;// int/int => int = 3
        System.out.printf("7/2는 %d입니다" , result);

        int a = 6/2;//3
        int b = 7/2 ;//3
        System.out.printf("a = %d, b = %d" , a, b);

        double x = 7.0/2.0;
        double y = 7/2; // 3.5(X) => 3(o) => 자동변환 => 3.0

        System.out.printf("x = %f, y=%f\n", x,y);

        String title = "로미오와 줄리엣";
        String author = "셰익스피어";
        double price = 5.94;

        System.out.printf("제목:%s \n" , title);
        System.out.printf("저자:%s \n", author);
        System.out.printf("가격:%.3f \n" , price);

        int height = 176;
        double weight = 82.34;

        System.out.printf("신장: %dcm\n", (int)height);
        System.out.printf("체중: %dcm\n", (int)weight);

        String A = "7";
        String B = "3.14";

        int C = Integer.parseInt(A);
        double D = Double.parseDouble(B);

        double E = C+D;
        System.out.printf("%d +%f = %.2f" , C,D,E);


    }
}
