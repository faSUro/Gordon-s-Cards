package it.fasuro.flashcardApp.view.studyDeck;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The main frame that allows to slide the deck
 * question by question with the relative answer.
 * @author Nicolò Fasulo <fasulo.nicol@gmail.com>
 *
 */
@SuppressWarnings("serial")
public class StudyDeckFrame extends JFrame {
	
	private JPanel mainPanel;
	private QuestionPanel questionPanel;
	private AnswerPanel answerPanel;
	private DifficultyPanel difficultyPanel;
	
	public StudyDeckFrame() {
		setTitle("FlashcardApp");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		mainPanel = new JPanel();
		Container contentPane = getContentPane();
		contentPane.add(mainPanel);
		
		mainPanel.setLayout(new BorderLayout());
		
		questionPanel = new QuestionPanel();
		
		answerPanel = new AnswerPanel("");
		
		difficultyPanel = new DifficultyPanel();
		
		mainPanel.add(questionPanel, BorderLayout.NORTH);
		mainPanel.add(answerPanel, BorderLayout.CENTER);
		mainPanel.add(difficultyPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JPanel getMainPanel() {
		return mainPanel;
	}
	
	public JButton getShowAnswerButton() {
		return questionPanel.getShowAnswerButton();
	}
	
	public void resetShowAnswerButtonText() {
		questionPanel.resetShowAnswerButtonText();
	}
	
	public void setQuestion(String question) {
		questionPanel.setQuestion(question);
	}
	
	public void setAnswer(String answer) {
		answerPanel.setAnswer(answer);;
	}
	
	public JButton getEasyButton() {
		return difficultyPanel.getEasyButton();
	}
	
	public JButton getMediumButton() {
		return difficultyPanel.getMediumButton();
	}

	public JButton getHardButton() {
		return difficultyPanel.getHardButton();
	}
	
}
