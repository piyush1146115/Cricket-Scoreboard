package application;
import javafx.beans.property.*;
public class MyInt {
	private IntegerProperty number;

	public int getNumber() {
		if(number != null) 
		return number.get();
		return 0; 
	}

	public void setNumber(int number) {
		this.numberProperty().set(number);
	}
	
	public final IntegerProperty numberProperty() {
		if(number == null) {
			number = new SimpleIntegerProperty(0);
		}
		return number;
	}
	
}
