package reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Command add10Command = new Add10Command();
        Command multiplyBy2Command = new MultiplyBy2Command();
        Command incrementCommand = new IncrementCommand();

        int counter = 0;

        int option = 0;

        Stack<Command> stack = new Stack<>();


        while (option != 5) {
            System.out.println("\nValor actual: " + counter);
            System.out.println("Elige alguna opción:");
            System.out.println("1. Incrementa en uno el contador");
            System.out.println("2. Multiplica por 2 el contador");
            System.out.println("3. Añade 10 al contador");
            System.out.println("4. Deshacer último cambio");
            System.out.println("5. Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    counter = incrementCommand.execute(counter);
                    stack.add(incrementCommand);
                    break;
                case 2:
                    counter = multiplyBy2Command.execute(counter);
                    stack.add(multiplyBy2Command);
                    break;
                case 3:
                    counter = add10Command.execute(counter);
                    stack.add(add10Command);
                    break;
                case 4:
                    if (!stack.isEmpty()) {
                        Command lastCommand = stack.pop();
                        counter = lastCommand.unxecute(counter);
                    } else {
                        System.out.println("No hay cambios que deshacer");
                    }
                    break;
            }
        }
    }


}

