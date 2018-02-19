		/*It prints a conversion table of inches to meters. 
		Display 12 inches of conversions, inch by inch. 
		Output a blank line every 1 inch. */ 

		package Coverter;

		public class Converter {

			public static void main(String[] args) {
				double inch;
				double meters = 39.37;
			    int counter;
			    
				inch = 12;
				counter = 0;
				
				for ( inch = 1; inch < 13; inch++) {
					meters = inch / 39.37;
					
					System.out.println( inch + " inch is " +  meters + " meters ");
					
				    counter++;
				         
				     
				if ( counter== 1) {
					System.out.println();
					counter =0; 
						 
					}
				   }
				 }
		        }


