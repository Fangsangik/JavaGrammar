package Day4;
/*
1부터 10까지 합을 출력하고, continue 문을 같이 수행한다
 */

public class Continue {

    public static void printSum(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.printf("%d,", i);
            sum += i;
            if (i == end){
                break;
            }
            System.out.printf("+");
        }
        System.out.printf("\n => %d", sum);
    }


    public static void main(String[] args){
       printSum(1,10);
    }
}
