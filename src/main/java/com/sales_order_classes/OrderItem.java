package com.sales_order_classes;

public class OrderItem {
	
	private String itemName;
    private double price;
    private int quantity;
    
	public OrderItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getTotal() {
        return price * quantity;
    }
	
	 public String getItemName() {
	        return itemName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

		public boolean isActive() {
			// TODO Auto-generated method stub
			return false;
		}

		public int getId() {
			// TODO Auto-generated method stub
			return 0;
		}
	
}
