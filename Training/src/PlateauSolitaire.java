
public class PlateauSolitaire 


{
	boolean tabvalide[][] = new boolean[7][7]; // true retourne une case ou on joue false une case ou ya rien 
	boolean taboccuper[][] = new boolean[7][7]; // true est une case ou on joue occuper par une bille false une sans bille
	int tab2[] = {0,1,2,3,4,5,6};
	final static private String INTERDI = " ", OCCUPE = "O", LIBRE = "X";
	
	
	public PlateauSolitaire()  // contructeur du plateau
	{
		System.out.println ("Création d'un plateau\n");
			
	
		for(int i = 0 ; i < 7; i++)
		{
			for (int j = 0; j<7; j++)
			{
				if(i == 3 && j ==3)
				{
					tabvalide[i][j]= true; 
					taboccuper[i][j]= false;
				}
					
				else if ((i<2 && j<2) ||(i<2 && j>4) || (i>4 && j<2) || (i>4 && j>4) )
				{
					tabvalide[i][j]=false;
				
				}
				
				else {
				tabvalide[i][j]= true; 
				taboccuper[i][j]= true;
				}
				
							}
		}
		}
	
	public static void AfficheTableau(PlateauSolitaire toto)   
	 {    
		for (int a = 0; a<7; a++)
		{
			
		
		if (a==toto.tab2.length-1)
		
		{
			System.out.println(toto.tab2[a]+"|");
		}
		else if (a==0)
		{
			System.out.print(" |" + toto.tab2[a]+"|");
		}
		else 
		{
			System.out.print(toto.tab2[a]+"|");
		}
		}
		
		System.out.print("");
		for(int i = 0 ; i < 7; i++)
		{
		
				
			for (int j = 0; j<7; j++)
			
			{
				if(toto.tabvalide[i][j] == true) {
					if (toto.taboccuper[i][j] == true) {
						if (j == toto.tabvalide.length-1)
						{
						System.out.println("|"+ OCCUPE+ "|");
						}
						else {
							if (j==0)
							{
								System.out.print(i);
							}
							
							
							System.out.print("|"+ OCCUPE);
						}
					}
					else 
					{
						System.out.print("|"+LIBRE);
					}
			}
				else
				{
					if (j == toto.tabvalide.length-1)
					{
						System.out.println("|"+INTERDI+"|");
						}
					
					else 
					{
						
					
						if (j==0 )
					{
						System.out.print(i);
					}

						System.out.print("|"+INTERDI);
				}
			}
		
			}			
		}
	 }

	
	
	
}
