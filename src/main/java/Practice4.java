/*
-method
일련의 동작을 하나로 묶는것
입력값에 따른 반환값이 있다. 입력에 따른 반한값을 정해 놓고 사용 가능.

method 호출
method를 실행 시키는 것
double x - Math.abs(-9.81) -> 9.81로 바꾸어 줌
         - Math.round(10.4) -> 10

method 정의
일련의 코드들이 작성 되어 있어야 함
JAVA API - 자바가 코드를 제공하는 것

int z = square(); -> 제곱을 함

메소드 이름 - 호출 코드와 일치해야 함
입력변수 - 메소드 실행에 필요한 정보를 받아옴 (매개변수, parameter)
반환 값
반환 타입

public static (반환타입 = int) (메소드 이름=square) (입력변수= int n) { // 입력값 받기
int result ; (변수 생성)
result = n*n; (값 계산)
return result (값 반환)

메소드 호출 시 입력한 값은 입력 변수 즉, 파라미터로 대입됨
입력변수 = 파라미터

입력변수가 2개인 경우 다중 파라미터 메소드라고 함
int a = times(3,4);
int b - times (5,6)

public static int times (inta , int b){
return a*b;
}

잘못된 parameter
입력된 전달 값이 파라미터와 일치하는 확인
int x = foo(0.0) // double을 int로 대입 불가
int y = foo("3") // String을 int로 대입 불가

반환 값 또한 신경
public static int foo (int n ) {
return n+n;
}
String z = foo (3);
 => Error

 파라미터가 없는 메소드
 int a = getTen();
 public static int getTen(){
 return 10;
 }

 Math.random() 메소드는 파라미터가 없는 대표적 예
 double x = Math.random();

 메소드에는 항상 리턴 값이 있는 것은 아니다.
 타입 자리에 void를 넣어준다

 printHello();

 public static void printHello(){
 sout("Hello");
 return;

 반환 값이 없기 때문에 return 이라는 키위드 생략 할 수 있다.
 public staitc void printHello() {
 sout("Hello")
 }

 메소드의 중첩 호출
 메소드는 내부적으로 여러번 호출 할 수 있다.
 threeStar () ;
 public static void treeStar(){
 oneStar() ;
 oneStar() ;
 oneStar() ;
 }

 public static void oneStar () {
 souf("*")
 }
 =>***

 */


/*
import java.lang.Math;
import java.net.Proxy;

public class Practice4 {

     // 1)
     public static int cube(int n){
         int result;
         result = n*n*n;
         return result;
     }


    2)

    public static double volume(double r, double h) {
        double result;
        result = Math.PI * r * r * h;
        return result;
    }
3)

    public static double cube(double n) {
        return n * n * n;
    }

    public static int square(int n) {
        return n * n;
    }

    4)

    public static int rollDie() {
        double r = 6 * Math.random();
        int temp = (int) r;
        int n = temp + 1;
        return n;
    }

    5)

    public static void boil() {
        System.out.printf("물을 끓인다");
    }

    public static void buy() {
        System.out.printf("라면을 사온다");
    }

    public static void eat() {
        System.out.printf("맛있게 먹는다");
    }

    public static void put() {
        System.out.printf("라면을 넣는다");
    }

    6)

    public static void drawEdge() {
        System.out.println("");
    }

    public static void drawRectangle() {
        System.out.println("");
    }

    public static void drwaLine() {
        System.out.println("");
    }

    7)

    public static double calcualte(int n) {
        int gram = n * 180;
        double kcal = gram * 5.179;
        return kcal;
    }

    public static void main(String[] args) {
    /*
        1)
        int n=3;
        int x = cube(n);
        System.out.printf("%d의 세제곱 => %d", n, x);

     2)
            double r = 7.0;
            double h = 5.0;
            double v = volume(r, h);
            System.out.printf("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피: %.1f", r, h, v);


        3)
        int a = square((int) 3.0);
        int b = (int) cube(2.0);

        System.out.printf("a = %d, b = %d\n", a, b);

        4)
        int x = rollDie();
        System.out.printf("주사위의 눈: %d", x);

        5)
        buy();
        boil();
        put();
        eat();

        6)
        drawRectangle();

        7)
        int num = 3;
        double result = calcualte(num);
        System.out.printf("삼겹살 %d인분: %.2f kcal", num, result);


    }
}

     */
