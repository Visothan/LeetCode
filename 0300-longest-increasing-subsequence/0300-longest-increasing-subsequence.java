class Solution {
    public int lower_bound(List<Integer> arr,int begin,int end,int target){
        int low=begin;
        int high=end;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr.get(mid)<target){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    public int lengthOfLIS(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int pos=lower_bound(arr,0,arr.size(),nums[i]);
            if(pos==arr.size()){
                arr.add(nums[i]);
            }
            else{
                arr.set(pos,nums[i]);
            }
        }
        return arr.size();
    }
}