class Solution {

    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        int longSeq = 0;

        for(int num: nums){
            set.add(num);        //[100,4,200,1,3,2]
        }

        for(int num : set){

            if(!set.contains(num-1)){     
                int count = 1;       
                int current = num;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
            longSeq = Math.max(longSeq,count);
            }

        }

        return longSeq;

    }

}
