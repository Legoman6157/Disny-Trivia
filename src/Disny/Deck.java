/* Deck.java Version 1
 * Created by: Joshua Byers
 * Last edited: 9/30/15 at around 8:08
 * 
 * Version 1:
 */

package Disny;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Deck
{
	static JFrame window = new JFrame("Disny Trivia");
	static JPanel
		panel1 = new JPanel(),
		panel2 = new JPanel();
	static JTextArea field = new JTextArea(5, 20);
	static JTextField answer = new JTextField(5);
	public static void main(String[] args)
	{
		window.add(field);
		window.setSize(300, 150);
		window.setVisible(true);
		ArrayList<Card> deck = new ArrayList<Card>();
		deck.add(new Card("Animation", "Answer", "Film", "Answer", "Song", "Answer", "Personalities", "Answer", "Mousellaneous", "Answer"));
		for (int x = 0; x < 5; x++) {
			field.setText(deck.get(0).getQuestion(x) + "\n");
		}
	}//main
}//Deck
