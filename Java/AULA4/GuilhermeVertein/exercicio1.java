/**
 * @author Guilherme Vertein
*/

/**Criar uma matriz que represente as idades dos alunos de uma colégio, 
divididos por turma. Cada turma possui 20 alunos, e o colégio possui 6 
turmas. O programa deve inicializar as idades dos alunos deste colégio.*/

public class Exercicio1 
{

	public static void main(String[] args) 
	{
		int i;
		int a;
		int j;
		int[][] idadeAlunos;
		
		idadeAlunos = new int[6][20];
		
			for (i=0; i < idadeAlunos.length; i++)
			{
				
				for(j=0; j < idadeAlunos[i].length; j++)
				{
					for (a=10; a < 15; a++)
					{
						
					 idadeAlunos[i][j] = (12 + (a % 5));
					 System.out.println(idadeAlunos[i][j] + " Anos");
			
					}
			
			
			    }
			}	

	}

}
