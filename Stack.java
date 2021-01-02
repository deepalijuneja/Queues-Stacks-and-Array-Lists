import java.util.Arrays;

/**
 * The second part of homework: Stack Interference (the LIFO nature of stack).
 * @author Deepali Juneja
 * @version 21 April 2020
 */
public class Stack {
    private Object[] stackIntereference;
    private int numberElem; 

    /**
     * Below, our contructor starts, which takes no value.
     */
    public Stack() {
        this.stackIntereference = new Object[1];// the constructor set the value to 1
        this.numberElem = 0; // the constructor set the value to zero
    }
    // checkpoint 1
    /**
     * Below, our 2nd constructor starts, which does take argument in the form of array.
     * 
     * @param Ar the array
     */
    public Stack(Object[] Ar) {
        this.stackIntereference = new Object[Ar.length];
        this.numberElem = 0;
        System.arraycopy(Ar, 0, this.stackIntereference, 0, this.numberElem);
    }
// checkpoint 2
    /**
     * The purpose of this method is to provide the stack's size.
     * 
     * @return stack's size
     */
    public int stackSize() {
        return this.stackIntereference.length;
    }
// checkpoint 3
    /**
     * The purpose of this method is to provide an additional object to the stack.
     * 
     * @param addObject 
     */
    public void push(Object addObject) {
        if (this.numberElem == this.stackSize()) {
            this.stackIntereference = Arrays.copyOf(this.stackIntereference, this.stackSize() + 1);
        }
        this.stackIntereference[this.numberElem++] = addObject;
    }
// checkpoint 4
    /**
     * The purpose of this method is to get/take the object at the specified index position.
     * 
     * @param indexPosition
     * @return whichever object is at that specific indxPosition
     */
    public Object get(int indexPosition) {
        return this.stackIntereference[indexPosition];
    }
//checkpoint 5
    /**
     * The purpose of this method is basically to remove the last object.
     * 
     * @return the removed object
     */
    public Object remove() {
        Object addObject = this.stackIntereference[this.stackSize() - 1];
        this.stackIntereference = Arrays.copyOf(this.stackIntereference, this.stackSize() - 1);
        return addObject;
    }
//checkpoint 6
    /**
     * The purpose of this method is to evaluate if the stack is empty or not.
     * 
     * @return true or false
     */
    public boolean evalEmpty() {
        boolean evalEmpty = true; // the assumption here is the stack is empty
        if (this.stackSize()-1 == 0) {
            evalEmpty = true;
        } else {
            evalEmpty = false;
        }
        return evalEmpty;
    }
//checkpoint 7
    /**
     * The purpose of this method is to evaluate if 2 stacks are equal or not to each other.
     * 
     * @param evalStack
     * @return true or false
     */
    public boolean equals(Stack evalStack) {
        boolean equals = false;
        if (this.stackSize() == evalStack.stackSize()) {
            for (int i = 0; i < this.stackSize(); i++) {
                if (this.get(i) == evalStack.get(i)) {
                    equals = true;
                } else {
                    equals = false;
                }
            }
        } else {
            equals = false;
        }
        return equals;
    }
// checkpoint 8
    /**
     * The purpose of this last method is to produce an output string.
     */
    @Override
    public String toString() {
        String output = "[ ";
        for (int i = 0; i < this.stackSize(); i++) {
            if (this.stackIntereference[i] != null) {
                output += stackIntereference[i] + " ";
            }
        }
        output += "]";
        return output;
    }
// final checkpoint
}