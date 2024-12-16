import java.util.Arrays;
import java.util.List;

public class AverageStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        double res = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(res);
    }
}
