package com.project.services;

import com.project.models.BuyerDetail;

public interface BuyerService {

	public boolean addBuyer(BuyerDetail bObj);
	public BuyerDetail validateBuyer(String email,String password);
}
