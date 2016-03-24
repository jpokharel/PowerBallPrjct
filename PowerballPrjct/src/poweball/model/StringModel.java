package poweball.model;

public class StringModel {

	private DateOfDraw dateOfDraw;
	private NormalNumbers normalNumbers;
	private PowerBallNumber powerBallNumber;

	public StringModel(DateOfDraw dateOfDraw, NormalNumbers normalNumbers, PowerBallNumber powerBallNumber) {
		super();
		this.dateOfDraw = dateOfDraw;
		this.normalNumbers = normalNumbers;
		this.powerBallNumber = powerBallNumber;
	}

	public DateOfDraw getDateOfDraw() {
		return dateOfDraw;
	}

	public void setDateOfDraw(DateOfDraw dateOfDraw) {
		this.dateOfDraw = dateOfDraw;
	}

	public NormalNumbers getNormalNumbers() {
		return normalNumbers;
	}

	public void setNormalNumbers(NormalNumbers normalNumbers) {
		this.normalNumbers = normalNumbers;
	}

	public PowerBallNumber getPowerBallNumber() {
		return powerBallNumber;
	}

	public void setPowerBallNumber(PowerBallNumber powerBallNumber) {
		this.powerBallNumber = powerBallNumber;
	}

}
