import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static Scanner scanner;
    static Menu menu;
    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);

        Buyer buyer = new Buyer("Tae", 1000);
        Buyer buyer2 = new Buyer("Mary", 1000);
        Provider provider = new Provider(100, 20);
        Seller seller = new Seller(200, 0, 700);
        menu = new Menu(buyer, buyer2, provider, seller);

        System.out.println("Доро пожаловать в простую систему бухучета. \n" +
                "В системе есть покупатели: " + buyer.getName() + " и " + buyer2.getName() + ".\n" +
                "У " + buyer.getName() + " " + buyer.getMoney() + " условных единиц. \n" +
                "У " + buyer2.getName() + " " + buyer2.getMoney() + " условных единиц. \n" +
                "Также в системе имеются поставщик и продавец. \n" +
                "У поставщика есть " + provider.getNumberOfPots() + " горшков по " + provider.getPotPrice() + " у.е.\n" +
                "У продавца есть " + seller.getNumberOfPots() + " горшков по " + seller.getPotPrice() + " у.е.\n" +
                space() + "Выберите действие, которое вы хотите совершить: ");

        menu();


    }


    private static void selectMenu(int num) throws Exception {
        switch (num) {
            case 1:
                System.out.println(menu.getBuyerInformation());
                break;
            case 2:
                System.out.println(menu.getProviderInformation());
                break;
            case 3:
                System.out.println(menu.getSellerInformation());
                break;
            case 4:
                System.out.println(menu.buyPotForSeller());
                break;
            case 5:
                System.out.println(menu.buyPotForBuyer());
                break;
            case 6:
                menu.Array();
                break;
            default:
                System.out.println("Введите число из списка меню");
        }
        menu();
    }

    private static void menu() throws Exception {
        System.out.println("1 - Вывод информации о покупателях");
        System.out.println("2 - Вывод информации о поставщике");
        System.out.println("3 - Вывод информации о продавце");
        System.out.println("4 - Покупка горшка продавцом у поставщика");
        System.out.println("5 - Покупка горшка покупателем у продавца");
        System.out.println("6 - Вывод списка операций");
        selectMenu(scanner.nextInt());
    }

    public static String space() {
        return "\n------------------------------------------------\n";
    }
}
