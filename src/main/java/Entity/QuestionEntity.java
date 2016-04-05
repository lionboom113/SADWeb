package Entity;

public class QuestionEntity {

	private int id;

	private String content;

	private String type;

	private int examId;

	private double point;

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setData(QuestionEntity data) {
		this.id = data.id;
		this.content = data.content;
		this.type = data.type;
	}
}
