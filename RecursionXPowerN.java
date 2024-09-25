public class RecursionXPowerN {
    public static int xPowerN(int x, int n){  //Time complexity = O(n) 
        if (n == 0) {
            return 1;
        }
        return x*xPowerN(x, n-1);
    }

    public static int power(int x, int n){  //Time complexity = O(n) 
        if (n==0) {
            return 1;
        }
        else if(n % 2 == 0){
            return power(x, n/2)*power(x, n/2);
        }
        else{
            return x*power(x, n/2)*power(x, n/2);
        }
    }

    public static int optimizedPower(int x, int n){ //Time complexity = O(logn) 
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if ((n % 2) != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(xPowerN(2, 10));
        System.out.println(power(2, 10));
        System.out.println(power(2, 9));
        System.out.println(optimizedPower(2, 10));
        System.out.println(optimizedPower(2, 9));
    }
}
