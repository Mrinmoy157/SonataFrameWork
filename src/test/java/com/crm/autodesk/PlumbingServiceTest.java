package com.crm.autodesk;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.EnterEmailAddress;
import objectRepository.PlumberNeedsToKnow;
import objectRepository.ProblemPage;
import objectRepository.ProblemsDoYouHave;
import objectRepository.RequirePlumbing;
import objectRepository.SelectDate;
import objectRepository.TimeOfPlumber;
import objectRepository.WhatDoYouNeed;

/**
 * this is plumbing service class
 * @author mrinm
 *
 */
public class PlumbingServiceTest extends BaseClass{
	@Test
	public void plumbing() throws Throwable {
		ProblemPage pp= new ProblemPage(driver);
		pp.selectProblemNeeded();
		
		WhatDoYouNeed wn= new WhatDoYouNeed(driver);
		wn.selectWhatDoYouNeed();
		
		ProblemsDoYouHave ph= new ProblemsDoYouHave(driver);
		ph.selectProblemsYouHave();
		
		PlumberNeedsToKnow pk= new PlumberNeedsToKnow(driver);
		pk.writeDescription();
		
		
		RequirePlumbing rp= new RequirePlumbing(driver);
		rp.selectRadioButton();
		
		//Fetching the data from excel to provide timing.
		ExcelUtility eLib = new ExcelUtility();
		String time=eLib.getDataFromExcel("Sheet1", 0, 1);
		
		//Creating object of SelectDate for providing a particular date
		SelectDate sd= new SelectDate(driver);
		sd.selectParticularDate();
		
		TimeOfPlumber tp= new TimeOfPlumber(driver);
		tp.selectParticularTime(time);
		
		//Fetching the data from excel to provide emailId.
		String email=eLib.getDataFromExcel("Sheet2", 1, 1);
		EnterEmailAddress ea= new EnterEmailAddress(driver);
		ea.selectEmailAddress(email);
	}

}
