package CollectionPractice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> linkedlt1 = new LinkedList<String>();
        linkedlt1.add("India");
        linkedlt1.add("USA");
        linkedlt1.add("UK");
        linkedlt1.add("Australia");
        linkedlt1.add("Switzerland !");

        linkedlt1.add(1, "UAE");

        LinkedList<String> linkedlt2 = new LinkedList<String>();
        linkedlt2.add("France");
        linkedlt2.add("Qatar !!");

        linkedlt1.addAll(linkedlt2);

        LinkedList<String> linkedlt3 = new LinkedList<String>();
        linkedlt3.add("Luxembourg !!!");
        linkedlt3.addFirst("Japan");

        linkedlt1.addAll(1, linkedlt3);

        linkedlt1.addLast("Ireland ");
        // System.out.println(linkedlt);
        Iterator<String> itr1 = linkedlt1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        LinkedList<String> cList1 = new LinkedList<>();
        cList1.add("New Delhi");
        cList1.add("Mumbai");
        cList1.add("Tamil Nadu");
        cList1.add("Kerala");
        cList1.add("Andhra Pradesh");
        cList1.add("Telangana");
        cList1.add("Mumbai");
        cList1.add("West Bengal");
        cList1.add("Karnataka");
        cList1.add("Kerala");
        cList1.add("Mumbai");
        cList1.add("West Bengal");
        Iterator<String> itr2= cList1.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        cList1.remove(5);
        System.out.println("\n"+cList1+"\n");
        cList1.remove("West BengaL");
        cList1.remove("West");
        System.out.println("\n"+cList1+"\n");
        cList1.removeFirst();
        System.out.println("first remove----"+cList1);
        cList1.removeLast();
        System.out.println("last remove----"+cList1);
        cList1.removeFirstOccurrence("Kerala");
        System.out.println("1 st occ---"+cList1);
        cList1.removeLastOccurrence("Mumbai");
        System.out.println("last occ-----"+cList1);

        // Iterator<String> i=cList1.descendingIterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
            ListIterator<String> list=cList1.listIterator(cList1.size());
            System.out.println("\n");
            while(list.hasPrevious()){
                String s=list.previous();
                System.out.println(s);
            }
    

        System.out.println("\n"+cList1.peek());
    }
}

// clear()
// clone()
// contains()
// element()
// get()
// getFirst() getLast()
// indexOf(), lastIndexOf()
