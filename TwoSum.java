import java.util.HashMap;
public class TwoSum {
    public int[] twoSum() {
        int nums[] = {2,7,11,15};
        int target = 9;
        HashMap<Integer, Integer> values = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            int complement = target - nums[i];
            if (values.containsKey(complement)) {
                return new int[]{values.get(complement), i};
                /*
                * 7 false, {2:0}
                * 2 true , {0,1} -> return this
                * */
            }
            values.put(nums[i],i);
        }
        return nums;
    }
    public static void main(String[] args) {
        TwoSum ans = new TwoSum();
        int[] result = ans.twoSum();
        System.out.println("Two indexes are: [" + result[0] + "," + result[1] + "]");
    }
}