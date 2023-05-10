package org.java.exceptions.books;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static final String FILENAME = "/Users/andre/Desktop/Scuola/prova.txt";
	
	public static void main(String[] args) throws IOException {
		
		FileWriter myWriter = new FileWriter(FILENAME);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanti libri vuoi inserire?");
		int bookNumber = sc.nextInt();
		sc.nextLine();
		
		int index = -1;
		
		Libro[] lArr = new Libro[bookNumber];
		
		while (index < bookNumber - 1) {
			
			index ++;
			
			System.out.println("Qual è il titolo? (Non si accetta un campo vuoto)");
			String title = sc.nextLine();
			System.out.println("Qual è il numero di pagine? (>0)");
			int pageNumber = sc.nextInt();
			sc.nextLine();
			System.out.println("Chi è l'autore?");
			String author = sc.nextLine();
			System.out.println("Chi è l'editore?");
			String editor = sc.nextLine();
			
			try {
				
				Libro l = new Libro(title, pageNumber, author, editor);
				
				lArr[index] = l;
				
			} catch (Exception e){
				index --;
				System.err.println("Errore: \n" + e.getMessage());
			}
			
		}
		
		for (int i = 0; i < lArr.length; i++) {
			myWriter.write("\n" + lArr[i].toString() + "\n");
		}
		
		myWriter.close();
		
		File mioFile = new File(FILENAME);
		Scanner reader = new Scanner(mioFile);
		System.out.println("\nLa lettura del file creato è:");
		
		while (reader.hasNextLine()) {
			
			String readerBook = reader.nextLine();
			System.out.println(readerBook);
		}
		
		sc.close();
		reader.close();
		
	}
}
