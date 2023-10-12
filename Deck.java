import java.util.ArrayList;
import java.util.Collections;
public class Deck{
  private ArrayList <Card> Holds = new ArrayList <Card>();
  
  public Deck(){
    Card sAce = new Card(11,'s', "ace");
    Card s2 = new Card(2,'s',"two");
    Card s3 = new Card(3,'s',"three");
    Card s4 = new Card(4,'s',"four");
    Card s5 = new Card(5,'s',"five");
    Card s6 = new Card(6,'s', "six");
    Card s7 = new Card(7,'s',"seven");
    Card s8 = new Card(8,'s',"eight");
    Card s9 = new Card(9,'s',"nine");
    Card s10 = new Card(10,'s',"ten");
    Card sJack = new Card(10,'s',"jack");
    Card sQueen = new Card(10,'s',"queen");
    Card sKing = new Card(10,'s',"king");
    
    Card cAce = new Card(11,'c',"ace");
    Card c2 = new Card(2,'c',"two");
    Card c3 = new Card(3,'c',"three");
    Card c4 = new Card(4,'c',"four");
    Card c5 = new Card(5,'c',"five");
    Card c6 = new Card(6,'c',"six");
    Card c7 = new Card(7,'c',"seven");
    Card c8 = new Card(8,'c',"eight");
    Card c9 = new Card(9,'c',"nine");
    Card c10 = new Card(10,'c',"ten");
    Card cJack = new Card(10,'c',"jack");
    Card cQueen = new Card(10,'c',"queen");
    Card cKing = new Card(10,'c',"king");

    Card hAce = new Card(11,'h',"ace");
    Card h2 = new Card(2,'h',"two");
    Card h3 = new Card(3,'h',"three");
    Card h4 = new Card(4,'h',"four");
    Card h5 = new Card(5,'h',"five");
    Card h6 = new Card(6,'h',"six");
    Card h7 = new Card(7,'h',"seven");
    Card h8 = new Card(8,'h',"eight");
    Card h9 = new Card(9,'h',"nine");
    Card h10 = new Card(10,'h',"ten");
    Card hJack = new Card(10,'h',"jack");
    Card hQueen = new Card(10,'h',"queen");
    Card hKing = new Card(10,'h',"king");

    Card dAce = new Card(11,'d',"ace");
    Card d2 = new Card(2,'d',"two");
    Card d3 = new Card(3,'d',"three");
    Card d4 = new Card(4,'d',"four");
    Card d5 = new Card(5,'d',"five");
    Card d6 = new Card(6,'d',"six");
    Card d7 = new Card(7,'d',"seven");
    Card d8 = new Card(8,'d',"eight");
    Card d9 = new Card(9,'d',"nine");
    Card d10 = new Card(10,'d',"ten");
    Card dJack = new Card(10,'d',"jack");
    Card dQueen = new Card(10,'d',"queen");
    Card dKing = new Card(10,'d',"king");
    
    Holds.add(sAce);
    Holds.add(s2);
    Holds.add(s3);
    Holds.add(s4);
    Holds.add(s5);
    Holds.add(s6);
    Holds.add(s7);
    Holds.add(s8);
    Holds.add(s9);
    Holds.add(s10);
    Holds.add(sJack);
    Holds.add(sQueen);
    Holds.add(sKing);

    Holds.add(cAce);
    Holds.add(c2);
    Holds.add(c3);
    Holds.add(c4);
    Holds.add(c5);
    Holds.add(c6);
    Holds.add(c7);
    Holds.add(c8);
    Holds.add(c9);
    Holds.add(c10);
    Holds.add(cJack);
    Holds.add(cQueen);
    Holds.add(cKing);

    Holds.add(hAce);
    Holds.add(h2);
    Holds.add(h3);
    Holds.add(h4);
    Holds.add(h5);
    Holds.add(h6);
    Holds.add(h7);
    Holds.add(h8);
    Holds.add(h9);
    Holds.add(h10);
    Holds.add(hJack);
    Holds.add(hQueen);
    Holds.add(hKing);

    Holds.add(dAce);
    Holds.add(d2);
    Holds.add(d3);
    Holds.add(d4);
    Holds.add(d5);
    Holds.add(d6);
    Holds.add(d7);
    Holds.add(d8);
    Holds.add(d9);
    Holds.add(d10);
    Holds.add(dJack);
    Holds.add(dQueen);
    Holds.add(dKing);
  }
    
