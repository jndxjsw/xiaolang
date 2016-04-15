package service;

import bean.customer;
import dao.customerdao;

public class CustomerRegisterImpl implements CustomerService{  
    
   private customerdao customerdao;                  //�û�DAO�ӿ�����  
   public void customerdao(customerdao customerdao) {  
       this.customerdao = customerdao;  
   }  
   
    public boolean addCustomer(customer customer) {
    	 String phone = customer.getphone();            //����û��� 
    	 if(customerdao.queryBycustomerphone(phone) == null){      //�ж��û����Ƿ�ռ��  
    		 customerdao.savecustomer(customer);           //�����û�  
            return true;                    //����ɹ�  
         }else{  
             return false;                   //����ʧ��  
          }  
	} 
}
