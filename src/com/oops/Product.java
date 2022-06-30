package com.oops;

public class Product {

	private long productId;
	private String productName;
	private double productPrice;
	static String companyName="XYZ pvt. ltd";
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(long productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+companyName+ "]";
	}

	public static void main(String args[])
	{
		Product product1=new Product(9876,"abc product",12000);
		Product product2=new Product(9890,"pqr product",12500);
		
		System.out.println(product1);
		System.out.println(product2);
		

		
	}
	
	
	
}
