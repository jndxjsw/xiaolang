package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.customer;

public class customerdaoImpl extends HibernateDaoSupport implements customerdao{  

	   public customer queryBycustomerphone(String phone) {   //�����û�������  
	        @SuppressWarnings("unchecked")  
	        List<customer> list = (List<customer>) this.getHibernateTemplate().find("from customer where phone = ?",phone);  
	        if(list.size() == 0){                           //�жϲ�ѯ�����Ƿ�Ϊ��  
	            return null;  
	        }else {  
	            return list.get(0);                         //���ص�һ���û�  
	        }  
	    }

	public void savecustomer(customer customer) {
		// TODO Auto-generated method stub
		 this.getHibernateTemplate().save(customer);  
	}
}

