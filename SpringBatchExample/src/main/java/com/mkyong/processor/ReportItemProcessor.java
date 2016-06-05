package com.mkyong.processor;

import org.springframework.batch.item.ItemProcessor;
import com.mkyong.model.Report;

public class ReportItemProcessor implements ItemProcessor<Report, Report>{
	
	
	public Report process(Report date) throws Exception {
		System.out.println("Processing result :"+date);	
		/*
		 * Only return results which are more than 80%
		 * 
		 */
		if((date.getDate()).equalsIgnoreCase("date")){
			return null;
		}
		
		return date;
	}

}
