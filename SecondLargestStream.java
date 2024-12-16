import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestStream {
    public static void main(String[] args) {
        /*SecondLargest*/
        List<Integer> nums = Arrays.asList(1,4,6,8,10);
        int secondLargest = nums.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secondLargest);
        /*Reverse Order*/
        List<Integer> reverse = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverse);
    }
}
