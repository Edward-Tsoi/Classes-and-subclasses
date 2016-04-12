public class HelloGamers{
  
  public static void main(String[] args){
    
    Lolgamer Clearlove = new Lolgamer(Gamer.Gender.MALE, 19, "Clearlove", Lolgamer.Position.JUNGLE, 9.9, "EDG");
    Clearlove.intro();
    
    Csgogamer Jw = new Csgogamer(Gamer.Gender.MALE, 17, "JW", Csgogamer.Position.FIVE, 7.8, "Fnatic",32,184);
    Jw.intro();
    
    
  }
  
}