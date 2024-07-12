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


// public class Sortings {

//     public static int selectionSortWithSwaps(int[] arr) {
//         int n = arr.length;
//         int swaps = 0;

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
//                 swaps++;
//             }
//         }

//         return swaps;
//     }

//     public static int insertionSortWithSwaps(int[] arr) {
//         int n = arr.length;
//         int swaps = 0;

//         for (int i = 1; i < n; i++) {
//             int key = arr[i];
//             int j = i - 1;

//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j = j - 1;
//                 swaps++;
//             }
//             arr[j + 1] = key;
//             if (j != i - 1) {
//                 swaps++;
//             }
//         }

//         return swaps;
//     }

//     public static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr1 = {64, 25, 12, 22, 11};
//         int[] arr2 = arr1.clone();

//         int selectionSwaps = selectionSortWithSwaps(arr1);
//         int insertionSwaps = insertionSortWithSwaps(arr2);

//         System.out.print("Sorted array using Selection Sort: ");
//         printArray(arr1);
//         System.out.println("Number of swaps in Selection Sort: " + selectionSwaps);

//         System.out.print("Sorted array using Insertion Sort: ");
//         printArray(arr2);
//         System.out.println("Number of swaps in Insertion Sort: " + insertionSwaps);
//     }
// }

// Easy Challenge:
// - Task: Create an ArrayList, add five elements to it, and print the element at the third index.

// Medium Challenge:
// - Task: Write a program using ArrayList to take an unknown number of strings from input until an empty string is entered, then print each string in reverse order.

// Hard Challenge:
// - Task: Implement a function using ArrayList that simulates removing every second element in an array of integers until only one element remains, and return that element.


// import java.util.ArrayList;
// import java.util.Scanner;

// public class ArrayListChallenges {

//     // Easy Challenge
//     public static void easyChallenge() {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Element1");
//         list.add("Element2");
//         list.add("Element3");
//         list.add("Element4");
//         list.add("Element5");

//         System.out.println("Element at the third index: " + list.get(3));
//     }

//     // Medium Challenge
//     public static void mediumChallenge() {
//         Scanner scanner = new Scanner(System.in);
//         ArrayList<String> list = new ArrayList<>();
        
//         System.out.println("Enter strings (enter an empty string to stop):");
//         while (true) {
//             String input = scanner.nextLine();
//             if (input.isEmpty()) {
//                 break;
//             }
//             list.add(input);
//         }

//         System.out.println("Strings in reverse order:");
//         for (int i = list.size() - 1; i >= 0; i--) {
//             System.out.println(list.get(i));
//         }

//         scanner.close();
//     }

//     // Hard Challenge
//     public static int hardChallenge(ArrayList<Integer> list) {
//         int index = 0;
//         while (list.size() > 1) {
//             index = (index + 1) % list.size();
//             list.remove(index);
//         }
//         return list.get(0);
//     }

//     public static void main(String[] args) {
//         // Easy Challenge
//         easyChallenge();

//         // Medium Challenge
//         mediumChallenge();

//         // Hard Challenge
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 1; i <= 10; i++) {
//             list.add(i);
//         }
//         int lastRemaining = hardChallenge(list);
//         System.out.println("Last remaining element: " + lastRemaining);
//     }
// }
