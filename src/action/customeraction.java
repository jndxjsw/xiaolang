package action;

import java.util.Map;

import org.springframework.stereotype.Controller;

import service.CustomerService;
import service.CustomerRegisterImpl;
import bean.customer;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class customeraction  extends ActionSupport{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String phone;
	  private String password;

	  public String getPassword() {
	    return password;
	  }
	  public void setPassword(String password) {
	    this.password = password;
	  }
	  public String getphone() {
	    return phone;
	  }
	  public void setphone(String phone) {
	    this.phone = phone;
	  }

	  public String execute() throws Exception {  
		      customer Customer = new customer();        //�����û�����  
		      Customer.setphone(phone);      //�����û���  
		      Customer.setPassword(password);        //��������  
		        return "success";  
		            
		     }  

	}
