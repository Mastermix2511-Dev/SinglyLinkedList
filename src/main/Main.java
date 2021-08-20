package main;
import singlylinkedlist.*;

public class Main{
  public static void main(String args []){
    SinglyLinkedList list = new SinglyLinkedList(); 
    /*
     
    list.append(1);
    list.append(2);
    list.prepend(40);
    list.prepend(30);
    list.append(20);
    list.prepend(10);
    list.prepend(10);
    list.append(10);
    
    */

    /*
     
    list.prepend(1);
    list.prepend(2);
    list.prepend(3);
    list.prepend(4);
     * */
    list.append(2);
    list.prepend(1);
    list.prepend(3);
    System.out.println();
    list.printList();
    list.returnHead();
    list.returnTail();
  }
}
