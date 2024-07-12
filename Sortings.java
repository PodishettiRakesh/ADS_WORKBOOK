// public class Sortings {

//     public static void selectionSort(int[] arr) {
//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) {
//             int minIndex = i;

//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }

//             // Swap the found minimum element with the first element
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = {64, 25, 12, 22, 11};
//         selectionSort(arr);
//         System.out.print("Sorted array using Selection Sort: ");
//         printArray(arr);
//     }
// }


// public class Sortings {

//     public static void insertionSort(int[] arr) {
//         int n = arr.length;

//         for (int i = 1; i < n; i++) {
//             int key = arr[i];
//             int j = i - 1;

//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j = j - 1;
//             }
//             arr[j + 1] = key;
//         }
//     }

//     public static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = {64, 25, 12, 22, 11};
//         insertionSort(arr);
//         System.out.print("Sorted array using Insertion Sort: ");
//         printArray(arr);
//     }
// }
