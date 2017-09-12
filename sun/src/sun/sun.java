package sun;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sun {
	//hashmap的使用方法
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		//添加数据
		hm.put("tom",new Integer(23));
		hm.put("rose",new Integer(18));
		hm.put("jane",new Integer(26));
		hm.put("black",new Integer(28));
		hm.put("smith",new Integer(230));
		//获取entry的集合
		Set<Map.Entry<String, Integer>>set=hm.entrySet();
		//遍历所有元素
		for(Map.Entry<String, Integer>entry:set) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			}
			System.out.println("------------------");
			Set<String>KeySet=hm.keySet();
			StringBuffer buffer=new StringBuffer();
			for(String str:KeySet) {
			buffer.append(str +",");
		}
			String str=buffer.substring(0,buffer.length()-1);
			System.out.println(str);
		
	}
	
}
