package Model;

import Model.Cards.Card;
import java.util.Vector;

public class Player {
  String playerName = "John Smith";

  int soil;
  int gainedSoil = 0;
  int gainedCards = 0;

  Card m_islandCard, m_climateCard;
  Vector<Card> hand;
  Vector<Card> compostPile;
  Vector<Vector<Card>> playerTabulue;

  public String getName() { return playerName; }
  Player() {
    hand = new Vector<Card>();
    compostPile = new Vector<Card>();
    playerTabulue = new Vector<Vector<Card>>();
  }
  public Vector<Card> getHand() { return hand; }
  void setIsland(Card islandCard) { m_islandCard = islandCard; }
  void setClimate(Card cliamteCard) { m_climateCard = cliamteCard; }
  void activePlanting() {}

  void inactivePlanting() {}

  void activeComposting() {}

  void inactiveComposting() {}

  void activeWatering() {}

  void inactiveWatering() {}

  void activeGrowing() {}

  void inactiveGrowing() {}
}
