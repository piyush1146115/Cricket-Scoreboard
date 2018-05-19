package application;
import javafx.beans.property.*;
public class MyNumber {
	private DoubleProperty number;

	public double getNumber() {
		if(number != null) 
		return number.get();
		return 0; 
	}

	public void setNumber(double number) {
		this.numberProperty().set(number);
	}
	
	public final DoubleProperty numberProperty() {
		if(number == null) {
			number = new SimpleDoubleProperty(0);
		}
		return number;
	}
	
}
