public class DPCatalansNumber {

    public static int catlan(int n){
        if (n == 0 || n == 1) {
            return 1;
        }

        int catN = 0;
        for (int i = 0; i < n; i++) {
            catN += catlan(i)*catlan(n-1-i);
        }

        return catN;
    }

    
    
    public static void main(String[] args) {
        System.out.println(catlan(5));


    }
}
