package dao;

import bean.customer;

public interface customerdao {
	 public void savecustomer(customer customer);      //保存用户  
	 public customer queryBycustomerphone(String phone);    //根据用户名查找用户  

}
