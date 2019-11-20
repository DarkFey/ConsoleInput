package es.iessaladillo.console_input;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase sirve para controlar las peticiones de datos
 * 
 * @author Vicente Machado Balboa
 *
 */
public class ConsoleInput {
	private final Scanner keyboard;

	public ConsoleInput(Scanner keyboard) {
		this.keyboard = keyboard;
	}

	/**
	 * Este metodo nos ayuda a limpiar el bufer del codigo
	 * 
	 */
	private void cleanInput() {
		keyboard.nextLine();
	}

	/**
	 * Metodo para la devolucion de un caracter
	 * 
	 * @return un caracter solicitado por el usuario
	 */
	public char readChar() {
		String s;
		char c;
		do {
			System.out.println("Introduzca UN caracter");
			s = keyboard.next();
		} while (s.length() != 1);
		c = s.charAt(0);
		return c;

	}

	/**
	 * Metodo que devuelve un caracter que pertenezca a una lista de pasada como
	 * parametro
	 * 
	 * @param validCharacters Lista de caracteres
	 * @return un caracter valido
	 */
	public char readChar(String validCharacters) {
		Character c = 'x', letter;
		int i;
		boolean check = false;

		while (!check) {
			c = readChar();
			for (i = 1; i <= validCharacters.length(); i++) {
				letter = validCharacters.charAt(i - 1);
				if (c.equals(letter)) {
					check = true;
				} else if (i == validCharacters.length() && !check) {
					System.out.println("NO ES VALIDO ESE CARACTER");
				}

			}
		}
		return c;
	}

	/**
	 * Metodo que devuelve una vocal introducida por el usuario
	 * 
	 * @return una vocal valida
	 */
	public char readVowel() {
		Character c;
		c = readChar("aeiouAEIOU");
		return c;
	}

	/**
	 * Metodo que devuelve un caracter digito introducido por el usuario
	 * 
	 * @return un digito
	 */
	public char readDigit() {
		Character c;
		c = readChar("0123456789");
		return c;
	}

	/**
	 * Metodo que devuelve un caracter letra minuscula
	 * 
	 * @return una minuscula
	 */
	public char readLowerCase() {
		Character c = 'x';
		boolean check = false;

		while (!check) {
			c = readChar();

			if (c.equals(c.toLowerCase(c))) {
				check = true;
			} else {
				System.out.println("NO ES VALIDO ESE CARACTER");
			}

		}
		return c;
	}

	/**
	 * Metodo qe devuelve una mayuscula introducida por el usuario
	 * 
	 * @return Una mayuscula
	 */
	public char readUpperCase() {
		Character c = 'x';
		boolean check = false;

		while (!check) {
			c = readChar();

			if (c.equals(c.toUpperCase(c))) {
				check = true;
			} else {
				System.out.println("NO ES VALIDO ESE CARACTER");
			}

		}
		return c;
	}

	/**
	 * Metodo que devuelve una cadena introducida por el usuario
	 * 
	 * @return una cadena
	 */
	public String readString() {
		String s;
		System.out.println("Introduzca la informaci�n pertinente");
		return s = keyboard.next();

	}

	/**
	 * Metodo que devuelve una cadena introducida por el usuario con una extension
	 * determinada
	 * 
	 * @param maxLength Extension maxima de la cadena
	 * @return una cadena
	 */
	public String readString(int maxLength) {
		String s;
		do {
			s = readString();
			if (s.length() > maxLength) {
				System.out.println("NO VALIDA");
			}
		} while (s.length() > maxLength);
		return s;

	}

	/**
	 * Metodo que obtiene un byte introducido por el usuario
	 * 
	 * @return un byte
	 */
	public byte readByte() {
		byte s = 0;
		boolean lock;
		do {
			lock = true;
			try {
				System.out.println("Introduzca un numero");
				s = keyboard.nextByte();
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un numero");
				lock = false;
			} finally {
				cleanInput();
			}
		} while (!lock);
		return s;
	}

	/**
	 * Metodo que obtiene un short introducido por el usuario
	 * 
	 * @return un short
	 */
	public short readShort() {
		short s = 0;
		boolean lock;
		do {
			lock = true;
			try {
				System.out.println("Introduzca un numero");
				s = keyboard.nextShort();
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un numero");
				lock = false;
			} finally {
				cleanInput();
			}
		} while (!lock);
		return s;
	}

	/**
	 * Metodo que obtiene un int introducido por el usuario
	 * 
	 * @return un int
	 * @exception InputMismatchException si no introduce un numero
	 */
	public int readInt() {
		int s = 0;
		boolean lock;
		do {
			lock = true;
			try {
				System.out.println("Introduzca un numero");
				s = keyboard.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un numero");
				lock = false;
			} finally {
				cleanInput();
			}
		} while (!lock);
		return s;
	}

