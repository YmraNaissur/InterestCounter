package com.naissur.debitApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DebitApp {
	public static void main(String[] args) {
		// Goods and their prices
		Map<String, Double> goods = new HashMap<>();
		// Persons and their contributions for each good
		Map<String, Map<String, Double>> persons = new HashMap<>();
		// How much each person owe for each good
		Map<String, Double> owes = new HashMap<>();
		// Balances of persons for each good
		Map<String, Map<String, Double>> balances = new HashMap<>();
		
		String key;
		Double value;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			// 1. Enter goods and prices
			do {
				System.out.print("Enter good (q for exit): ");
				key = reader.readLine();
				if (key.equals("q")) {
					break;
				}
				System.out.print("Enter good price (1 for exit): ");
				value = Double.parseDouble(reader.readLine());
				if (value != 1) {
					goods.put(key, value);
				}
			} while (value != 1);
			
			System.out.println(goods);
			
			// 2. Enter persons and how much each person paid
			do {
				System.out.print("Enter person (q for exit): ");
				key = reader.readLine();
				if (key.equals("q")) {
					break;
				}
				
				Map<String, Double> contributions = new HashMap<>();
				for (String s: goods.keySet()) {
					System.out.print("Enter person's contribution for " + s + ": ");
					value = Double.parseDouble(reader.readLine());
					contributions.put(s, value);
				}
				
				persons.put(key, contributions);
			} while (true);
			
			System.out.println(persons);
			
			// 3. Calculate how much money each person owe
			int personsNumber = persons.size();
			System.out.println("Total " + personsNumber + " persons.");
			for (String s: goods.keySet()) {
				owes.put(s, goods.get(s) / personsNumber);
			}
			System.out.println("Each owe next amounts of money: ");
			System.out.println(owes);
			
			// 4. Calculate each person's balance
			Map<String, Double> currentBalance;
			for (String p: persons.keySet()) {
				currentBalance = new HashMap<>();
				for (String good: persons.get(p).keySet()) {
					currentBalance.put(good, persons.get(p).get(good) - owes.get(good));
				}
				balances.put(p, currentBalance);
			}
			
			System.out.println(balances);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}