package sun;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm=new TreeMap<String ,Integer>();
		tm.put("tom", new Integer(23));
		tm.put("rose", new Integer(23));
		Set<Map.Entry<String,Integer>>set=tm.entrySet();
		for(Entry<String,Integer>entry:set) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
