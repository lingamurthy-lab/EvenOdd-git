public class OddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] data= {1,3,5,2,4,6,11,12,15,16};
       for(int n=0;n<data.length;n++) {
       	if(data[n]%2!=0) {
       		System.out.println("odd numbers"+data[n]);
       	}
       }
       
        for(int n=0;n<data.length;n++) {
        	if(data[n]%2==0) {
        		System.out.println("Even numbers"+data[n]);
        	}
        }
        
		
		}
				
	}


