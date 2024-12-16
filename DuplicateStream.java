import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,6,4,3,7,6,2,4,7,9,1);
        Set<Integer> result = nums.stream().filter(e -> Collections.frequency(nums,e) > 1).collect(Collectors.toSet());
        System.out.println(result);
    }
}
