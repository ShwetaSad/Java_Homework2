package javaprog6;
public class AreaOfCircle {
/*Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).

 */
static double pie = 3.14;

public static void areaOfCircle(int radius) {
    double area = pie * radius * radius;
    System.out.println("The area of the circle is " + area);

}

public static void main(String[] args) {
areaOfCircle(5);
areaOfCircle(10);
}

}
