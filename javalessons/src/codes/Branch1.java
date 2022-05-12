package codes;

public class Branch1 {
	public final int id;
    private int managerID;
    private String location;
    public final String bankName ="ABC";
    
     public Branch1(int id) {
    	this.id =id;
     }
     public int getManagerID() {
    	 return managerID;
     }
     public void setManagerID(int managerid) {
    	 this.managerID=managerid;
     }
     public String getLocation() {
    	 return location;
     }
     public void setLocation(String location) {
    	 this.location=location;
     }
}
