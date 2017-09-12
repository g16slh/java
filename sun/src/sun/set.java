package sun;

import java.util.HashSet;
import java.util.TreeSet;

public class set {
	//hashset的相关知识
	/*public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("frist");
		hs.add("second");
		hs.add("third");
		hs.add("forth");
		System.out.println(hs);
		for (String str : hs) {
			System.out.println(str);
		}
	}*/
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("frist");
		ts.add("second");
		ts.add("third");
		ts.add("forth");
		System.out.println(ts);
		for (String str : ts) {
			System.out.println(str);
		}
	}
}
