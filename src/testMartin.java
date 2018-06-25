package test_logics;

public class testMartin {

	  public static void main(String args[]) {
	        testMartin test1 = new testMartin();
	            System.out.println(test1.xyz(4));    
	    }
	    public int xyz(int num) {
	        if(num == 1) return 1;
	        else return(num + xyz(num-1));
	    }

}
