package week6homework;


/* * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme3 {

    int p = 100;//3.1 instance variable
    static int b = 200;//3.1 static variable


    public void myMethod1() {  //3.2 instance method

        System.out.println(p);//3.4 instance variable
        System.out.println(Programme3.b);//3.4 static variable

    }

    public static void myMethod2() {//3.3 static method
        Programme3 obj = new Programme3();//3.4 instance variable
        System.out.println(obj.p);
        System.out.println(b);//3.4 static variable
    }

    public static void main(String[] args) {//3.5 main method

        Programme3 obj = new Programme3();
        obj.myMethod1();
        //3.6 instance method
        myMethod2();//3.6 static method
    }

}
