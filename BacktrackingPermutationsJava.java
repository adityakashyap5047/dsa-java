public class BacktrackingPermutationsJava {
        /*
            Time Complexity :- O(n * n!)

                Since, there are n! permutation and each permutation takes n times
            
            Space Complexity :- O(n)
        */
    public static void permutations(String str, String ans, int i){
        //base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        //recursion work
        for(int j = 0; j < str.length(); j++){
            char currChar = str.charAt(j);
            String newStr = str.substring(0, j) + str.substring(j+1);
            permutations(newStr, ans+currChar, i);
        }
    }

    public static void findPermutations(String str, StringBuilder ans){

        //base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        //recursion work
        for(int j = 0; j < str.length(); j++){
            char currChar = str.charAt(j);
            String newStr = str.substring(0, j) + str.substring(j+1);
            findPermutations(newStr, ans.append(currChar));
            ans = ans.deleteCharAt(ans.length()-1);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str, " ", 0);
        findPermutations(str, new StringBuilder(" "));
    }
}
