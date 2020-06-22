/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author User
 */
public class Singlylinkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person <String> node1 = new Person<>("Knoxx", "Montefalco", "Alegria");
        Person <String> node2 = new Person<>("Rozen", "Elizalde", "Cebu");
        Person <String> node3 = new Person<>("Jayden", "Corpuz", "Manila");
        Person <String> node4 = new Person<>("Jaxon", "Riego", "Davao");
        Person <String> node5 = new Person<>("Noah", "Elizalde", "Bohol");
         
        SList<String> sList = new SList<>();
        
        sList.addFirst(node1);
        sList.addFirst(node2);
        sList.addFirst(node3);
        sList.addFirst(node4);
        sList.addLast(node5);
        
        System.out.println("\nBefore removeFirst()");
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
        
        System.out.println("\nAfter removeFirst()");
        sList.removeFirst();
        sList.showList();
    }
}

