package reto2;

public class IncrementCommand implements Command{

    @Override
    public int execute(int counter) {
        return counter + 1;
    }

    @Override
    public int unxecute(int counter) {
        return counter - 1;
    }
}
