package com.salesorder.project;

import com.sales_order_classes.Order;
import com.sales_order_classes.OrderItem;
import com.sales_order_classes.SalesOrderService;

public class SalesOrderEntity {

	public static void main(String[] args) {
		
		 SalesOrderService service = new SalesOrderService();

	        // Create new order
	        Order order1 = service.createOrder(101);

	        // Add items
	        order1.addItem(new OrderItem("Laptop", 45000, 1));
	        order1.addItem(new OrderItem("Mouse", 500, 2));

	        // Show total
	        System.out.println("Order ID: " + order1.getOrderId());
	        System.out.println("Total Amount: " + order1.getTotalAmount());

	        // Display all items
	        System.out.println("\nItems:");
	        for (OrderItem item : order1.getItems()) {
	            System.out.println(item.getItemName() + " - " + item.getPrice() +
	                               " x " + item.getQuantity() +
	                               " = " + item.getTotal());
	        }
	    }
	}
