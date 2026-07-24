class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[]{-1, -1};
        if (nums.length == 0) {
            return arr;
        }
        
        // Find the first occurrence (left bound)
        arr[0] = findBound(nums, target, true);
        
        // If the target doesn't exist, no need to search for the right bound
        if (arr[0] != -1) {
            arr[1] = findBound(nums, target, false);
        }
        
        return arr;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (isFirst) {
                    high = mid - 1; // Keep searching left
                } else {
                    low = mid + 1;  // Keep searching right
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
