import java.util.Scanner;


public class MenuSolitaire 

{
Scanner choix = new Scanner(System.in);
	
	{
		
	System.out.println("Bienvenu dans le jeu du solitaire !\n");
	
	
	
	new java.util.Scanner(System.in);
	System.out.println("Commencer une partie ? OUI ou NON \n");
	String a = choix.next();
	choix.nextLine();
	
	if (a.equals("OUI"))
		
	{
		
	
	System.out.println("Choisissez votre tablier \n");
	System.out.println("'1'- Tablier Anglais (33 trous) \n"
			+ "'2'- Tablier Allemand (45 trous) \n"
			+ "'3'- Tablier diamant (41 trous) ");
	
	int b = choix.nextInt();
	choix.nextLine();
	
	if (b==1) 
		
		{	
		PlateauSolitaire toto = new PlateauSolitaire ();
		PlateauSolitaire.AfficheTableau(toto);}
		

		else if (b==2)
	{
		System.out.println("Le tablier Allemand n'a pas encore été crée");
	}
	
	if (b==3)
	{
		System.out.println("Le tablier diamant n'a pas encore été crée");
	}
		}
	else
		System.out.println("A bientôt !");
}
}
