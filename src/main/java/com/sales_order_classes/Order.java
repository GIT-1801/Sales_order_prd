package com.sales_order_classes;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderId;
    private List<OrderItem> items = new ArrayList<>();
    
	public Order(int orderId) {
		this.orderId = orderId;
	}
	
	public void addItem(OrderItem item) {
        items.add(item);
        System.out.println("Item added: " + item.getItemName());
    }
	
	 public double getTotalAmount() {
	        double total = 0;
	        for (OrderItem item : items) {
	            total += item.getTotal();
	        }
	        return total;
	    }

	    public int getOrderId() {
	        return orderId;
	    }

	    public List<OrderItem> getItems() {
	        return items;
	    }
}
