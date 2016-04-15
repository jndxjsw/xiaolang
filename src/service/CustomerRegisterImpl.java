package service;

import bean.customer;
import dao.customerdao;

public class CustomerRegisterImpl implements CustomerService{  
    
   private customerdao customerdao;                  //用户DAO接口引用  
   public void customerdao(customerdao customerdao) {  
       this.customerdao = customerdao;  
   }  
   
    public boolean addCustomer(customer customer) {
    	 String phone = customer.getphone();            //获得用户名 
    	 if(customerdao.queryBycustomerphone(phone) == null){      //判断用户名是否被占用  
    		 customerdao.savecustomer(customer);           //保存用户  
            return true;                    //保存成功  
         }else{  
             return false;                   //保存失败  
          }  
	} 
}
