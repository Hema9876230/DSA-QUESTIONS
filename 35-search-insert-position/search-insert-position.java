class Solution {
    public int searchInsert(int[] nums, int target) {
        //Binary Search approach - time complexity - O(log n)
        //we have to return target index  if target is in array 
        //we have o find expected target index if target is not in array 

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            else if(nums[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return start;
    }
}