import java.util.*; //NU UITA SA INCLUZI functiile din Java Util

public class Main {

    public static void main(String[] args) {

        // Crearea obiectului din lista (poate fi LinkedList sau ArrayList)
        LinkedList<String> listA = new LinkedList<String>();

        // Adaugarea elementelor in lista
        listA.add("A");
        listA.add("B");
        listA.addLast("C");
        listA.addFirst("D");
        listA.add(2, "E");
        listA.add("F");
        listA.add("G");
        System.out.println("Lista inlantuita: " + listA);

        for (String tmp : listA) {
            System.out.println(tmp);
        }

/*
        // Stergerea elementelor din lista
        listA.remove("B");
        listA.remove();
        listA.remove(3);
        listA.removeFirst();
        listA.removeLast();
        System.out.println("Lista inlantuita dupa elementele eliminate: " + listA);
*/

        // Cautarea elementelor din lista

        if (listA.contains("F")) {
            System.out.println("Lista contine elementul 'F' ");
        } else {
            System.out.println("Lista nu contine elementul 'F'");
        }

        // Numarul elementelor din lista
        System.out.println("Lungimea listei = " + listA.size());

        // Functiile get si set ale listei inlantuite
        String element = listA.get(2);
        System.out.println("Element din lista, ales este : " + element);
        listA.set(2, "Y");
        System.out.println("Lista inlantuita dupa modificare : " + listA);

        //bucla for each
        for (String tmp : listA) {
            System.out.println(tmp);
        }

        Iterator it = listA.iterator();

        System.out.println("Iterator");

        while (it.hasNext()) {

            System.out.print(it.next());
        }

    }
}