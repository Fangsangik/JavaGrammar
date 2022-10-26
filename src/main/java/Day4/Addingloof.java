package Day4;
/*
주어진 코드는 행과 열의 정보를 입력 받아 RxC의 별표시 행렬을 출력한다

행의 수를 R, 열의 수를 C라고 할때 R,C의 형태로 입력한다
2 2

출력 예
*******
*******
*******

 */

public class Addingloof {

    public static void printMatrix(int rowMatrix, int columnMatrix){
        for (int i =0; i<rowMatrix; i++){
            for(int j =0; j<columnMatrix; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);//3값을 받고
        int c = Integer.parseInt(args[1]);//7값을 받는다

        printMatrix(r,c);//matrix을 출력하는 영역
    }
}