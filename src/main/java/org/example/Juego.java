package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
	private static Scanner scanner = new Scanner(System.in);

	private static ArrayList<Dado> dados = new ArrayList<>();

	private static void jugar(int valor) {
		int total = dados.get(0).getCara()+dados.get(1).getCara();
		if (valor == 7){
			System.out.println("Dado 1: "+dados.get(0).getCara() +
					"\nDado 2: "+ dados.get(1).getCara()+"\nTotal: "+ total+
					"\nHAZ GANADO!!!");
		}else{
			System.out.println("Dado 1: "+dados.get(0).getCara() +
					"\nDado 2: "+ dados.get(1).getCara()+"\nTotal: "+ total+
					"\nHaz Perdido, Intentalo Nuevamente");
		}
		dados.clear();
	}

	private static void crear_dados(){
		for(int i=0;i<2;i++) {
			int aux1 = (int) (Math.random() * 6 + 1);
			Dado dado = new Dado(aux1);
			dados.add(dado);
		}
	}


	private static int lanzar_dados(){
		crear_dados();
		return Dado.sumarDados(dados.get(0).getCara(),dados.get(1).getCara());
	}


	public static void play() {
		while (true){
			Juego.jugar(Juego.lanzar_dados());
			System.out.println("");
			System.out.println("Desea jugar nuevamente?\nIngrese '1' para jugar de nuevo.\nIngrese '2' para salir.");
			int respuesta = scanner.nextInt();
			if(respuesta==2) {
				break;
			}
		}
	}

}