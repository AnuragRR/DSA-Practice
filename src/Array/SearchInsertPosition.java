package Array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int res=0;
        while (i< nums.length){
            if (target==nums[i] || target<nums[i]){
                res=i;
                break;
            }
            if (i!= nums.length-1) {
            if (target > nums[i] && target < nums[i + 1]) {
                    res = i+1;
                    break;
                }
            }
            else {
                res= nums.length-1;
            }
            i++;
        }
        return res;
    }
}
