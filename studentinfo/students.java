package studentinfo;

public class students {
 public void getstudentinfo(int id)
 {
	System.out.println(id);		
		}
 public void getstudentinfo(int id,String name)
 {
	System.out.println(id+" "+name); 
 }
 public void getstudentinfo(String email,String phnno) {
	 
	 System.out.println(email+" "+phnno);
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students info=new students();
		info.getstudentinfo(9);
		info.getstudentinfo(9, "vims");
		info.getstudentinfo("vimalap14@gmail.com","9090888890");

	}

}
