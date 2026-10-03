public class IT26102598Lab2Q1{
	public static void main(String[]args){
		double perimeter = 100;
		double Length = 2*perimeter/7;
		double Width = 3*Length/4;
		perimeter = 2 * (Length+Width);
		
		System.out.println("Length of the fence : "+ Length);
		System.out.println("Width of the fence : "+ Width);
	}
}