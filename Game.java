public class Game
{
  //create arraylist
      MajorCard theFool;
      theFool = new MajorCard("The Fool",
                         "beginning, spontaneity, faith, embracing folly",
                         "OPTIMISM",
                         "",
                         "");
      
     MajorCard theMagician;
     theMagician = new MajorCard("The Magician",
                            "taking action, consciousness, concentration, power",
                            "POWER",
                            "",
                            "");
     MajorCard theHighPriestess;
     theHighPriestess = new MajorCard("The High Priestess",
                                 "serenity, intuition, potential, uncovering a truth/solving a mystery",
                                 "KNOWLEDGE",
                                 "",
                                 "");
     MajorCard theEmpress;
     theEmpress = new MajorCard("The Empress",
                           "motherly love, abundance, sensuality, nature",
                           "LOVE",
                           "",
                           "");
     Card theEmperor;
     theEmperor = new Card("The Emperor",
                           "fatherly love, structure, authority, regulation",
                           "JUSTICE"
                           "",
                           "");
     MajorCard theHierophant;
     theHierophant = new MajorCard("The Hierophant",
                              "education, belief, conformity, identifying with a group",
                              "KNOWLEDGE",
                              "",
                              "");
                               
     MajorCard theLovers;
     theLovers = new MajorCard("The Lovers",
                          "relationship, sexuality, personal beliefs, values",
                          "LOVE",
                          "",
                          "");
     Card theChariot;
     theChariot = new Card("The Chariot",
                           "being victorious, asserting yourself, achieving control",
                           "SUCCESS",
                           "",
                           "");
     MajorCard theStrength;
     theStrength = new MajorCard("Strength",
                            "enduring, being patient, compassion, soft control",
                            "idkman");
     MajorCard theHermit;
     theHermit = new MajorCard("The Hermit",
                          "introspection, seeking something, giving/receiving guidance, solitude",
                          "KNOWLEDGE",
                          "",
                          "");
     MajorCard theWheelOfFortune;
     theWheelOfFortune = new MajorCard("The Wheel of Fortune",
                                  "destiny, turning points, movement, personal vision",
                                  "TRANSFORMATION"
                                  "",
                                  "");
     MajorCard theJustice;
     theJustice = new MajorCard("The Justice",
                           "fairness, responsibility, making decisions, cause and effect",
                           "JUSTICE",
                           "",
                           "");
     MajorCard theHangedMan;
     theHangedMan = new MajorCard("The Hanged Man",
                             "letting go, reversal, suspending action, sacrifice",
                             "",
                             "",
                             "");
     MajorCard theDeath;
     theDeath = new MajorCard("Death",
                         "ending, transition, elimination of excess, accepting the inevitable",
                         "",
                         "",
                         "");
     MajorCard theTemperance;
     theTemperance = new MajorCard("Temperance",
                              "finding middle ground, balance, health, combining forces",
                              "",
                              "",
                              "");
     MajorCard theDevil;
     theDevil = new MajorCard("The Devil",
                         "bondage, materialism, ignorance, hopelessness",
                         "",
                         "",
                         "");
     MajorCard theTower;
     theTower = new MajorCard("The Tower",
                         "sudden change, release, downfall, revelation",
                         "",
                         "",//death, sun, five of pentacles
                         "");//chariot, temperance, star, six of wands, ten of cups
     MajorCard theStar;
     theStar = new MajorCard("The Star",
                        "hope, inspiration, generosity, serenity",
                        "",
                        "",//fool, empress, six of cups, ten of cups
                        "");//devil, tower, moon, two of swords, nine of swords
     MajorCard theMoon;
     theMoon = new MajorCard("The Moon",
                        "fear, illusion, imagination, bewilderment",
                        "",
                        "",//Seven of Cups, Two of Swords, Eight of Swords
                        "");//Star, Sun
     MajorCard theSun;
     theSun = new MajorCard("The Sun",
                       "enlightenment, greatness, vitality, assurance",
                       "",
                       "",//Tower, World, Two of Wands, Six of Wands
                       "");//The Moon, Eight of Cups, Six of Swords, Five of Pentacles
     MajorCard theJudgement;
     theJudgement = new MajorCard("Judgement",
                             "difficult choices, rebirth, inner calling, absolution",
                             "",
                             "",//fool, justice, seven of pentacles
                             "");//death, five of cups, nine of swords
     MajorCard theWorld;
     theWorld = new MajorCard("The World",
                         "integration, accomplishment, involvement, filfillment",
                         "",
                         "",//temperance, sun, nine of cups, ten of cups, ten of pentacles
                         "");//hermit, four of cups, five of wands
     AceCard theAceOfWands;
     theAceOfWands = new AceCard("The Ace of Wands",
                              "creative force, enthusiasm, confidence, courage",
                              "",
                              "");//special meaning if there is another ace with this one
     MinorCard theTwoOfWands;
     theTwoOfWands = new MinorCard("The Two of Wands",
                                   "personal power, boldness, originality",
                                   "",
                                   "",//magician, emperor, chariot, sun
                                   "");//high priestess, hierophant, eight of swords, ten of swords, ten of pentacles
     MinorCard theThreeOfWands;
     theThreeOfWands = new MinorCard("The Three of Wands",
                                     "exploration, foresight, leadership",
                                     "",
                                     "",//fool, emperor, eight of cups, thre of pentacles
                                     "");//two of swords, ten of pentacles
     MinorCard theFourOfWands;
     theFourOfWands = new MinorCard("The Four of Wands",
                                     "celebration, freedom, excitement",
                                     "",
                                     "",//three of cups, two of pentacles
                                     "");//devil, ten of wands, four of cups, six of swords, eight of swords
     MinorCard theFiveOfWands;
     theFiveOfWands = new MinorCard("The Five of Wands",
                                     "disagreement, competition, hassles",
                                     "",
                                     "",//seven of wands, ten of wands, five of swords
                                     "");//temperance, world, two of cups, two of pentacles, three of pentacles
     MinorCard theSixOfWands;
     theSixOfWands = new MinorCard("The Six of Wands",
                                     "triumph, acclaim, pride",
                                     "",
                                     "",//chariot, sun, nine of cups
                                     "");//tower, five of cups, ten of swords, five of pentacles
     MinorCard theSevenOfWands;
     theSevenOfWands = new MinorCard("The Seven of Wands",
                                     "aggression, defiance, conviction",
                                     "",
                                     "",//five of wands, nine of wands, five of swords
                                     "");//high priestess, hanged man, three of pentacles
     MinorCard theEightOfWands;
     theEightOfWands = new MinorCard("The Eight of Wands",
                                     "quick action, conclusion, news",
                                     "",
                                     "",//magician, wheel of fortune, death, eight of cups
                                     "");//high priestess, four of swords, seven of pentacles
     MinorCard theNineOfWands;
     theNineOfWands = new MinorCard("The Nine of Wands",
                                     "defensiveness, perseverance, stamina",
                                     "",
                                     "",//strength, seven of wands, two of swords, eight of pentacles
                                     "");//three of cups, six of cups, eight of cups
     MinorCard theTenOfWands;
     theTenOfWands = new MinorCard("The Ten of Wands",
                                   "overextension, burdens, struggle",
                                   "",
                                   "",//justice, five of wands, six of swords, nine of swords, five of pentacles
                                   "");//fool, hanged man, four of wands, four of swords, seven of swords
     CourtCard thePageOfWands;
     thePageOfWands = new CourtCard("The Page of Wands",
                                   "be creative, be enthusiastic, be confident, be courageous",
                                   "",
                                   "");//court pairs
     CourtCard theKnightOfWands;
     theKnightOfWands = new CourtCard("The Knight of Wands",
                                      "charming/superficial, self-confident/cocky, daring/foolhardy, adventurour/restless, passionate/hot-tempered",
                                      "",
                                      "");
     CourtCard theQueenOfWands;
     theQueenOfWands = new CourtCard("The Queen of Wands",
                                      "attractive, wholehearted, energetic, cheerful, self-assured",
                                      "",
                                      "");
     CourtCard theKingOfWands;
     theKingOfWands = new CourtCard("The King of Wands",
                                      "creative, inspiring, forceful, charismatic, bold",
                                      "",
                                      "");
      AceCard theAceOfCups;
      theAceOfCups = new AceCard("The Ace of Cups",
                                 "emotional force, 
        
    
                            
     
             
     
                             
           //add cards to arraylist
       
       public void play()
     {
       
     }
    }