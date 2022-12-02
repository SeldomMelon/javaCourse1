package GameBlackJack.models;

import GameBlackJack.interfaces.GameBJ;
import GameBlackJack.interfaces.Player;

public class GameBJImpl implements GameBJ {
   PlayerImpl [] playersInGame = new PlayerImpl[3];
   DeckOfCardsImpl deckOfCards = new DeckOfCardsImpl();

   @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }
    @Override
    public void giveTwoCardsOnHands() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                playersInGame[i].takeCard(deckOfCards.randomCards());
                playersInGame[i].takeCard(deckOfCards.randomCards());
            }
        }
    }
    @Override
    public void giveOneCardIfNeedToPlayer() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                while (playersInGame[i].needCard()){
                    playersInGame[i].takeCard(deckOfCards.randomCards());
                }
            }
        }
    }
    @Override
    public void printWinner() {
        for ( PlayerImpl player  : playersInGame ){
            if (player!= null) {
                if(player.countValuesOfAllCarsOnHands() > 21) {
                    player.setInGame(false);

                }
            }
        }
        if (countPlayersInGame() == 1) {
            for (PlayerImpl player : playersInGame) {
                if (player != null && player.isInGame()) {
                    System.out.println("Победил игрок: " + player.getName() );
                    player.showCardsOnHand();
                }
            }
        }

        int bestValue = 0;
        for (PlayerImpl player : playersInGame) {
            if (player != null && player.isInGame()) {
                if (bestValue < player.countValuesOfAllCarsOnHands()) {
                    bestValue = player.countValuesOfAllCarsOnHands();
                }
            }
        }

        for (PlayerImpl player : playersInGame) {
            if (player != null && player.isInGame() && !player.isCroupier) {
                System.out.println("Победил игрок: " + player.getName() );
                player.showCardsOnHand();
            }
        }
    }
    public int countPlayersInGame (){
        int countPlayers = 0;
        for (PlayerImpl player : playersInGame) {
            if (player != null && player.isInGame()) {
                countPlayers++;
            }
        }
        return countPlayers;
    }
}
