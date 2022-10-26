package Day1;

    // 실습

    public class Practice2 {
    public static void main(String[] args) {

        String message = "헬로 월드!";
        message = "웰컴 투 헬!";
        System.out.println(message);


        double score = 1 + 2 * (3 + 4) - 5;
        System.out.println(score);
        score = score/2;
        System.out.println(score);
        score = score/2;
        System.out.println(score);

        String b = "가나다라";
        String a = b;
        System.out.println(a);
        a = a + "마바사";
        System.out.println(a);






        String c = "상익이의";
        int month = 8;
        int day = 23;
        String d = "다이어트 일지";
        int count = 1;
        double weight = 72.4d ;
        System.out.println("==============================");
        System.out.println(c + month + "월" + day + "일" +d);
        System.out.println("==============================");
        System.out.println("금일 식사 횟수:" + count);
        System.out.println("금일 몸무게:" + weight);

        int e = Integer.parseInt("123");
        double f = Double.parseDouble("3.14");
        System.out.println(e+f);


      int C = Integer.parseInt("77.F");
      double D = (f-32.0)/1.8;
        System.out.println("화씨"+D+"도는 섭씨" + C + "도 입니다");

    }
}


