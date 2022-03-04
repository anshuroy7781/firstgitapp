package fi.company;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arrInt= {5,3,8,6,1,2};
    String[] arrString= {"anshu","rajat","shyam"};
    
    StringSorter<String[]> StringSorter=new stringSorter<>();
    
   // Sorter<int[]> intSorter=new IntegerSorter<>();
    Sorter<int[]> intSorter=(int []arr)->{
    	System.out.println("integer sorted");
    	return null;};
    	intSorter.sort(arrInt);
    }
	}


