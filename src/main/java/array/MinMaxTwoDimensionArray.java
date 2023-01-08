package array;
public class MinMaxTwoDimensionArray {
//	
//	11 12 13
//	21 22 22
//	0  32 33
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 11, 12, 13 }, { 21, 22, 23 }, { 33, 32, 0 } };
		int min = arr[0][0];
		int max = arr[0][0];
		int minColumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					minColumn=j;
				} else if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("Minimum value within array is: " + min + "\n" + "Maximum value within array is: " + max);
		int k = 0;
		int maxColumn = arr[k][minColumn];
		for(k=0;k<3;k++)
		{
			if(arr[k][minColumn]>maxColumn)
			{
				maxColumn=arr[k][minColumn];
			}
		}
		System.out.println("Maximum value in column is: " + maxColumn);
	}
}
