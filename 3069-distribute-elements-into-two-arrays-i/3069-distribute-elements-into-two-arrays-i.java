import java.util.ArrayList;

class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> e = new ArrayList<>();
        ArrayList<Integer> o = new ArrayList<>();
        e.add(nums[0]);
        o.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            // if (e.get(e.size()-1) > o.get(e.size()-1)) {
            if (!e.isEmpty() && !o.isEmpty() && e.get(e.size() - 1) > o.get(o.size() - 1)) {
                e.add(nums[i]);
            } else {
                o.add(nums[i]);
            }
        }

        int[] result = new int[e.size() + o.size()];
        int index = 0;

        for (int num : e) {
            result[index++] = num;
        }

        for (int num : o) {
            result[index++] = num;
        }

        return result;
    }
}
