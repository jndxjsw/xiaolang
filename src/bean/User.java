package bean;

public class User {
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

	  public User(){
	  }

	  public User(String phone, String password){
	    this.phone = phone;
	    this.password = password;
	  }

}
