/*
1. Type과 형 변환
        - 오류가 발생하는 이유

        나눗샘 연산
        double a = 5/2;
        int b = 4/2;
        int c = 5/2; (2.5 X/ 2 o)
        int/int => int 소수점 이하가 버려진다

        값과 타입이 일치해야 한다
        ex) int age = "110" ; int는 정수형 / "110"은 String = 불일치

        형 변환
        자동 변환 & 직접 변환
        자동변환이란 알아서 바꾸어줌
        ex) double p = 2; - 실수형 type / 정수 int
        int r = 10.04;  => Erro ( 정수형은 실수형을 담을 수 없음)
        이럴 때는 직접 변환 방법인 Casting을 활용
        int r = (int) 10.04; => 정수인 10으로 count
        * 숫자 타입들 : byte, short, int. long, float, double = Casting 가능

        printf() - 정수값 출력 (%d)
        System.out.printf("상익이의 나이는 %d세 입니다" + age);
        %d에는 age라는 변수의 값이 %d로 위치 한다
        하나의 문자열에 변수를 삽입하는 형태로 함
        %d라는 의미는 d에 오는 변수가 정수라는 의미
        두개 이상의 변수 또한 삽입이 가능

        int month = 10;
        int day = 4;
        System.out.printf ("제 생일은 %d월 %d일 입니다" , month ,day);

        printf() - 실수형 변수 (%f)
        double pi = 3.14;
        System.out.printf ("파이의 값은 %f 입니다. " , pi);

        printf() - 문자열 삽입 (%s)
        String name = "상익";
        String hobby = "축구";
        System.out.printf("이름: %s" , name);
        System.out.printf("취미: %s" , hobby);

        추가적으로 줄내림이 필요할 경우 ＼n

        실수값 출력을 할때 소수점이 너무 길면 소수점 자리 정해서 출력 가능
        System.out.printf ("%.2f" , pi); => 소수점 둘째 자리 까지 출력 하겠다

        Casting - 실수를 정수로
        출력 변수의 타입을 강제변환(Casting) 한다
        double pi = 3.14;
        System.out.printf("%d" , (int) pi); => 3
        */