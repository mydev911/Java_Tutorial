package supper_keyword_Instance_Varable;



public class B_Inst_Varable extends A_Inst_Varable{
	
	int X = 5;

	
	public void Display(){
		
		System.out.println(X);
		//try  //System.out.println(X);
		
		// if we use Super keyword
		System.out.println(super.X);
		
	}

}
