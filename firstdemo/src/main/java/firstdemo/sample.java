package firstdemo;

public class sample {

	public void display() {
		int [] arr= {23,45,56,78};
		int sum=0;
		for(int num:arr) {
			sum+=num;
		    System.out.println(num);
		}
		System.out.println("Summation:"+ sum);

	}
	public void print() {
		System.out.println("Print all Array Numbers");
		display();
	}

}
