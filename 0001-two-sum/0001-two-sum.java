import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Find the required complement
            int complement = target - nums[i];

            // If complement exists, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the current number with its index
            map.put(nums[i], i);
        }

        // This line will never execute because the problem guarantees one solution
        return new int[] {};
    }
}