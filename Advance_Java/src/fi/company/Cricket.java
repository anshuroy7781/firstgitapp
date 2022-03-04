package fi.company;

public class Cricket {
   public void game(){
  System.out.println("gentleman game");
}
   class Player extends Cricket{

	   public void captain() {
		   System.out.println("gentleman game");
	}
	  
   }
   class Test{
	   public static void main(String[] args) {
		Cricket obj=new Cricket();
		obj.game();
		//obj.captain();
		
		
	}
   }
}
