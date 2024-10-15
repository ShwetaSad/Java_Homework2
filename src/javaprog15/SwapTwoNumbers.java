package javaprog15;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Declare variables for the values to be swapped
        int a, b, temp;

        a = 15;
        b = 27;

        System.out.println("Before swapping : a, b = " + a + ", " + b);

        // Perform the swap using a temporary variable
        temp = a;
        a = b;
        b = temp;

        // Print the values after swapping
        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
