import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,4,6,8,10,2,7,5,3,9);
        List<Integer> sortedList = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
