package Day4;

/*
주어진 코드는 1부터 10까지의 합을 출력한다
이때 Break문을 삽입하여 출력과 같은 예의 결과를 얻어라
1+2+3+4+5+6+7+8+9+10+ = 55
 */
public class Break {
    public static void main(String[] args) {
        printSum(1, 10);
    }

    public static void printSum(int start, int end) {//start =1 , end =10
        int sum = 0;

        for (int i = start; i <= end; i++) {
            System.out.printf("d%", i);
            sum += i;//sum에 i 값을 대입
            if (i == end) { //마지막 숫자라면 아래의 내용을 수행하지 않고 탈출한다.
                break;
            }
            System.out.printf("+");// 갱신을 하게 됨 + 표시를 해줌

            System.out.printf("\n=>%d", sum);
        }
    }
}
