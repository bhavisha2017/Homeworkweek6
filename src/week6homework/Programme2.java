package week6homework;


/* * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Programme2 {
    //2.1 Declare two static variables
    static int x = 10;
    static int y = 20;

    //2.2 Declare one static method
    public static void myMethod2() {

        // 2.3 Call both static variables into the static method inside the print statement.
        System.out.println(x);
        System.out.println(y);
    }
        //2.4 Declare the Main method.
        public static void main(String [] args){

    // 2.5 Call the static method into the Main method and Run the programme.
          myMethod2();

        }

    }

