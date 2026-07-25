class Solution {
    public boolean isValid(int[] nums,int mid){
        if(mid==0&&nums[mid]!=nums[mid+1]){
            return true;
        }
        else if(mid==nums.length-1&&nums[mid]!=nums[mid-1]){
            return true;
        }
        else if(mid>0&&mid<nums.length-1&&nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
            return true;
        }
        else{
            return false;
        }
    }
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        if(nums.length==1){
            return nums[0];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(nums,mid)){
                ans=nums[mid];
                break;
            }
            else{
    if(mid%2==0&&nums[mid]==nums[mid+1]){
        low=mid+2;
    }
    else if(mid%2==1&&nums[mid]==nums[mid-1]){
        low=mid+1;
    }
    else{
        high=mid-1;
    }
}
        }
        return ans;
    }
}