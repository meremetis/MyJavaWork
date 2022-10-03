package gr.aueb.elearn.chapter17.ColectionsStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens","London",   "Paris");
        //list of epistrefei ena list pou einai amodifiable --oxi add - oxi remove mono traverse
        List<String> cities2 = new ArrayList<>(List.of("Athens","London",   "Paris"));
        //cities 2 giati panw htan imutable etsi notw na kanw crud




        List<Product> products = new ArrayList<>();
        products.add(new Product("Apples" , 8.500D, 10));
        products.add(new Product("Apples" , 8.500D, 20));
        products.add(new Product("Apples" , 8.500D, 40));
        products.add(new Product("Milk" , 2.20D, 4));
        products.add(new Product("Honey" , 15D, 2));




        List<Product> honeyProduxts = products.stream()
                 .filter(product -> product.getDescription().equals("Honey"))
                .map(e -> new Product(e.getDescription(),e.getPrice() + e.getPrice() * 0.1 , e.getQuanity()))
              // .sorted(Comparator.comparingInt(Product::getQuanity))
                .collect(Collectors.toList());

        honeyProduxts.forEach(System.out::println);



        int applesCount = products.stream()

                .filter(product -> product.getDescription().equals("Apples"))
                .mapToInt(Product::getQuanity)
                // .sorted(Comparator.comparingInt(Product::getQuanity))
                .sum();

        System.out.println(applesCount);






/**
 * kane map se ena mono pedio
 * px(prices) kai etsi pernw mono prices
 */
        List<Double> priceProducts = products.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());


        priceProducts.forEach(System.out::println);






            /*    .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparingInt(Product::getQuanity))
                .collect(Collectors.toList());*/














/*
        //filtrarw
        *//**
         * ftiaxnw mia lista pou thn exw filtratei
         * kai thn vaze se mIA NEA LISTA
         *//*
        List<Product> appleProducts = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparingInt(Product::getQuanity))
                .collect(Collectors.toList());

        appleProducts.forEach(System.out::println);*/




       /* products.sort(Comparator.comparing(Product::getDescription)
                .thenComparingInt(Product::getQuanity)
                 .thenComparing(Product::getPrice,(a1,a2) -> Double.compare(a2,a1))//adistrefw ta pedia


                .reversed());

        products.forEach(System.out::println);*/
        /***
         * list sort
         */
/*
products.sort(Comparator.naturalOrder());
products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());
        products.forEach(System.out::println);

*/


/***
 * list sort
 */

      /*  //xrisimopiw comparator
        Collections.sort(products,Comparator.naturalOrder());
        products.forEach(System.out::println);

        //reverse order me comparator
        Collections.sort(products,Comparator.reverseOrder());
        products.forEach(System.out::println);*/


/***
 * comparator
 */













/*        //kanw sortingme - vash ton comperable
        Collections.sort(products);
        products.forEach(System.out::println);

        //kanw sorting reverse - me vash ton comperable
        Collections.reverse(products);
        products.forEach(System.out::println);*/


/**
 * compares edw
 *
 *
 *
 */

















        /*Product myProduct = new Product("Apples",5.6D,5);

        //elenxo an iparxei kai meta to kanw remove.
       if (products.contains(myProduct))products.remove(myProduct);

       //vazw sthn thesh 1
        products.set(1, new Product("Oranges",100,35));




        *//**
         * kanw traverse
         *//*
        //1os  tropos
        for (int i =0; i < cities.size();  i++) {
            System.out.println(cities.get(i));
        }

        //2os  tropos enchanced for
        for (String city : cities)
        {
            System.out.println(city);
        }

        //3os tropos - gia string iterator styring gia kati alo alo alo tipou iterator
        Iterator<String> it = cities.iterator();
        while (it.hasNext())
        {
            String city = it.next();
            System.out.println(city);
        }

        //4os troppos

        cities.forEach((city)-> System.out.println(city));//ame lamda
        cities.forEach(System.out::println);//alios me method regerence



        *//** ----DELETE----
         * ean thelw na diagrapsw kati mesa apo thn lista
         * i swstos tropos einai meso iterator
         *//*
        while (it.hasNext())
        {
            String city = it.next();
            if (city.equals("Athens"))
                it.remove();// sthn thesh pou dixnei o iterator kane remove
            System.out.println(city);
        }


        //me ton panw tropo remove
        *//**
         * oxi
         * v Oxi
         *//*
        while (it.hasNext())
        {
            String city = it.next();
            if (city.equals("Athens"))
                cities.remove(city);// sthn thesh pou dixnei o iterator kane remove ----OXI AUTO TON TROPO GIATI SPAEI H LISTA----
            System.out.println(city);
        }



            *//** 2OS TROPOS REMOVE
         * cities remove alos tropos
         *to c einai tipikh parametros
         *to c einai tipikh parametros
         *//*


        cities2.removeIf(c -> c.equals(("London")));*/




    }

}
