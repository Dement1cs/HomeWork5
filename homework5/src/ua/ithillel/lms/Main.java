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
                System.out.println("��������� " + clientCard.owner + " �����������, �� ����������� ���������� �����");
                break;
            case "���":
                System.out.println(clientCard.owner + "����� �� �� �Y� ������ �� ����� ������� ��������!!");
                break;
            default:
                System.out.println("����������� ��� ����� ");
        }
    }
}