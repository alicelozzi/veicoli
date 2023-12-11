package org.generation.italy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*Si realizzi una applicazione java per la gestione di un garage secondo le specifiche:
il garage ha al max 15 posti ognuno dei quali è identificato da un num a partire da 0 e per motivi di 
capienza può ospitare solo auto moto e furgoni partendo dalla classe base veicolo a motore V; 
la si estenda, realizzando anche le classi che modellano le entità furgone (F) auto (A) 
e moto (M).
Ridefinire il metodo toString in modo che ogni entità possa esternalizzare in forma di stringa tutte 
le informazioni che la riguardano.
Si implementi una classe che modelli il garage sopradescritto offrendo le seguenti 
operazioni di gestione
1] immissione di un nuovo veicolo
2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
3] stampa della situazione corrente dei posti nel garage veicolo:
marca,anno,cilindrata;
auto:porte, alimentazione (diesel/benzina)
moto:tempi
furgone:capacità		
*/
		Scanner sc=new Scanner(System.in);
		
		Garage garage = new Garage(new ArrayList<>());	
		String rispostona= " ";
		String risposta= " ", risposta1, risposta2;
		
		do {
		System.out.println("salve, vuole inserire un veicolo?");
		rispostona=sc.nextLine();
		if(rispostona.equals("si")) {
		System.out.println("di che veicolo si tratta?");
		risposta=sc.nextLine();
		garage.inserireVeicolo(risposta);
		}
		else {
		System.out.println("Va bene, arrivederci");	
		}
		
		System.out.println("vuoi estrarre un veicolo?");
		rispostona=sc.nextLine();
		if (rispostona.equals("si")) {
			System.out.println("che veicolo vuoi rimuovere?");
			risposta2=sc.nextLine();
		garage.estrazione(risposta2);
		}
     	else {
     	System.out.println("va bene, arrivederci");
     	}
	     garage.stampa();
	     System.out.println("vuole inserire altro?");
	     rispostona=sc.nextLine();
	}while(rispostona.equals("si"));
     	}

	}


