package reto2;

public class MultiplyBy2Command implements Command{

        @Override
        public int execute(int counter) {
            return counter * 2;
        }

        @Override
        public int unxecute(int counter) {
            return counter / 2;
        }
}
