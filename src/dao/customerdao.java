package dao;

import bean.customer;

public interface customerdao {
	 public void savecustomer(customer customer);      //�����û�  
	 public customer queryBycustomerphone(String phone);    //�����û��������û�  

}
