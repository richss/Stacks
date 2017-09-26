/**
 * List implementation of the stack interface.
 *
 * @param <t> -type of data stored in the stack.
 *
 * @author Richard S. Stansbury
 */

public class ListStack<t> implements Stack<t> {

    DLList<t> list;

    /**
     * Default constructor
     */
    public ListStack()
    {
        list = new DLList<>();
    }


    /**
     * Adds a value to the top of a stack
     * @param value
     */
    public void push(t value) {
        list.addToHead(value);
    }

    /**
     * Pops and returns the item from the top of the stack
     * @return value at top of stack
     */
    public t pop() {
        return list.deleteValueAt(0);
    }

    /**
     * Returns the value at the top of stack without removing it
     * @return value at the top of the stack
     */
    public t peak() {
        return list.getValueAt(0);
    }

    /**
     * Empties the stack
     */
    public void clear() {
        while(pop() != null);
    }

    /**
     *
     * @return true if the stack is empty; false otherwise.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

}
