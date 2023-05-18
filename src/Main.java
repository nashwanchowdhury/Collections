
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;


public class Main {
    static int total;
    static int avg;
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(176);
        numbers.add(653);
        numbers.add(532);
        numbers.add(876);
        numbers.add(156);
        numbers.add(176);
        Set<Integer> nums = new HashSet<>();
        nums.addAll(numbers);
        System.out.println("The sum is: " + sum(nums));
        average(nums);
        System.out.println(nums);
    }

    private static int sum(Set<Integer> nums) {
        try {
            for (int num : nums) {
                total += num;
            }
            return total;
        } catch (Exception e){
            System.out.println("Could not calculate arithmetic sum");
            return 0;
        }
    }
    private static void average(Set<Integer> nums) {
        total = 0;
        try {
            avg = sum(nums) / nums.size();
            System.out.println("The average is: " + avg);
        } catch (Exception e) {
            System.out.println("Could not calculate average");
        }
    }
}

