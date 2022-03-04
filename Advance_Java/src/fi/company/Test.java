package fi.company;

 interface Commit {
   public void save();
   public void load();
   public default void autosave()
   {
	   throw new RuntimeException("unimplemented method");
   }
  
}
class Data implements Commit{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("data saved");
	}

	@Override
	public void load() {
	
		System.out.println("data saved");
	}

}
class SpecialClass implements Commit{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("data saved");
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println("data loaded");
	}
	
}

public class Test{
	public static void main(String[] args) {
		Commit obj=new SpecialClass();
		obj.save();
		obj.load();
		obj.autosave();
		
	}
	
}








