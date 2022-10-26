package Day4;

/*
출력을 시작합니다
1,2,3,4,5,6,7
끝
 */
public class For {
    public static void printNumber(int max) {
        for (max = 0; max <= 7; max++) {
            System.out.printf("%d", max);
        }
        System.out.println("\n끝");
    }



    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        printNumber(n);

    }
}
