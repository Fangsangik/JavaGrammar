/*
원주율 - Math.PI
double pi = Math.PI //3.14569265....

절대값 - Math.abs();
double x = Math.abs(-9.81); // 9.81

반올림 - Math.round();
int n = Math.round(10.6) // 11
 */
public class Math {

    public static void main (String[] args){
        // S= 파이 * r제곱
        // r= 4
        // 50.265
        String r = "4";
        Double s = 50.265;
       int a = Integer.parseInt(r); // "4" => 4
        double b = 3.14*a*a;
        System.out.printf("반지름이 %d인 원의 넓이 => %.3f", a,b);
    }

}
