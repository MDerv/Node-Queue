/*
Dhruv Sharma
11/12/2020
11/12/2020
This is a the class that defines a queue using nodes.
 */
public class Queue<T> {

    private int length;
    private QueueNode firstNode;
    private QueueNode lastNode;



    public Queue() {
        firstNode = new QueueNode();
        lastNode = firstNode;
        length = 0;
    }

    
    }
}
