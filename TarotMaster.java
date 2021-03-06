import java.util.Scanner;
import java.util.Random;
public class TarotMaster
{
  
        MajorCard theFool = new MajorCard("The Fool",
                         "beginning, spontaneity, faith, and embracing folly",
                         "optimism and innocence",
                         "",//The Hanged Man, The Star, Judgement, Three of Wands
                         "");//The Hierophant, Death, The Devil, Two of Swords, Four of Pentacles
      
     MajorCard theMagician = new MajorCard("The Magician",
                            "taking action, consciousness, concentration, and power",
                            "power and action",
                            "",//The Chariot, Two of Wands, Eight of Wands, Eight of Pentacles
                            "");//The High Priestess, The Hanged Man, Seven of Cups, Four of Swords, Eight of Swords
     MajorCard theHighPriestess = new MajorCard("The High Priestess",
                                 "serenity, intuition, potential, and uncovering a truth/solving a mystery",
                                 "intuition and mystery",
                                 "",//The Hermit, The Hanged Man, Four of Swords
                                 "");//The Magician, Two of Wands, Seven of Wands, Eight of Wands
     MajorCard theEmpress = new MajorCard("The Empress",
                           "motherly love, abundance, sensuality, and nature",
                           "femininity and nature",
                           "",//The Lovers, The Star, Nine of Cups, Seven of Pentacles, Ten of Pentacles
                           "");//The Emperor, Death, Four of Pentacles, Nine of Pentacles
     MajorCard theEmperor = new MajorCard("The Emperor",
                           "fatherly love, structure, authority, and regulation",
                           "authority and structure",
                           "",//The Hierophant, Justice, Two of Wands, Three of Wands, Four of Pentacles
                           "");//The Empress, Seven of Cups, Five of Swords
     MajorCard theHierophant = new MajorCard("The Hierophant",
                              "education, belief, conformity, and identifying with a group",
                              "conformity and beliefs",
                              "",//The Emperor, Three of Cups, Three of Pentacles, Eight of Pentacles, Ten of Pentacles
                              "");//The Fool, The Lovers, Two of Wands, Seven of Swords, Two of Pentacles
                               
     MajorCard theLovers = new MajorCard("The Lovers",
                          "relationship, sexuality, personal beliefs, and values",
                          "love and union",
                          "",//The Empress, Two of Cups, Nine of Cups, Ten of Cups, Ten of Pentacles
                          "");//The Hierophant, The Hermit, Five of Cups, Three of Swords
     MajorCard theChariot = new MajorCard("The Chariot",
                           "victory, will, self-assertion, and hard control",
                           "determination and victory",
                           "",//The Magician, Two of Wands, Six of Wands, Four of Pentacles, Nine of Pentacles
                           "");//Strength, Hanged Man, Tower, Eight of Swords, Ten of Swords
     MajorCard theStrength = new MajorCard("Strength",
                            "strength, patience, compassion, and soft control",
                            "courage and control",
                            "",//The Hanged Man, Nine of Wands
                            "");//The Chariot, Eight of Cups, Six of Swords, Five of Pentacles
                                
