package corejava;

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
		 int[] counts = new int[10];
		 
	      for (int i = 1; i <= 9; i++) {
	          int count = 0;
	          for (int j = 0; j < input.length; j++) {
	              if (input[j] % i == 0) {
	                  count++;
	              }
	          }
	          counts[i] = count;
	        }
	        for (int i = 1; i <= 9; i++) {
	            System.out.print(" "+i + ":" + counts[i]);
	        }
	}

}
