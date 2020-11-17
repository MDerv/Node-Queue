/*
Dhruv Sharma
11/12/2020
11/17/2020
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

    public boolean isEmpty() { //checks if stack is empty
        if (length == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void enqueue(T element) { //add an element
        if (length == 0) {
            QueueNode tempNode = new QueueNode(element);
            firstNode = tempNode;
            lastNode = tempNode;
            length++;
        }
        else {
            QueueNode tempNode = new QueueNode(element);
            lastNode.setParent(tempNode);
            lastNode = tempNode;
            length++;
        }
    }

    public T dequeue() { //remove and return the first element
        QueueNode tempNode = peekNode();

        if(length > 1) {
            firstNode = peekNode().getParent();
            tempNode.setParent(null);
            length--;
            return (T) tempNode.getTData();
        }
        else if(length == 1) {
            firstNode = new QueueNode();
            lastNode = firstNode;
            length--;
            return (T) tempNode.getTData();
        }
        else {
            throw new IndexOutOfBoundsException("Your stack is empty!");
        }
    }

    public int size() {
        return length;
    }

    public QueueNode peekNode() { //look at the top node without removing
        return firstNode;
    }

    public T peek() { //look at the top element without removing
        return (T) peekNode().getTData();
    }
}