     MajorCard theHermit = new MajorCard("The Hermit",
                          "introspection, seeking something, giving/receiving guidance, and solitude",
                          "soul-searching",
                          "",//The High Priestess, Four of Cups, Eight of Cups, Four of Swords, Seven of Swords
                          "");//The Lovers, The World, Two of Cups, Three of Cups, Nine of Cups
     MajorCard theWheelOfFortune = new MajorCard("The Wheel of Fortune",
                                  "destiny, turning points, movement, and personal vision",
                                  "destiny and transformation",
                                  "",//Eight of Wands
                                  "");//Two of Swords, Four of Swords, Four of Pentacles, Seven of Pentacles
     MajorCard theJustice = new MajorCard("Justice",
                           "fairness, responsibility, making decisions, and cause and effect",
                           "justice and truth",
                           "",//The Emperor, Judgement, Ten of Wands, Nine of Swords, Seven of Pentacles
                           "");//Two of Swords, Five of Swords, Seven of Pentacles
     MajorCard theHangedMan = new MajorCard("The Hanged Man",
                             "letting go, reversal, suspending action, and sacrifice",
                             "suspension and letting go",
                             "",//The Fool, The High Priestess, Strength, Four of Swords, Ten of Swords
                             "");//The Magician, The Chariot, Seven of Wands, Ten of Wands, Four of Pentacles
     MajorCard theDeath = new MajorCard("Death",
                         "ending, transition, elimination of excess, and accepting the inevitable",
                         "endings, new beginnings, and transformation",
                         "",//The Tower, Eight of Wands, Five of Cups, Eight of Cups
                         "");//The Fool, The Empress, Judgement
     MajorCard theTemperance = new MajorCard("Temperance",
                              "finding middle ground, balance, health, and combining forces",
                              "moderation, patience, and purpose",
                              "",//The World, Two of Cups, Three of Cups, Two of Pentacles, Three of Pentacles
                              "");//The Twoer, Five of Wands, Seven of Cups, Five of Swords, Five of Pentacles
     MajorCard theDevil = new MajorCard("The Devil",
                         "bondage, materialism, ignorance, and hopelessness",
                         "lack of freedom and addiction",
                         "",//Seven of Cups, Eight of Swords, Nine of Swords
                         "");//The Fool, The Star, Four of Wands, Six of Cups, Ten of Cups
     MajorCard theTower = new MajorCard("The Tower",
                         "sudden change, release, downfall, and revelation",
                         "upheaval and revelation",
                         "",//death, sun, five of pentacles
                         "");//chariot, temperance, star, six of wands, ten of cups
     MajorCard theStar = new MajorCard("The Star",
                        "hope, inspiration, generosity, and serenity",
                        "renewal and spirituality",
                        "",//fool, empress, six of cups, ten of cups
                        "");//devil, tower, moon, two of swords, nine of swords
     MajorCard theMoon = new MajorCard("The Moon",
                        "fear, illusion, imagination, and bewilderment",
                        "anxiety and insecurity",
                        "",//Seven of Cups, Two of Swords, Eight of Swords
                        "");//Star, Sun
     MajorCard theSun = new MajorCard("The Sun",
                       "enlightenment, greatness, vitality, and assurance",
                       "fun, warmth, and positivity",
                       "",//Tower, World, Two of Wands, Six of Wands
                       "");//The Moon, Eight of Cups, Six of Swords, Five of Pentacles
     MajorCard theJudgement = new MajorCard("Judgement",
                             "difficult choices, rebirth, inner calling, and absolution",
                             "judgement (as you may have guessed)",
                             "",//fool, justice, seven of pentacles
                             "");//death, five of cups, nine of swords
     MajorCard theWorld = new MajorCard("The World",
                         "integration, accomplishment, involvement, and fulfillment",
                         "contemplation and closure",
                         "",//temperance, sun, nine of cups, ten of cups, ten of pentacles
                         "");//hermit, four of cups, five of wands
     AceCard theAceOfWands = new AceCard("The Ace of Wands",
                              "creative force, enthusiasm, confidence, and courage",
                              "inspiration and potential",
                              "");//special meaning if there is another ace with this one
     MinorCard theTwoOfWands = new MinorCard("The Two of Wands",
                                   "personal power, boldness, and originality",
                                   "progress and discovery",
                                   "",//magician, emperor, chariot, sun
                                   "");//high priestess, hierophant, eight of swords, ten of swords, ten of pentacles
     MinorCard theThreeOfWands = new MinorCard("The Three of Wands",
                                     "exploration, foresight, and leadership",
                                     "preparation and enterprise",
                                     "",//fool, emperor, eight of cups, thre of pentacles
                                     "");//two of swords, ten of pentacles
     MinorCard theFourOfWands = new MinorCard("The Four of Wands",
                                     "celebration, freedom, and excitement",
                                     "harmony, perhaps marriage, and community",
                                     "",//three of cups, two of pentacles
                                     "");//devil, ten of wands, four of cups, six of swords, eight of swords
     MinorCard theFiveOfWands = new MinorCard("The Five of Wands",
                                     "disagreement, competition, and hassles",
                                     "tension and conflict",
                                     "",//seven of wands, ten of wands, five of swords
                                     "");//temperance, world, two of cups, two of pentacles, three of pentacles
     MinorCard theSixOfWands = new MinorCard("The Six of Wands",
                                     "triumph, acclaim, and pride",
                                     "victory and confidence",
                                     "",//chariot, sun, nine of cups
                                     "");//tower, five of cups, ten of swords, five of pentacles
     MinorCard theSevenOfWands = new MinorCard("The Seven of Wands",
                                     "aggression, defiance, and conviction",
                                     "competition and perseverance",
                                     "",//five of wands, nine of wands, five of swords
                                     "");//high priestess, hanged man, three of pentacles
     MinorCard theEightOfWands = new MinorCard("The Eight of Wands",
                                     "quick action, conclusion, and news",
                                     "speed, movement, and swift changes",
                                     "",//magician, wheel of fortune, death, eight of cups
                                     "");//high priestess, four of swords, seven of pentacles
     MinorCard theNineOfWands = new MinorCard("The Nine of Wands",
                                     "defensiveness, perseverance, and stamina",
                                     "courage and resilience",
                                     "",//strength, seven of wands, two of swords, eight of pentacles
                                     "");//three of cups, six of cups, eight of cups
     MinorCard theTenOfWands = new MinorCard("The Ten of Wands",
                                   "overextension, burdens, and struggle",
                                   "responsibility and stress",
                                   "",//justice, five of wands, six of swords, nine of swords, five of pentacles
                                   "");//fool, hanged man, four of wands, four of swords, seven of swords
     CourtCard thePageOfWands = new CourtCard("The Page of Wands",
                                   "being creative, being enthusiastic, being confident, and being courageous",
                                   "enthusiasm and discovery",
                                   "");//court pairs
     CourtCard theKnightOfWands = new CourtCard("The Knight of Wands",
                                      "being charming/superficial, being self-confident/cocky, being daring/foolhardy, being adventurour/restless, and being passionate/hot-tempered",
                                      "passion and adventure, but possibly impulsiveness",
                                      "");
     CourtCard theQueenOfWands = new CourtCard("The Queen of Wands",
                                      "being attractive, wholehearted, energetic, cheerful, and self-assured",
                                      "exuberance and vibrancy",
                                      "");
     CourtCard theKingOfWands = new CourtCard("The King of Wands",
                                      "being creative, inspiring, forceful, charismatic, and bold",
                                      "leadership and vision",
                                      "");
      AceCard theAceOfCups = new AceCard("The Ace of Cups",
                                 "emotional force, intuition, intimacy, and love",
                                 "love and perhaps overwhelming emotions",
                                 "");
      MinorCard theTwoOfCups = new MinorCard("The Two of Cups",
                                    "connection, truce, and attraction",
                                    "partnership and love",
                                    "",// The Lovers, Temperance, The Ten of Cups
                                    "");//The Hermit, the Five of Wands, the Four of Cups, the Five of Cups
      
