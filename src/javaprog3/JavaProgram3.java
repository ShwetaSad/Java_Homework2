package javaprog3;

public class JavaProgram3 {

/* Declare one instance and one static variable.
    Declare one instance method.
    Declare one static method.
    Call both instance and static variables into both instance and static methods inside the
    print statement.
    Declare the Main method.
    Call both instance and static methods into the Main method and run the programme.

     */
      int a =10;
     static int b = 20;

     public void m1() {
         System.out.println(a);
         System.out.println(JavaProgram3.b);
     }
     public static void m2(){
         JavaProgram3 obj = new JavaProgram3();
         System.out.println(obj.a);
         System.out.println(b);
     }
     public static void main(String[] args) {
         JavaProgram3 j2 = new JavaProgram3();
         j2.m1();
         JavaProgram3.m2();
     }
}
