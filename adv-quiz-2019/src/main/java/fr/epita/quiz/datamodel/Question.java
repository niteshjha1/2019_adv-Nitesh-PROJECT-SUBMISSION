package fr.epita.quiz.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(unique = true, nullable = false)
	private String question;

	private String answer1;

	private String answer2;

	private String answer3;

	private String answer4;

	private String correctanswer;
	@Column(nullable = false)
	private TypeOFQuestions type;
	@Column(nullable = false)
	private String quizName;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getAnswer1() {
		return answer1;
	}
	
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	
	public String getAnswer2() {
		return answer2;
	}
	
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	
	public String getAnswer3() {
		return answer3;
	}
	
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	
	public String getAnswer4() {
		return answer4;
	}
	
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	
	public String getCorrectanswer() {
		return correctanswer;
	}
	
	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}
	
	public TypeOFQuestions getType() {
		return type;
	}
	
	public void setType(TypeOFQuestions type) {
		this.type = type;
	}
	
	public String getQuizName() {
		return quizName;
	}
	
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	public void setContent(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	

}