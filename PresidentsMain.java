package lab7_1302;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PresidentsMain {
	public static void main(String[] args) {
		Map<String, String> PresidentsOfTheUnitedStates = new HashMap<String, String>();
			PresidentsOfTheUnitedStates.put("George Washington", "Unaffiliated");
			PresidentsOfTheUnitedStates.put("John Adams", "Federalist");
			PresidentsOfTheUnitedStates.put("Thomas Jefferson", "Democratic-Republican");
			PresidentsOfTheUnitedStates.put("James Madison", "Democratic-Republican");
			PresidentsOfTheUnitedStates.put("James Monroe", "Democratic-Republican");
			PresidentsOfTheUnitedStates.put("John Quincy Adams", "Democratic-Republican");
			PresidentsOfTheUnitedStates.put("Andrew Jackson", "Democratic");
			PresidentsOfTheUnitedStates.put("Martin Van Buren","Democratic");
			PresidentsOfTheUnitedStates.put("William Henry Harrison","Whig");
			PresidentsOfTheUnitedStates.put("John Tyler","Whig");
	
			PresidentsClient t = new PresidentsClient();
			t.FilterMapByValue(PresidentsOfTheUnitedStates, "Democratic-Republican");
			System.out.println();
			t.PrintValues(PresidentsOfTheUnitedStates);
			System.out.println();
			t.PrintKeys(PresidentsOfTheUnitedStates);
	}
}
