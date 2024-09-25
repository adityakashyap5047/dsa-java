public class StringsPalindrome {
    public static boolean checkPalindrome(String str){
        int length = str.length();
        for(int i = 0; i < length/2; i++){
            if (str.charAt(i) == str.charAt(length-1-i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "noon";
        String str3 = "Hello";

        System.out.println(checkPalindrome(str1));
        System.out.println(checkPalindrome(str2));
        System.out.println(checkPalindrome(str3));
    }
}
