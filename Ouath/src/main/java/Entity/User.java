package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	
 @Id
 @GeneratedValue
 @Column(name="UserId")
 private int userid;
 @Column(name="UserName")
 private String uname;
 @Column(name="UserEmail")
 private String uemail;
 @Column(name="GoogleId")
 private double googid;
 @Column(name="ImageURL")
 private String imageurl;
 @JsonIgnore
 @Column(name="IsVerified")
 private boolean isverified;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public double getGoogid() {
	return googid;
}
public void setGoogid(double googid) {
	this.googid = googid;
}
public String getImageurl() {
	return imageurl;
}
public void setImageurl(String imageurl) {
	this.imageurl = imageurl;
}
public boolean isIsverified() {
	return isverified;
}
public void setIsverified(boolean isverified) {
	this.isverified = isverified;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", uname=" + uname + ", uemail=" + uemail + ", googid=" + googid + ", imageurl="
			+ imageurl + ", isverified=" + isverified + "]";
}
 
 
 

}
