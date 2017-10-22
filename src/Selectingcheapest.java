import java.util.Scanner; 
import java.util.ArrayList;
public class Selectingcheapest { 
	
	public static void main(String[] args)
    {
		  ArrayList<String> lists=new ArrayList<String>();
		  lists.add("* The Park");
		  lists.add("* Hotel Hyaat");  
		  lists.add("* Raddisson");  
		  lists.add("* RainTree");  
		  lists.add("* Accord");  
		  lists.add("* Fortune");
		  for(String obj:lists)  
				
	      System.out.println(obj); 
	          
		  double discount,amount = 0,amount1 = 0,c1=0,c3=0,c5=0,c7=0,c9=0,c10=0;
       
		Scanner scan= new Scanner (System.in);
       
		System.out.println("Enter the buget ");
        double budget= scan.nextDouble();
        
          
        System.out.println("Enter the ratings?");
        int ratings= scan.nextInt();

//-------------------------------------------------------------------------------------------------------------------------//
        if(ratings ==5) 
        {
            System.out.println("Available Hotels in rating"+ratings+ "are:");
            System.out.println(" *The Park");
            System.out.println("* Hotel Hyaat");
                       
            System.out.print("Enter the number of days: ");
            int days = scan.nextInt();
                       
            if(days>2){
              double cash1=90*days;
              discount=0.20;
   	          amount=  (cash1*discount);
   	          System.out.println("You get an offer of 12% from the total money:"  +amount);
            }
   	          else
   	            {
   	              c1 = 90*days;
   	              System.out.println("The amount is"+c1);	
   	        }     
            if(days>3){
        	  double c2;
              c2 =82*days;
		      discount=0.12;
		      amount1=  (c2*discount);
		      System.out.println("You get an offer of 12% from the total money: "+amount1);}
              else{
            	  c3 = 82*days;
     	         System.out.println("The amount is"+c3);    
		   	}
        }
        if(amount<amount1){
     	   System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Hyaat" +""+ "for the cost of" +""+amount );
        }
          else{
        	  
        		 System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Hyaat" +""+ "for the cost of" +""+amount1);
        	}
        
                
        if(c1<c3){
      	   System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"The Park" +""+ "for the cost of" +""+c1 );
         }
          else{
         	{
         		System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Hyaat" +""+ "for the cost of" +""+c3);
         	}
         }
              
         if((budget<c1)||(budget<c3)){
            System.out.println("'Sorry! you dont have sufficient amount to book any hotel'");
          }
         else {
            System.out.println("");
          }
          
//--------------------------------------------------------------------------------------------------------------------------//
            if(ratings ==3) 
            {
            	System.out.println("Available Hotels in rating"+ratings+ "are:");
                System.out.println("* Raddisson");
                System.out.println("* Rain Tree");
                
                System.out.print("Enter the number of days: ");
                int days1 = scan.nextInt();
                           
                if(days1 > 3){
                  double c4=60*days1;
                  discount=0.18;
       	          amount= (c4*0.18);
       	          System.out.println("You get an offer of 18% from the total money : "+amount);
                }
       	          else
       	            {
       	        	  c5 = 60*days1;    
       	        	 System.out.println("The amount is"+c5);	
	        
       	            }    
                if(days1 > 2){
                  double c6;
                  c6=58*days1;
    		      discount=0.15;
    		      amount1= (c6*0.15);
    		      System.out.println("You get an offer of 15% and the amount is: "+amount1);}
                
                  else{
                    c7 = 58*days1;
   		   	        System.out.println("The amount is"+c7);  	 		   	            
      		      }
               
                if(amount<amount1){
          	      System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Raddisson" +""+ "for the cost of" +""+amount );
                 }
                  else{
             	   
             		System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"RainTree" +""+ "for the cost of" +""+amount1);
             	
             }
             
             
                if(c5<c7){
           	      System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Raddisson" +""+ "for the cost of" +""+c5 );
                }
                  else{
            	     
              	  System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Rain Tree" +""+ "for the cost of" +""+c7);
              	}
              
            
                if((budget<c5)||(budget<c7)){
             	  System.out.println("'Sorry! you dont have sufficient amount to book any hotel'");
                }
                  else {
             	    System.out.println("");
                }
            } 
       
 //----------------------------------------------------------------------------------------------------------------------------//     
            if(ratings ==1) 
            {

                System.out.println("Available Hotels in rating"+ratings+ "are:");
                System.out.println("* Accord");
                System.out.println("* Fortune");
                
                System.out.print("Enter the number of days: ");
                int days2 = scan.nextInt();
                
                if(days2 > 3){
                  double c8=41.55*days2;
                  discount=0.118;
       	          amount= (c8*discount);
       	          System.out.println("You get an offer of 11.8% from the total money:" +amount);
                }
       	          else {
     			    c9 = 41.55*days2;
       	            System.out.println("The amount is"+c9);	
       	          }     
                if(days2 > 4){
                  c9=43*days2;
    		      discount=0.148;
    		      amount1=  (c9*discount);
    		      System.out.println("You get an offer of 14.8% from the total money:" +amount1);}
                else{
    		   	     c10= 43*days2;
  		   	         System.out.println("The amount is"+c10);
    		        }
                 }
            
                 if(amount<amount1){
           	       System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Accord" +""+ "for the cost of" +""+amount );
                 }
                   else{
              	     if(amount1>amount){
              		   System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Fortune" +""+ "for the cost of" +""+amount1);
              	      }
                    }
                            
              if(c9<c10){
                System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Accord" +""+ "for the cost of" +""+c9 );
              }
                else{
                 	if(c10<c9){
               		System.out.println("Hotel booked for" +""+"days in"+ "" +ratings+""+"star hotel"+""+"Fortune" +""+ "for the cost of" +""+c10);
               	     }
               	}
                            
              if((budget<amount)&&(budget<amount1)){
          	    System.out.println("'Sorry! you dont have sufficient amount to book any hotel '");
              }
                else{
            	 System.out.println("");
              }
                     
          }
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    