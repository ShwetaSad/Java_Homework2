package javaprog7;

public class Celsius {
/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
celsius
 */
    public static void celsius(Float Fahrenheit) {
        float celsius = ((Fahrenheit - 32)*5/9);
        System.out.println(celsius);
    }

    public static void main(String[] args) {

      celsius(50.12f);


    }

}
