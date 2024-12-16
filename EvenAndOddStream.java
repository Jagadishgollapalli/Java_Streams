import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = nums.stream().filter(e -> e %2 ==0).collect(Collectors.toList());
        System.out.println(evenList);
        List<Integer> oddList = nums.stream().filter(e -> e %2 !=0).collect(Collectors.toList());
        System.out.println(oddList);
    }
}
