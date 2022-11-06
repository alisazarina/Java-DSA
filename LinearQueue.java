public class LinearQueue {

    // Data members
    private int front;
    private int tail;
    private int size;
    private int[] queue; // data structure

    // The following are method members

    // Constructor that is used to create queue and initialization - front, tail,
    public LinearQueue() {
        front = 0;
        tail = -1;
        size = 3;
        queue = new int[size];              // create linear queue (array) of size 3
    }

    // Add data into queue at tail location
    public void enqueue(int item) {         // item = new value that you want to add into the queue
        tail++;                             // update value of tail -- increase by 1
        queue[tail] = item;                 // assign new value (item, parameter 1) into the queue at tail (the specific index of the last data of the queue) location
    }

    // Remove the front data of the queue
    public int dequeue() {
        int temp;

        temp = queue[front];                // copy the value that you want to remove into a temporary storage (before you perform remove/dequeue op)
        front++;                            // update value of front -- increase by 1

        return temp;
    }

    // Check if queue is empty or not
    public boolean empty() {
        if (front > tail)                   // condition to tell that the queue IS empty
            return true;
        else
            return false;                   // if queue is not empty
    }

    // Check is queue is full or not
    public boolean full() {
        if (front == 0 && tail == size - 1) // condition to tell that the queue IS full
            return true;
        else
            return false;                   // if queue is not full
    }

}
