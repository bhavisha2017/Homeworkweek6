package week6homework;


/* *  Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
     //1.1 Declare two instance variables.
    int a = 10;
    int b = 20;

    //1.2 Declare one instance method.
    public void myMethod() {
        //1.3 Call both instance variable into the instance method inside the print statement.
        System.out.println(a);
        System.out.println(b);
    }
        //1.4 declare the main method.
    public static void main(String[] args) {
        //1.5 call the above instance method into the main method and run the programme.

        Programme1 obj = new Programme1();
        obj.myMethod();
    }

    }






