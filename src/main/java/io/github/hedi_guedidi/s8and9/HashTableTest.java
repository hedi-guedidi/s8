package io.github.hedi_guedidi.s8and9;

import java.util.Scanner;

public class HashTableTest {

	public static void main(String[] args) {
		HashTable table = new HashTable(); // Initial size of table is 2.
		String key, value;
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("Menu:");
				System.out.println("1. test put(key,value)");
				System.out.println("2. test get(key)");
				System.out.println("3. test containsKey(key)");
				System.out.println("4. test remove(key)");
				System.out.println("5. show complete contents of hash table.");
				System.out.println("6. EXIT");
				System.out.println("Enter your command:");
				int test=sc.nextInt();
				sc.nextLine();
				switch (test){
				case 1:
					System.out.println("Key =");
					key = sc.nextLine();
					System.out.println("Value =");
					value = sc.nextLine();
					table.put(key, value);
					break;
					
				case 2:
					System.out.println("Key = ");
					key = sc.nextLine();
					System.out.println("Value is " + table.get(key));
					break;
				case 3:
					System.out.print("Key = ");
					key = sc.nextLine();
					System.out.println("containsKey(" + key + ") is " + table.containsKey(key));
					break;
				case 4:
					System.out.println("Key = ");
					key = sc.nextLine();
					table.remove(key);
					break;
				case 5:
					table.dump();
					break;
				case 6:
					return; // End program by returning from main()
				default:
					System.out.println("Illegal command.");
					break;
				}

				System.out.println("Hash table size is " + table.size());
			}
		}

	}
	

}
