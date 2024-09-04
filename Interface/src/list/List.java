/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 *
 * @author tuan0
 */
public class List{

    public static void testString(MyList<String> list){
        list.addLast("Xin chào");
        list.addFirst("Tuấn");
        list.addFirst("Anh");
        list.addFirst("Phúc");
        list.addFirst("Nguyễn");
        list.addLast("14/09/2005");
        list.print();
    }
    
    public static void main(String[] args) {
        System.out.println("Test Slist");
        MyList<String> slist = new Slist<>();
        testString(slist);
        System.out.println("\n------------------------");
//        Dlist dlist = new Dlist();
//        test(dlist);
          
        System.out.println("Test Dlist");
        MyList<String> dlist = new Dlist<>();
        testString(dlist);
        
        System.out.println("Test Integer");
        MyList<Integer> dlist2 = new Dlist<>();
        testInteger(dlist2);
    }
    
    public static void testInteger(MyList<Integer> list) {
        list.addLast(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(7);
        list.addLast(8);
        list.print();
    }
    
}
