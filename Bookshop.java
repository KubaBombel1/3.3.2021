package sample;

public class Bookshop extends Shop

{


        private String[] products_nor = {"Ciekawi świata z informatyką", "Klasyfikacja ee.08 przygotowanie", "Repetytorium matematyka", "Ciekawostki ze świata informatyki", "Informatyka na czasie"};



               Bookshop(String address_nor, String size_nor)

    {


               super(address_nor, size_nor);



    }


                 public void get_info()

    {


        super.get_info();


                   System.out.println("Ksiązki które posiadamy");


                    for (String i : products_nor)

        {


                System.out.println(i);


        }
    }
}