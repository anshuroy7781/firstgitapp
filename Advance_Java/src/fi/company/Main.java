package fi.company;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Operation op=(int num1,int num2)->{return num1+num2;};
    //op.operate(3, 5);
    
    Operation opAdd=(num1,num2)->num1+num2;
    System.out.println(opAdd.operate(5, 8));
    
    Operation opMultiply=(num1,num2)->num1*num2;
    System.out.println(opMultiply.operate(10, 10));
	}

}
