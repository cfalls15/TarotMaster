public class TarotMaster
{
  public class Card
  {
    public String myName;
    public String myDef;
    public String myType;
    
    public Card(String name, String def, String type)
    {
      myName = name;
      myDef = def;
      myType = type;
    }
    
    public static void main( String[] args )
    {
      Card theFool;
      theFool = new Card( "The Fool",
                         "new beginnings, discovery, and optimism",
                         "OPTIMISM");
    }
        
      
  }
}