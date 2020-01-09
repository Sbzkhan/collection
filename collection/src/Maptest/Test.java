package Maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
	HashMap<Integer,String> m= new HashMap<Integer,String>();
	m.put(4, "shahbaz");
	m.put(2, "khan");
	m.put(3, "arbaz");
	m.put(1, "shahbaz2");
	m.put(4, "ajaz");
	for(Map.Entry<Integer, String> mp:m.entrySet())
	{
		System.out.println("key::"+mp.getKey()+"::value::"+mp.getValue());
	}
	
	
	//Collection c=m.values();
	//System.out.println(c);
	
	//System.out.println(m);
	
	//Set s=m.keySet();
	//System.out.println(s);
	//Set<Map.Entry<Integer,String>> set=m.entrySet();  
	/*Set set=m.entrySet();  
	Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
	while(itr.hasNext()){  
	Map.Entry e=itr.next();//no need to typecast  
	System.out.println(e.getKey()+"...... "+e.getValue());  
	}  */
	//System.out.println(m);

	}

}
