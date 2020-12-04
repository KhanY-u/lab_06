import java.net.PortUnreachableException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MyMap {
    public static void main(String[] args) {
        //Use Obj
        Map<Integer,String> m = new HashMap();
        m.put(1, "Computer");
        m.put(2,"Map");
        m.put(3,"Table");
        m.put(4,"door");
        System.out.println("Using the Object");
        System.out.println(m);
    // using generic
        Map<Integer,Object > n = new HashMap<>();
        Vector<Integer> Number = new Vector<>();
        Number.add(1); Number.add(4);
        n.put(1,"abc");
        n.put(2,2);
        n.put(3,Number);
        System.out.println("Using the Generic");
        System.out.println(n);
}
// Advantage of generic type over object is : The difference is that the inputs to formal
// parameters are values, while the inputs to type parameters are types
}


