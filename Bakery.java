package sample;

public class Bakery extends Shop
{


                   private String[] products_nor = {"Chipsy", "Hamubrger", "Cistako", "Kawa", "Herbata"};


               Bakery(String address_nor, String size_nor)

    {


                       super(address_nor, size_nor);

    }


                public void get_info()


    {

                           super.get_info();


                       System.out.println("Jedzenie i ciepłe napoje na sprzedaż");


                              for (String i : products_nor)

        {
                System.out.println(i);
        }

    }
}