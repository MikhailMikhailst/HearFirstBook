package GameGuess;

public class GameGuess {
    Player p1;//gbrt
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;


        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();


            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("У нас есть победитель!");
            }

            if (p1isRight) {
                System.out.println("Первый игрок угадал, что это число : " + targetNumber);

        }
            if (p2isRight) {
                System.out.println("Второй игрок угадал, что это число " + targetNumber);
            }
            if (p3isRight) {
                System.out.println("Третий игрок угадал, что это число " + targetNumber);
            }

            if (p1isRight || p2isRight || p3isRight) {




                System.out.println("Конец игры.");
                break; // прерываем цикл

            } else {
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }
    }
}