import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixStream {
    public static void main(String[] args) {
        List<Integer> TwoPrefix = Arrays.asList(22,56,34,78,231,267,89,32,12,2);
        List<Integer> res = TwoPrefix.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(res);
    }
}
