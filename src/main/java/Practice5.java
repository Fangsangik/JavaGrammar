/*
조건문
상황에 따라 흐름을 결정하는 조건문
특정 조건을 결정할때 사용하는 문법
1) if
특정 동작의 사용 여부
if (조건) {
    조건이 참일 때 수행할 내용
}

2) if else
둘중 하나를 선택할 때 사용
if (조건) {
    조건이 참일 때 수행할 내용
}else{
    거짓일때 수행
}

3)else if
여러가지 선택지들 중 하나를 고를때
if (조건) {
    조건이 참일 때 수행할 내용

}else if { 또 다시 조건 검색이 가능하다
    참이라면 이 조건을 줌

}else {
    거짓일 때 수행

}

조건문은 실행의 흐름을 결정하는 것

if문은 특정 동작을 실행하거나 하지 않는다

else if - 양자택일 함

비교/논리 연산자
비교 연산자 - 좌우 값의 크기를 비교하여 참/거짓 값을 반호나 함
== 같은가 , != 같지 않은가, > 큰가 , <작은가, >=크가나 같은가, <= 작거나 같은가

논리 연산자 - 좌우에 논리 값을 입력ㅇ르 받아 새로운 논리 값을 반환
AND(&&) - 조건 모두가 만족하면 참 , 하나라도 거짓이 포함되어 있으면 거짓 / OR (||) - 하나라도 만족하면 참 , 모두 거짓이여야 거짓이 성립이 됨

중첩된 조건문 문제
조건문 속에 또다른 조건문을 사용할 수 있음


 */
/*
public class Practice5 {
   1)

    public static void order(int age) {
        if (age >= 19) {
            System.out.printf("%d세, 성인인증 완료 ==> 캔맥주가 나왔습니다.\n", age);
        }
    }

    2)

    public static void buy(int age) {
        String result = "";

        if (age >= 19) {
            result = "성인입니다";
        } else {
            result = "미성년자 입니다";
        }

        System.out.printf("%d세 => 담배팜매(%s)\n", age, result);

    }

    3)

    public static void prinRole(int age) {
        String role = "";

        if (age >= 22) {
            role = "성인";
        } else if (age >= 16) {
            role = "청소년";
        } else if (age >= 10) {
            role = "어린이";
        } else {
            role = "유아";
        }

        System.out.printf("%dtkf ==> %s살 입니다\n", age, role);


    }

    4)

    public static void printTest(String name, int math, int eng) {
        String result = "";

        if ((math >= 90) && (eng >= 90)) {
            result = "전액";
        } else if ((math >= 85) || (eng >= 80)) {
            result = "반액";
        } else {
            result = "탈락";
        }
    }

    5)

    public static void test(double height, boolean isMale) {
        String gender = "";
        String result = "";

        if (isMale == true) {
            gender = "남자";
        }
        if (height >= 176.3) {
            result = "이상";
        } else if (171.7 >= height) {
            result = "이하";
        } else {
            gender = "여성";
            if (height >= 162.7) {
                result = "이상";
            } else {
                result = "이하";
            }
        }
    }


        public static void main (String[]args){
            1)
            order(18);
            order(19);
            order(20);

            2)
            buy(15);
            buy(19);
            buy(22);

            3)
            prinRole(22);
            prinRole(16);
            prinRole(10);
            prinRole(4);

            4)
            printTest("park", 100, 92);
            printTest("kim", 82, 85);
            printTest("Choi", 15, 20);

            5)
            test(176.3, true);
            test(162.7, false);
            test(171.8, true);
            test(158.4, false);
        }
    }

 */








