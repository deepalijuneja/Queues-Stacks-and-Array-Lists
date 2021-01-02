import java.util.Arrays;

/**
 * The third part of homework: Queue Interference
 * @author Deepali Juneja
 * @version 21 April 2020
 */
public class Queue {
    private Object[] theQueueArray;// this is the original array
    private int numberElem;

    /**
     * Below, is the 1st constructor that is used to initiate the initial array and it keeps going on.
     */
    public Queue() {
        this.theQueueArray = new Object[1];
        this.numberElem = 0;
    }
    // checkpoint 1
    /**
     * Below, is the 2nd constructor which takes arrays of objects as an argument.
     * 
     * @param Q 
     */
    public Queue(Object[] Q) {
        this.theQueueArray = new Object[Q.length];
        this.theQueueArray = Arrays.copyOf(Q, Q.length);
        this.numberElem = 0;
    }
    //checkpoint 2
    /**
     * The purpose of this method is to give the Queue's size.
     * 
     * @return the size of the array
     */
    public int queueSize() {
        return this.theQueueArray.length;
    }
     //checkpoint 3
    /**
     * The purpose of this method is to add elements.
     * 
     * @param elemObj
     */
     public void enqueue(Object elemObj) {
        if (this.numberElem == this.queueSize()) {
            this.theQueueArray = Arrays.copyOf(this.theQueueArray, this.queueSize() + 1);
        }
        this.theQueueArray[this.numberElem++] = elemObj;
    }
    // checkpoint 4
    /**
     * This method removes elements in FIFO form, so the first element to be added
     * would be removed first
     * 
     * @return deq the dequed element/item 
     */
    public Object deq() {
        Object elem = this.theQueueArray[0];
        this.theQueueArray[0] = null;// this removes the 1st element
        System.arraycopy(this.theQueueArray, 1, this.theQueueArray, 0, this.numberElem - 1);
        this.numberElem--;
        return elem;
    }
    //checkpoint 5
    /**
     * The purpose of this method to evaluate if the queue is empty or not.
     * 
     * @return
     */
    public boolean evalEmpty() {
        boolean output = false;
        if (this.numberElem == 0) {
            output = true;
        } else {
            output = false;
        }
        return output;
    }
    //checkpoint 6
    /**
     * The purpose of this method is to get/take the object at the specified index position
     * 
     * @param indexPosition
     * @return whichever object is in that specific location
     */
    public Object get(int indexPosition) {
        return this.theQueueArray[indexPosition];
    }
//checkpoint 7
    /**
     * The purpose of this method is to evaluate if 2 queues are equal or not to each other.
     * 
     * @param evalQueue
     * @return true or false 
     *         
     */
    public boolean equals(Queue evalQueue) {
        boolean output = false;
        if (this.queueSize() == evalQueue.queueSize()) {
            for (int i = 0; i < this.queueSize(); i++) {
                if (this.theQueueArray[i] == evalQueue.get(i)) {
                    output = true;
                } else {
                    output = false;
                }
            }
        } else {
            output = false;
        }
        return output;
    }
//checkpoint 8
    /**
     * The purpose of this last method is to produce an output string.
     */
    @Override
    public String toString() {
        String output = "[ ";
        for (int i = 0; i < numberElem; i++) {
            output += theQueueArray[i] + " ";
        }
        output += "]";
        return output;
        //final checkpoint
    }
}