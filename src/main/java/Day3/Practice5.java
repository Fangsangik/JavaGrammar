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








