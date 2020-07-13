package com.nt.service;

import com.nt.dto.ProductDTO;

public interface IECommerceStore {
	public String addItemToCart(ProductDTO dto);
	public void showCartItems();
	public Float calcBillAmount(float couponDiscount);

}
