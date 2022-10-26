package Day4;
/*
구구단 출력하는 문제 2단~9단 까지
 */
public class Final {

    public static void printDan(int dan) {
        System.out.printf("%d단\n", dan);

        for (int i =1; i<=9; i++ ){
            System.out.printf("\t"); // 역슬래쉬 t는 들여쓰기 효과
            System.out.printf("%d * %d = %d\n", dan, i, i*dan);
        }
    }

    public static void GUGU(){
        for (int a=2; a<=9; a++){//a의 값은 2부터 9까지
            printDan(a);
        }
    }

    public static void main (String[] args){
        GUGU();
    }
}
