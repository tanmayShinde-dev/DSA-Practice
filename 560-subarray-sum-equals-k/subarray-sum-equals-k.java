class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Long, Integer> map = new HashMap<>();

        int n = nums.length;
        int subArrCount = 0;
        long currSum = 0;

        if(n==0){
            return 0;
        }

        map.put(0L, 1);

        for(int i=0; i<n; i++){

            currSum+=nums[i];
            long required = currSum-k;

            if(map.containsKey(required)){
                subArrCount += map.get(required);
            }

            map.put(currSum, map.getOrDefault(currSum,0)+1);


        }

        
        

        return subArrCount;
        
    }
}