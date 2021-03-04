package sample;

public class Main

{

                 public static void main(String[] args)

    {

                       Bookshop bookshop = new Bookshop("Admirała Kowalskiego 15", "Średnia");


             bookshop.get_info();



        Bakery bakery = new Bakery("Łódkowa 23", "Mała");


             bakery.get_info();



        Shop shop = new Shop("Jana z Kolana 20", "Duża");


        shop.get_info();



    }
}