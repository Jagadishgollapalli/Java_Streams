import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    int result = nums.stream().reduce((a,b) -> a+b).get();
        System.out.println(result);
    }
}
