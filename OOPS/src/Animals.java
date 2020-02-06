
public class Animals implements animal {
	String st,st1,st2,st3;
	
	Animals(String st,String st1,String st2,String st3){
		this.st=st;
		this.st1=st1;
		this.st2=st2;
		this.st3=st3;
	}
	Animals(){
		
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("It will eat:"+st1);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("It will eat:"+st2);

	}

	@Override
	public void nature() {
		// TODO Auto-generated method stub
		System.out.println("It will eat:"+st3);

	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name of the animal:"+st);
	}

	
}
 
