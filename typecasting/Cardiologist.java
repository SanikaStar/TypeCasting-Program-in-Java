package typecasting;

public class Cardiologist extends Doctor {
	String spe;
	String organ;
	
	public Cardiologist()
	{
		
	}
	public Cardiologist(String name,double fees,String degree,int exp,String hospital,String spe,String organ)
	{
		super(name,fees,degree,exp,hospital);
		this.spe=spe;
		this.organ=organ;
	}
	
	public void displayCardiologist() {
		displayDoctor();
		System.out.println(spe);
		System.out.println(organ);
	}
	

}
