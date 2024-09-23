import java.util.Scanner;
public class WhoWantsToBeAMillionaire {

        public static void main(String[] args) {

            final int QUESTIONVALUE = 200000;
            final int X = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("\u001b[31m");
            System.out.println("+-----------------------------+");
            System.out.println("| Questions === Dollar Amount |");
            System.out.println("+-----------------------------+");
            System.out.println("| Question 5 ===== $1,000,000 |");
            System.out.println("+-----------------------------+");
            System.out.println("| Question 4 ======= $800,000 |");
            System.out.println("+-----------------------------+");
            System.out.println("| Question 3 ======= $600,000 |");
            System.out.println("+-----------------------------+");
            System.out.println("| Question 2 ======= $400,000 |");
            System.out.println("+-----------------------------+");
            System.out.println("| Question 1 ======= $200,000 |");
            System.out.println("+-----------------------------+");

            System.out.println("Press ENTER to begin");
            String startGame = scanner.nextLine().toLowerCase();
            while(X == 0)
            {
                System.out.println("\u001b[34m");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("=====================================================");
                System.out.println("You have: $" + (QUESTIONVALUE - 200000));
                System.out.println("=====================================================");
                System.out.println("Question #1:");
                System.out.println("");
                System.out.println("200,000 dollars");
                System.out.println("");
                System.out.println("");
                System.out.println("What is the longest part of cell cycle?");
                System.out.println("");
                System.out.println("A - Meiosis");
                System.out.println("");
                System.out.println("B - Mitosis");
                System.out.println("");
                System.out.println("C - Interphase");
                System.out.println("");
                System.out.println("D - S phase");
                System.out.println("");
                System.out.println("");
                System.out.println("Choose an answer: ");
                String playerChoice = scanner.nextLine().toLowerCase();
                if (playerChoice.equals("c")) {
                    System.out.println("\u001b[32m=========================================");
                    System.out.println("");
                    System.out.println("Correct Answer: You have 200,000 dollars.");
                    System.out.println("");
                    System.out.println("=========================================");
                } else {
                    System.out.println("\u001b[31m=====================================");
                    System.out.println("");
                    System.out.println("Game Over :( ");
                    System.out.println("Incorrect Answer: You have 0 dollars.");
                    System.out.println("");
                    System.out.println("=====================================");
                    System.exit(0);
                }
                System.out.println("");
                System.out.println("Do you want to continue y(yes) or n(no): ");
                String answer = scanner.nextLine().toLowerCase();
                System.out.println("");

                if (answer.equals("y")) {
                    System.out.println();
                } else {
                    System.out.println("\u001b[32mYou walk away with 200,000 dollars.");
                    System.exit(0);
                }

                if (playerChoice.equals("c") && answer.equals("y")) {
                    System.out.println("\u001b[31m");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("=====================================================");
                    System.out.println("You have: $" + (QUESTIONVALUE * 1));
                    System.out.println("=====================================================");
                    System.out.println("Question #2:");
                    System.out.println("");
                    System.out.println("400,000 dollars");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("How many meters are in a mile?");
                    System.out.println("");
                    System.out.println("A - 2000");
                    System.out.println("");
                    System.out.println("B - 1600");
                    System.out.println("");
                    System.out.println("C - 1500");
                    System.out.println("");
                    System.out.println("D - 1800");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Choose an answer: ");
                    String playerChoice1 = scanner.nextLine().toLowerCase();

                    if (playerChoice1.equals("b")) {
                        System.out.println("\u001b[32m=========================================");
                        System.out.println("");
                        System.out.println("Correct Answer: You have 400,000 dollars.");
                        System.out.println("");
                        System.out.println("=========================================");
                    } else {
                        System.out.println("\u001b[31m=====================================");
                        System.out.println("");
                        System.out.println("Incorrect Answer: You have 0 dollars.");
                        System.out.println("");
                        System.out.println("=====================================");
                        System.exit(0);
                    }

                    System.out.println("");
                    System.out.println("Do you want to continue y(yes) or n(no): ");
                    String answer1 = scanner.nextLine().toLowerCase();

                    if (answer1.equals("y") && playerChoice1.equals("b")) {
                        System.out.println("\u001b[34m");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("=====================================================");
                        System.out.println("You have: $" + (QUESTIONVALUE * 2));
                        System.out.println("=====================================================");
                        System.out.println("Question #3:");
                        System.out.println("");
                        System.out.println("600,000 dollars");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("What comes last in PEMDAS?");
                        System.out.println("");
                        System.out.println("A - Addition");
                        System.out.println("");
                        System.out.println("B - Multiplication");
                        System.out.println("");
                        System.out.println("C - Subtraction");
                        System.out.println("");
                        System.out.println("D - A & C");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Choose an answer: ");
                    } else {
                        System.out.println("\u001b[32mYou walk away with 400,000 dollars.");
                        System.exit(0);
                    }
                    String playerChoice2 = scanner.nextLine().toLowerCase();
                    if (playerChoice2.equals("d")) {
                        System.out.println("\u001b[32m=========================================");
                        System.out.println("");
                        System.out.println("Correct Answer: You have 600,000 dollars.");
                        System.out.println("");
                        System.out.println("=========================================");
                    } else {
                        System.out.println("\u001b[31m=====================================");
                        System.out.println("");
                        System.out.println("Game Over :( ");
                        System.out.println("Incorrect Answer: You have 0 dollars.");
                        System.out.println("");
                        System.out.println("=====================================");
                        System.exit(0);
                    }
                    System.out.println("");
                    System.out.println("Do you want to continue y(yes) or n(no): ");
                    String answer2 = scanner.nextLine().toLowerCase();
                    System.out.println("");

                    if (answer2.equals("y") && playerChoice2.equals("d")) {
                        System.out.println("\u001b[31m");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("=====================================================");
                        System.out.println("You have: $" + (QUESTIONVALUE * 3));
                        System.out.println("=====================================================");
                        System.out.println("Question #4:");
                        System.out.println("");
                        System.out.println("800,000 dollars");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Woman got the right to:");
                        System.out.println("");
                        System.out.println("A - Vote");
                        System.out.println("");
                        System.out.println("B - Work");
                        System.out.println("");
                        System.out.println("C - Ear");
                        System.out.println("");
                        System.out.println("D - A & B");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Choose an answer: ");
                    } else {
                        System.out.println("\u001b[32mYou walk away with 600,000 dollars.");
                        System.exit(0);
                    }
                    String playerChoice3 = scanner.nextLine().toLowerCase();

                    if (playerChoice3.equals("a")) {
                        System.out.println("\u001b[32m=========================================");
                        System.out.println("");
                        System.out.println("Correct Answer: You have 800,000 dollars.");
                        System.out.println("");
                        System.out.println("=========================================");
                    } else {
                        System.out.println("\u001b[31m=====================================");
                        System.out.println("");
                        System.out.println("Game Over :( ");
                        System.out.println("Incorrect Answer: You have 0 dollars.");
                        System.out.println("");
                        System.out.println("=====================================");
                        System.exit(0);
                    }
                    System.out.println("");
                    System.out.println("Do you want to continue y(yes) or n(no): ");
                    String answer3 = scanner.nextLine().toLowerCase();
                    System.out.println("");

                    if (answer3.equals("y") && playerChoice3.equals("a")) {
                        System.out.println("\u001b[34m");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("=====================================================");
                        System.out.println("You have: $" + (QUESTIONVALUE * 4));
                        System.out.println("=====================================================");
                        System.out.println("Question #5:");
                        System.out.println("");
                        System.out.println("1,000,000 dollars");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("What is the proper way to write an if statement?");
                        System.out.println("");
                        System.out.println("A - Condition(if){statement;}");
                        System.out.println("");
                        System.out.println("B - If(condition){statement;}");
                        System.out.println("");
                        System.out.println("C - Condition(statement){if;}");
                        System.out.println("");
                        System.out.println("D - If(statement){condition;}");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Choose an answer: ");
                    } else {
                        System.out.println("\u001b[32mYou walk away with 800,000 dollars.");
                        System.exit(0);
                    }
                    String playerChoice4 = scanner.nextLine().toLowerCase();

                    if (playerChoice4.equals("b")) {
                        System.out.println("\u001b[32m=========================================");
                        System.out.println("");
                        System.out.println("Correct Answer: You have 1,000,000 dollars.");
                        System.out.println("");
                        System.out.println("=========================================");
                    } else {
                        System.out.println("\u001b[31m=====================================");
                        System.out.println("");
                        System.out.println("Game Over :( ");
                        System.out.println("Incorrect Answer: You have 0 dollars.");
                        System.out.println("");
                        System.out.println("=====================================");
                        System.exit(0);
                    }

                    if (playerChoice4.equals("b")) {
                        System.out.println("\u001b[32m");
                        System.out.println("Congrats!");
                        System.out.println("");
                        System.out.println("You are now a millionare!");
                        System.exit(0);
                    } else {
                        System.out.println("You walk away with 800,000 dollars.");
                        System.exit(0);
                    }

                }
            }
        }
    }
