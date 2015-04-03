import java.util.ArrayList;
import java.util.Scanner;


public class Room {
	// put characters and items into rooms

   	ArrayList<Integer> npc = new ArrayList<Integer>();
   	ArrayList<Room> monster = new ArrayList<Room>();
   	ArrayList<Room> item = new ArrayList<Room>();
   	
 public String searchRoom()
	{
		Scanner scan= new Scanner(System.in);
// if room contains monster, print monster
		return "the room contains ";
		
// if room contains item, print item
// if room contains npc, print npc
		
	}
	
	private int room1;

	   	
		public int assignRoom()
		{
			
			npc.add(room1);
			int count = 0;
			for(int i = 0; i < npc.size()- i; i++)
			{

				npc.add(room1);
				count++;
				System.out.println("Room 1 contains " + room1);
				
			}
			return count;
		}
	

		public static void main (String[] stuff)
		{
			Room room = new Room();
			System.out.println(room.assignRoom());
		}
}




