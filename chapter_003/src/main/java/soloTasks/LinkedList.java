package soloTasks;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;

public class LinkedList<T> {
    public class Node<T> {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    Node<T> first = null;

    void add(T value) {
        Node newNode=new Node(value);
        if (first == null) {
            first = newNode;
        }else{
            Node<T> dop = first;
            while(dop.next!=null){
                dop=dop.next;
            }
            dop.next=newNode;
        }
    }
    ArrayList<T> toArray(){
        ArrayList<T> arr = new ArrayList<T>();
        arr.add(first.value);
        Node dop=first;
        while(dop.next!=null){
            dop=dop.next;
    //        arr.add(dop.value);
        }
      return arr;
    }

    @Override
    public String toString() {
        return "List{" +
                "first=" + first +
                '}';
    }
    public void reverse(){
       Node<T> last = first;
       while(first.next!=null){
           Node<T> b = first.next;
           Node<T> c= b.next;
           b.next=last;
           last=b;
           first.next=c;
       }
       first=last;
    }
}
