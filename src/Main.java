import java.util.*;

public class Main {

    public void run() {
        printOdd();
        printEvenDuplicate();
        printWordsNoDuplicate();
        printWordsCount();
    }
    private void printOdd() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(s -> s % 2 == 0);
        nums.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    private void printEvenDuplicate() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(s ->s % 2 != 0);
        Set<Integer> set = new TreeSet<>(nums);
        set.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    private void printWordsNoDuplicate() {
        List <String> words = List.of("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz");
        Set<String> set = new HashSet<>(words);
        set.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    private void printWordsCount() {
        List <String> words = List.of("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz");
        Map<String, Integer> map = new HashMap<>();
        words.forEach(word -> map.merge(word, 1, Integer::sum));
        map.values().removeIf(value -> value < 2);
        map.values().forEach(value -> System.out.print(value + " "));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}