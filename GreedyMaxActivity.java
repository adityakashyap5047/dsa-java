import java.util.*;

public class GreedyMaxActivity{

    public static void main(String[] args) {    //T.C - O(n)
        
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //sorting the activity according to end time if they are not
        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity ---> it ends earlier from all the activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        
        /*The error in your code lies in the condition used to select activities. 
            Specifically, the condition if (end[i - 1] <= start[i]) is incorrect. 
                This condition compares the end time of the previous activity in the list 
                with the start time of the current activity, 
                which is not the correct way to determine if the current activity can be selected.
            Instead, you should compare the end time of the last selected activity 
                with the start time of the current activity. 
                To fix this, you need to keep track of the end time of the last selected activity.
        */


        for(int i = 1; i<end.length; i++){
            if (lastEnd <= start[i]) {
                
                //select the activity
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities is : "+ maxAct);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}