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
                                 "emotional force, intuition, intimacy, love",
                                 "",
                                 "");
      MinorCard theTwoOfCups;
      theTwoOfCups = new MinorCard("The Two of Cups",
                                    "connection, truce, attraction",
                                    "",
                                    "",// The Lovers, Temperance, The Ten of Cups
                                    "");//The Hermit, the Five of Wands, the Four of Cups, the Five of Cups
      
      MinorCard theThreeOfCups;
      theThreeOfCups = new MinorCard("The Three of Cups",
                                     "exuberance, friendship, community",
                                     "",
                                     "",//The Hierophant, Temperance, Four of Wands, Three of Pentacles
                                     "");//Hermit, Nine of Wands, Three of Swords, Six of Swords, Nine of Swords
      MinorCard theFourOfCups;
      theFourOfCups = new MinorCard("The Four of Cups",
                                    "self-absorption, apathy, going within",
                                    "",
                                    "",//Hermit, Four of Swords, Six of Swords
                                    "");//World, Four of Wands, Two of Cups, Eight of Pentacles
      
      MinorCard theFiveOfCups;
      theFiveOfCups = new MinorCard("The Five of Cups",
                                    "loss, bereavement, regret"
                                    "",
                                    "",//Death, Three of Swords, Six of Swords, Five of Pentacles
                                    "");//Lovers, Judgement, Six of Wands, Two of Cups, Nine of Cups
      MinorCard theSixOfCups;
      theSixOfCups = new MinorCard("The Six of Cups",
                                   "good will, innocence, childhood"
                                   "",
                                   "",//Star, Ten of Cups
                                   "");//Devil, Nine of Wands, Five of Swords, Seven of Swords, Nine of Swords
      MinorCard theSevenOfCups;
      theSevenOfCups = new MinorCard("The Seven of Cups",
                                    "wishful thinking, options, dissipation"
                                    "",
                                    "",//devil, moon, nine of cups
                                    "");//magician, emperor, temperance, four of pentacles, eight of pentacles, nine of pentacles
      MinorCard theEightOfCups;
      theEightOfCups = new MinorCard("The Eight of Cups",
                                    "deeper meaning, moving on, weariness",
                                    "",
                                    "",//Hermit, Death, Three of Wands, Eight of Wands, Six of Swords
                                    "");//Strength, Sun, Nine of Wands
      MinorCard theNineOfCups;
      theNineOfCups = new MinorCard("The Nine of Cups",
                                   "wish fulfillment, satisfaction, sensual pleasure",
                                   "",
                                   "",//empress, lovers, World, Six of Wands, Seven of Cups
                                   "");//The Hermit, the Five of Cups
      MinorCard theTenOfCups;
      theTenOfCups = new MinorCard("The Ten of Cups",
                                  "joy, peace, family",
                                  "",
                                  "",//The Lovers, The Star, the World, the Six of Cups
                                  "");//The Devil, The Tower, The Three of Swords, The Nine of Swords, The Ten of Swords
      CourtCard thePageOfCups;
      thePageOfCups = new CourtCard("The Page of Cups",
                                   "Be Emotional, Be Intuitive, Be Intimate, Be Loving",
                                   "",
                                   "");
      CourtCard theKnightOfCups;
      theKnightOfCups = new CourtCard("The Knight of Cups",
                                     "Romantic/Overemotional, Imaginative/Fanciful, Sensitive/Temperamental, Refined/Overrefined, Introspective/Introverted",
                                     "",
                                     "");
      CourtCard theQueenOfCups;
      theQueenOfCups = new CourtCard("The Queen of Cups",
                                    "loving, tenderhearted, intuitive, psychic, spiritual"
                                    "",
                                    "");
      CourtCard theKingOfCups;
      theKingOfCups = new CourtCard("The King of Cups",
                                   "wise, calm, diplomatic, caring, tolerant",
                                   "",
                                   "");
      AceCard theAceOfSwords;
      theAceOfSwords = new AceCard("The Ace of Swords",
                                  "mental force, truth, justice, fortitude",
                                  "",
                                  "");
      
      MinorCard theTwoOfSwords;
      theTwoOfSwords = new MinorCard("The Two of Swords",
                                    "blocked emotions, avoidance, stalemate",
                                    "",
                                    "",//The Moon, Nine Of Wands, Seven of Swords, Four of Pentacles
                                    "");//The Fool, The Wheel of Fortune, Justice, The Star, the Three of Wands
      MinorCard theThreeOfSwords;
      theThreeOfSwords = new MinorCard("The Three of Swords",
                                      "heartbreak, loneliness, betrayal",
                                      "",
                                      "",//Five of Cups, Nine of Swords, Five of Pentacles
                                      "");//The Lovers, Three of Cups, Ten of Cups
      MinorCard theFourOfSwords;
      theFourOfSwords = new MinorCard("The Four of Swords",
                                     "rest, contemplation, quiet preparation",
                                     "",
                                     "",//The High Priestess, The Hermit, The Hanged Man, The Four of Cups, The Six of Swords, The Seven of Pentacles
                                     "");//The Magician, The Wheel of Fortune, The Eight of Wands, The Ten of Wands, The Two of Pentacles
      MinorCard theFiveOfSwords;
      theFiveOfSwords = new MinorCard("The Five of Swords",
                                     "self-interest, discord, open dishonor",
                                     "",
                                     "",//Five of Wands, Seven of Wands, Seven of Swords
                                     "");// The Emperor, Justice, Temperance, Six of Cups
      MinorCard theSixOfSwords;
      theSixOfSwords = new MinorCard("The Six of Swords",
                                    "the blues, recovery, travel",
                                    "",
                                    "",//Ten of Wands, Four of Cups, Five of Cups, Eight of Cups, Four of Swords, Nine of Swords
                                    "");//Strength, The Sun, Four of Wands, Three of Cups, Two of Pentacles
      MinorCard theSevenOfSwords;
      theSevenOfSwords = new MinorCard("The Seven of Swords",
                                      "running away, being a lone wolf, hidden dishonor",
                                      "",
                                      "",//The Hermit, Two of Swords, Five of Swords, Nine of Pentacles
                                      "");//The Hierophant, Justice, Ten of Wands, Six of Cups
      MinorCard theEightOfSwords;
      theEightOfSwords = new MinorCard("The Eight of Swords",
                                       "restriction, confusion, powerlessness",
                                       "",
                                       "",//The Devil, The Moon, Ten of Swords
                                       "");//The Magician, the Chariot, Two of Wands, Four of Wands, Three of Pentacles
      MinorCard theNineOfSwords;
      theNineOfSwords = new MinorCard("The Nine of Swords",
                                      "worry, guilt, anguish",
                                      "",
                                      "",//The Devil, Ten of Wands, Three of Swords, Six of Swords
                                      "");//The Star, Judgement, Three of Cups, Six of Cups, Ten of Cups
      MinorCard theTenOfSwords;
      theTenOfSwords = new MinorCard("The Ten of Swords",
                                     "hitting rock bottom, victim mentality, martyrdom",
                                     "",
                                     "",//The Hanged Man, Eight of Swords
                                     "");//The Chariot, Two of Wands, Six of Wands, Nine of Cups
      CourtCard thePageOfSwords;
      thePageOfSwords = new CourtCard("The Page of Swords",
                                      "use your mind, be truthful, be just, have fortitude",
                                      "",
                                      "");
                                        
      
      CourtCard theKnightOfSwords;
      theKnightOfSwords = new CourtCard("The Knight of Swords",
                                        "direct/blunt, authoritative/overbearing, incisive/cutting, knowledgeable/opinionated, logical/unfeeling",
                                        "",
                                        "");
      CourtCard theQueenOfSwords;
      theQueenOfSwords = new CourtCard("The Queen of Swords",
                                       "honest, astute, forthright, witty, experienced",
                                       "",
                                       "");
      CourtCard theKingOfSwords;
      theKingOfSwords = new CourtCard("The King of Swords",
                                      "intellectual, analytical, articulate, just, ethical",
                                      "",
                                      "");
      AceCard theAceOfPentacles;
      theAceOfPentacles = new AceCard("The Ace of Pentacles",
                                      "material force, prosperity, practicality, trust",
                                      "",
                                      "");
      MinorCard theTwoOfPentacles;
      theTwoOfPentacles = new MinorCard("The Two of Pentacles",
                                        "juggling, flexibility, fun",
                                        "",
                                        "",//Temperance, Four of Wands
                                        "");//The Hierophant, Five of Wands, Four of Swords, Six of Swords
      MinorCard theThreeOfPentacles;
      theThreeOfPentacles = new MinorCard("The Three of Pentacles",
                                          "teamwork, planning, competence",
                                          "",
                                          "",//The Hierophant, Temperance, Three of Wands, Three of Cups
                                          "");//Five of Wands, Seven of Wands, Eight of Swords, Nine of Pentacles
      MinorCard theFourOfPentacles;
      theFourofPentacles = new MinorCard("The Four of Pentacles",
                                         "possessiveness, control, blocked change",
                                         "",
                                         "",//The Emperor, the Chariot, Two of Swords, Ten of Pentacles
                                         "");//The Fool, The Empress, the Wheel of Fortune, The Hanged Man
      MinorCard theFiveOfPentacles;
      theFiveOfPentacles = new MinorCard("The Five of Pentacles",
                                         "hard times, ill health, rejection",
                                         "",
                                         "The Tower, Ten of Wands, Five of Cups, Three of Swords",
                                         "Strength, Temperance, The Sun, Six of Wands, Seven of Pentacles");
      MinorCard theSixOfPentacles;
      theSixOfPentacles = new MinorCard("The Six of Pentacles",
                                        "having/not having resources, knowledge, power",
                                        "",
                                        "",//The Empress, The World, Ten of Wands, Five of Pentacles, Seven of Pentacles, Ten of Pentacles
                                        "");//no opposing cards bc six of pentacles deals with both sides of the issue
      MinorCard theSevenOfPentacles;
      theSevenOfPentacles = new MinorCard("The Seven of Pentacles",
                                          "assessment, reward, change of direction",
                                          "",
                                          "",//The Empress, Justice, Judgement, Four of Swords
                                          "");//The Wheel of Fortune, Eight of Wands, Five of Pentacles
      
                                            

      MinorCard theEightOfPentacles;
      theEightOfPentacles = new MinorCard("The Eight of Pentacles",
                                          "diligence, knowledge, detail",
                                          "",
                                          "",//The Magician, the Hierophant, Nine of Wands
                                          "");//Four of Cups, Seven of Cups
      MinorCard theNineOfPentacles;
      theNineOfPentacles = new MinorCard("The Nine of Pentacles",
                                         "discipline, self-reliance, refinement",
                                         "",
                                         "",//The Chariot, Seven of Swords
                                         "");//The Empress, Seven of Cups, Three of Pentacles
      MinorCard theTenOfPentacles;
      theTenOfPentacles = new MinorCard("The Ten of Pentacles",
                                        "affluence, permanence, convention",
                                        "",
                                        "",//The Empress, The Hierophant, The Lovers, The World, the Four of Pentacles
                                        "");//Two of Wands, Three of Wands, Five of Pentacles
      CourtCard thePageOfPentacles;
      thePageOfPentacles = new CourtCard("The Page of Pentacles",
                                         "have an effect, be practical, be prosperous, be trusting/trustworthy",
                                         "",
                                         "");
      CourtCard theKnightOfPentacles;
      theKnightOfPentacles = new CourtCard("The Knight of Pentacles",
                                           "unwavering/stubborn, cautious/unadventurous, thorough/obsessive, realistic/pessimistic, hardworking/workaholic",
                                           "",
                                           "");
      CourtCard theQueenOfPentacles;
      theQueenOfPentacles = new CourtCard("The Queen of Pentacles",
                                          "nurturing, bighearted, down-to-earth, resourceful, trustworthy",
                                          "",
                                          "");
      CourtCard theKingOfPentacles;
      theKingOfPentacles = new CourtCard("The King of Pentacles",
                                         "enterprising, adept, reliable, supporting, steady",
                                         "",
                                         "");
        
                                           
      
                                           
      
      
        
                                      
                                    
                                    
                                     
                                   
        
    
                            
     
             
     
                             
           //add cards to arraylist
       
       public void play()
     {
       
     }
    }