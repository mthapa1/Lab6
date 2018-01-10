package p6Testing;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import p6Coding.Card;
import p6Coding.Deck;
import p6Coding.HandEvaluatorBBXP;
import p6Coding.HandEvaluatorBeeblejack;

public class StudentTests {

	@Test
	public void testExampleTest_SinglePairTest() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(3,1);
		testHand[3] = new Card(4,1);
		testHand[4] = new Card(5,1);
		assertFalse(HandEvaluatorBBXP.hasPair(testHand));
	}

	@Test
	public void testExampleTest_SingleThreeOfAKind() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(3,1);
		testHand[2] = new Card(2,1);
		testHand[3] = new Card(4,1);
		testHand[4] = new Card(5,1);
		assertFalse(HandEvaluatorBBXP.hasThreeOfAKind(testHand));
	}

	@Test
	public void testExampleTest_SingleFourOfAKind() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(5,0);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,2);
		testHand[3] = new Card(5,3);
		testHand[4] = new Card(9,4);
		assertTrue(HandEvaluatorBBXP.hasFourOfAKind(testHand));
	}
	
	
	@Test
	public void testExampleTest_SingleFiveOfAKind() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(4,0);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,2);
		testHand[3] = new Card(5,3);
		testHand[4] = new Card(5,4);
		assertFalse(HandEvaluatorBBXP.hasFiveOfAKind(testHand));
	}
	
	
	@Test
	public void testExampleTest_SingleHasStraight() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(1,0);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(3,2);
		testHand[3] = new Card(4,3);
		testHand[4] = new Card(5,4);
		assertTrue(HandEvaluatorBBXP.hasStraight(testHand));
	}
	
	@Test
	public void testExampleTest_SingleHasFlush() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(1,0);
		testHand[1] = new Card(2,0);
		testHand[2] = new Card(3,0);
		testHand[3] = new Card(4,0);
		testHand[4] = new Card(5,0);
		assertTrue(HandEvaluatorBBXP.hasFlush(testHand));
	}
	
	@Test
	public void testExampleTest_SingleRainbowTest() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(4,0);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,2);
		testHand[3] = new Card(5,3);
		testHand[4] = new Card(9,4);
		assertTrue(HandEvaluatorBBXP.hasRainbow(testHand));
	}

	@Test
	public void testExampleTest_SingleBeebeljackEvalTest() {
		ArrayList<Card> player = new ArrayList<Card>();
		player.add(new Card(3,1));
		player.add(new Card(2,1));

		assertEquals(5, HandEvaluatorBeeblejack.eval(player));
	}


	@Test
	public void testExampleTest_DeckDealCardsLengthTest() {
		Deck theDeck = new Deck();
		Card[] cards = theDeck.deal(41);
		assertEquals(41, cards.length);
	}

	@Test
	public void testExampleTest_TestRainbowMore() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(4,0);
		testHand[1] = new Card(6,1);
		testHand[2] = new Card(6,2);
		testHand[3] = new Card(6,3);
		testHand[4] = new Card(9,4);
		assertTrue(HandEvaluatorBBXP.hasRainbow(testHand));
	}
	
	@Test
	public void testExampleTest_TestStraightMore() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(5,0);
		testHand[1] = new Card(6,1);
		testHand[2] = new Card(7,2);
		testHand[3] = new Card(8,3);
		testHand[4] = new Card(9,4);
		assertTrue(HandEvaluatorBBXP.hasStraight(testHand));
	}
	
	@Test
	public void testExampleTest_TestStraightRainbow() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(5,1);
		testHand[1] = new Card(6,1);
		testHand[2] = new Card(7,1);
		testHand[3] = new Card(8,1);
		testHand[4] = new Card(9,1);
		assertFalse(HandEvaluatorBBXP.hasStraightRainbow(testHand));
	}
	
	@Test
	public void testExampleTest_TestStraightFlush() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(5,1);
		testHand[1] = new Card(6,1);
		testHand[2] = new Card(7,1);
		testHand[3] = new Card(8,1);
		testHand[4] = new Card(9,1);
		assertTrue(HandEvaluatorBBXP.hasStraightFlush(testHand));
	}
	@Test
	public void testExampleTest_TestHasTwoPair() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(5,1);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,1);
		testHand[3] = new Card(5,1);
		testHand[4] = new Card(9,1);
		assertFalse(HandEvaluatorBBXP.hasTwoPair(testHand));
	}
	
	@Test
	public void testExampleTest_TestEval1() {
		ArrayList<Card> madan = new ArrayList<>(2);
		Card val4= new Card(4,1);
		Card val2= new Card(2,1);
		madan.add(val2);
		madan.add(val4);
		assertEquals(HandEvaluatorBeeblejack.eval(madan),22);
	}
	
	@Test
	public void testExampleTest_TestEval2() {
		ArrayList<Card> madan = new ArrayList<>(2);
		Card val4= new Card(4,1);
		Card val2= new Card(2,1);
		Card val5= new Card(5,1);
		madan.add(val2);
		madan.add(val4);
		madan.add(val5);
		assertEquals(HandEvaluatorBeeblejack.eval(madan),21);
	}
	

	@Test
	public void testExampleTest_TestEval3() {
		ArrayList<Card> madan = new ArrayList<>(2);
		Card val4= new Card(6,1);
		Card val2= new Card(9,1);
		madan.add(val2);
		madan.add(val4);
		assertEquals(HandEvaluatorBeeblejack.eval(madan),21);
	}

	//You will add many other tests here.  You can also modify the ones above.




}
