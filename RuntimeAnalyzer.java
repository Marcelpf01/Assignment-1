//RuntimeAnalizer

import java.util.Random;

public class RuntimeAnalyzer {

    // Generate the array with random values between -10 and 99
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(110) - 10; // Display numbers between -10 and 99
        }

        return array;
    }

    public static void main(String[] args) {
        int[] sizes = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int runs = 20;

        for (int size : sizes) {
            long totalElapsed1 = 0, totalElapsed2 = 0, totalElapsed3 = 0;

            for (int i = 0; i < runs; i++) {
                int[] array = generateArray(size);

                // Time for Algorithm 1
                long startTime = System.currentTimeMillis();
                MethodTester.algorithm1(array);
                long endTime = System.currentTimeMillis();
                totalElapsed1 += (endTime - startTime);

                // Time for Algorithm 2
                startTime = System.currentTimeMillis();
                MethodTester.algorithm2(array);
                endTime = System.currentTimeMillis();
                totalElapsed2 += (endTime - startTime);

                // Time for Algorithm 3
                startTime = System.currentTimeMillis();
                MethodTester.algorithm3(array);
                endTime = System.currentTimeMillis();
                totalElapsed3 += (endTime - startTime);
            }

            System.out.println("Array size: " + size);
            System.out.println("Avg time for Algorithm 1: " + (totalElapsed1 / runs) + " ms");
            System.out.println("Avg time for Algorithm 2: " + (totalElapsed2 / runs) + " ms");
            System.out.println("Avg time for Algorithm 3: " + (totalElapsed3 / runs) + " ms");
        }
    }
}
