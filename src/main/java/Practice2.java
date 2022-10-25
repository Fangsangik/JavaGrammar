
     /*
        변수 - 변하는 수 , 값을 저장하는 값
        int(변수의 형태로써 type (String int double boolean) age(변수 이름) =(연산자) 34 ;
        연산자는 오른쪽 결과값을 왼쪽 변수에 저장

        int result = 3+8*(3-1);
        연산자 우선순위 - 실행 순서는 연산자에 의해 결정
        같은 우선순위의 경우, 왼쪽에서 오른쪽으로 진행

        생성된 변수는 새로운 값으로 변경 될 수 있다.
        String str = "abcd";
        새로운 값으로 변경
        str = "ABCD";
        sout(str) -> ABCD

        연산자 우선순위
        1. ()
        2. * & /
        3. + & -
        4. =
        5. 같은 우선 순위의 경우 왼쪽에서 오른쪽 연산

        변수의 값은 또다른 변수에 대입, 복사 될 수 있다.
        double origin = 3.14;
        double copy = origin; (3.14를 그대로 copy 값에 대입)
        sout -> 3.14

        문자열은 덧샘 연산이 가능
        String a = "AAA"
        String b = "BBB"
        String c = a+b;
        sout -> AAABBB

        문자열과 숫자와의 연결
        정수 (int)와 문자열 연결
        int hour = 13;
        sout("지금은" + hour + "시");

        double weight = 1.45
        sout ("무게:" + weight + "kg");
        boolean sleepy = true ;
        sout ("슬슬졸림?" + true);

        입력값 받기
        사용자로 부터 입력값 전달을 받기 위해서는
          public static void main(String[] args)
          sout(args[0]) - 파라미터 & 배열, 전달된 입력값은 문자열이 되는데 이를 변수 args[0]을 통해 사용될 수 있다.


        사용자가 입력한 값은 모두 문자열
        123.3.14
        이러한 문자열은 숫자 계산을 할 수 없음. 문자열간 덧샘은 그저 하나로 연결 되기 때문
        "123" + "3.14" + ==> "1233.14"
        sout(args[0] + args[1});  == > 123.3.14값으로 나옴

        1. 정수로 바꾸고 싶은 경우 "123" => 123
        int a = Integer.parseInt(args[0]);
        2. 실수로 바꾸고 싶은 경우 "3.14" => 3.14
        double b= Double.parseDouble(args[1]);


         */

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


