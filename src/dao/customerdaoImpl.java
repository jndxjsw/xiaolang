package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.customer;

public class customerdaoImpl extends HibernateDaoSupport implements customerdao{  

	   public customer queryBycustomerphone(String phone) {   //根据用户名查找  
	        @SuppressWarnings("unchecked")  
	        List<customer> list = (List<customer>) this.getHibernateTemplate().find("from customer where phone = ?",phone);  
	        if(list.size() == 0){                           //判断查询集合是否为空  
	            return null;  
	        }else {  
	            return list.get(0);                         //返回第一个用户  
	        }  
	    }

	public void savecustomer(customer customer) {
		// TODO Auto-generated method stub
		 this.getHibernateTemplate().save(customer);  
	}
}

