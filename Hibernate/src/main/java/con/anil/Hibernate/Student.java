package con.anil.Hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	private String name ;
	@Id
	private int roll_no;
	@ManyToMany(mappedBy="student")//fetch = Fetchtype.EAGER/use for eager fatching
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public List<Laptop> getLaptop() {
		return laptop;
	}


	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", laptop=" + laptop + "]";
	}
	
	
	
	
}
