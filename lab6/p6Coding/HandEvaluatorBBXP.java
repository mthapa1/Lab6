package p6Coding;

public class HandEvaluatorBBXP
{
	// ALL OF THESE ARE PASSED AN ARRAY OF LENGTH 5

	// Cluster 1: Think about how a helper might be useful for these...
	public static boolean hasPair(Card[] cards)
	{
		int count = 0;

		for (int i = 0; i < cards.length - 1; i++)
		{
			for (int i1 = i + 1; i1 < cards.length; i1++)
			{
				if (cards[i].getValue() == cards[i1].getValue())
				{
					count++;
				}
			}
		}

		return (count != 0);

	}

	public static boolean hasThreeOfAKind(Card[] cards) 
		        { 
	                int count = 0; 
		 
		                for (int i = 0; i < cards.length - 1; i++) 
		                { 
		                        for (int i1 = (i + 1); i1 < cards.length; i1++) 
		                        { 
		                                if (cards[i].getValue() == cards[i1].getValue()) 
		                                { 
		                                        count++; 
		                                } 
		                        } 
	                } 
		 
		                return (count > 2);
		        }
		 
	public static boolean hasFourOfAKind(Card[] cards) 
		        { 
		                int count = 0; 
		 
		                for (int i = 0; i < cards.length - 1; i++) 
		                { 
		                        for (int i1 =( i + 1); i1 < cards.length; i1++) 
		                        { 
		                                if (cards[i].getValue() == cards[i1].getValue()) 
	                                { 
		                                        count++; 
	                                } 
		                        } 
		                } 
		 
		                return (count > 3); 
		 
		        } 
	 
	public static boolean hasFiveOfAKind(Card[] cards) 
	        { 
		return (cards[0].getValue()==cards[1].getValue()&&cards[1].getValue()==cards[2].getValue()&&cards[2].getValue()==cards[3].getValue()&&cards[3].getValue()==cards[4].getValue());

		 
		        } 

	// Cluster 2
	public static boolean hasRainbow(Card[] cards)
	{
		int count=0;
		int[] array= helperMethod2(cards);		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==1)
			{
				count++;
			}
		}
		return(count==5);
	
	}

	public static boolean hasStraight(Card[] cards)
	{
		int count=0;
		int[] array= helperMethod(cards);
		for(int i=0; i<cards.length;i++)
		{
			if(cards[i].getValue()==1)
			{
				array[10]+=1;
			}
		}
		
		for (int ii=1; ii<7; ii++)
		{
			if(array[ii]==1&&array[ii+1]==1)
			{
				count=ii;
				break;
			}
		}
		
		return(array[count]==array[count+1]&&array[count+1]==array[count+2]&&array[count+2]==array[count+3]&&array[count+3]==array[count+4]);
		
		
		
	}

	public static boolean hasFlush(Card[] cards)
	{
		return (cards[0].getSuit()==cards[1].getSuit()&&cards[1].getSuit()==cards[2].getSuit()&&cards[2].getSuit()==cards[3].getSuit()&&cards[3].getSuit()==cards[4].getSuit());
	}

	// Cluster 3: Think about how to make use of existing methods to
	// make the following ones easier to write...
	public static boolean hasStraightRainbow(Card[] cards)
	{
		boolean straightRainbow = false;
		straightRainbow = hasStraight(cards);
		straightRainbow = hasRainbow(cards);
		return straightRainbow;
	}

	public static boolean hasStraightFlush(Card[] cards)
	{
		boolean straightFlush = false;
		straightFlush = hasStraight(cards);
		straightFlush = hasFlush(cards);
		return straightFlush;
	}

	public static boolean hasTwoPair(Card[] cards)
	{
		int count= 0; 
		int[] array= helperMethod(cards);
		for( int i=1; i< array.length; i++)
		{
			if(array[i]>=2)
			{
				count++;
			}
		}
		return(count>1);
	}

	// Challenge
	public static boolean hasFullHouse(Card[] cards)
	{
		throw new RuntimeException("You need to implement this...");
	}
	
	public static int[] helperMethod(Card[] cards)
	{
		int[] array= new int[11];
		for(int i=1; i<10; i++)
		{
			for(int j=0; j<cards.length; j++)
			{
				if(i==cards[j].getValue())
				{
					array[i]+=1;
				}
			}
		}
		return array;
		
	}
	
	public static int[] helperMethod2(Card[] cards)
	{
		int[] array= new int[5];
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<cards.length; j++)
			{
				if(i==cards[j].getSuit())
				{
					array[i]+=1;
				}
			}
		}
		return array;
		
	}
	
	

}
