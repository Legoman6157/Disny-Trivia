/* Card.java Version 1
 * Class to create a new card.
 * 
 * Version 1:
 * Contains the questions, answers, and card image. Also contains the overloaded (three times) method getquests.
 */

package Disny;

public class Card {
	public String
		animation,										//Question for the first category: Animation
		animAnswer,										//Answer for the first category: Animation
		film,											//Question for the second category: Film
		filmAnswer,										//Answer for the first category: Film
		song,											//Question for the third category: Song
		songAnswer,										//Answer for the first category: Song
		personalities,									//Question for the fourth category: Personalities
		personAnswer,									//Answer for the first category: Personalities
		mousellaneous,									//Question for the fifth category: Mousellaneous (Miscellaneous)
		mouseAnswer;									//Answer for the first category: Mousellaneous (Miscellaneous)
	public Card (String question1, String answer1, String question2, String answer2, String question3, String answer3, String question4, String answer4, String question5, String answer5) {
		animation = question1;
		animAnswer = answer1;
		film = question2;
		filmAnswer = answer2;
		song = question3;
		songAnswer = answer3;
		personalities = question4;
		personAnswer = answer4;
		mousellaneous = question5;
		mouseAnswer = answer5;
	}//Card
	
	//
	public void newCard(String question1, String answer1, String question2, String answer2, String question3, String answer3, String question4, String answer4, String question5, String answer5) {
		
	}//newCard
	
	//Gets the question from the specified index x and y
	public String getquests(int x, int y) {
		String[][] string = {
				{animation, animAnswer},
				{film, filmAnswer},
				{song, songAnswer},
				{personalities, personAnswer},
				{mousellaneous, mouseAnswer}};
		return string[x][y];
	}//String getquests
	
	//Gets the question
		public String[] getquests(int x) {
			String[][] string = {
				{animation, animAnswer},
				{film, filmAnswer},
				{song, songAnswer},
				{personalities, personAnswer},
				{mousellaneous, mouseAnswer}};
			return string[x];
		}//String[] getquests
	
	//Gets all of the questions
	public String[][] getquests() {
		String[][] string = {
				{animation, animAnswer},
				{film, filmAnswer},
				{song, songAnswer},
				{personalities, personAnswer},
				{mousellaneous, mouseAnswer}};
		return string;
	}//String[] getquests
	
	public String getQuestion(int x) {
		String[] string = {
				animation,
				film,
				song,
				personalities,
				mousellaneous
		};
		return string[x];
	}//String getQuestion
	
	public String[] getAll() {
		String[] string = {animation, animAnswer, film, filmAnswer, song, songAnswer, personalities, personAnswer, mousellaneous, mouseAnswer};
		return string;
	}//String[] getAll
	
	//Gets the card image.
	//public Image getImage() {
	//	return image;
	//}
}
