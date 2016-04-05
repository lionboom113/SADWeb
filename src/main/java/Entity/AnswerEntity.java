package Entity;

public class AnswerEntity {

	private int id;

	private String content;

	private boolean isCorrect;

	private int questionId;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setData(AnswerEntity data) {
		this.id = data.id;
		this.content = data.content;
		this.isCorrect = data.isCorrect;
	}
}
