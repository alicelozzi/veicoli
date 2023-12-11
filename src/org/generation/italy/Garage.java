package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;

public class Garage{

private ArrayList<String>posti=new ArrayList<>();

public Garage(ArrayList<String> posti) {
	super();
	this.posti = posti;
}

public void inserireVeicolo(String risposta) {
if (posti.size()>=15)
	System.out.println("tutti i posti sono occupati");
else
	System.out.println("Veicolo inserito correttamente");
	posti.add(risposta);
}

public void estrazione(String risposta2) {
posti.remove(risposta2);
System.out.println("Veicolo estratto");	
	
}

public void stampa() {
for(int i=0;i<posti.size();i++)	
	System.out.println("hai inserito: " + posti.get(i));
}

//commento

}
