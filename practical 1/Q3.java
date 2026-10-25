import java.util.Vector;
public class Q3{
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        vec.add("Nagpur");
        vec.add("Pune");
        vec.add("Mumbai");
        vec.add("Malkapur");
        vec.add("Dubai");
        System.out.println(vec);
        vec.add("New York");
        vec.add("Moscow");
        System.out.println(vec);
        vec.remove(2);
        vec.remove(5);
        vec.add (5, "Pandharpur");
        System.out.println(vec);
        vec.removeElementAt(0);
        vec.removeElementAt(vec.lastIndexOf(vec.lastElement()));
        System.out.println(vec.size());
        System.out.println(vec.capacity());
    }
}