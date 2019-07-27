package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answers {
	
	@Id
	@GeneratedValue
	@Column(name="aid")
	private int aid;
	@Column(name="UserEmail")
	private String aemail;
	@Column(name="Q1ans")
	private int aq1;
	@Column(name="Q2ans")
	private int aq2;
	@Override
	public String toString() {
		return "Answers [aid=" + aid + ", aemail=" + aemail + ", aq1=" + aq1 + ", aq2=" + aq2 + ", aq3=" + aq3
				+ ", aq4=" + aq4 + ", aq5=" + aq5 + "]";
	}
	@Column(name="Q3ans")
	private int aq3;
	@Column(name="Q4ans")
	private int aq4;
	@Column(name="Q5ans")
	private int aq5;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public int getAq1() {
		return aq1;
	}
	public void setAq1(int aq1) {
		this.aq1 = aq1;
	}
	public int getAq2() {
		return aq2;
	}
	public void setAq2(int aq2) {
		this.aq2 = aq2;
	}
	public int getAq3() {
		return aq3;
	}
	public void setAq3(int aq3) {
		this.aq3 = aq3;
	}
	public int getAq4() {
		return aq4;
	}
	public void setAq4(int aq4) {
		this.aq4 = aq4;
	}
	public int getAq5() {
		return aq5;
	}
	public void setAq5(int aq5) {
		this.aq5 = aq5;
	}

}
