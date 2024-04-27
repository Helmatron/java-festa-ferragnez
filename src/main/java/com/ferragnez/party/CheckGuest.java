package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		
		// << ARRAY >>
		// Dichiaro e inizializzo un Array di stringhe con i nomi dei partecipanti
		String[] nomiPartecipanti = {
		        "Dua Lipa",
		        "Paris Hilton",
		        "Manuel Agnelli",
		        "J-Ax",
		        "Francesco Totti",
		        "Ilary Blasi",
		        "Bebe Vio",
		        "Luis",
		        "Pardis Zarei",
		        "Martina Maccherone",
		        "Rachel Zeilic"
				};

		
		// << INPUT TASTIERA >>
			// Attivo la raccolta degli input da tastiera col metodo (System.in)
			Scanner input = new Scanner(System.in);

			
		// << NOME >>
			// Stampo la richiesta del Nome all'utente
			System.out.println("Inserisci il tuo Nome");
			// Imposto variabile NOME e richiedo il valore da console - String
			String name = input.nextLine();

			
		// << CICLO DI VERIFICA >>
			// Dichiaro una variabile booleana per indicare se il nome è stato trovato
				boolean found = false; 

		// Controlla se il nome dell'utente esiste nell'array (non sensibile alle maiuscole/minuscole)
			for (String participantName : nomiPartecipanti) {
			    if (participantName.equalsIgnoreCase(name)) {
			        found = true;
			        break; // Ferma il ciclo For se il nome viene trovato
				    }
				}
		
				if (found) {
				    System.out.println("puoi entrare");
				} else {
				    System.out.println("non puoi entrare");
				}

	}

}
