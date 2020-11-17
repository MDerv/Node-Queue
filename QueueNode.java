/*
Dhruv Sharma
11/12/2020
11/12/2020
This is a simple node class ti be used in the Queue class
*/

public class QueueNode<T> {

    private QueueNode parentNode;
    private T tData;

    public QueueNode() {
        //empty
    }

    public QueueNode(T data) { // 1 param
        tData = data;
        parentNode = null;
    }

    public QueueNode(T data, QueueNode parent) { // 2 param
        tData = data;
        parentNode = parent;
    }

    public QueueNode getParent () { //returns parentNode instance variable
        return parentNode;
    }

    public T getTData() { //returns tData instance variable
        return tData;
    }

    public void newParent(QueueNode parent) { //overwrites parentNode instance variable
        parentNode =  parent;
    }

    public void setParent(QueueNode parent) { //overwrites parentNode instance variable
        parentNode = parent;
    }

    public void newTData(T data) { //overwrites tData instance variable
        tData =  data;
    }

    public String toString() { //outputs tData as a string
        return "Node: " + tData.toString();
    }

    public boolean equals(QueueNode nodeToCompare) { //compares tData instance variable to another class' tData instance variable
        return tData == nodeToCompare.getTData();
    }

}