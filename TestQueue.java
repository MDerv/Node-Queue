/*
Dhruv Sharma
10/28/2020
11/12/2020
This is a the class that defines a stack using nodes.
 */

import java.util.*;

public class TestQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue st = new Queue(); //real stack

        //should return true
        System.out.println(st.isEmpty());

        //add 1st element to stacks
        st.enqueue(2);

        //should return false
        System.out.println(st.isEmpty());

        //should return 2
        System.out.println(st.peek());

        //should return 1
        System.out.println(st.size());

        //add 2nd and 3rd elements to stacks
        st.enqueue(3);
        st.enqueue(5);

        //should return 3
        System.out.println(st.size());

        //removes first element; should return 2
        System.out.println(st.dequeue());

        //should return 2
        System.out.println(st.size());

        //should return 3
        System.out.println(st.peek());

        //removes first element; should return 3
        System.out.println(st.dequeue());

        //removes last remaining element; should return 5
        System.out.println(st.dequeue());

        //should return 0
        System.out.println(st.size());

        //add 1st element to stacks (again to test if the stack could be re-used)
        st.enqueue(7);

        //should return 7
        System.out.println(st.peek());

        //removes last element; should return 7
        System.out.println(st.dequeue());

        //should return 0
        System.out.println(st.size());

        //removes last element; should an error, as there are no elements in stack to remove
        System.out.println(st.dequeue());

    }
}
