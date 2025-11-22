package com.pageobjectmanager;

import com.pageobjectmodel.EmployeementPage;
import com.pageobjectmodel.KeySkillPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.ProfileUpdatePage;
import com.pageobjectmodel.ResumeHeaderLinePage;
import com.utility.FileReaderManger;

public class PageObjectManager {
	
	private static PageObjectManager pageObjectManager;
	private FileReaderManger fileReaderManger;
	private LoginPage loginPage;
	private ProfileUpdatePage profileUpdatePage;
	private ResumeHeaderLinePage resumeHeaderLinePage;
	private KeySkillPage keySkillPage;
	private EmployeementPage employeementPage;

	public static PageObjectManager getPageObjectManager() {
		if( pageObjectManager == null ) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}
	
	public FileReaderManger getFileReaderManger() {
		if( fileReaderManger == null ) {
			fileReaderManger = new FileReaderManger();
		}
		return fileReaderManger;
	}

	public LoginPage getLoginPage() {
		if( loginPage == null ) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}

	public ProfileUpdatePage getProfileUpdatePage() {
		if( profileUpdatePage == null ) {
			profileUpdatePage = new ProfileUpdatePage();
		}
		return profileUpdatePage;
	}
	
	public ResumeHeaderLinePage getResumeHeaderLinePage() {
		if( resumeHeaderLinePage == null ) {
			resumeHeaderLinePage = new ResumeHeaderLinePage();
		}
		return resumeHeaderLinePage;
	}

	public KeySkillPage getKeySkillPage() {
		if( keySkillPage == null ) {
			keySkillPage = new KeySkillPage();
		}
		return keySkillPage;
	}

	public EmployeementPage getEmployeementPage() {
		if( employeementPage == null ) {
			employeementPage = new EmployeementPage();
	}
		return employeementPage;
	}
	
	
	
	

	
	
	
}
