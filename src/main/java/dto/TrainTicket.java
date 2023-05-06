package dto;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class TrainTicket {
	@Id
	@GeneratedValue(generator="x")
	@SequenceGenerator(name="x", sequenceName="x", initialValue=0001,allocationSize=1)
	int PNR_Number;
	String From;
	String To;
	int Train_Number;
	Time Time_Of_Departure;
	boolean Status;
	double Price;

}
