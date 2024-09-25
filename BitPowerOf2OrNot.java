public class BitPowerOf2OrNot {
    public static boolean checkPower(int n){
        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkPower(8));
        System.out.println(checkPower(15));
    }
}
