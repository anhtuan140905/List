/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

/**
 *
 * @author tuan0
 */
class Dlist<Item> implements MyList<Item>{
    Node header;
    Node trailer;

    public Dlist() {
        header = new Node(null, null, null);
        trailer = new Node(null,header, null);
        header.next = trailer;
    }
    
    
    public void print() {
        Node current = header.next;
        System.out.printf("[ ");
        while(current != trailer) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.printf("]");
    }
    
    public void addLast(Item data) {
        insertAfter(data, trailer.prev);
    }

    public void addFirst(Item data) {
        insertAfter(data, header);
    }

    private void insertAfter(Item data, Node node) {
        Node left = node;
        Node right = node.next;
        Node newNode = new Node(data, left, right);
        left.next = newNode;
        right.prev= newNode;
//        Node newNode = new Node(data, node, node.next);
//        node.next = newNode;
//        newNode.next.prev = newNode;  
    }
    
    public class Node {
        Item data;
        Node prev;
        Node next;

        public Node(Item data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        
        
        
    }
    
}
