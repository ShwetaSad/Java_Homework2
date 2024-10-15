package javaprog18;

public class TwoNumbers {
    public static void addition(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);

    }

    public static void subtraction(int a, int b) {
        int sub = a - b;
        System.out.println(a + " - " + b + " = " + sub);

    }

    public static void multiplication(int a, int b) {
        int mul = a * b;
        System.out.println(a + " * " + b + " = " + mul);
    }

    public static void division(int a, int b) {
        int div = a / b;
        System.out.println(a + " / " + b + " = " + div);

    }

    public static void remainder(int a, int b) {
        int remain = a % b;
        System.out.println(a + " mod " + b + " = " + remain);
    }

    public static void main(String[] args) {
        System.out.println("Excepted Output:");
        int a = 125;
        int b = 24;
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        remainder(a, b);


    }
}