  public void shufffleDeck(){
   Card sAce = new Card(11,'s', "ace");
    Card s2 = new Card(2,'s',"two");
    Card s3 = new Card(3,'s',"three");
    Card s4 = new Card(4,'s',"four");
    Card s5 = new Card(5,'s',"five");
    Card s6 = new Card(6,'s', "six");
    Card s7 = new Card(7,'s',"seven");
    Card s8 = new Card(8,'s',"eight");
    Card s9 = new Card(9,'s',"nine");
    Card s10 = new Card(10,'s',"ten");
    Card sJack = new Card(10,'s',"jack");
    Card sQueen = new Card(10,'s',"queen");
    Card sKing = new Card(10,'s',"king");
    
    Card cAce = new Card(11,'c',"ace");
    Card c2 = new Card(2,'c',"two");
    Card c3 = new Card(3,'c',"three");
    Card c4 = new Card(4,'c',"four");
    Card c5 = new Card(5,'c',"five");
    Card c6 = new Card(6,'c',"six");
    Card c7 = new Card(7,'c',"seven");
    Card c8 = new Card(8,'c',"eight");
    Card c9 = new Card(9,'c',"nine");
    Card c10 = new Card(10,'c',"ten");
    Card cJack = new Card(10,'c',"jack");
    Card cQueen = new Card(10,'c',"queen");
    Card cKing = new Card(10,'c',"king");

    Card hAce = new Card(11,'h',"ace");
    Card h2 = new Card(2,'h',"two");
    Card h3 = new Card(3,'h',"three");
    Card h4 = new Card(4,'h',"four");
    Card h5 = new Card(5,'h',"five");
    Card h6 = new Card(6,'h',"six");
    Card h7 = new Card(7,'h',"seven");
    Card h8 = new Card(8,'h',"eight");
    Card h9 = new Card(9,'h',"nine");
    Card h10 = new Card(10,'h',"ten");
    Card hJack = new Card(10,'h',"jack");
    Card hQueen = new Card(10,'h',"queen");
    Card hKing = new Card(10,'h',"king");

    Card dAce = new Card(11,'d',"ace");
    Card d2 = new Card(2,'d',"two");
    Card d3 = new Card(3,'d',"three");
    Card d4 = new Card(4,'d',"four");
    Card d5 = new Card(5,'d',"five");
    Card d6 = new Card(6,'d',"six");
    Card d7 = new Card(7,'d',"seven");
    Card d8 = new Card(8,'d',"eight");
    Card d9 = new Card(9,'d',"nine");
    Card d10 = new Card(10,'d',"ten");
    Card dJack = new Card(10,'d',"jack");
    Card dQueen = new Card(10,'d',"queen");
    Card dKing = new Card(10,'d',"king");

    Holds.clear();
      
    Holds.add(sAce);
    Holds.add(s2);
    Holds.add(s3);
    Holds.add(s4);
    Holds.add(s5);
    Holds.add(s6);
    Holds.add(s7);
    Holds.add(s8);
    Holds.add(s9);
    Holds.add(s10);
    Holds.add(sJack);
    Holds.add(sQueen);
    Holds.add(sKing);

    Holds.add(cAce);
    Holds.add(c2);
    Holds.add(c3);
    Holds.add(c4);
    Holds.add(c5);
    Holds.add(c6);
    Holds.add(c7);
    Holds.add(c8);
    Holds.add(c9);
    Holds.add(c10);
    Holds.add(cJack);
    Holds.add(cQueen);
    Holds.add(cKing);

    Holds.add(hAce);
    Holds.add(h2);
    Holds.add(h3);
    Holds.add(h4);
    Holds.add(h5);
    Holds.add(h6);
    Holds.add(h7);
    Holds.add(h8);
    Holds.add(h9);
    Holds.add(h10);
    Holds.add(hJack);
    Holds.add(hQueen);
    Holds.add(hKing);

    Holds.add(dAce);
    Holds.add(d2);
    Holds.add(d3);
    Holds.add(d4);
    Holds.add(d5);
    Holds.add(d6);
    Holds.add(d7);
    Holds.add(d8);
    Holds.add(d9);
    Holds.add(d10);
    Holds.add(dJack);
    Holds.add(dQueen);
    Holds.add(dKing);
    Collections.shuffle(Holds);
    }
  
    public Card getCard(int i){
      return Holds.get(i);
    }
  
  public void removeCard(int i){
    Holds.remove(i);
    }
  
  public int getSize(){
      return Holds.size();
    }
  
  public String toString(){
    String toReturn = new String();
    for(int i = 0; i < Holds.size(); i++)
     toReturn += Holds.get(i).getName() + ", ";

    return toReturn;
      
  }
  }