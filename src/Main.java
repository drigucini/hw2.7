import java.util.*;

public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
    }

    public static void task0 () {
        System.out.println("Task 0,lecture notes");
    }

    public static void task1 () {
        System.out.println("\nTask 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nums);
        List<Integer> numsOdd = new ArrayList<>(List.of());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                numsOdd.add(nums.get(i));
            }
        }
        System.out.println(numsOdd);
    }

    public static void task2 () {
        System.out.println("\nTask 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 10, 8, 8, 8));
        System.out.println("Initial list " + nums);
        List<Integer> numsEven = new ArrayList<>(List.of());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !numsEven.contains(nums.get(i))) {
                numsEven.add(nums.get(i));
            }
        }
        Collections.sort(numsEven);
        System.out.println(numsEven);
    }

    public static void task3 () {
        System.out.println("\nTask 3");
        List<String> words = new ArrayList<>(List.of("word", "word1", "word3", "word", "word2"));
        HashSet<String> wordsUnique = new HashSet<>(words);
        System.out.println(wordsUnique);
    }

    public static void task4 () {
        System.out.println("\nTask 4");
        Map<String, Integer> map =new HashMap<>();
        List<String> words = new ArrayList<>(List.of("word", "word1", "word3", "word", "word2"));
        for (String word: words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println("The word " + key + " is repeated " + map.get(key) + " times");
        }
    }

}