package reto2;

public class Add10Command implements Command{


    @Override
    public int execute(int counter) {
        return counter + 10;
    }

    @Override
    public int unxecute(int counter) {
        return counter - 10;
    }
}
