class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int C=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    C=C+1;
                    

                }

            }
            ans[i]=C;
        }
        return ans;
        

        
    }
}