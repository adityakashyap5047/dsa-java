// Given a route containing 4 directions (E, W, N, S), 
// find the shortest path to reach destination.

import java.util.*;

public class StringsShotestPath {
    public static float shortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'E') {
                x++;
            }
            else if(str.charAt(i) == 'W') {
                x--;
            }
            else if(str.charAt(i) == 'N') {
                y++;
            }
            else if(str.charAt(i) == 'S') {
                y--;
            }
            else{
                System.out.println("Please Enter the valid direction");
                return -0.0f;
            }
        }
        int squareDisplacement = x*x + y*y;
        float displacement = (float)Math.sqrt(squareDisplacement);
        return displacement;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";    
        System.out.println("The shortest path is : "+shortestPath(path));
    }
}
