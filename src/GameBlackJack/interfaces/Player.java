package GameBlackJack.interfaces;

public interface Player {
    void takeCard (Card card);
    int countValuesOfAllCarsOnHands();
    boolean needCard();
    void showCardsOnHand();
    boolean isCroupier();
}