      MinorCard theThreeOfCups = new MinorCard("The Three of Cups",
                                     "exuberance, friendship, and community",
                                     "celebration and friendship",
                                     "",//The Hierophant, Temperance, Four of Wands, Three of Pentacles
                                     "");//Hermit, Nine of Wands, Three of Swords, Six of Swords, Nine of Swords
      MinorCard theFourOfCups = new MinorCard("The Four of Cups",
                                    "self-absorption (not necessarily bad), apathy, and going within",
                                    "meditation and contemplation, but perhaps apathy",
                                    "",//Hermit, Four of Swords, Six of Swords
                                    "");//World, Four of Wands, Two of Cups, Eight of Pentacles
      
      MinorCard theFiveOfCups = new MinorCard("The Five of Cups",
                                    "loss, bereavement, and regret",
                                    "despair and disappointment",
                                    "",//Death, Three of Swords, Six of Swords, Five of Pentacles
                                    "");//Lovers, Judgement, Six of Wands, Two of Cups, Nine of Cups
      MinorCard theSixOfCups = new MinorCard("The Six of Cups",
                                   "good will, innocence, and childhood",
                                   "reunion and nostalgia",
                                   "",//Star, Ten of Cups
                                   "");//Devil, Nine of Wands, Five of Swords, Seven of Swords, Nine of Swords
      MinorCard theSevenOfCups = new MinorCard("The Seven of Cups",
                                    "wishful thinking, options, and dissipation",
                                    "fantasy and imagination",
                                    "",//devil, moon, nine of cups
                                    "");//magician, emperor, temperance, four of pentacles, eight of pentacles, nine of pentacles
      MinorCard theEightOfCups = new MinorCard("The Eight of Cups",
                                    "deeper meaning, moving on, and weariness",
                                    "abandonment and withdrawal",
                                    "",//Hermit, Death, Three of Wands, Eight of Wands, Six of Swords
                                    "");//Strength, Sun, Nine of Wands
      MinorCard theNineOfCups = new MinorCard("The Nine of Cups",
                                   "wish fulfillment, satisfaction, and sensual pleasure",
                                   "comfort and happiness",
                                   "",//empress, lovers, World, Six of Wands, Seven of Cups
                                   "");//The Hermit, the Five of Cups
      MinorCard theTenOfCups = new MinorCard("The Ten of Cups",
                                  "joy, peace, and family",
                                  "harmony, perhaps marriage or family",
                                  "",//The Lovers, The Star, the World, the Six of Cups
                                  "");//The Devil, The Tower, The Three of Swords, The Nine of Swords, The Ten of Swords
      CourtCard thePageOfCups = new CourtCard("The Page of Cups",
                                   "being emotional, being intuitive, being intimate, and being loving",
                                   "creative beginnings and synchronicity",
                                   "");
      CourtCard theKnightOfCups = new CourtCard("The Knight of Cups",
                                     "being romantic/overemotional, being imaginative/fanciful, being sensitive/temperamental, being refined/overrefined, being introspective/introverted",
                                     "romance and charm",
                                     "");
      CourtCard theQueenOfCups = new CourtCard("The Queen of Cups",
                                    "loving, tenderhearted, intuitive, psychic, and spiritual",
                                    "tranquility and compassion",
                                    "");
      CourtCard theKingOfCups = new CourtCard("The King of Cups",
                                   "wise, calm, diplomatic, caring, and tolerant",
                                   "balance, control, and generosity",
                                   "");
      AceCard theAceOfSwords = new AceCard("The Ace of Swords",
                                  "mental force, truth, justice, and fortitude",
                                  "power, victory, and break-throughs",
                                  "");
      
