class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> m = new HashMap<>();
        
        int n = nums.length;

        for(int i=0;i<n;i++){
            int first = nums[i];

            int second = target-first;

            if(m.containsKey(second) ){
                return new int[]{m.get(second), i};
            }

            m.put(first, i);
        }
    return new int[]{};    
     }
}
