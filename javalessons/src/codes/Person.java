package codes;

public class Person {
     private String name;
     public  int id;
     private String address;
     private long phoneNo;
     
    public Person(int id) {
    	this.id=id;
    }
    public String getName() {
    	return name;
    }
    public  void setName(String name) {
    	this.name=name;
    }
    public String getAddress() {
    	return address;
    }
    public void setAddress(String address) {
    	this.address=address;
    }
    public long getPhoneNo() {
    	return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
    	this.phoneNo=phoneNo;
    }
}
