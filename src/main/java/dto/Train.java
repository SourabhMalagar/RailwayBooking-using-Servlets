package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	
	@Id
	int Train_Number;
	int Train_Seats;
	String Train_Name;
	String[] Train_Stations;
	String[] Train_Price;
	String[] Train_Time;
	String[] Train_Days;
	public int getTrain_Number() {
		return Train_Number;
	}
	public void setTrain_Number(int train_Number) {
		Train_Number = train_Number;
	}
	public int getTrain_Seats() {
		return Train_Seats;
	}
	public void setTrain_Seats(int train_Seats) {
		Train_Seats = train_Seats;
	}
	public String getTrain_Name() {
		return Train_Name;
	}
	public void setTrain_Name(String train_Name) {
		Train_Name = train_Name;
	}
	public String[] getTrain_Stations() {
		return Train_Stations;
	}
	public void setTrain_Stations(String[] train_Stations) {
		Train_Stations = train_Stations;
	}
	public String[] getTrain_Price() {
		return Train_Price;
	}
	public void setTrain_Price(String[] train_Price) {
		Train_Price = train_Price;
	}
	public String[] getTrain_Time() {
		return Train_Time;
	}
	public void setTrain_Time(String[] train_Time) {
		Train_Time = train_Time;
	}
	public String[] getTrain_Days() {
		return Train_Days;
	}
	public void setTrain_Days(String[] train_Days) {
		Train_Days = train_Days;
	}
	
	

}
