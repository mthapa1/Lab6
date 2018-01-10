package p6Coding;

import java.util.ArrayList;

public class Deck {

	//YOU NEED TO USE THIS ARRAYLIST<CARD> TO HOLD THE DECK
	//  YOU CANNOT USE REGULAR ARRAYS IN THIS CLASS OTHER THAN
	//  IN THE DEAL METHOD, WHICH NEEDS TO RETURN AN ARRAY
	
	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>(45);
		for(int i=0; i<=4;i++)
		{
			for(int index=1; index<=9; index++)
			{
				Card c= new Card(index,i);
				cards.add(c);
			}
		}
	}

	public Deck(Deck other) {
		this.cards = other.cards;
	}

	public Card getCardAt(int position) {
		return cards.get(position);
	}

	public int getNumCards() {
		return cards.size();
	}


	public Card[] deal(int numCards) {
		Card[] madan= new Card[numCards];
		for(int i=0; i<numCards; i++)
		{
			madan[i]= cards.get(i);
		}
		for(int i=0; i<numCards; i++)
		{
			cards.remove(0);
		}
		
		return madan;
		
	}


	public void cut(int position) {
		for (int i=0; i<=position-1; i++)
		{
			Card madan= cards.get(i);
			cards.add(madan);
	
		}
		int count=0;
		for (int i=0; i<=position-1; i++)
		{
			cards.remove(count);
		}
		
	}
	
	public void shuffle() {
		int half= cards.size()/2;
		final int size=cards.size();
		int count=0;
		if(cards.size()%2<= 0)
		{
			ArrayList<Card> first= new ArrayList<Card>(half);
			for(int i=0; i<half; i++)
			{
				first.add(cards.get(i));
			}
			
			ArrayList<Card> second= new ArrayList<Card>(half);
			for (int i=0; i<half; i++)
			{
				second.add(cards.get(half+i));
			}
			ArrayList<Card> shuffel= new ArrayList<Card>();
			for(int i=0; i<half; i++)
			{
				shuffel.add(first.get(i));
				shuffel.add(second.get(i));
			}
			
			for(int i=0; i<size; i++)
			{
				cards.remove(count);
			}
			cards=shuffel;
			
		}
		else
		{
			ArrayList<Card> first= new ArrayList<Card>(half+1);
			ArrayList<Card> second= new ArrayList<Card>(half);
			for (int i=0; i<half+1; i++)
			{
				first.add(cards.get(i));
			}
			
			for(int i=0; i<half; i++)
			{
				second.add(cards.get(half+1+i));
			}
			
			ArrayList<Card> shuffel= new ArrayList<Card>();
			for(int i=0; i<half; i++)
			{
	
					shuffel.add(first.get(i));
					shuffel.add(second.get(i));
			}

			shuffel.add(cards.get(half));
			
			for(int i=0; i<size; i++)
			{
				cards.remove(count);
			}
			
			
			
			cards=shuffel;
		}
	}
	

}
