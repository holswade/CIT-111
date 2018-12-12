/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *This class just shows things about these cats
 * @author lauren.holswade319
 */
public class Cat {
    boolean sleeping;
    public String age;
    public String size;
    boolean climbing;
    boolean isCatFed;
    private double height;
    double jump;
    public String name;
    
    public static void displayTabby(){
        System.out.println("CATS");
        System.out.println("../\\,,,,,,./\\.");
        System.out.println(" .( = 'o'=  )");
        System.out.println(".   (''),,('')");
        System.out.println("',  | |   | |");
        System.out.println(".   | ,,,,.|");
        System.out.println(".   |,,,,,.|");        
        System.out.println(".(,,)|" + "|(,,)");
        System.out.println("  ||    ||");
        System.out.println(". .. ((...");
        System.out.println(". . . ))..");
        System.out.println(". . . ((..");
        System.out.println(". . .  @.. ");
        // to make this you have to make a line each time you want to draw the art
    }
    
    
    public static void displaySunny(){
      
        System.out.println("       |\\      _,,,---,,_");
        System.out.println("ZZZzz  /,`.-'`'    -.  ;-;;,_");
        System.out.println("       |,4-  ) )-,_. ,\\ (  `'-'");
        System.out.println("       '---''(_/--'  `-'\\_)");
    // look a kitty is printed sleeping, 
    
    }
    
    public static void displayMissy(){
        
        System.out.println("                            /^--^\\     /^--^\\     /^--^\\");                   
        System.out.println("                            \\____/     \\____/     \\____/");            
        System.out.println("                            /      \\   /      \\   /      \\");           
        System.out.println("                           |        | |        | |        |");          
        System.out.println("                           \\__  __/   \\__  __/   \\__  __/");           
        System.out.println("    |^|^|^|^|^|^|^|^|^|^|^|^\\ \\^|^|^|^/ /^|^|^|^|^\\ \\^|^|^|^|^|^|^|^|^|^|^|^|");
        System.out.println("    | | | | | | | | | | | | |\\ \\| | |/ /| | | | | | \\ \\ | | | | | | | | | | |");
        System.out.println("        | | | | | | | | | | |/ / | | |  \\ \\| | | | | |/ /| | | | | | | | | | | |");
        System.out.println("         | | | | | | | | | | | | \\/| | | | \\/| | | | | |\\/ | | | | | | | | | | | |");
        System.out.println("        #########################################################################");
        System.out.println("    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
        System.out.println("    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
        
        
        
        
    }//close main
    
    public void giveCatFood(){
        isCatFed = true;
        System.out.println("Meow...meowwwwwww.... m e o w!<3<3<3 ");
        }//close method
    // this line shows the cat is loving
    public void dontGiveCatFood(){
        isCatFed = false;
        System.out.println("REOWWWWW!!!!!!! HISSSSSS!!!!!!!!!! ");
    }//close method
    // this line shows the cat is mad
    public boolean sleeping(){
        return isCatFed;
        }
    
    public double climb(int numFoot){
    height = height + numFoot;
    return height;
    }
    public double jump(int maxHeight){
    jump = jump + maxHeight; 
     } 
   
}//close class
