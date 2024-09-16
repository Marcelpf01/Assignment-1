public class MethodTester {

    // Algorithm 1: Calculate the maximum sum of subarrays with a length up to 3
    public static int algorithm1(int[] A) {
        int n = A.length;
        int maxSum = 0; // Default max sum is 0 
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < Math.min(i + 3, n); j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    // Algorithm 2: 
    public static int algorithm2(int[] A) {
        int n = A.length;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < Math.min(i + 3, n); j++) {
                sum += A[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    // Algorithm 3:
    public static int algorithm3(int[] A) {
        int n = A.length;
        int maxSum = 0;
        int[] subarraySums = new int[n]; // Store the sums

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < Math.min(i + 3, n); j++) {
                sum += A[j];
                subarraySums[j - i] = sum; // Store intermediate sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // Test with small arrays
        int[] array1 = {-1, 12, -3, 14, -4, 3};
        int[] array2 = {2, -3, 5, -1, 7};

        System.out.println("Algorithm 1: Max sum = " + algorithm1(array1));
        System.out.println("Algorithm 1: Max sum = " + algorithm1(array2));

        System.out.println("Algorithm 2: Max sum = " + algorithm2(array1));
        System.out.println("Algorithm 2: Max sum = " + algorithm2(array2));

        System.out.println("Algorithm 3: Max sum = " + algorithm3(array1));
        System.out.println("Algorithm 3: Max sum = " + algorithm3(array2));
    }
}
