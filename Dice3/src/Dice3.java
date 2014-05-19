import java.util.Random;

public class Dice3 {		

	int game;		

	public int  Throw(int number)
	{		
		for (int i=0; i<number; i++)
		{			
			 game = game + 0 + (int) (Math.random() * 10);
		}	
		game = game / 	number;
		return 	(game );
	}

	//public int Value()
	//{
	//	return game;		
	//}	
}