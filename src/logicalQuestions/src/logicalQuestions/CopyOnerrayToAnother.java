package logicalQuestions;

public class CopyOnerrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,34,56,43,76,98};
		int[] copy_arr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			copy_arr[i]=arr[i];
		}
		
		for(int no:copy_arr) {
			System.out.println(no+"");
		}
		
		

	}

}
