package com.project.dao;

import com.project.models.BuyerDetail;

public interface BuyerDao {

	public boolean addBuyer(BuyerDetail bObj);
	public BuyerDetail validateBuyer(String email,String password);
}
