package ch05_array;

public class ExArray09 {
	/*
	 * 2차원 배열보다 가로,세로가 1씩 더 큰 배열 result를 생성하여,
	 * 마지막 행과열에 합계를 저장하는 프로그램을 구현하기 
	 */

	public static void main(String[] args) {
		int score[][] = {
	  {100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}};
		
		int[][] result =new int [score.length+1] [score[0].length + 1];
		 for (int i = 0; i < score.length; i++) {			 			 
			  for(int j=0; j< score[i].length; j++) {
				result[i][j] = score[i][j];
				
				result[i][score[i].length]+= score[i][j];//[0][3],[1][3]...
				result[score.length][j]+= score[i][j];   //[5][0],[5][1]...
				result[score.length][score[i].length]  += score[i][j];	//[5][3]			  	  			  					
}       
		 }
		 for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d",result[i][j]);
			}
			System.out.println();
		}
	}
}


