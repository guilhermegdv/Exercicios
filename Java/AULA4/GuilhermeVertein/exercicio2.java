
/**
 * @author Guilherme Vertein
*/

/**Criar uma matriz que represente os nomes dos integrantes de quatro duplas 
de jogadores de sinuca. O programa deve sortear dois jogadores, que 
podem pertencer ao mesmo grupo, e imprimir: “Próximo jogo: Jogador1 x 
Jogador 2. Não perca!”. Em sua primeira versão, permita que um jogador 
seja sorteado para jogar contra ele mesmo.
*/

import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Exercicio2 
{

	public static void main(String[] args) 
	{
	
		String[][] duplas;
		String[] jogador;
		int i;
		int j;
		
		jogador = new String[8];
		duplas = new String[4][2];
		
		Random Aleatorios = new Random();
		
		jogador[0] = ("Jogador1");
		jogador[1] = ("Jogador2");  
		jogador[2] = ("Jogador3");  
		jogador[3] = ("Jogador4");  
		jogador[4] = ("Jogador5");  
		jogador[5] = ("Jogador6");  
		jogador[6] = ("Jogador7");  
		jogador[7] = ("Jogador8");
		
			for (i=0; i < duplas.length; i++)
			{
				for (j=0; j < duplas[i].length; j++)
				{
					if (j==0)
					{
						duplas[i][j] = jogador[Aleatorios.nextInt(8)];
						System.out.print("Próximo jogo: " + duplas[0][0]);
					}	
						else	
						{	
							duplas[i][j] = jogador[Aleatorios.nextInt(8)];
							System.out.print(" x " + duplas[0][1] + " Não perca! ");
							
						}		
				}
			
				break;
			
			}
		}
 }
