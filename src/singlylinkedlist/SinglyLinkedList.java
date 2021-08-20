package singlylinkedlist; 
import node.*;

public class SinglyLinkedList {
  public Node head;

  public SinglyLinkedList(){
    this.head = null; 
  } 

  public void append(int number){ //se agrega un nodo antes
    Node newNode = new Node(number); //se crea un nuevo nodo
    if (head == null) { //se verifica si ya existe un nodo en la lista
      head = newNode;	// si no hay ningun nodo se agrega el nuevo nodo a la cabeza
    } else { // en caso de haber mas de 1 nodo a en la lista entra el else
      Node current = head; // se crea un nodo temp para movernos de nodo en nodo sin perder referencia de cabeza
      while (current.next != null) { // este bucle se repite hasta el ultimo nodo se encuentre su next == null
	current = current.next; // variable que sirve de contador para ir cambiando al next nodo
      }
      current.next = newNode; // el ultimo nodo se conecta con el nuevo nodo 
    }
  }

  public void prepend(int number){ // se agrega un nodo despues
    Node newNode = new Node(number); // se crea un nuevo nodo
    if (head == null) { //se verifica si ya existe un nodo en la lista
      head = newNode;	// si no hay ningun nodo se agrega el nuevo nodo a la cabeza
    } else { // en caso de haber mas de 1 nodo a en la lista entra el else
      newNode.next = head; // el nuevo nodo se conecta su next con la cabeza(head) 
      head = newNode; // y por ultimo se cambia el valor de la cabeza el nuevo nodo
    }
  }


  public void returnHead(){
    if (head == null) {
      System.out.println("\nNo hay cabeza");
    } else {
      System.out.println("\nLa cabeza es: " + head.number);
    }
  }

  public void returnTail(){
    if (head == null) {
      System.out.println("\nNo hay cola");
    }else{
      Node current = head; 
      while (current.next != null) {
	current = current.next;
      }
      System.out.println("\nLa cola es: " + current.number);
    }
  }

  public void printList(){
    Node current = head;
    if (current == null) {
      System.out.println("Esta vacia la lista");	
    } else {
      while (current != null) {
	System.out.print(current.number + "->");  	
	current = current.next; 
      }
    }
  }

}

