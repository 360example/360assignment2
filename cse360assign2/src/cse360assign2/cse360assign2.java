package cse360assign2;


public class cse360assign2 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Calculator myCalc = new Calculator();
		
		myCalc.add(1);
		System.out.println(myCalc.getHistory());
		myCalc.add(10);
		System.out.print(myCalc.getHistory());
		System.out.println(" = " + myCalc.getTotal());
		myCalc.subtract(1);
		System.out.print(myCalc.getHistory());
		System.out.println(" = " + myCalc.getTotal());
		myCalc.multiply(1);
		System.out.print(myCalc.getHistory());
		System.out.println(" = " + myCalc.getTotal());
		myCalc.divide(5);
		System.out.print(myCalc.getHistory());
		System.out.println(" = " + myCalc.getTotal());
		myCalc.add(1);
		System.out.print(myCalc.getHistory());
		System.out.println(" = " + myCalc.getTotal());

	}

}
