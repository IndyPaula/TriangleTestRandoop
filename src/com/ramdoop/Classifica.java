package com.ramdoop;

import java.util.Scanner;

public class Classifica {

	public static void classificaoTriangulo(int ladoA, int ladoB, int ladoC) {
		if ((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB))) {
			// é um triângulo equilátero (todos os lados iguais)?
			if ((ladoA == ladoB) && (ladoB == ladoC)) {
				System.out.println("O triângulo é equilátero");
			}
			// é isósceles (dois lados iguais e um diferente)?
			else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoC == ladoB)) {
				System.out.println("O triângulo é isósceles");
			}
			// é escaleno
			System.out.println("O triângulo é escaleno");
		} else {
			System.out.println("Os lados informados não formam um triângulo.");
		}
	}

	public static boolean extract(int ladoA, int ladoB, int ladoC) {
		//(ladoA == ladoB) && (ladoB == ladoC)
		return true;
	}

}