	/**
	 * Metodo que obtiene un long introducido por el usuario
	 * 
	 * @return un long
	 */
	public long readLong() {
		long s = 0;
		boolean lock;
		do {
			lock = true;
			try {
				System.out.println("Introduzca un numero");
				s = keyboard.nextLong();
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un numero");
				lock = false;
			} finally {
				cleanInput();
			}
		} while (!lock);
		return s;
	}

	/**
	 * Metodo que obtiene un float introducido por el usuario
	 * 
	 * @return un float
	 */
	public float readFloat() {
		float s = 0;
		boolean lock;
		do {
			lock = true;
			try {
				System.out.println("Introduzca un numero");
				s = keyboard.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un numero");
				lock = false;
			} finally {
				cleanInput();
			}
		} while (!lock);
		return s;
	}

	/**
	 * Metodo que obtiene un double introducido por el usuario
	 * 
	 * @return un double
	 */
	public double readDouble() {
		double s = 0;
		boolean lock;
		do {
			lock = true;
			try {
				System.out.println("Introduzca un numero");
				s = keyboard.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un numero");
				lock = false;
			} finally {
				cleanInput();
			}
		} while (!lock);
		return s;
	}

	/**
	 * Metodo que obtiene un byte menor a un parametro introducido por el usuario
	 * 
	 * @return un byte
	 */
	public byte readByteLessThan(byte upperBound) {
		byte s;
		do {
			s = readByte();
		} while (s >= upperBound);
		return s;
	}

	/**
	 * Metodo que obtiene un short menor a un parametro introducido por el usuario
	 * 
	 * @return un short
	 */
	public short readShortLessThan(short upperBound) {
		short s;
		do {
			s = readShort();
		} while (s >= upperBound);
		return s;
	}

	/**
	 * Metodo que obtiene un int menor a un parametro introducido por el usuario
	 * 
	 * @return un int
	 */
	public int readIntLessThan(int upperBound) {
		int s;
		do {
			s = readInt();
		} while (s >= upperBound);
		return s;
	}

	/**
	 * Metodo que obtiene un long menor a un parametro introducido por el usuario
	 * 
	 * @return un long
	 */
	public long readLongLessThan(long upperBound) {
		long s;
		do {
			s = readLong();
		} while (s >= upperBound);
		return s;
	}

	/**
	 * Metodo que obtiene un float menor a un parametro introducido por el usuario
	 * 
	 * @return un float
	 */
	public float readFloatLessThan(float upperBound) {
		float s;
		do {
			s = readFloat();
		} while (s >= upperBound);
		return s;
	}

	/**
	 * Metodo que obtiene un double menor a un parametro introducido por el usuario
	 * 
	 * @return un double
	 */
	public double readDoubleLessThan(double upperBound) {
		double s;
		do {
			s = readDouble();
		} while (s >= upperBound);
		return s;
	}

	/**
	 * Metodo que obtiene un byte menor o igual a un parametro introducido por el
	 * usuario
	 * 
	 * @return un byte
	 */
	public byte readByteLessOrEqualThan(byte upperBound) {
		byte s;
		do {
			s = readByte();
		} while (s > upperBound);
		return s;
	}

	public short readShortLessOrEqualThan(short upperBound) {
		short s;
		do {
			s = readShort();
		} while (s > upperBound);
		return s;
	}

	public int readIntLessOrEqualThan(int upperBound) {
		int s;
		do {
			s = readInt();
		} while (s > upperBound);
		return s;
	}

	public long readLongLessOrEqualThan(long upperBound) {
		long s;
		do {
			s = readLong();
		} while (s > upperBound);
		return s;
	}

	public float readFloatLessOrEqualThan(float upperBound) {
		float s;
		do {
			s = readFloat();
		} while (s > upperBound);
		return s;
	}

	public double readDoubleLessOrEqualThan(double upperBound) {
		double s;
		do {
			s = readDouble();
		} while (s > upperBound);
		return s;
	}

	public byte readByteGreaterThan(byte lowerBound) {
		byte s;
		do {
			s = readByte();
		} while (s <= lowerBound);
		return s;
	}

	public short readShortGreaterThan(short lowerBound) {
		short s;
		do {
			s = readShort();
		} while (s <= lowerBound);
		return s;
	}

	public int readIntGreaterThan(int lowerBound) {
		int s;
		do {
			s = readInt();
		} while (s <= lowerBound);
		return s;
	}

