import java.util.Hashtable;
import java.util.Map;


public class testHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("Name", "Sandeep");
		ht.put("Dep", "OK");
		ht.put("Location", "India");
		
		for(Map.Entry<String, String> m : ht.entrySet()){
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
		
		ht.remove("Dep");
		for(Map.Entry<String, String> m : ht.entrySet()){
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
		
		ht.put(null, "ok");
		
		for(Map.Entry<String, String> m : ht.entrySet()){
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
	}

}
