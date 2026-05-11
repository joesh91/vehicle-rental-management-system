package datastructures;

public class Node <T>{

    Node next;
    Node prev;
    T data;

        public Node(T data){
            this.data =data;
            this.next = null;
            this.prev = null;
        }

}
