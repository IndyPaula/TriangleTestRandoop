package com.ramdoop;

import java.util.Scanner;

public class Classifica {

	public static void classificaoTriangulo(int ladoA, int ladoB, int ladoC) {
		if ((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB))) {
			// � um tri�ngulo equil�tero (todos os lados iguais)?
			if ((ladoA == ladoB) && (ladoB == ladoC)) {
				System.out.println("O tri�ngulo � equil�tero");
			}
			// � is�sceles (dois lados iguais e um diferente)?
			else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoC == ladoB)) {
				System.out.println("O tri�ngulo � is�sceles");
			}
			// � escaleno
			System.out.println("O tri�ngulo � escaleno");
		} else {
			System.out.println("Os lados informados n�o formam um tri�ngulo.");
		}
	}

	public static boolean extract(int ladoA, int ladoB, int ladoC) {
		//(ladoA == ladoB) && (ladoB == ladoC)
		return true;
	}

}