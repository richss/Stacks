/**
 * This defiens the interface of a stack
 * @author: Richard S. Stansbury
 */

public interface Stack<t> {

    /**
     * Adds a value to the top of a stack
     * @param value
     */
    public void push(t value);

    /**
     * Pops and returns the item from the top of the stack
     * @return value at top of stack
     */
    public t pop();

    /**
     * Returns the value at the top of stack without removing it
     * @return value at the top of the stack
     */
    public t top();

    /**
     * Empties the stack
     */
    public void clear();

    /**
     *
     * @return true if the stack is empty; false otherwise.
     */
    public boolean isEmpty();
}
