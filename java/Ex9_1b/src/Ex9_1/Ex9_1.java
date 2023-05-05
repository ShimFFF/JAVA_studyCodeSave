package Ex9_1;


enum Specialty{
	Medicine, Surgery, Dentist, Orienteal;
}

class Doctor extends Person{
	double visit_fee;
	Specialty spt;
	
	public Doctor(){
		super();
		visit_fee=0;
	}
	public Doctor(String name, Specialty sppt, double fee) {
		super(name);
		visit_fee = fee;
		spt=sppt;
	}
	
	public void setVisitFee(double fee){
		if(fee<0) return;
		this.visit_fee=fee;
	}
	public void setSpecialty(Specialty sppt) {
		this.spt=sppt;
	}
	
	public double getVisitFee(){
		return visit_fee;
	}
	public String getSpecialty() {
		return spt.toString();
	}
	public String toString() {
		return(super.getName()+" "+visit_fee);
	}
	
	public boolean equals (Object other) {
		if(!(other!=null && other instanceof Doctor))
			return false;
		Doctor others = (Doctor)other;
		return this.hasSameName(others)&&
				(this.spt==others.spt);	
	}
	
}


public class Ex9_1 {
	public static void main(String[] args)
	 {	
		Student s = new Student();
	 	s.setName("Warren Peace"); 
	 	s.setStudentNumber(1234); 
	 	s.writeOutput();
	 	
	 	Doctor dtr = new Doctor("Shim", Specialty.Dentist, 200);
	 	System.out.println("Doctor1 : "+dtr.toString());
	 	
	 	Doctor dtr2 = new Doctor("Shim", Specialty.Dentist, 230);
	 	System.out.println("Doctor2 : "+dtr2.toString());
	 	
	 	if(dtr.equals(dtr2)) System.out.println("D1, D2 are same");
	 	else System.out.println("D1, D2 are different");
	 	
	 	Doctor dtr3 = new Doctor("Kim", Specialty.Orienteal, 230);
	 	System.out.println("Doctor2 : "+dtr3.toString());
	 	
	 	if(dtr.equals(dtr3)) System.out.println("D1, D3 are same");
	 	else System.out.println("D1, D3 are different");
	 	
	 	
	 	
	 }

}
