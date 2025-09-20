import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target=new ArrayList<Integer>();
        for(int i=0; i<index.length;i++){
            target.add(index[i],nums[i]);
        }

        int[] ans= new int[index.length];

        for (int i=0;i<index.length;i++){
            ans[i]=target.get(i);
            
        }
        return ans;





        
    }
}