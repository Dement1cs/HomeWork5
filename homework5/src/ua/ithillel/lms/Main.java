package ua.ithillel.lms;

public class Main {

    public static void main(String[] args) {
        CreditCard clientCard = new CreditCard();
        clientCard.cardNumber = "7777_7777_7777_7777";
        clientCard.owner = "Denis Varenikov";
        clientCard.type = "VISA";

        switch (clientCard.type) {
            case "VISA":
            case "MasterCard":
                System.out.println("Уважаемый " + clientCard.owner + " поздравляем, вы используете нормальную карту");
                break;
            case "МИР":
                System.out.println(clientCard.owner + "пошел ты на хYй вместе со своим русским кораблем!!");
                break;
            default:
                System.out.println("неизвестный тип карты ");
        }
    }
}