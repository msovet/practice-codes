class Solution {


    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        search(nums, target);
    }
    public static int search(int[] nums, int target) {
        System.out.println("asd");
        int low = 0;
        int high = nums.length-1;
        while(low<=high) {
            int mid = (low+high) / 2;
            System.out.println(mid);

            if (target == nums[mid]) {
                return mid;
            }

            else if(target > nums[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}