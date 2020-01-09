package comparator;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String args[])
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("shahbaz", "khan");
		map.put("chennai", "tamilnadu");
		for(Map.Entry<String, String> m : map.entrySet())
		{
			System.out.println("getkey"+m.getKey()+"/ngetvalue"+m.getValue());
		}
	}
}
