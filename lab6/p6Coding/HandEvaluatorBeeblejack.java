package p6Coding;

import java.util.ArrayList;

public class HandEvaluatorBeeblejack {
	//ALL OF THESE ARE PASSED AN ARRAYLIST<CARD> OF "UNKNOWN" LENGTH
	public static int eval(ArrayList<Card> hand) {
		int whatHand=0; 
		int[] array= helperMethod(hand);
		
			if(hand.size()==2&&array[4]==1&&array[2]==1)
			{
				whatHand=22;
			}
			
			else if(hand.size()==2&&array[6]==1&&array[9]==1)
			{
				whatHand=21;
			}	
	
			else 
			{
				for(Card c: hand)
				{
					switch(c.getValue())
					{
						case 5: if((whatHand<=6)){
									whatHand+=15;
									}
								else
									{
										whatHand+=5;
									};
									break;
						default:
							whatHand+=c.getValue();
							break;
					}
				
				}
				if(whatHand>21)
				{
					whatHand=0;
				}
			}
			
		
		return whatHand;
	}


	public static boolean houseWins(ArrayList<Card> player, ArrayList<Card> dealer) {
		int playerHand= eval(player);
		int houseHand= eval(dealer);
		boolean win=false;
		if(playerHand<houseHand)
		{
			win=true;
		}
		else if(playerHand>houseHand)
		{
			win=false;
		}
		else if (playerHand==houseHand)
		{
			win=false;
		}
	
		return win;
		
	}
	
	public static int[] helperMethod(ArrayList<Card> hand)
	{
		int[] array= new int[11];
		for(int i=1; i<10; i++)
		{
			for(int j=0; j<hand.size(); j++)
			{
				if(i==hand.get(j).getValue())
				{
					array[i]+=1;
				}
			}
		}
		return array;
		
	}

}
