package javaprog2;


public class JavaProgram2 {
    /*
    Declare two static variables
    Declare one static method
    Call both static variables into the static method inside the print statement.
    Declare the Main method.
    Call the static method into the Main method and Run the programme.
    */
     static int a =10;
     static int b =20;

     public static void m1(){
         System.out.println(a);
         System.out.println(b);

     }
     public static void main(String[] args) {
JavaProgram2 obj = new JavaProgram2();
obj.m1();

     }
}
