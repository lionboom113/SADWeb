package Entity;

public class ExamEntity {

	private long id;

	private String name;

	private int level;
	
	private int testDone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	

	public int getTestDone() {
		return testDone;
	}

	public void setTestDone(int testDone) {
		this.testDone = testDone;
	}

	public void setData(ExamEntity data) {
		this.id = data.id;
		this.name = data.name;
		this.level = data.level;
		this.testDone = data.testDone;
	}
}
