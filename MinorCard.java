public class MinorCard extends Card
  {
    public String myReinforcers;
    public String myOpposers;
    
    public MinorCard(String name, String def, String type, String reinforcers, String opposers)
    {
      myName = name;
      myDef = def;
      myType = type;
      myReinforcers = reinforcers;
      myOpposers = opposers;
    }
}