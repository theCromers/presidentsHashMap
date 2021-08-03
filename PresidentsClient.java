package lab7_1302;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class PresidentsClient {
	public void FilterMapByValue(Map<String, String>InMap, String TargetValue) {
		  for (Map.Entry<String,String> Entry : InMap.entrySet()) {
			  if(Entry.getValue().equals(TargetValue)) {
				  System.out.println(Entry.getKey());
			  }
		  }
	}
	public void PrintValues(Map<String, String>Values) {
	
		for(String s:	Values.values()) {
			System.out.println(s);
		}
	}
	public void PrintKeys(Map<String, String>Keys) {
		
		for(String t: Keys.keySet()) {
			System.out.println(t);
		}
	}
}


