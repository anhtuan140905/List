
package list;

/**
 *
 * @author tuan0
 */
public class Slist<Item> implements MyList<Item>{
    Node head;
    
    public void upgradePrint() {
        print(head);
    }
    
    public void print(Node start) {
        if(start == null) return;
        System.out.println(start.data + ", ");
        print(start.next);
    }
    
//    public void print() {
//        Node current = head;
//        System.out.printf("[ ");
//        while(current != null) {
//            System.out.print(current.data + ", ");
//            current = current.next;
//        }
//        System.out.printf("]");
//    }
    
    public void addFirst(Item data) {
        head = new Node(data, head);
    }
    
//    public void addLast(String data) {
//        if(head == null) {
//            addFirst(data);
//            return;
//        }
//        Node lastNode = head;
//        while(lastNode.next != null) lastNode = lastNode.next;
//        lastNode.next = new Node(data, null);
//    }
    
        public void addLast(Item data) {
            head = addLast(data, head);
        }
        
        private Node addLast(Item data, Node start) {
            if(start != null) { 
                start.next = addLast(data, start.next);
                return start;
            }
            else {  //empty
                return new Node(data, null);
            }
        }

    @Override
    public void print() {
        Node current = head;
        System.out.printf("[ ");
        while(current != null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.printf("]");
//    }
    }
    
    public class Node {
        Item data;
        Node next;
                
        Node(Item data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
