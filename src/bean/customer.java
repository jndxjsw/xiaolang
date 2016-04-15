package bean;

public class customer implements java.io.Serializable {
	  /**
	 * 
	 */
	private static final long serialVersionUID = -6834284214092664024L;
	private String phone;
	  private String password;

	  public String getphone() {
	    return phone;
	  }
	  public void setphone(String phone) {
	    this.phone = phone;
	  }
	  public String getPassword() {
	    return password;
	  }
	  public void setPassword(String password) {
	    this.password = password;
	  }
	  public customer() {  
		   }  

	  public customer(String phone, String password){
	    this.phone = phone;
	    this.password = password;
	  }
}
