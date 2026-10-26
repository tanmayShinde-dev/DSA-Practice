class Solution {
    public int maxProduct(int[] nums) {

        int currMax = nums[0];
        int currMin = nums[0];
        int maxProd = nums[0];

        for (int i = 1; i<nums.length; i++){
            int prevMax = currMax;
            int prevMin = currMin;

            int n = nums[i];

        currMax = Math.max(n, Math.max(n*prevMax, n*prevMin));
        currMin = Math.min(n, Math.min(n*prevMax, n*prevMin));
        maxProd = Math.max(currMax, maxProd);

        }

        return maxProd;
        
    }
}