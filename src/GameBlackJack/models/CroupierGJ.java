package GameBlackJack.models;

public class CroupierGJ extends PlayerImpl {


    public CroupierGJ(String name) {
        super(name);
    }

    @Override
    public boolean isCroupier() {
        return true;
    }
}