package _03Arrays;


//Leetcode --- 42
public class TrappedWater {
    public static void main(String[] args) {

        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trap(height));

    }
        public static int trap(int[] height) {
            if (height == null || height.length < 3) return 0;

            int n = height.length;

            // Calculate left max
            int[] leftMax = new int[n];
            leftMax[0] = height[0];
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            }

            // Calculate right max
            int[] rightMax = new int[n];
            rightMax[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], height[i]);
            }

            // Calculate trapped water
            int trappedWater = 0;
            for (int i = 0; i < n; i++) {
                int waterLevel = Math.min(leftMax[i], rightMax[i]);
                trappedWater += waterLevel - height[i];
            }

            return trappedWater;
        }
    }

