package com.action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.model.Account;
import com.opensymphony.xwork2.ActionSupport;
import com.service.LoginService;
@Controller
public class LoginAction extends ActionSupport{
	/**
	 * 
	*/
	private static final long serialVersionUID = 3707624644418852546L;
	@Autowired
	private LoginService loginService;
	private Account account;
	public LoginAction(LoginService loginService, Account account) {
		super();
		this.loginService = loginService;
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public LoginAction() {
	}
	public String login()throws Exception{
		System.out.println(loginService.IsValid(account));
		if(loginService==null)
		{
			System.out.println("2312");
			return "eorror";
		}
		if(loginService.IsValid(account)==1)
		return "success";
		else
			return "error";
	}
}
