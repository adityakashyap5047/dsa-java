public class BinaryString {
    public static void printBinaryString(int n, int idx, String curr, String str){
        if (n == 0 || idx == n) {
            System.out.println(str);
            return;
        }
        else if (curr == "0") {
            printBinaryString(n, idx+1, "0", str+"0");
            printBinaryString(n, idx+1, "1", str+"1");
        }
        else if (curr == "1") {
            printBinaryString(n, idx+1, "0", str+"0");
        }

    }
    public static void main(String[] args) {
        printBinaryString(2, 0, "0", new String(" "));        
    }
}
