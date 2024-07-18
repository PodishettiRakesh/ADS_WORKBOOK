// public class Mergesort {
//     // Merge function for Merge Sort
//     public static void merge(int[] arr, int l, int m, int r) {
//         int n1 = m - l + 1;
//         int n2 = r - m;

//         int[] L = new int[n1];
//         int[] R = new int[n2];

//         for (int i = 0; i < n1; ++i) {
//             L[i] = arr[l + i];
//         }
//         for (int j = 0; j < n2; ++j) {
//             R[j] = arr[m + 1 + j];
//         }

//         int i = 0, j = 0;
//         int k = l;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             } else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }

//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
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
//         int[] arr = {12, 11, 13, 5, 6, 7};
//         int l = 0, m = arr.length / 2 - 1, r = arr.length - 1;
        
//         System.out.println("Original array:");
//         printArray(arr);
        
//         merge(arr, l, m, r);
        
//         System.out.println("Array after merge:");
//         printArray(arr);
//     }
// }



// public class Mergesort {
//     // Merge function for Merge Sort
//     public static void merge(int[] arr, int l, int m, int r) {
//         int n1 = m - l + 1;
//         int n2 = r - m;

//         int[] L = new int[n1];
//         int[] R = new int[n2];

//         for (int i = 0; i < n1; ++i) {
//             L[i] = arr[l + i];
//         }
//         for (int j = 0; j < n2; ++j) {
//             R[j] = arr[m + 1 + j];
//         }

//         int i = 0, j = 0;
//         int k = l;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             } else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }

//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }

//     // Merge Sort function
//     public static void mergeSort(int[] arr, int l, int r) {
//         if (l < r) {
//             int m = (l + r) / 2;

//             mergeSort(arr, l, m);
//             mergeSort(arr, m + 1, r);

//             merge(arr, l, m, r);
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
//         int[] arr = {12, 11, 13, 5, 6, 7};
        
//         System.out.println("Original array:");
//         printArray(arr);
        
//         mergeSort(arr, 0, arr.length - 1);
        
//         System.out.println("Sorted array using Merge Sort:");
//         printArray(arr);
//     }
// }

// public class Mergesort {
//     private static int mergeCount = 0;

//     // Merge function for Merge Sort
//     public static void merge(int[] arr, int l, int m, int r) {
//         int n1 = m - l + 1;
//         int n2 = r - m;

//         int[] L = new int[n1];
//         int[] R = new int[n2];

//         for (int i = 0; i < n1; ++i) {
//             L[i] = arr[l + i];
//         }
//         for (int j = 0; j < n2; ++j) {
//             R[j] = arr[m + 1 + j];
//         }

//         int i = 0, j = 0;
//         int k = l;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             } else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }

//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }

//         mergeCount++;
//         System.out.println("Merge #" + mergeCount + ": " + arrayToString(arr, l, r));
//     }

//     // Merge Sort function
//     public static void mergeSort(int[] arr, int l, int r) {
//         if (l < r) {
//             int m = (l + r) / 2;

//             mergeSort(arr, l, m);
//             mergeSort(arr, m + 1, r);

//             merge(arr, l, m, r);
//         }
//     }

//     // Utility method to print array
//     public static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     // Utility method to convert array segment to string
//     public static String arrayToString(int[] arr, int l, int r) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = l; i <= r; i++) {
//             sb.append(arr[i]).append(" ");
//         }
//         return sb.toString().trim();
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 11, 13, 5, 6, 7};

//         System.out.println("Original array:");
//         printArray(arr);

//         mergeSort(arr, 0, arr.length - 1);

//         System.out.println("Sorted array using Merge Sort:");
//         printArray(arr);
//         System.out.println("Total merges performed: " + mergeCount);
//     }
// }
