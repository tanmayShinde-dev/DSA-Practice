class Solution {

    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        int longSeq = 1;
        int count =1;

        Arrays.sort(nums);      // [100,4,200,1,3,2] --> [1,2,3,4,100,200]

        for(int i=1; i<nums.length;i++){

            if(nums[i] == nums[i-1]+1){
                count++;
                longSeq = Math.max(count, longSeq);

            }else if(nums[i] == nums[i-1]){
                count = count;
            }else{
                count=1;
            }
        }    //0,1,1,2

        return longSeq;

    }

}