public class AceCard implements Card
  {
    public String myAcePair;
    public String myDef;
    public String myType;
    
    public AceCard(String name, String def, String type, String acePair)
    {
      myName = name;
      myDef = def;
      myType = type;
      myAcePair = acePair;
    }
 }