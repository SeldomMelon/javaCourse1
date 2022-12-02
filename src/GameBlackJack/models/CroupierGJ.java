package GameBlackJack.models;

public class CroupierGJ extends PlayerImpl {


    public CroupierGJ(String name) {
        super(name, true);
        this.setCroupier(true);
    }

    @Override
    public boolean isCroupier() {

        return true;
    }
}