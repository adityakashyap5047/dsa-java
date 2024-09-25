public class RemoveDuplicateinString {
    public static void removeDuplicates(String str, int idx, boolean arr[], StringBuilder sb){
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(idx);
        if (arr[currChar - 'a'] == false) {
            sb.append(currChar);
            arr[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, arr, sb);
        }
        else{
            removeDuplicates(str, idx+1, arr, sb);
        }
    }

    public static void removeDuplicatesUpLowCase(String str, int idx, boolean arr[], StringBuilder sb){
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(idx);
        if (arr[currChar - 'A'] == false) {
            sb.append(currChar);
            arr[currChar - 'A'] = true;
            removeDuplicatesUpLowCase(str, idx+1, arr, sb);
        }
        else{
            removeDuplicatesUpLowCase(str, idx+1, arr, sb);
        }
    }

    public static void main(String[] args) {
        String str = "aaddiittyyaakkuummaarr";
        removeDuplicates(str, 0, new boolean[26], new StringBuilder (""));

        str = "AABBCCDDVVYYZZaabbcciiuukkzz";
        removeDuplicatesUpLowCase(str, 0, new boolean[58], new StringBuilder (""));
    }
}
