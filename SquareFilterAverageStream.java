import java.util.Arrays;
import java.util.List;

public class SquareFilterAverageStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        double res = nums.stream().mapToInt(e -> e * e).filter(e -> e %2 == 0).average().getAsDouble();
        System.out.println(res);
    }
}

