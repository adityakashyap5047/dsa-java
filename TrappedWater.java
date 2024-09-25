import java.util.*;

public class TrappedWater {
    public static int trappedWater(int height[]){ //time complexity is O(n)
        //calculate the left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        //calculate the right max boundary
        int rightmax[] = new int[height.length];
        rightmax[rightmax.length-1] = height[height.length-1];
        for (int i = rightmax.length-2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        //waterLevel = min of left and right boundary
        int waterLevel[] = new int[height.length];
        for (int i = 0; i < waterLevel.length; i++) {
            waterLevel[i] = Math.min(leftmax[i], rightmax[i]);
        }
        //trappedWater = waterLevel - height
        int trappedWater[] = new int[height.length];
        int rainWater = 0;
        for (int i = 0; i < trappedWater.length; i++) {
            trappedWater[i] = waterLevel[i] - height[i];
            rainWater += trappedWater[i];
        }
        return rainWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedWater(height));
    }
}