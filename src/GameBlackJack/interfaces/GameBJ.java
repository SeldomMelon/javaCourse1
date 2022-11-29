package GameBlackJack.interfaces;

import GameBlackJack.models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame (PlayerImpl player); //добавить игрока
    void giveTwoCardsOnHands(); // поздать по 2 карты на старте
    void giveOneCardIfNeedToPlayer(); // раздать по 1 карте если нужно
    void printWinner(); // объявить победителя
}
