package CollectionPractice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> Books = new HashSet<>();
        Books.add("Wings Of Fire");
        Books.add("Atomic habits");
        Books.add("Long Walk to Freedom");
        Books.add("The Story of My Experiments with Truth");
        Books.add("God of Small Things ");
        System.out.println("BOOKS : " + Books);

        HashSet<String> Group1 = new HashSet<>();
        Group1.add("Ignited minds");
        Group1.add("Turning Points");
        Group1.add("India 2020");
        Group1.add("Forge your future");
        Group1.add("Learning how to Fly");
        // Group1.add("India 2020"); -duplicate element is ignored

        Iterator<String> itr = Group1.iterator();
    // Adding a new line in Java -> "\n" , "\r", or "\r\n" at the end of our string.
        System.out.println("\r\n" + "Dr.A.P.J Abdul Kalam BOOKS : ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        HashSet<String> Group2 = new HashSet<>();
        Group2.add("The end of imagination");
        Group2.add("Walking with the comrades");
        Group2.add("War Talk");
        Group2.add("The Doctor and the Saint");
        Group2.add("Come September");

    // HashSet does not have a get method to retrieve elements.
        // for(int i=0;i<Group2.size();i++){
        // System.out.println(Group2.get(i));
        // }
        
        System.out.println("\r\n" + "ARUNDHATI ROY BOOKS");
        for (String grp : Group2) {
            System.out.println(grp);
        }

    // cannot use ListIterator in Set, Queue, Deque.
        // ListIterator<String> itr1=Group2.listIterator(Group2.size());

        HashSet<String> Group3 = new HashSet<>();
        Group3.add("The blue umbrella");
        Group3.add("Angry River");
        Group3.add("Tiger in the tunnel");
        Group3.add("A Flight of Pigeons");
        Group3.add("Delhi is not far");


        System.out.println("\r\n" + "RUSKIN BOND BOOKS");
        Iterator<String> itr1 = Group3.iterator();
        itr1.forEachRemaining(grp3 -> {
            System.out.println(grp3);
        });
        Group3.add("Cherry Tree");
        System.out.println("Element added: "+Group3);

        Group3.remove("Cherry Tree");
        System.out.println("Element removed: "+Group3);


        System.out.println("\n Enter a string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Group3.add(str);

        System.out.println("Added new element: "+ Group3);
        sc.close();
       
        ArrayList<String> book=new ArrayList<>();
        book.add("The room on the roof");
        book.add("The Great Train Journey");
        book.add("The Golden Years");

        HashSet<String> bookList=new HashSet<>(book);
        bookList.add("School Times");
        bookList.add("The girl on the train");

        // HashSet from another Collection
        System.out.println("\n HASHSET FROM ANOTHER COLLECTION: ");
        for (String ruskin : bookList) {
            System.out.println(ruskin);
            
        }
    }
}
// add()
// clear()
// clone()- clones hashset instance not elements
// contains()
// isEmpty()
// iterator()
// remove()
// size()
// spliterator()
