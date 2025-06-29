public class CharDemo {
	public static void main(String[] args) {
		// assigning single character literal
		char ch = 'a';
		System.out.println(ch);

		// assigning number to char
		char ch1 = 65;
		System.out.println(ch1);

		// assigning unicode to char
		char var1 = '\u00A7';
		System.out.println(var1);

		// Unicode representation
		char var2 = '\u20AC';
		System.out.println(var2);

		// ASCI code representation
		int a = 'A';
		System.out.println(a);
	}
}

/*
 * Explanation:
 *
 * 1. Character Assignment:
 *    - char ch = 'a'; assigns the character 'a' to the variable ch.
 *    - char ch1 = 65; assigns the character corresponding to ASCII value 65, which is 'A'.
 *
 * 2. Unicode Characters:
 *    - char var1 = '\u00A7'; assigns the section sign (§) using its Unicode escape sequence.
 *    - char var2 = '\u20AC'; assigns the Euro sign (€) using its Unicode escape sequence.
 *
 * 3. ASCII Representation:
 *    - int a = 'A'; assigns the ASCII (or Unicode) value of 'A' (which is 65) to the integer variable a.
 *
 * 4. Output:
 *    - a
 *    - A
 *    - §
 *    - €
 *    - 65
 *
 * Summary:
 * You're assigning characters using:
 * - character literals (e.g., 'a')
 * - ASCII/Unicode numeric values (e.g., 65)
 * - Unicode escape sequences (e.g., \u00A7 → §, \u20AC → €)
 *
 * This is especially useful when:
 * - You want to include special characters not available directly on your keyboard.
 * - You’re handling internationalization or symbol-heavy data (like currency signs).
 */
