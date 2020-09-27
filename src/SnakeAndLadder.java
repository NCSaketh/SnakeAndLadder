
public class SnakeAndLadder {
	static int count1 = 0;
	static int count2 = 0;
	static int pos1 = 1;
	static int pos2 = 1;
	static String p1 = "Player1";
	static String p2 = "Player2";
	
   public static void main(String[] args) {
	   int a = 0;
	   while (pos1 != 100 && pos2 !=  100)
	   {
		   int x = (int)Math.ceil(Math.random()*6);
		   int type = (int)Math.ceil(Math.random()*3);
		   if(a%2==0)
			   player1(x,type);
		   else 
			   player2(x,type);
		   if(type!=2)
			   a++;
		  
	   }
	   
	   if(pos1==100)
	   System.out.println("Player1 wins and number of moves is" + count1);
	   else
	   System.out.println("Player2 wins and number of moves is" + count2);
	   
     }	
 
    public static int player1(int x, int type)  
    {
    	count1++;
    	System.out.println(p1+ ":position is" + pos1);
    	switch(type)
    	{
    	case 1 : 
    		if(pos1 +x <= 100)
    		pos1+=x;
    		break;
    	case 2:	pos1-=x;
    	 if(pos1<0)	
    		 pos1 = 0;
    		break;
    		
    	}
    	return pos1;
    }
   
    public static int player2(int x,int type)
    {
    	count2++;
    	
    	System.out.println(p2+ ":position is" + pos2);
    	switch(type)
    	 {
    	case 1:
    		if(pos2 +x <=100)
    			pos2+=x;
    		break;
    	case 2: pos2-=x;
    	if(pos2<0)
    		pos2=0;
    	break; 		
     	 }
    	return pos2;
    }
}
