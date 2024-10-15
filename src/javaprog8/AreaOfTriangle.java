package javaprog8;

public class AreaOfTriangle {
//Write a program to calculate the area of a triangle.

public static void areaOfTriangle(int base, int height ) {
    int area = (base * height) / 2;
    System.out.println("Area of the Triangle is " + area);

}
public static void main(String[] args) {
    areaOfTriangle(10,20);
}
}
