package Model;

import java.util.Observable;

public class Card extends Observable{

	private Suit cardSuit;
	private int cardNumber;
	private String specialty;
//	private Image img;
	
	public Card(Suit cardSuit, int cardNumber){
		this.cardSuit = cardSuit; 
		this.cardNumber = cardNumber;
		
		if(cardNumber == 1 ){
			specialty = "Skip 1";
		}else if ( cardNumber == 7 ){
			specialty = "Take 3";
		}else if( cardNumber == 10 ){
			specialty = "Change Rotation";
		}else if( cardNumber == 11){
			specialty = "Change Suit";
		}else{
			specialty = "None";
		}
		
	}
	
	public Suit getSuit(){
		return cardSuit;
	}
	
	public void setSuit( Suit cardSuit){
		this.cardSuit = cardSuit;
		setChanged();
		notifyObservers("Card Suit Changed!");
	}
	
	public int getNumber(){
		return cardNumber;
	}
	
	public void setNumber(int cardNumber){
		this.cardNumber = cardNumber;
		setChanged();
		notifyObservers("Card Number Changed!");
	}
	
	
}
