import java.util.HashMap;
import java.util.Map;



public class testHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Name", "Sandeep");
		hm.put("Dep", "QA");
		hm.put("Location", "India");
		
		for(Map.Entry<String, String> m : hm.entrySet()){
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
		
		hm.remove("Dep");

		for(Map.Entry<String, String> m : hm.entrySet()){
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
		
		hm.put("Role", "Manager");
		
		for(Map.Entry<String, String> m : hm.entrySet()){
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
		
		hm.put(null, "ok");
		
		for(Map.Entry<String, String> m : hm.entrySet()){
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
	}

}

