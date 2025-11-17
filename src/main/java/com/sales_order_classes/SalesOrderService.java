package com.sales_order_classes;

import java.util.ArrayList;
import java.util.List;

public class SalesOrderService {

	private List<Order> orders = new ArrayList<>();
	
	 public Order createOrder(int orderId) {
	        Order order = new Order(orderId);
	        orders.add(order);
	        return order;
	    }
	 
	 public List<Order> getAllOrders() {
	        return orders;
	    }
	 
	 public Order getOrderById(int orderId) {
	        for (Order order : orders) {
	            if (order.getOrderId() == orderId) {
	                return order;
	            }
	        }
	        return null;
	    }
}
