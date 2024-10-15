package javaprog14;

import java.util.Scanner;

public class PerimeterOfRectangle {
         public static void main(String[] args) {
            m1(5.6, 8.5);

        }


        public static void m1(double width, double height) {
            double area = (width * height);
            double perimeter = 2 * (width + height);
            System.out.println("Expected Output");
            System.out.println("Area is " + width +"*" + height + "=" + area);
            System.out.println("Perimter is 2 x" +  width + " + " + height  + " = "+ perimeter);


        }
    }

