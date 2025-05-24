package HashhEg;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapEg {
    public static void main(String[] args) {
        HashMap<String, Integer> item = new HashMap<>();  
        // "HashMap stores data in (key, value) pairs. Each key is associated with a value, and you can access the value by using the corresponding key. "
        item.put("Pemba",12);
        item.put("Pemba",22);
        item.put("Apple",21);
        item.put("banana", 20);
        System.out.println("Hash-map: "+item);


        LinkedHashMap<String, Integer> items = new LinkedHashMap<>();
        items.put("Apple",21);
        items.put("banana", 22);
        items.put("Pemba",12);
        items.put("Pemba",22);
        System.out.println("Linked HashMap: "+items);

        TreeMap<String, Integer> Items = new TreeMap<>();
        Items.put("Apple",21);
        Items.put("Banana", 22);
        Items.put("Ram",12);
        Items.put("Pemba",22);
        System.out.println("Tree Map: "+Items);


    }
}
