public class Factorial {
    public static int calculate(int number){
        int res = 1;
        int i = 2;
        while(i <= number){
            res *= i;
            i++;
        }
        return res;
    }
}
