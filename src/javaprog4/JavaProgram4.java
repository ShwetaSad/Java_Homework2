package javaprog4;

public class JavaProgram4 {
/*  Declare two instance and two static variables.
    Declare one instance method.
    Declare one static method.
    Call all four instance and static variables into both instance and static methods inside the
    print statement.
    Declare the Main method.
    Call both instance and static methods into the Main method and run the programme.*/

    int a =10;
    int b =20;
    static String name = "Shweta";
    static String name2 = "Sanay";

    public static void m1(){
        JavaProgram4 obj = new JavaProgram4();
        System.out.println(name);
        System.out.println(name2);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
    public void m2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(JavaProgram4.name);
        System.out.println(JavaProgram4.name2);
    }
    public static void main(String[] args) {
        JavaProgram4 obj1 = new JavaProgram4();
        JavaProgram4.m1();
        obj1.m2();


    }
}
