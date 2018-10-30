package befaster.solutions.CHK;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	// checking only the capital letters
    	for(int i = 0; i < skus.length(); i++){
    		if(skus.charAt(i) < 65 && skus.charAt(i) > 90){
        		return -1;
        	}
    	}
    	
    	
    }
}
