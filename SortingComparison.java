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
