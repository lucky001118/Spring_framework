package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	/*
	 *  here we are trying the lifecycle mathod using the implementation the
	 * InitializationBean & DisposableBean interface
	 */
	private String status;
	private int price;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//init() mathod
	public void afterPropertiesSet()throws Exception {
		System.out.println("The init() mathod, Hi everyone!");
	}
	
	//destroy() mathod
	public void destroy() throws Exception{
		System.out.println("The destroy() mathod, bye bye everyone i'm gone!");
	}
	@Override
	public String toString() {
		return "Pepsi [status=" + status + ", price=" + price + "]";
	}
	

}
