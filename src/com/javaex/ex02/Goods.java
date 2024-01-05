package com.javaex.ex02;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	//생성자를 적지 않으면, 디폴트 값으로 적용되지만
	//생성자를 따로 만들었기 때문에 디폴트값이 사라진다
	public Goods() {
		//오류를 해결하기 위해서는 디폴트값으로 사용되던 생성자를 다시 적어준다
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	//메소드 - g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품명:"+name+", 가격:" + price);
	}
	
	
	
	
}




