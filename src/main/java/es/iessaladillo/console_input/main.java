package es.iessaladillo.console_input;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		char c;
		String s;
		byte n;
		boolean b;
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		c = consola.readChar();
		System.out.println(c);
	}

}
