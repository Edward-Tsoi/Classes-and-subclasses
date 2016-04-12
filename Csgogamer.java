public class Csgogamer extends Gamer{
  public enum Position{ONE, TWO, THREE, FOUR, FIVE};
  
   private Position position;
  private double kda;
  private String teamname;
  private int score;
   private int teamscore;
  
  public Csgogamer(Gender gender, int age, String name, Position position, double kda, String teamname, int score, int teamscore){
    super(gender, age, name);
    this.position = position;
    this.kda = kda;
    this.teamname= teamname;
    this.score= score;
  }
  
  public Position getPosition(){return this.position;}
  public double getKda(){return this.kda;}
  public String getTeamname(){return this.teamname;}
  public int getScore(){return this.score;}
  public int getTeamscore(){return this.teamscore;}
  
  public void intro(){
    System.out.println("Hello my name is " + this.getName() + ".  I am a csgo gamer.");
  }
  
}