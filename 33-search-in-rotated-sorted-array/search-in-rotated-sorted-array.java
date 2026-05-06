class Solution {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // target found
            if (nums[mid] == target) {
                return mid;
            }

            // LEFT HALF SORTED
            if (nums[low] <= nums[mid]) {

                // target lies inside left sorted half
                if (target >= nums[low] && target < nums[mid]) {

                    high = mid - 1;
                }

                // target lies in right half
                else {

                    low = mid + 1;
                }
            }

            // RIGHT HALF SORTED
            else {

                // target lies inside right sorted half
                if (target > nums[mid] && target <= nums[high]) {

                    low = mid + 1;
                }

                // target lies in left half
                else {

                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}