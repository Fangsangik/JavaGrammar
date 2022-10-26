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
