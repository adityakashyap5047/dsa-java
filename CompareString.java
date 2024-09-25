public class CompareString {
    public static String largest(String str[]){
        String lrg = str[0];
        for(int i=1; i<str.length; i++){
            if (lrg.compareToIgnoreCase(str[i]) < 0) {
                lrg = str[i];
            }
        }
        return lrg;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        System.out.println(largest(fruits));
    }
}
