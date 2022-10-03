package gr.aueb.elearn.chapter17.generic;

public class Main {
    public static void main(String[] args) {
        GenericNode<Integer> intNode = new GenericNode<>();
        //var intnode2 = new GenericNode<Integer>();

        GenericNode<String> strNode = new GenericNode<>();

//        String s = intNode.getItem();
                String s = strNode.getItem();


                Integer[] intArr = {1, 2, 3};
                String[] strArr = {"h1", "h2"};

                printArray(intArr);
                printArray(strArr);
    }


    public static <T> void  printArray(T[] arr)
    {
        for(T arrayItem : arr)
        {
            System.out.println(arrayItem);
        }

    }


    public static void print(GenericNode<? extends Number>  node )//otan den exw eksartiseis borw na valw <?> pou pernaei otidipote mesa se run time borw na ton periorisw me extend se kapio number
            //extends Number frazoume ton telesth ? me extends - h me supper gia klash <? extends Number>
    {
        System.out.println(node.getItem());
    }
}
