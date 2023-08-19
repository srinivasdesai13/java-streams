package com.sd.streams;

import java.util.*;
import java.util.stream.*;

public class TransactionAmountsByCategory {

	public static void main(String args[]) {
		Transaction transaction1 = new Transaction(1, 50.0, "Groceries");
		Transaction transaction2 = new Transaction(2, 30.0, "Electronics");
		Transaction transaction3 = new Transaction(3, 40.0, "Groceries");
		Transaction transaction4 = new Transaction(4, 20.0, "Electronics");
		Transaction transaction5 = new Transaction(5, 60.0, "Clothing");
		List<Transaction> transactions = List.of(transaction1, transaction2, transaction3, transaction4, transaction5);
		Map<String, Double> response = sumTransactionAmountsByCategory(transactions);
		System.out.println("response " + response);
	}

	// Your task is to find and return the sum of transaction amounts for each
	// unique category.
	public static Map<String, Double> sumTransactionAmountsByCategory(List<Transaction> transactions) {
		return transactions.stream().collect(
				Collectors.groupingBy(Transaction::getCategory, Collectors.summingDouble(Transaction::getAmount)));

	}

}

class Transaction {
	private int transactionId;
	private double amount;
	private String category;

	public Transaction(int transactionId, double amount, String category) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.category = category;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
