/**     
 * @Title: LoginAction.java  
 * @Package com.jiemoxiaodi.struts   
 * @Description: TODO  
 * @author huli
 * @date 2017年2月20日 上午9:21:03   
 * @version V1.0     
 */
package com.jiemoxiaodi.struts;

/**
 * @ClassName: LoginAction
 * @Description: TODO
 * @author huli
 * @date 2017年2月20日 上午9:21:03
 * 
 */
public class LoginAction {
	private String username;
	private String userpassword;

	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return userpassword
	 */
	public String getUserpassword() {
		return userpassword;
	}

	/**
	 * @param userpassword
	 *            the userpassword to set
	 */
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	// 默认情况下的方法
	public String execute() throws Exception {
		String result = "error";
		if ("admin".equals(username) && "admin".equals(userpassword)) {
			result = "success";
		}
		return result;
	}

}