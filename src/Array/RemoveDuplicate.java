package Array;

public class RemoveDuplicate {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length-1;
        int temp = 0;
        while (l<=r){
            if(nums[l]==val){
                temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                r--;
            }
            else{
                l++;
            }
        }
        return l;
    }
}
