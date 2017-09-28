/**
 * This runs tests on the stack using the stack interface so that I can test both types
 * with one class.
 *
 * @author Richard Stansbury
 */

public class StackTests {


    public static void StackTests(Stack s)
    {
        System.out.println("Stack Tests");

        //Confirm isEmpty() is true.
        System.out.println("Empty Test: True = " + s.isEmpty());

        //Push some content.
        s.push("Dr. Jones");
        s.push("Dr. Lecter");
        System.out.println("Empty Test: False = " + s.isEmpty());

        //Peak Test
        System.out.println("Peak Test: Dr. Lecter = " + s.peak());

        //Full Test
        s.push("Jack Burton"); //Should produce an error message if ArrayStack is set to size 2.

        //Pop content and Print.
        while (s.isEmpty() == false) {
            System.out.println("Pop Item:" + s.pop());
        }

        //Confirm is Empty
        System.out.println("Empty Test: True = " + s.isEmpty());
        System.out.println("Empty Pop Test: null=" + s.pop());
        System.out.println("Empty Peak Test: null=" + s.peak());

        //Test Clear
        s.push("Dr. Jones");
        s.push("Dr. Lecter");
        System.out.println("Empty Test: False = " + s.isEmpty());
        s.clear();
        System.out.println("Empty Test: True = " + s.isEmpty());

        System.out.println("End of Test.\n\n");
    }


    public static void main(String [] args)
    {

        Stack s1 = new ListStack<String>();
        Stack s2 = new ArrayStack<String>(2);

        StackTests.StackTests(s1);
        StackTests.StackTests(s2);
    }


}

