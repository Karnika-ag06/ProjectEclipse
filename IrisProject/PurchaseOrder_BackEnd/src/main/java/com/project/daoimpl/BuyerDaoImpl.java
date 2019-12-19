package com.project.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.BuyerDao;
import com.project.models.BuyerDetail;

@Repository("buyerDao")
@Transactional
public class BuyerDaoImpl implements BuyerDao {
	

	@Autowired
  SessionFactory sessionFactory;
	
        public boolean addBuyer(BuyerDetail bObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(bObj);
            return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

		@Override
		public BuyerDetail validateBuyer(String email, String password) {
			// TODO Auto-generated method stub
			return null;
		}

        	/*public BuyerDetail validateBuyer(String email, String password) {
			
			try {
			Session session=sessionFactory.getCurrentSession();
	        BuyerDetail buyerObj=session.get(BuyerDetail.class,email);
	            if(buyerObj!=null) {
	            	 if(buyerObj.getBuyer_Password().equals(password)) {
	 	            	return buyerObj;
				}
	            }
			}
				catch(Exception e){
					e.printStackTrace();
				}
			return null;
		}*/
}