package logicalQuestions;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZerosToEnd(arr);

        System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // Points to where the next non-zero should go

        // Move all non-zero elements to the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the rest of the array with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
}