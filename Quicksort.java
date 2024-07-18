// import java.util.Random;

// public class Quicksort {

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
//     public static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 7, 8, 9, 1, 5};
//         System.out.println("Original array:");
//         printArray(arr);
//         quickSort(arr, 0, arr.length - 1);
//         System.out.println("Sorted array using Quick Sort:");
//         printArray(arr);
//     }
// }


// import java.util.Random;

// public class Mergesort {

//     // Quick Sort Method with Random Pivot
//     public static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int pi = randomPartition(arr, low, high);
//             quickSort(arr, low, pi - 1);
//             quickSort(arr, pi + 1, high);
//         }
//     }

//     // Partition method for Quick Sort with Random Pivot
//     public static int randomPartition(int[] arr, int low, int high) {
//         Random rand = new Random();
//         int pivotIndex = low + rand.nextInt(high - low + 1);
//         int temp = arr[pivotIndex];
//         arr[pivotIndex] = arr[high];
//         arr[high] = temp;
//         return partition(arr, low, high);
//     }

//     // Standard Partition method
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
//     public static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 7, 8, 9, 1, 5};
//         System.out.println("Original array:");
//         printArray(arr);
//         quickSort(arr, 0, arr.length - 1);
//         System.out.println("Sorted array using Quick Sort with Random Pivot:");
//         printArray(arr);
//     }
// }



import java.util.Random;

public class Quicksort {
    private static int comparisonCount = 0;

    // Quick Sort Method with Comparison Count
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method with Comparison Count
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            comparisonCount++;
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array:");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array using Quick Sort:");
        printArray(arr);
        System.out.println("Total comparisons made: " + comparisonCount);
    }
}
