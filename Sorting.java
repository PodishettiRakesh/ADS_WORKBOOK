// public class Sorting {
//     // Selection Sort Method
//     public static void selectionSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
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
//         System.out.println("Original array:");
//         printArray(arr);
//         selectionSort(arr);
//         System.out.println("Sorted array using Selection Sort:");
//         printArray(arr);
//     }
// }



// public class Sorting {
//     // Insertion Sort Method
//     public static void insertionSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 1; i < n; ++i) {
//             int key = arr[i];
//             int j = i - 1;

//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j = j - 1;
//             }
//             arr[j + 1] = key;
//         }
//     }

//     // Utility method to print array
//     public static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 11, 13, 5, 6};
//         System.out.println("Original array:");
//         printArray(arr);
//         insertionSort(arr);
//         System.out.println("Sorted array using Insertion Sort:");
//         printArray(arr);
//     }
// }




// public class Sorting {

//     // Selection Sort Method
//     public static int selectionSort(int[] arr) {
//         int n = arr.length;
//         int swapCount = 0;
//         for (int i = 0; i < n - 1; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             if (minIndex != i) {
//                 int temp = arr[minIndex];
//                 arr[minIndex] = arr[i];
//                 arr[i] = temp;
//                 swapCount++;
//             }
//         }
//         return swapCount;
//     }

//     // Insertion Sort Method
//     public static int insertionSort(int[] arr) {
//         int n = arr.length;
//         int swapCount = 0;
//         for (int i = 1; i < n; ++i) {
//             int key = arr[i];
//             int j = i - 1;

//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 swapCount++;
//                 j = j - 1;
//             }
//             arr[j + 1] = key;
//         }
//         return swapCount;
//     }

//     // Utility method to print array
//     public static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = {64, 25, 12, 22, 11};

//         int[] selectionSortArr = arr.clone();
//         int[] insertionSortArr = arr.clone();

//         System.out.println("Original array:");
//         printArray(arr);

//         int selectionSortSwaps = selectionSort(selectionSortArr);
//         int insertionSortSwaps = insertionSort(insertionSortArr);

//         System.out.println("Selection Sort Swaps: " + selectionSortSwaps);
//         System.out.println("Sorted array using Selection Sort:");
//         printArray(selectionSortArr);

//         System.out.println("Insertion Sort Swaps: " + insertionSortSwaps);
//         System.out.println("Sorted array using Insertion Sort:");
//         printArray(insertionSortArr);
//     }
// }
