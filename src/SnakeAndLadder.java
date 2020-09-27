
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
	   }
	   
	   System.out.println("Player1 wins");
	
     }	

}
