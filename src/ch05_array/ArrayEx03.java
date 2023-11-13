package ch05_array;

public class ArrayEx03 {
    /*
     * 로또 번호 추첨기
     * 1. 1~ 45
     * 2. 중복없는 6개의 수(random)를 만든다 lotto
     * 3. sort  : lotto
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] balls = new int[45];
      int [] lotto = new int[6];
      for (int i = 0; i < balls.length; i++) {
		balls[i] = i + 1;
		//System.out.println(balls[i]);
	} 
      //balls 섞기
      for (int i = 0; i < 1000; i++) {
    	  int f = (int) (Math.random() * 45); //0~44 index
    	  int t = (int) (Math.random() * 45); //0~44 index
    	  // swap 알고리즘 
    	  int tmp = balls[f];
    	  balls[f] = balls[t];
    	  balls[t] = tmp;
	}
        for (int i = 0; i < balls.length; i++) {
        	 System.out.print(balls[i]+ " ");
		}
        //balls의 0 ~ 5 index의 자료를 lotto 0 ~ 5 index의 자료로 복사
        System.out.println();
        
        for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
			System.out.print(lotto[i] + " ");
		}
          System.out.println();
          
          //ascending sort  큰수를 뒤로 보냄
        for (int i = 0; i < lotto.length; i++) {
        	boolean change = false; // 안바뀌는걸 가정
        	for (int j = 0; j < lotto.length -1 -i; j++) {
        		if (lotto[j] > lotto[j + 1]) {
        			int temp = lotto[j];
          	        lotto[j] = lotto[j + 1];
          	        lotto[j+1] = temp;
        		    change=true;//바뀌면 참
			}
			
		}    
        	      if (!change) break; //안바꼈으면 다시올라감 
        	      
	}         // lotto 번호
                  for (int l : lotto) {
            	   System.out.print(l+ " ");
              }
	
	}         
	}

