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



// import java.util.Arrays;

// public class SortingComparison {

//     // Utility method to get maximum value in an array
//     public static int getMax(int[] arr) {
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     // Count Sort method used by Radix Sort
//     public static void countSort(int[] arr, int exp) {
//         int n = arr.length;
//         int[] output = new int[n];
//         int[] count = new int[10];
//         Arrays.fill(count, 0);

//         for (int i = 0; i < n; i++) {
//             count[(arr[i] / exp) % 10]++;
//         }

//         for (int i = 1; i < 10; i++) {
//             count[i] += count[i - 1];
//         }

//         for (int i = n - 1; i >= 0; i--) {
//             output[count[(arr[i] / exp) % 10] - 1] = arr[i];
//             count[(arr[i] / exp) % 10]--;
//         }

//         for (int i = 0; i < n; i++) {
//             arr[i] = output[i];
//         }
//     }

//     // Radix Sort method
//     public static void radixSort(int[] arr) {
//         int max = getMax(arr);
//         for (int exp = 1; max / exp > 0; exp *= 10) {
//             countSort(arr, exp);
//         }
//     }

//     // Utility method to print array
//     public static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
//         System.out.println("Original array:");
//         printArray(arr);
//         radixSort(arr);
//         System.out.println("Sorted array using Radix Sort:");
//         printArray(arr);
//     }
// }



// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Random;

// public class SortingComparison {

//     // Bucket Sort Method
//     public static void bucketSort(float[] arr) {
//         int n = arr.length;
//         if (n <= 0) {
//             return;
//         }

//         ArrayList<Float>[] buckets = new ArrayList[n];
//         for (int i = 0; i < n; i++) {
//             buckets[i] = new ArrayList<Float>();
//         }

//         for (int i = 0; i < n; i++) {
//             int bucketIndex = (int) (arr[i] * n);
//             buckets[bucketIndex].add(arr[i]);
//         }

//         for (int i = 0; i < n; i++) {
//             Collections.sort(buckets[i]);
//         }

//         int index = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < buckets[i].size(); j++) {
//                 arr[index++] = buckets[i].get(j);
//             }
//         }
//     }

//     // Utility method to get maximum value in an array
//     public static int getMax(int[] arr) {
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     // Count Sort method used by Radix Sort
//     public static void countSort(int[] arr, int exp) {
//         int n = arr.length;
//         int[] output = new int[n];
//         int[] count = new int[10];
//         Arrays.fill(count, 0);

//         for (int i = 0; i < n; i++) {
//             count[(arr[i] / exp) % 10]++;
//         }

//         for (int i = 1; i < 10; i++) {
//             count[i] += count[i - 1];
//         }

//         for (int i = n - 1; i >= 0; i--) {
//             output[count[(arr[i] / exp) % 10] - 1] = arr[i];
//             count[(arr[i] / exp) % 10]--;
//         }

//         for (int i = 0; i < n; i++) {
//             arr[i] = output[i];
//         }
//     }

//     // Radix Sort method
//     public static void radixSort(int[] arr) {
//         int max = getMax(arr);
//         for (int exp = 1; max / exp > 0; exp *= 10) {
//             countSort(arr, exp);
//         }
//     }

//     // Quick Sort Method
//     public static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int pi = partition(arr, low, high);
//             quickSort(arr, low, pi - 1);
//             quickSort(arr, pi + 1, high);
//         }
//     }

//     // Partition method for Quick Sort
//     public static int partition(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int i = (low - 1);
//         for (int j = low; j < high; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;
//         return i + 1;
//     }

//     // Utility method to print array
//     public static void printArray(float[] arr) {
//         for (float num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     // Utility method to print array
//     public static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     // Utility method to generate random float array
//     public static float[] generateRandomFloatArray(int size) {
//         float[] arr = new float[size];
//         Random rand = new Random();
//         for (int i = 0; i < size; i++) {
//             arr[i] = rand.nextFloat();
//         }
//         return arr;
//     }

//     // Utility method to generate random integer array
//     public static int[] generateRandomIntArray(int size, int upperBound) {
//         int[] arr = new int[size];
//         Random rand = new Random();
//         for (int i = 0; i < size; i++) {
//             arr[i] = rand.nextInt(upperBound);
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         int size = 10000;

//         // Bucket Sort on floating-point numbers
//         float[] bucketSortArray = generateRandomFloatArray(size);
//         long startTime = System.nanoTime();
//         bucketSort(bucketSortArray);
//         long endTime = System.nanoTime();
//         long bucketSortTime = endTime - startTime;
//         System.out.println("Bucket Sort time: " + bucketSortTime + " ns");

//         // Radix Sort on integers
//         int[] radixSortArray = generateRandomIntArray(size, 10000);
//         startTime = System.nanoTime();
//         radixSort(radixSortArray);
//         endTime = System.nanoTime();
//         long radixSortTime = endTime - startTime;
//         System.out.println("Radix Sort time: " + radixSortTime + " ns");

//         // Quick Sort on integers
//         int[] quickSortArray = generateRandomIntArray(size, 10000);
//         startTime = System.nanoTime();
//         quickSort(quickSortArray, 0, quickSortArray.length - 1);
//         endTime = System.nanoTime();
//         long quickSortTime = endTime - startTime;
//         System.out.println("Quick Sort time: " + quickSortTime + " ns");
//     }
// }



