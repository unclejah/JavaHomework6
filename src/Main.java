import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        //Exercise 1
        int summ = 0;
        for (int m: arr ) {
            summ = summ + m;
        }
        System.out.println("Сумма трат за месяц составила "+summ+" рублей.");

        //Exercise 2
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int m: arr ) {
            if(m>maxVal){
                maxVal = m;
            }
            if(m<minVal){
                minVal = m;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minVal+" рублей.");
        System.out.println("Максимальная сумма трат за день составила "+maxVal+" рублей.");

        //Exercise 3
        System.out.println("Средняя сумма трат за месяц составила "+summ /30f+" рублей.");

        //Exercise 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

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
