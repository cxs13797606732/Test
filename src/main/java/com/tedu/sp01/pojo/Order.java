package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id;
	private User user;
	private List<Item> items;
	public void setUser(int i, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}