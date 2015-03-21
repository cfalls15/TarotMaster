public class MajorCard
  {
    public String myName;
    public String myDef;
    public String myType;
    public String myReinforcers;
    public String myOpposers;
    
    public MajorCard(String name, String def, String type, String reinforcers, String opposers)
    {
      myName = name;
      myDef = def;
      myType = type;
      myReinforcers = reinforcers;
      myOpposers = opposers;
    }
}
//how do I make the card realize that cards in the opposer and reinforcer
//strings are other cards, and not just combinations of letters?
//I need them to be able to recognize when they're in a set with 
//their reinforcer/opposer cards
//there are multiple reinforcer and opposer cards