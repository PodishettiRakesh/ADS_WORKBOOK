#include <stdio.h>

int main() {
    char str[100];  // Array to hold the input string
    int length = 0; // Variable to hold the length of the string
    char temp;      // Temporary variable for swapping

    // Prompt the user for input
    printf("Enter a string: ");
    gets(str); // Use gets to read the input string (note: gets is unsafe and not recommended in real applications)

    // Calculate the length of the string
    while (str[length] != '\0') {
        length++;
    }

    // Reverse the string
    for (int i = 0; i < length / 2; i++) {
        // Swap characters from the beginning and the end
        temp = str[i];
        str[i] = str[length - 1 - i];
        str[length - 1 - i] = temp;
    }

    // Print the reversed string
    printf("Reversed string: %s\n", str);

    return 0;
}
