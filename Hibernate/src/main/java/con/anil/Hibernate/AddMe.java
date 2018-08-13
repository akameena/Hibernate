package con.anil.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity //to specify in app.java for which classs will be use
//@Entity(name = "aasdsad")//use for to give table name 
public class AddMe {
	@Id //primary key
	private int id;
	//@Column(name = "asjdn")
	private Name name;
	//@Transient //use for to not store this column in tabel
	private int roll_no;
	
	
	public int getId() {
		return id;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "AddMe [id=" + id + ", name=" + name + ", roll_no=" + roll_no + "]";
	}
	
	
	
}
