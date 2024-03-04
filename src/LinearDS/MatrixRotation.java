package LinearDS;

public class MatrixRotation {
	
	

	//out of place
	public static void rotation90CW(int[][] array) {
		int[][] newArray = new int[array.length][array.length];
		for(int i = 0; i<array.length;i++) {
			for(int j = 0; j<array[i].length;j++) {
				
				newArray[j][array.length-1-i] = array[i][j];
				
				
			}
		}
		
			for(int i=0;i<array.length;i++) {
				for(int j=0; j<array.length;j++) {
					System.out.print(newArray[i][j]+" ");
					
				}
				System.out.println();
			}
	}
	
	public static void rotation90CWINPlace(int[][] array) {
		arrayTransposition(array);
		
		arrayReverse(array);
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array.length;j++) {
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}
	
	}
	public static void arrayTransposition(int[][] array){
		
		for(int i = 0;i<array.length;i++) {
			for(int j = i ; j<array[i].length;j++) {
				swap(i, j, array);
			}
		}
	}
	
	public static void arrayReverse(int[][] array) {
		for(int i = 0 ; i<array.length;i++) {
			int[] arrayToReverse = array[i];
			int start = 0;
			int end = arrayToReverse.length-1;
			while(start<end) {
				int temp = arrayToReverse[start];
				arrayToReverse[start] = arrayToReverse[end];
				arrayToReverse[end] = temp;
				start++;
				end--;
			}
		}
	}
	
	public static void swap(int i , int j , int[][] array) {
		int temp = array[i][j];
		array[i][j]= array[j][i];
		array[j][i]= temp;
	}
	
	
	
	public static void main(String[] args) {
		int[][] array =  {{1,2,3},{4,5,6},{7,8,9}};
//		rotation90CW(array);
		rotation90CWINPlace(array);
	
		
		
	}

}
