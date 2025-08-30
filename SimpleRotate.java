
public class SimpleRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2; // rotate left by 2

        // Repeat k times
        for (int r = 0; r < k; r++) {
            int first = arr[0];   // store first element
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1]; // shift left
            }
            arr[n - 1] = first;   // put first at end
        }

        // Print result
        System.out.print("Left Rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

