package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.dto.ProductDTO;

public class ECommerceStore {
	
	private List<ProductDTO> cartList=new ArrayList();
	
	public String addItemToCart(ProductDTO dto) {
		cartList.add(dto);
		return dto.getPname()+" is added to cart";
	}
	
	public void showCartItems() {
		//cartList.forEach(System.out::println);
		//cartList.forEach(dto->{System.out.println(dto);});
		cartList.stream().forEach(System.out::println);
	}
	
	public Float calcBillAmount(float couponDiscount) {
		System.out.println("ECommerceStore.CalcBillAmount()::"+couponDiscount);
		float bAmt=0.0f;
		float finalAmount=0.0f; 
		
		bAmt=(float)cartList.stream().mapToDouble(dto->dto.getPrice()* dto.getQty()).sum();
		finalAmount=bAmt-(bAmt*(couponDiscount/100.0f));
		return finalAmount;
	}

}
