/* Card.java Version 1
 * Class to create a new card.
 * 
 * Version 1:
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Card {
	private String
		animation,										//Question for the first category: Animation
		ANIMATION,										//Answer for the first category: Animation
		film,											//Question for the second category: Film
		FILM,											//Answer for the first category: Film
		song,											//Question for the third category: Song
		SONG,											//Answer for the first category: Song
		personalities,									//Question for the fourth category: Personalities
		PERSONALITIES,									//Answer for the first category: Personalities
		mousellaneous,									//Question for the fifth category: Mousellaneous (Miscellaneous)
		MOUSELLANEOUS;									//Answer for the first category: Mousellaneous (Miscellaneous)
	private Image
		image;											//Card image
	public Card (String question1, String answer1, String question2, String answer2, String question3, String answer3, String question4, String answer4, String question5, String answer5, Image img) {
		animation = question1;
		ANIMATION = answer1;
		film = question2;
		FILM = answer2;
		song = question3;
		SONG = answer3;
		personalities = question4;
		PERSONALITIES = answer4;
		mousellaneous = question5;
		MOUSELLANEOUS = answer5;
		image = img;
	}//Card
	//Gets the question from the specified index
	public String getquests(int x) {
		String[] string = {animation, film, song, personalities, mousellaneous};
		return string[x];
	}//String getquests
	
	//Gets all of the questions
	public String[] getquests() {
		String[] string = {animation, film, song, personalities, mousellaneous};
		return string;
	}//String[] getquests
	
	//Gets the card image.
	public Image getImage() {
		return image;
	}
}
