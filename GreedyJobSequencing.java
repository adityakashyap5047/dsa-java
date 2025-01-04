import java.util.ArrayList;
import java.util.Collections;

public class GreedyJobSequencing {
    
    static class Job{
        int deadline;
        int profit;
        int id;
        
        public Job(int i, int d, int p){
            id = i;
            profit = p;
            deadline = d;
        }
    }

    public static void main(String[] args) {

        
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);  // sorting in descending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Maximum jobs that one can do it = "+time+" and the jobs are = "+seq);
    }
}
