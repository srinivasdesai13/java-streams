package com.sd.streams;

import java.util.List;

public class LargestOrderWithCriteria {

	public static void main(String args[]) {
	     Order order1 = new Order(1, 120.0, List.of(new Product(101, "Electronics"), new Product(102, "Clothing")));
	    Order order2 = new Order(2, 180.0, List.of(new Product(103, "Groceries"), new Product(104, "Electronics"), new Product(105, "Books")));
	    Order order3 = new Order(3, 150.0, List.of(new Product(106, "Clothing"), new Product(107, "Books")));

	    List<Order> orders = List.of(order1,order2,order3);
	        int response = findLargestOrderWithCriteria(orders);
	        System.out.println("response "+response);
	    }
	    
	    public static int findLargestOrderWithCriteria(List<Order> orders) {
	        return orders.stream()
	            .filter(o -> o.getProducts()
	                        .stream()
	                        .map(x -> x.getCategory())
	                        .distinct()
	                        .count() >=3).findFirst()
	                                    .get()
	                                    .getOrderId();

	    }

	}


class Order {
    private int orderId;
    private double totalAmount;
    private List<Product> products;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Order(int orderId, double totalAmount, List<Product> products) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.products = products;
	}

    // Constructor, getters, and setters
}

class Product {
    private int productId;
    private String category;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product(int productId, String category) {
		super();
		this.productId = productId;
		this.category = category;
	}

    // Constructor, getters, and setters
}
