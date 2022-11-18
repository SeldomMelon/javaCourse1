package GameBlackJack.interfaces;

public interface GameBJ {
    void addPlayerInGame (Player player); //добавить игрока
    void giveTwoCardsOnHands(); // поздать по 2 карты на старте
    void diveOneCardIfNeedToPlayer(); // раздать по 1 карте если нужно
    void printWinner(); // объявить победителя
}
