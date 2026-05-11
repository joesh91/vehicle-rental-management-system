package datastructures;

public class DoublyLinkedList <T> {
    Node <T> head;
    Node <T> tail;

        public void addToHead(T value){
            Node <T> n = new Node<>(value);

            if(head == null){
                head = n;
                tail = n;
            }else{
                    head.prev=n;
                    n.next=head;
                    head=n;
            }
        }

        public void addToTail(T value){
            Node <T> n = new Node<>(value);
                if(tail==null){
                    head = n;
                    tail = n;
                }else{
                    n.prev=tail;
                    tail.next=n;
                    tail=n;
                }
        }

        public void addToMiddle(T value, T after){

            Node <T> n = new Node<>(value);

            Node <T> current = head;
                while(current!=null){
                    if(current.data.equals(after)){
                        n.prev=current;
                        n.next=current.next;
                            if(current.next != null){
                               current.next.prev=n;
                            }else{
                                tail=n;
                            }
                        current.next=n;
                            break;
                    }else{
                        current=current.next;
                    }
                }
        }

        public boolean delete(T value){

            boolean isDeleted = false;

            if(head==null) return isDeleted;

            if(head.data.equals(value)){
                head=head.next;
                    if(head!=null){
                        head.prev=null;
                    }else{
                        tail=null;
                    }
                isDeleted=true;
            }

            Node <T> current = head;
                while(current.next!=null){
                    if(current.next.data.equals(value)) {
                        current.next = current.next.next;
                        if (current.next != null) {
                            current.next.prev = current;
                        } else {
                            tail = current;
                        }
                        isDeleted=true;
                        break;
                    }else{
                        current=current.next;
                        }
                    }
            return isDeleted;
        }


}
