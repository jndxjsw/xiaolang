package action;

import java.util.Map;

import bean.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class customeraction  extends ActionSupport{
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

	  public String register() throws Exception{
	    if(phone==null || password==null)
	      return ERROR;
	    
	    UserDao userdao = new UserDao();
	    boolean insertSuccess = userdao.insert(phone, password);
	    if(insertSuccess){
	      Map session = ActionContext.getContext().getSession();
	      User user = new User(phone, password);
	      session.put("phone", user);
	      return SUCCESS;
	    }
	    return ERROR;
	  }

	  public String execute() throws Exception{
	    if(phone==null || password==null)
	      return ERROR;
	    return SUCCESS;
	  }
	}
