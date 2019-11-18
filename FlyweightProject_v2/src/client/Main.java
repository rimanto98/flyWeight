package client;

import interfacciaGrafica.Output;
import pattern.VettoreDiImmagini;

public class Main {
	
	public static void main(String[] args) {
		
		VettoreDiImmagini vettore = new VettoreDiImmagini();
		
		Output out = new Output(vettore);
	}

}
