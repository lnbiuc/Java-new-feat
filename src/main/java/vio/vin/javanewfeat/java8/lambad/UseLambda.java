package vio.vin.javanewfeat.java8.lambad;

import java.util.Arrays;
import java.util.List;

public class UseLambda {
    List<Integer> nums = Arrays.asList(5, 3, 12, 5, 1, 9, 0);

    public void case1() {
        nums.sort((a, b) -> a.compareTo(b + 1));
    }

    public void case2() {
        nums.forEach(i -> System.out.println(i + 1));
    }
}
