public class Lolgamer extends Gamer{
  
  public enum Position{TOP, JUNGLE, MID, ADC, SUPPORT};
  
  private Position position;
  private double kda;
  private String teamname;
  
  public Lolgamer(Gender gender, int age, String name, Position position, double kda, String teamname){
    super(gender, age, name);
    this.position = position;
    this.kda = kda;
    this.teamname= teamname;
  }
  
  public Position getPosition(){return this.position;}
  public double getKda(){return this.kda;}
  public String getTeamname(){return this.teamname;}
  
  public void intro(){
    System.out.println("Hello my name is " + this.getName() + ".  I'm a lol gamer.");
  }
}