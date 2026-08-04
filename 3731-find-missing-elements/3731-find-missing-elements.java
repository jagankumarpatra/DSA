import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums); // sort to easily find smallest & largest
        int smallest = nums[0];
        int largest = nums[nums.length - 1];

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        List<Integer> missing = new ArrayList<>();
        for (int i = smallest; i <= largest; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }
}
