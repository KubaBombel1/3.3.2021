package sample;

public class Shop

{
         protected String address_nor;


                   protected String size_nor;


    Shop(String address_nor, String size_nor)

    {

                  this.address_nor = address_nor;


        this.size_nor = size_nor;

    }

         public void get_info()

    {

                        System.out.println("Ulica sklepu, "+ address_nor + " Powierzchnia, "+ size_nor + " powierzchnia");
    }
}