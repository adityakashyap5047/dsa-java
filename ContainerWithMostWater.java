import java.util.ArrayList;
public class ContainerWithMostWater {

    public static int storedWater(ArrayList<Integer> height){
        int maxWaterQuatity = 0;
        //brute force approach       -> O(n^2)
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                int waterHeight = Math.min(height.get(i), height.get(j));
                int waterWidth = j - i;
                maxWaterQuatity = Math.max(waterHeight * waterWidth, maxWaterQuatity);
            }
        }
        return maxWaterQuatity;
    }

    public static int storedWaterPointerApproach(ArrayList<Integer> height){
        int maxWaterQuatity = 0;
        //Two pointer approach -> O(n)
        int lp = 0, rp = height.size() - 1;
        while(lp < rp){
            int waterHeight = Math.min(height.get(lp), height.get(rp));
            int waterWidth = rp - lp;
            maxWaterQuatity = Math.max(waterHeight * waterWidth, maxWaterQuatity);
            if(height.get(lp) < height.get(rp)){
                lp++;
            } else {
                rp--;
            }
        }
        return maxWaterQuatity;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println("The maximum water stored in the container is: "+storedWaterPointerApproach(height));
        System.out.println("The maximum water stored in the container is: "+storedWater(height));
    }
}
