// import java.util.ArrayList;
// import java.util.Collections;

// public class SortingComparison {

//     // Bucket Sort Method
//     public static void bucketSort(float[] arr) {
//         int n = arr.length;
//         if (n <= 0) {
//             return;
//         }

//         // Create empty buckets
//         ArrayList<Float>[] buckets = new ArrayList[n];
//         for (int i = 0; i < n; i++) {
//             buckets[i] = new ArrayList<Float>();
//         }

//         // Add elements into the buckets
//         for (int i = 0; i < n; i++) {
//             int bucketIndex = (int) (arr[i] * n);
//             buckets[bucketIndex].add(arr[i]);
//         }

//         // Sort the individual buckets
//         for (int i = 0; i < n; i++) {
//             Collections.sort(buckets[i]);
//         }

//         // Merge the buckets back into the array
//         int index = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < buckets[i].size(); j++) {
//                 arr[index++] = buckets[i].get(j);
//             }
//         }
//     }

//     // Utility method to print array
//     public static void printArray(float[] arr) {
//         for (float num : arr) {
//             System.out.print(num + " ");
//         // }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
//         System.out.println("Original array:");
//         printArray(arr);
//         bucketSort(arr);
//         System.out.println("Sorted array using Bucket Sort:");
//         printArray(arr);
//     }
// }



import java.util.Arrays;

public class SortingComparison {

    // Utility method to get maximum value in an array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Count Sort method used by Radix Sort
    public static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Radix Sort method
    public static void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original array:");
        printArray(arr);
        radixSort(arr);
        System.out.println("Sorted array using Radix Sort:");
        printArray(arr);
    }
}
i