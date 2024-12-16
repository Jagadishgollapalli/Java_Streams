import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipStream {
    public static void main(String[] args) {
        /*LIMIT*/
        List<Integer> nums = Arrays.asList(1,4,6,8,10,7,4,12,45,673,34,235,9743,221,544,234,454);
        int limitedList = nums.stream().limit(5).reduce((a,b) -> a+ b).get();
        System.out.println(limitedList);

        /*SKIP*/
        List<Integer> SkipList = nums.stream().skip(5).filter(e -> e > 300).collect(Collectors.toList());
        System.out.println(SkipList);
    }
}
