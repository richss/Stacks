/**
 * Array implementation of the stack interface.
 *
 * @param <t> -type of data stored in the stack.
 *
 * @author Richard S. Stansbury
 */

public class ArrayStack<t> implements Stack<t> {


    t [] arr;
    int top;


    /**
     * Default cnstructor, requires stack size.
     * @param size - size of the stack
     */
    public ArrayStack(int size) {
        arr = (t[]) new Object[size];
        top = -1;
    }


    /**
     * Returns true if the stack array is full.  False otherwise.
     * @return
     */
    public boolean isFull()
    {
        return (top == (arr.length - 1));
    }

    /**
     * Adds a value to the top of a stack
     * @param value
     */
    public void push(t value) {

        if (isFull()) {
            System.out.println("Unable to comply. The stack is full.");
            return;
        }

        top++;
        arr[top] = value;
    }

    /**
     * Pops and returns the item from the top of the stack
     * @return value at top of stack
     */
    public t pop() {

        if (isEmpty()) return null;

        t tmp = arr[top];
        top--;
        return tmp;
    }

    /**
     * Returns the value at the top of stack without removing it
     * @return value at the top of the stack
     */
    public t top() {
        if (isEmpty()) return null;
        return arr[top];
    }

    /**
     * Empties the stack
     */
    public void clear() {
        top = -1;
    }

    /**
     *
     * @return true if the stack is empty; false otherwise.
     */
    public boolean isEmpty() {
        return (top == -1);
    }


}
