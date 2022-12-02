package GameBlackJack;
//1. создать класс игру, в которой у нас происходит игра
//2. Создаем игроков
//3. Создаём крупье
//4. Добавить игроков и крупье в игру
//5. Добавить колоду карт
//6. Добавить карты в колоду
//7. Раздать каждому игроку по 2 карты на старте
//8. Раздавать каждому игроку по одной карте, пока это требуется
//9. Определить победителя


import GameBlackJack.models.CroupierGJ;
import GameBlackJack.models.GameBJImpl;
import GameBlackJack.models.PlayerImpl;

public class Main {
    public static void main(String[] args) {

        GameBJImpl gameBJ = new GameBJImpl();

         PlayerImpl player1 = new PlayerImpl("Vasya", true);
         PlayerImpl player2 = new PlayerImpl("Petya", true);

         CroupierGJ croupierGJ = new CroupierGJ("Glavni");

         gameBJ.addPlayerInGame(player1);
         gameBJ.addPlayerInGame(player2);
         gameBJ.addPlayerInGame(croupierGJ);

         gameBJ.giveTwoCardsOnHands();

         gameBJ.giveOneCardIfNeedToPlayer();

         gameBJ.printWinner();





    }
}