      MinorCard theTwoOfSwords = new MinorCard("The Two of Swords",
                                    "blocked emotions, avoidance, and stalemate",
                                    "indecision and perhaps emotional distance",
                                    "",//The Moon, Nine Of Wands, Seven of Swords, Four of Pentacles
                                    "");//The Fool, The Wheel of Fortune, Justice, The Star, the Three of Wands
      MinorCard theThreeOfSwords = new MinorCard("The Three of Swords",
                                      "heartbreak, loneliness, and betrayal",
                                      "separation and rejection",
                                      "",//Five of Cups, Nine of Swords, Five of Pentacles
                                      "");//The Lovers, Three of Cups, Ten of Cups
      MinorCard theFourOfSwords = new MinorCard("The Four of Swords",
                                     "rest, contemplation, and quiet preparation",
                                     "rest and relaxation",
                                     "",//The High Priestess, The Hermit, The Hanged Man, The Four of Cups, The Six of Swords, The Seven of Pentacles
                                     "");//The Magician, The Wheel of Fortune, The Eight of Wands, The Ten of Wands, The Two of Pentacles
      MinorCard theFiveOfSwords = new MinorCard("The Five of Swords",
                                     "self-interest, discord, and open dishonor",
                                     "conflict and betrayal",
                                     "",//Five of Wands, Seven of Wands, Seven of Swords
                                     "");// The Emperor, Justice, Temperance, Six of Cups
      MinorCard theSixOfSwords = new MinorCard("The Six of Swords",
                                    "the blues, recovery, and travel",
                                    "regretful but necessary transitions",
                                    "",//Ten of Wands, Four of Cups, Five of Cups, Eight of Cups, Four of Swords, Nine of Swords
                                    "");//Strength, The Sun, Four of Wands, Three of Cups, Two of Pentacles
      MinorCard theSevenOfSwords = new MinorCard("The Seven of Swords",
                                      "running away, being a lone wolf, and hidden dishonor",
                                      "betrayal, but also stealth ",
                                      "",//The Hermit, Two of Swords, Five of Swords, Nine of Pentacles
                                      "");//The Hierophant, Justice, Ten of Wands, Six of Cups
      MinorCard theEightOfSwords = new MinorCard("The Eight of Swords",
                                       "restriction, confusion, and powerlessness",
                                       "isolation, possibly self-imposed restriction",
                                       "",//The Devil, The Moon, Ten of Swords
                                       "");//The Magician, the Chariot, Two of Wands, Four of Wands, Three of Pentacles
      MinorCard theNineOfSwords = new MinorCard("The Nine of Swords",
                                      "worry, guilt, and anguish",
                                      "mental illness, possibly depression or anxiety, and nightmares",
                                      "",//The Devil, Ten of Wands, Three of Swords, Six of Swords
                                      "");//The Star, Judgement, Three of Cups, Six of Cups, Ten of Cups
      MinorCard theTenOfSwords = new MinorCard("The Ten of Swords",
                                     "hitting rock bottom, victim mentality, and martyrdom",
                                     "back-stabbings and loss",
                                     "",//The Hanged Man, Eight of Swords
                                     "");//The Chariot, Two of Wands, Six of Wands, Nine of Cups
      CourtCard thePageOfSwords = new CourtCard("The Page of Swords",
                                      "using your mind, being truthful, being just, and having fortitude",
                                      "energy and curiosity",
                                      "");
                                        
      
      CourtCard theKnightOfSwords = new CourtCard("The Knight of Swords",
                                        "being direct/blunt, being authoritative/overbearing, being incisive/cutting, being knowledgeable/opinionated, and being logical/unfeeling",
                                        "hastiness, and being opinionated",
                                        "");
      CourtCard theQueenOfSwords = new CourtCard("The Queen of Swords",
                                       "being honest, astute, forthright, witty, and experienced",
                                       "organization, perception, and independance",
                                       "");
      CourtCard theKingOfSwords = new CourtCard("The King of Swords",
                                      "being intellectual, analytical, articulate, just, and ethical",
                                      "mental clarity and truth",
                                      "");
      AceCard theAceOfPentacles = new AceCard("The Ace of Pentacles",
                                      "material force, prosperity, practicality, and trust",
                                      "manifestation and financial opportunities",
                                      "");
      MinorCard theTwoOfPentacles = new MinorCard("The Two of Pentacles",
                                        "juggling, flexibility, and fun",
                                        "balance and adaptability",
                                        "",//Temperance, Four of Wands
                                        "");//The Hierophant, Five of Wands, Four of Swords, Six of Swords
      MinorCard theThreeOfPentacles = new MinorCard("The Three of Pentacles",
                                          "teamwork, planning, and competence",
                                          "collaboration and learning",
                                          "",//The Hierophant, Temperance, Three of Wands, Three of Cups
                                          "");//Five of Wands, Seven of Wands, Eight of Swords, Nine of Pentacles
      MinorCard theFourOfPentacles = new MinorCard("The Four of Pentacles",
                                         "possessiveness, control, and blocked change",
                                         "stability, security, and conservativism",
                                         "",//The Emperor, the Chariot, Two of Swords, Ten of Pentacles
                                         "");//The Fool, The Empress, the Wheel of Fortune, The Hanged Man
      MinorCard theFiveOfPentacles = new MinorCard("The Five of Pentacles",
                                         "hard times, ill health, and rejection",
                                         "isolation and financial loss, possibly poverty",
                                         "The Tower, Ten of Wands, Five of Cups, Three of Swords",
                                         "Strength, Temperance, The Sun, Six of Wands, Seven of Pentacles");
      MinorCard theSixOfPentacles = new MinorCard("The Six of Pentacles",
                                        "sharing resources, knowledge, and power",
                                        "charity and generosity",
                                        "",//The Empress, The World, Ten of Wands, Five of Pentacles, Seven of Pentacles, Ten of Pentacles
                                        "");//no opposing cards bc six of pentacles deals with both sides of the issue
      MinorCard theSevenOfPentacles = new MinorCard("The Seven of Pentacles",
                                          "assessment, reward, and change of direction",
                                          "perseverance and profit",
                                          "",//The Empress, Justice, Judgement, Four of Swords
                                          "");//The Wheel of Fortune, Eight of Wands, Five of Pentacles
      
                                            

