package Day4;/*
counddown을 시작합니다
5
4
3
2
1
0
발사
 */

public class WhileCountdown {

    public static void CountDown(int num){
        System.out.println("카운트다운 시작합니다");

        while (num>=0) {
            System.out.printf("%d..\n" , num); // 5.. ,4.. , 3..
            num--;
        }
        System.out.println("발사");

    }

    public static void main (String[] args){
        int startNum = Integer.parseInt(args[0]); //"5" => 5

        CountDown(startNum);
    }
}
