/**
 * @author Guilherme Vertein
*/

/**Declarar um vetor de 20 posições com valores entre 1 e 1000. Percorrer o 
vetor indicando, para um determinado elemento, se ele é múltiplo de 2, 3,
5 ou 7 */

public class Exercicio1 
	{

		public static void main(String[] args) 
		{
			int[] vetor = {1, 4, 7, 49, 75, 144, 169, 172, 345, 421, 432, 512, 525, 533, 625, 733, 844, 887, 914, 999};
			
				for (int item: vetor)
				{
					if ((item % 2) == 0)
					{
						System.out.println(item+" É multiplo de 2");
					}
					else
						System.out.println(item+" Não é multiplo 2");
					if ((item % 3) == 0)
					{
						System.out.println(item+" É multiplo de 3");			
					}
					else
						System.out.println(item+" Não é multiplo 3");
					if ((item % 5) == 0)
					{
						System.out.println(item+" É multiplo de 5");
					}
					else
						System.out.println(item+" Não é multiplo 5");
					if ((item % 7) == 0)
					{
						System.out.println(item+" É multiplo de 7");
					}
					else
						System.out.println(item+" Não é multiplo 7");
				}		
		}

	}
