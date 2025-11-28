package desafio_palindromo;

import java.text.Normalizer;
import java.util.Scanner;

public class desafio {
	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite uma palavra ou número: ");
		    String entrada = scanner.nextLine();

		    if (isPalindromo(entrada)){
		        System.out.println(" " + entrada + " é um palíndromo!");

		    } else {
		        System.out.println(" " + entrada + " não é um palídromo");
		    } 
		    scanner.close();
		} 
		    public static boolean isPalindromo(String entradas) {
		        // 1. Converter para minúsculas para ignorar maiúsculas e minúsculas
		        String entradaFormatada = entradas.toLowerCase();
		        
		        // 2. Remove acentos
		        entradaFormatada = Normalizer.normalize(entradaFormatada, Normalizer.Form.NFD)
						.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

				// 3. Remove espaços e caracteres não alfanuméricos
				entradaFormatada = entradaFormatada.replaceAll("[^a-z0-9]", "");

		        // 2. Inverter a string
		        String entradaInvertida = new StringBuilder(entradaFormatada).reverse().toString();

		        // 3. Comparar a string original (formatada) com a invertida
		        return entradaFormatada.equals(entradaInvertida);
		    }
	}
