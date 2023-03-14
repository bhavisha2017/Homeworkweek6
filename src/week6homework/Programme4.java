package week6homework;
/* *4. Write a Java programme using the following steps.
 *4.1 Declare two instance and two static variables.
 *4.2 Declare one instance method.
 *4.3 Declare one static method.
 *4.4 Call all four instance and static variables into both instance and static methods inside the
 *print statement.
 *4.5 Declare the Main method.
 *4.6 Call both instance and static methods into the Main method and run the programme
*/
public class Programme4 {

    //4.1 instance variables
    int a = 10;
    int b = 20;

    //4.1 static variables
    static int c = 30;
    static int d = 40;

    public void myMethod1() {//4.2 instance method

        System.out.println(a);//4.4 instance variable
        System.out.println(b);//4.4 instance variable

        System.out.println(Programme4.c);//4.4 static variable
        System.out.println(Programme4.d);//4.4 static variable
    }
    public static void myMethod2() {//4.3 static method
        Programme4 obj = new Programme4();
        System.out.println(obj.a);//4.4 instance variable
        System.out.println(obj.b);//4.4 instance variable

        System.out.println(c);//4.4 static variable
        System.out.println(d);//4.4 static variable

    }
    public static void main(String[] args) {//4.5 main method

        Programme4 obj = new Programme4();
        obj.myMethod1();//4.6 instance method
        myMethod2();//4.6 static method
    }
}
