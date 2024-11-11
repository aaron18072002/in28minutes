package com.in28minutes.mysortingconsumer;

import java.util.List;
import java.util.logging.Logger;
import com.in28minutes.mysorting.MySorting;

public class MySortingConsumer {
	private static final Logger logger = Logger.getLogger
			(MySortingConsumer.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySorting mySorting = new MySorting();
		
		List<String> sortedNames = mySorting.sort
				(List.of("Ranga","Ravi","Sathish","Adam","Eve"));
		
		logger.info(sortedNames.toString());
	}
}
