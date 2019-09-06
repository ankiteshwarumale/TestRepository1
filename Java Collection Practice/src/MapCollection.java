import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class MapCollection {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Ankit");
		map.put(3, "Rahi");
		map.put(8, "Tree");
		map.put(5, "QQQQQ");
		
		
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Ankit");
		map1.put(3, "Rahi");
		map1.put(8, "Tree");
		map1.put(5, "QQQQQ");
		
		for(Map.Entry m : map1.entrySet()) {
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
		
		
	}

}
