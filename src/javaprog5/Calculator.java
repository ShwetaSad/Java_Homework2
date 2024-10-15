package javaprog5;

public class Calculator {
public static void addition(int a, int b) {
    int ans = a + b;
    System.out.println("Addition of " + a + " and " + b + " is " + ans);
}
public static void subtraction(int a, int b) {
    int ans = a - b;
    System.out.println("Subtraction of " + a + " and " + b + " is " + ans);
}
public void multiplication(int a, int b) {
    int ans = a * b;
    System.out.println("Multiplication of " + a + " and " + b + " is " + ans);

}
public void division(int a, int b) {
    int ans = a / b;
    System.out.println("Division of " + a + " and " + b + " is " + ans);

}
public static void main(String[] args) {
    Calculator calc = new Calculator();
    addition(1, 2);
    subtraction(2, 1);
    calc.division(10, 2);
    calc.multiplication(10, 2);



}
}
