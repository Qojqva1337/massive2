import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));

        System.out.println("Zadanie 1");
        int sum = 0;
        for (int expense : expenses) {
            sum += expense;
            System.out.println(" Сумма трат за месяц составила " + sum + " рублей");

            System.out.println("Zadanie 2");
            int max = Integer.MIN_VALUE;
            int min = Integer.MIN_VALUE;
            for (int expence : expenses) {
                if (expence > max) {
                    max = expense;
                }
                if (expense < min) {
                    min = expense;
                }
                System.out.println("Минимальная сумма трат за день составила" + min + " рублей");
                System.out.println("Максимальная сумма трат за день составила" + max + " рублей");
            }
            System.out.println("zadanie 3");
            double averageExpense = (double) sum / expenses.length;
            System.out.println("Средняя сумма трат за месяц составила" + averageExpense + " рублей");

            System.out.println("Zadanie 4");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.println(reverseFullName[i]);
            }
            System.out.println();

            int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
            int[] sortedArray = {-8, -7, -6, 1, 2, 4, 5, 8, 10, 12};
            int k = -2;
            Arrays.sort(arr);


        }

    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}