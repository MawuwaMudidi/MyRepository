public class MinOperationsToDivideBy3 {

    public int minOperations(int[] nums) {
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num % 3 == 1) count1++;
            else if (num % 3 == 2) count2++;
        }
        return Math.min(count1, count2) + 2 * Math.abs(count1 - count2) / 3;
    }

        public static void main(String[] args) {
            MinOperationsToDivideBy3 solution = new MinOperationsToDivideBy3();
            System.out.println(solution.minOperations(new int[] {4, 5, 6, 7, 8}));
        }
    }