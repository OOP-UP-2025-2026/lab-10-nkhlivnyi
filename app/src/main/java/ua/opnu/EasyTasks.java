package ua.opnu;

import java.util.Comparator;
import java.util.List;

public class EasyTasks {

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .toList();
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .toList();
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .toList();
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .toList();
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .toList();
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> List.of(s.split(" ")).stream())
                .toList();
    }
}
