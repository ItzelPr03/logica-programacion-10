package com.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    HashMap<String, String> dictionary = new HashMap<>();

	    dictionary.put("Correr", "Run");
	    dictionary.put("Hablar", "Talk");
	    dictionary.put("Computadora", "Computer");
	    dictionary.put("Escuela", "School");
	    dictionary.put("Perro", "Dog");
	    dictionary.put("Gato", "Cat");
	    dictionary.put("Galletas", "Cookies");
	    dictionary.put("Codigo", "Code");
	    dictionary.put("Juguete", "Toy");
	    dictionary.put("Libro", "Book");
	    dictionary.put("Ventana", "Window");

	    dictionary.put("Playera", "Shirt");
	    dictionary.put("Limpio", "Clean");
	    dictionary.put("Caja", "Box");
	    dictionary.put("Impresora", "Printer");
	    dictionary.put("Carro", "Car");
	    dictionary.put("Silla", "Chair");
	    dictionary.put("Tarjeta", "Card");
	    dictionary.put("Cesto", "Basquet");
	    dictionary.put("Papa", "Potato");
	    dictionary.put("Tenedor", "Fork");
	    dictionary.put("Tio", "Uncle");

	    List<String> listKey = new ArrayList<>(dictionary.keySet());
	    int count = 0;
	    int numberQuestions = 5;
	    for (int i = numberQuestions; i >= 1; i--) {
	      String spanishWord = listKey.get(new Random().nextInt(20));
	      System.out.println(
	        "Ingresa la siguiente palabra en ingles: " +
	        spanishWord
	      );
	      String englishWord = in.nextLine();
	      if (
	        englishWord
	          .toUpperCase()
	          .equals(dictionary.get(spanishWord).toUpperCase())
	      ) {
	        count++;
	      }
	    }
	    System.out.println(
	      "Respuestas correctas: " +
	      count +
	      " | Respuestas incorrectas: " +
	      (count - numberQuestions) +
	      " | " +
	      "De un total de preguntas: " +
	      numberQuestions
	    );

	    in.close();
		
		
		

	}

}
