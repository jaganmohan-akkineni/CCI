
public class zero_matrix {
	
	
	
	public static void setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean coloumnHasZero = false;
		
		//to find if first row has zero
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][0] == 0)
				rowHasZero = true;
				break;
		}
		
		//to find if first col has zero
		for(int i=0; i<matrix[0].length; i++) {
			if(matrix[0][i] == 0)
				coloumnHasZero = true;
				break;
		}
		

		for(int i=1; i<matrix.length; i++) {
			for(int j=1; j<matrix[0].length; j++) {
				if(matrix[i][j]==0)
				{
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][0] == 0) {
				for(int j=1; j<matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		for(int j=0; j<matrix[0].length; j++) {
			if(matrix[0][j] == 0) {
				for(int i=1; i<matrix.length; i++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		if(rowHasZero)
			for(int i=1; i<matrix.length; i++)
				matrix[i][0] = 0;
		
		if(coloumnHasZero)
			for(int j=1; j<matrix[0].length; j++)
				matrix[0][j] = 0;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{8,7,4,3,5},
				{9,13,12,2,1},
				{11,0,4,5,8},
				{2,4,9,17,16}
		};
		
		setZeros(matrix);
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}