	public long readLongGreaterThan(long lowerBound) {
		long s;
		do {
			s = readLong();
		} while (s <= lowerBound);
		return s;
	}

	public float readFloatGreaterThan(float lowerBound) {
		float s;
		do {
			s = readFloat();
		} while (s <= lowerBound);
		return s;
	}

	public double readDoubleGreaterThan(double lowerBound) {
		double s;
		do {
			s = readDouble();
		} while (s <= lowerBound);
		return s;
	}

	public byte readByteGreaterOrEqualThan(byte lowerBound) {
		byte s;
		do {
			s = readByte();
		} while (s < lowerBound);
		return s;
	}

	public short readShortGreaterOrEqualThan(short lowerBound) {
		short s;
		do {
			s = readShort();
		} while (s < lowerBound);
		return s;
	}

	public int readIntGreaterOrEqualThan(int lowerBound) {
		int s;
		do {
			s = readInt();
		} while (s < lowerBound);
		return s;
	}

	public long readLongGreaterOrEqualThan(long lowerBound) {
		long s;
		do {
			s = readLong();
		} while (s < lowerBound);
		return s;
	}

	public float readFloatGreaterOrEqualThan(float lowerBound) {
		float s;
		do {
			s = readFloat();
		} while (s < lowerBound);
		return s;
	}

	public double readDoubleGreaterOrEqualThan(double lowerBound) {
		double s;
		do {
			s = readDouble();
		} while (s < lowerBound);
		return s;
	}

	public byte readByteRangeInclusive(byte lowerBound, byte upperBound) {
		byte s;
		do {
			s = readByte();
		} while (s < lowerBound && s > upperBound);
		return s;
	}

	public short readShortRangeInclusive(short lowerBound, short upperBound) {
		short s;
		do {
			s = readShort();
		} while (s < lowerBound && s > upperBound);
		return s;
	}

	public int readIntRangeInclusive(int lowerBound, int upperBound) {
		int s;
		do {
			s = readInt();
		} while (s < lowerBound && s > upperBound);
		return s;
	}

	public long readLongRangeInclusive(long lowerBound, long upperBound) {
		long s;
		do {
			s = readLong();
		} while (s < lowerBound && s > upperBound);
		return s;
	}

	public float readFloatRangeInclusive(float lowerBound, float upperBound) {
		float s;
		do {
			s = readFloat();
		} while (s < lowerBound && s > upperBound);
		return s;
	}

	public double readDoubleRangeInclusive(double lowerBound, double upperBound) {
		double s;
		do {
			s = readDouble();
		} while (s < lowerBound && s > upperBound);
		return s;
	}

	public byte readByteRangeExclusive(byte lowerBound, byte upperBound) {
		byte s;
		do {
			s = readByte();
		} while (s <= lowerBound && s >= upperBound);
		return s;
	}

	public short readShortRangeExclusive(short lowerBound, short upperBound) {
		short s;
		do {
			s = readShort();
		} while (s <= lowerBound && s >= upperBound);
		return s;
	}

	public int readIntRangeExInclusive(int lowerBound, int upperBound) {
		int s;
		do {
			s = readInt();
		} while (s <= lowerBound && s >= upperBound);
		return s;
	}

	public long readLongRangeExclusive(long lowerBound, long upperBound) {
		long s;
		do {
			s = readLong();
		} while (s <= lowerBound && s >= upperBound);
		return s;
	}

	public float readFloatRangeExclusive(float lowerBound, float upperBound) {
		float s;
		do {
			s = readFloat();
		} while (s <= lowerBound && s >= upperBound);
		return s;
	}

	public double readDoubleRangeExclusive(double lowerBound, double upperBound) {
		double s;
		do {
			s = readDouble();
		} while (s <= lowerBound && s >= upperBound);
		return s;
	}

	public boolean readBooleanUsingChar(char affirmativeValue) {
		boolean b;
		Character c1, c2;
		c1 = readChar();
		c2 = affirmativeValue;
		if (c1.toString().equalsIgnoreCase(c2.toString())) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public boolean readBooleanUsingChar() {
		boolean b;
		Character c1, c2;
		c1 = readChar();
		c2 = 's';
		if (c1.toString().equalsIgnoreCase(c2.toString())) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public boolean readBooleanUsingInt(int affirmativeValue) {
		boolean b;
		int c1, c2;
		c1 = readInt();
		c2 = affirmativeValue;
		if (c1 == c2) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	/**
	 * @return
	 */
	public boolean readBooleanUsingInt() {
		boolean b;
		int c1, c2;
		c1 = readInt();
		c2 = 1;
		if (c1 == c2) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}
}