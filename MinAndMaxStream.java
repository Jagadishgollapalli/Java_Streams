import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,4,6,8,10);
        int max = nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min = nums.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
    }
}
