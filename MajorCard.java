public class MajorCard implements Card
  {
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

/*
use CardName.indexOf(TheStar) or something like that
  if its greater than negative one it's found
  
  greater than negative 1, the card IS found
  then you can have it trigger a sentance
  

indexOf(String str)*/