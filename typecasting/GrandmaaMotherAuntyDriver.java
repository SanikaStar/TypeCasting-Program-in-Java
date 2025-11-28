package typecasting;

public class GrandmaaMotherAuntyDriver {
	public static void main(String[] args) {
//		Grandmaa g=new Mother();// upcasting done
//		Mother m=(Mother)g;  // downcasting done		
//		m.cooking();
//		m.singing();
		//m.dancing();  CTE
		
		
		
//		Aunty a=(Aunty)g;    // typecasting Error
//		a.dancing();
//		a.cooking();
//   	a.singing();   CTE
		
		Grandmaa g1=new Aunty();
		Aunty a1=(Aunty)g1;
		a1.dancing();
		a1.cooking();
//   	a.singing();   CTE

		
		Mother m1=(Mother)g1;   //typecasting  Error
		m1.cooking();
		m1.singing();
//		m1.dancing();  CTE
		
		
	
		
	}

}
