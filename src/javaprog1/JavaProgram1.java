package javaprog1;

public class JavaProgram1 {
   //instance variables

    int a = 10;
    int b = 20;

    public void m1(){
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {

        JavaProgram1 obj = new JavaProgram1();
        obj.m1();
    }
}
