public class BacktrackingSubsetsJava {
    /*
        Time Complexity :- O(n * 2^n)

                Since, there are 2^n subSets and each subSets takes n times
            
        Space Complexity :- O(n)
    */
    public static void subSets(String str, String ans, int i){
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //recursion work
        
        //Yes choice
        subSets(str, ans+str.charAt(i), i+1);
        //No choice
        subSets(str, ans, i+1);
    }

    public static void findSubSets(String str, StringBuilder ans, int i){
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //recursion work
        //Yes choice
        findSubSets(str, ans.append(str.charAt(i)), i+1);
        //Deleting an element of StringBuilder
        ans = ans.deleteCharAt(ans.length()-1);  
        //No choice
        findSubSets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSets(str, "", 0);
        findSubSets(str, new StringBuilder(""), 0);
    }
}
