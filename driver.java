/**
 * The driver class 
 * @author Deepali Juneja
 * @version 21 April 2020
 */
public class driver {
    public static void main(String[] args) {
        System.out.println("Part 1: Arrays ");
        testtheArrayL();
        System.out.println("Part 2:Stacks ");
        testStack();
      
    }

    public static void testtheArrayL() {
        Integer[] array1 = { 100,200,200,4000,500,40 };
        Integer[] array2 = { 1,2,4,5,6 };
        Integer[] array1Copy = { 5,3,8,6,};

        theArrayList theArrayL1 = new theArrayList(array1);
        theArrayList theArrayL2 = new theArrayList(array2);
        theArrayList theArrayL3 = new theArrayList(array1Copy);

        System.out.println("give the value at index 3: " + theArrayL2.get(3));
        System.out.println("what is the index at 8: " + theArrayL2.indexOf(8));
        System.out.println("Size of theArrayL2: " + theArrayL2.Arsize());

        System.out.println();

        boolean evalEmpty = theArrayL2.evalEmpty();
        if (!evalEmpty) {
            System.out.println(theArrayL2 + " doesn't seem to be empty");
        }

        System.out.println();

        System.out.println();

        theArrayL1.insert(0, 0);
        theArrayL1.insert(69, 5);
        boolean equals = theArrayL1.equals(theArrayL3);
        if (equals) {
            System.out.println(theArrayL1 + " is equals to " + theArrayL3);
        } else {
            System.out.println(theArrayL1 + " is not equals to " + theArrayL3);
        }

        System.out.println();

        System.out.println("theArrayL2: " + theArrayL2);
        System.out.println(theArrayL2.remove(theArrayL2.Arsize() - 1) + " has been removed");
        System.out.println("theArrayL2: " + theArrayL2);
    }

    public static void testStack() {
        Stack d = new Stack();
        d.push('d');
        d.push('e');
        d.push('e');
        d.push('p');
        d.push('s');
        d.push('i');

        System.out.println(d);

        d.remove();
        d.remove();
        d.remove();

        System.out.println(d.stackSize());
        System.out.println(d);
        System.out.println("This is empty " + d.evalEmpty());
    }

    public static void testQueue() {
        Queue Q = new Queue();
        Q.enqueue('d');
        Q.enqueue('i');
        Q.enqueue('p');
        Q.enqueue('s');
        

        System.out.println(Q);
        System.out.println(Q + " is empty: "+Q.evalEmpty());
        while (!Q.evalEmpty()) {
            System.out.print(Q.deq()+" ");
        }
        System.out.println(Q + " is empty: "+Q.evalEmpty());
    }
}
