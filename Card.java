//import java.util.ArrayList;
public class Card {
  // 1 - Ace, 2-10, 11 - Jack, 12-Queen, 13-King
  private int value;
   // s - spades, c - clubs, h - hearts, d - diamonds
  private char face;
  private String name;

  public Card() {
    value = 0;
    face = ' ';
    name = "";
  }

  public Card(int v, char f, String n) {
    value = v;
    face = f;
    name = n;
  }

  public String getName() {
    return name;
  }
  public int getValue(){
    return value;
  }
  public String getFace(){
    if(face == 'h')
      return "hearts";
    if(face == 's')
      return "spades";
    if(face == 'c')
      return "clubs";
    if(face == 'd')
      return "diamonds";
    else
      return "";
    
  }

  
}