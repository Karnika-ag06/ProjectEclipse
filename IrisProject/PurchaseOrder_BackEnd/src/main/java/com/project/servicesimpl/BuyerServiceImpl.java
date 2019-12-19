package com.project.servicesimpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.BuyerDao;
import com.project.models.BuyerDetail;
import com.project.services.BuyerService;

@Service("buyerService")


public class BuyerServiceImpl implements BuyerService {

	@Autowired
	BuyerDao buyerDao;
	
	public boolean addBuyer(BuyerDetail bObj)
	{
		bObj.setRole_Id(1);
		bObj.setCreated_date(LocalDate.now());
		bObj.setCreated_By("System");
		bObj.setIs_Active("y");
		return buyerDao.addBuyer(bObj);
		
	}

	public BuyerDetail validateBuyer(String email, String password) {
		
		BuyerDetail bObj=buyerDao.validateBuyer(email, password);
		return bObj;
	}
}