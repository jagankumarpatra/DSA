class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> al = new ArrayList<>();
        int n = arr.length;
        int val = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int k = 0; k < n - 1; k++) {
            int sum = arr[k + 1] - arr[k];
            val = Math.min(val, sum);
        }
        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i + 1] - arr[i];
            if (sum == val) {
                al.add(Arrays.asList(arr[i], arr[i + 1]));
            }

        }
        return al;
    }
}
