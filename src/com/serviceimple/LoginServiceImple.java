package com.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.LoginDao;
import com.model.Account;
import com.service.LoginService;
@Service
@Transactional
public class LoginServiceImple implements LoginService{
@Autowired
	private LoginDao loginDao;
	public LoginServiceImple() {
		// TODO 自动生成的构造函数存根
	}

	public LoginServiceImple(LoginDao loginDao) {
		super();
		this.loginDao = loginDao;
	}
	@Override
	public String IsValid(Account account) {
		// TODO 自动生成的方法存根
		List<Account> pl =loginDao.find("from Account where account='"+account.getAccount()+"'");	
			if(pl.isEmpty()!=true){
				for (Object ele : pl)
			{
				Account p = (Account)ele;
				if(account.getPassword().equals(p.getPassword()))
				return "success";
			}
			}
			return "error";
	}

}