      MinorCard theEightOfPentacles = new MinorCard("The Eight of Pentacles",
                                          "diligence, knowledge, and detail",
                                          "education and quality",
                                          "",//The Magician, the Hierophant, Nine of Wands
                                          "");//Four of Cups, Seven of Cups
      MinorCard theNineOfPentacles = new MinorCard("The Nine of Pentacles",
                                         "culmination, self-reliance, and refinement",
                                         "luxury and self-sufficiency, but gratitude as well",
                                         "",//The Chariot, Seven of Swords
                                         "");//The Empress, Seven of Cups, Three of Pentacles
      MinorCard theTenOfPentacles = new MinorCard("The Ten of Pentacles",
                                        "affluence, permanence, and convention",
                                        "wealth, inheritance, or maybe retirement",
                                        "",//The Empress, The Hierophant, The Lovers, The World, the Four of Pentacles
                                        "");//Two of Wands, Three of Wands, Five of Pentacles
      CourtCard thePageOfPentacles = new CourtCard("The Page of Pentacles",
                                         "having an effect, being practical, being prosperous, and being trusting/trustworthy",
                                         "financial opportunity and manifestation",
                                         "");
      CourtCard theKnightOfPentacles = new CourtCard("The Knight of Pentacles",
                                           "being unwavering/stubborn, cautious/unadventurous, thorough/obsessive, realistic/pessimistic, and hardworking/workaholic",
                                           "efficiency, routine, and conservatism",
                                           "");
      CourtCard theQueenOfPentacles = new CourtCard("The Queen of Pentacles",
                                          "being nurturing, bighearted, down-to-earth, resourceful, and trustworthy",
                                          "practicality and maternal nature",
                                          "");
      CourtCard theKingOfPentacles = new CourtCard("The King of Pentacles",
                                         "being enterprising, adept, reliable, supporting, and steady",
                                         "security and discipline, but abundance",
                                         "");
      

Card[]deck = {theFool, theMagician, theHighPriestess,
              theEmpress, theEmperor, theHierophant,
              theLovers, theChariot, theStrength,
              theHermit, theWheelOfFortune, theJustice, 
              theHangedMan, theDeath, theTemperance,
              theDevil, theTower, theStar,
              theMoon, theSun, theJudgement,
              theWorld, theAceOfWands, theTwoOfWands,
              theThreeOfWands, theFourOfWands, theFiveOfWands,
              theSixOfWands, theSevenOfWands, theEightOfWands,
              theNineOfWands, theTenOfWands, thePageOfWands,
              theKnightOfWands, theQueenOfWands, theKingOfWands,
              theAceOfCups, theTwoOfCups, theThreeOfCups,
              theFourOfCups, theFiveOfCups, theSixOfCups,
              theSevenOfCups, theEightOfCups, theNineOfCups,
              theTenOfCups, thePageOfCups, theKnightOfCups,
              theQueenOfCups, theKingOfCups, theAceOfSwords,
              theTwoOfSwords, theThreeOfSwords, theFourOfSwords,
              theFiveOfSwords, theSixOfSwords, theSevenOfSwords,
              theEightOfSwords, theNineOfSwords, theTenOfSwords,
              thePageOfSwords, theKnightOfSwords, theQueenOfSwords,
              theKingOfSwords, theAceOfPentacles, theTwoOfPentacles, 
              theThreeOfPentacles, theFourOfPentacles, theFiveOfPentacles,
              theSixOfPentacles, theSevenOfPentacles, theEightOfPentacles,
              theNineOfPentacles, theTenOfPentacles, thePageOfPentacles,
              theKnightOfPentacles, theQueenOfPentacles, theKingOfPentacles}; 
  public void run()
  {

      //Game g = new Game();
      //g.play();
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to Tarot Master.  Have you had your tarot cards read before? (y/n)");
    String answer = new String(kb.nextLine().toLowerCase());
    
    if (answer.equals("y") || answer.equals("yes"))
      {
        System.out.println("Then let's begin.");
      }
    if (answer.equals("n") || answer.equals("no"))
      {
        System.out.println("Let me explain.  The setup we're going to use consists of three cards, representing your past, present, and future.  The cards you are dealt are chosen by fate from a deck of 78.");
      }
    System.out.println("To let the cards get to know you, please answer a few questions.  When's your birthday?");
    String birthday = new String(kb.nextLine().toLowerCase());
    System.out.println("What's your name?");
    String name = new String(kb.nextLine().toLowerCase());
    System.out.println("What makes you happy?");
    String happy = new String(kb.nextLine().toLowerCase());
    System.out.println("Okay, I think we're ready to begin.");
    
    Random randomOne = new Random(); //learned about Random from javapractices.com & javadocs
     //pick three random numbers
        int firstRandom = randomOne.nextInt(78);//make sure the numbers aren't the same
        int secondRandom = randomOne.nextInt(78);
        if (secondRandom == firstRandom)
        {
          secondRandom = randomOne.nextInt(78);
        }
        int thirdRandom = randomOne.nextInt(78);
        if (thirdRandom == firstRandom || thirdRandom == secondRandom)
        {
          thirdRandom = randomOne.nextInt(78);
        }
     
 
        Card cardOne = new Card();
        cardOne = deck[firstRandom];
        
        Card cardTwo = new Card();
        cardTwo = deck[secondRandom];
        
        Card cardThree = new Card();
        cardThree = deck[thirdRandom];
        
        
        
        
        //make it so the random number associates itself with the corresponding tarot card
        
        
         System.out.println("Your first card, representing your past, is " + cardOne.getMyName() + ", which signifies " + cardOne.getMyDef() + ".");
         System.out.println("Your second card, representing your present, is " + cardTwo.getMyName() + ", which signifies " + cardTwo.getMyDef() + ".");
         System.out.println("Your third card, representing your future, is " + cardThree.getMyName() + ", which signifies " + cardThree.getMyDef() + ".");
         System.out.println("Basically, this all means that your past was filled with " + cardOne.getMyType() + ".");
         System.out.println("Your present more closely reflects " + cardTwo.getMyType() + ", and your future holds the promise of " + cardThree.getMyType() + ".");

         
         
         //check to see if the cards are dealt with opposers or reinforcers
    
          
        

      
  }
}