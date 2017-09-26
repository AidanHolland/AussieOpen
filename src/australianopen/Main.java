package australianopen;
import java.util.*;
import java.io.*;

public class Main 
{
    String lines = "";
    GameController gc = GameController.getInstance();
    SaveLoad sl = SaveLoad.getInstance();
    
    public static void main(String[] args) throws IOException
    {
       Main main = new Main();
       main.run();
    }
    
    public void menu()
    {
       System.out.println(lines);
    }
    
    public void run() throws IOException
    {
        int choice;
       
        lines = sl.loadToString("menu.txt");
        
        
        for(;;)
        {
            
            menu();
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    break;
                case 2:
                    gc.createPlayer();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Enter the ID of your player");
                    choice = sc.nextInt();
                    gc.searchPlayer(choice);
                    break;
                case 7:
                    break;
                case 8:
                    return;
                            
                          
            }
        }
        
    }
    
    
}
