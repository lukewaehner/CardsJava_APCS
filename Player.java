import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Player{
  private int balance;
  private ArrayList <Card> hand = new ArrayList<Card>();
  private ArrayList <Card> dealer = new ArrayList<Card>();

  public Player(){
    balance = 1000;
  }

  public void hit(Deck d){
    int rnm = ((int)(Math.random()*(d.getSize())+1));
    hand.add(d.getCard(rnm));
    d.removeCard(rnm);
    System.out.println("You drew a " + hand.get(hand.size()-1).getName());
  }

  public void dealerHit(Deck d){
    int rnm = ((int)(Math.random()*(d.getSize())+1));
    dealer.add(d.getCard(rnm));
    d.removeCard(rnm);
    System.out.println("The Dealer drew a " + dealer.get(dealer.size()-1).getName() + " of " + dealer.get(dealer.size()-1).getFace());
  }
  
  public void playGame(Deck d){
    Scanner scanner = new Scanner(System.in);
    System.out.println("How much would you like to bet, you currently have: " + getBalance() + " credits");
    int bet = scanner.nextInt();
    while(bet > balance){
      System.out.println("Invalid bet, re-enter");
      bet = scanner.nextInt();}

    balance -= bet;
    scanner.nextLine();
    this.hit(d);
    this.hit(d);
    System.out.println("You are holding " + handValue());
    if(handValue() == 21){
      System.out.println("You have won");
      balance += 2*bet;
       System.out.println("Your running balance is " + getBalance());
      System.out.println("Would you like to play again? Y/N");
    if(scanner.nextLine().toLowerCase().equals("y")){
      hand.clear();
    dealer.clear();
    scanner.nextLine();
      playGame(d);}
      else
    return;}
    while(this.handValue() < 21){
    System.out.println("Would you like to hit or stand?");
    if(scanner.nextLine().toLowerCase().equals("hit"))
      this.hit(d);
      else break;}
    if(handValue()>21){
      System.out.println("You have lost with " + handValue() + ", the dealer has " + dealerValue());
      System.out.println("Your running balance is " + getBalance());
      System.out.println("Would you like to play again? Y/N");
    if(scanner.nextLine().toLowerCase().equals("y")){
      hand.clear();
    dealer.clear();
    scanner.nextLine();
      playGame(d);}
    else{
    return;}}
    this.dealerHit(d);
    this.dealerHit(d);
    while(this.dealerValue() < 17)
      this.dealerHit(d);
    
    if(beatDealer()) {
      System.out.println("You have beat the dealer with " + handValue() + " while they only managed to get, " + dealerValue() + " and won 1.5x your bet congratulaions!");
      balance += 1.5 * bet;}
    else {
      System.out.println("The dealer has beat you with " + dealerValue() + " While you only managed to get " + handValue());}
    System.out.println("Your running balance is " + getBalance());
    hand.clear();
    dealer.clear();
    scanner.nextLine();
    System.out.println("Would you like to play again? Y/N");
    if(scanner.nextLine().toLowerCase().equals("y")){
      playGame(d);
      }
  }
  

  public int handValue(){
    int toReturn = 0;
    for(int i = 0; i < hand.size(); i++)
      toReturn += hand.get(i).getValue();
    return toReturn;
  }
  public int dealerValue(){
    int toReturn = 0;
    for(int i = 0; i < dealer.size(); i++)
      toReturn += dealer.get(i).getValue();
    return toReturn;
  }
  public boolean beatDealer(){
    if(dealerValue() > 21)
      return true;
     else if (handValue() > dealerValue())
      return true;
    else
      return false;
  }
  public void printHand(){
  System.out.print("You are holding ");
    for(int i = 0; i < hand.size(); i++){
      System.out.print("a " + hand.get(i).getName() + ", ");
    }
      System.out.println();
  }
  public void clearHand(){
    for(int i = 0; i < hand.size(); i++)
      hand.remove(i);
  }
  public int getBalance(){
    return balance;
  }
}