package gr.aueb.testbed.week1.chapter16.ergasia.FRONTEND;





import gr.aueb.testbed.week1.chapter16.ergasia.DAO.AccountDAOImpl;
import gr.aueb.testbed.week1.chapter16.ergasia.DAO.IGenericDAO;
import gr.aueb.testbed.week1.chapter16.ergasia.DTO.AccountDTO;
import gr.aueb.testbed.week1.chapter16.ergasia.SERVICE.AccountServiceImpl;
import gr.aueb.testbed.week1.chapter16.ergasia.SERVICE.IGenericService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MAIN {
    private static final Scanner in = new Scanner(System.in);
    private static final IGenericDAO accountDAO = new AccountDAOImpl();
    private static final IGenericService service = new AccountServiceImpl(accountDAO);

    public static void printMenu()
    {
        System.out.println("Epilekste ena apo ta parakatw!");
        System.out.println("1. Eisagogh epafhs");
        System.out.println("2. Diagrafh epafhs");
        System.out.println("3. Enhmerwsh epafhs");
        System.out.println("4. Anazitish epafhs me kodiko");
        System.out.println("5. Deposit se account");
        System.out.println("6. withdrow apo account");
        System.out.println("7. Ektiposh epafwn");
        System.out.println("8. Eksodos");
    }

    public static int getChoice()
    {
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
        return -1;
    }

    public static int getId(){
        System.out.println("eisagete id");
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
        return -1;
    }

    public static String getIban()
    {
        System.out.println("eisagete iban");
        return in.next();
    }

    public static String getLastname()
    {
        System.out.println("eisagete epwnimo");
        return in.next();
    }

    public static String getFirstname()
    {
        System.out.println("eisagete onoma");
        return in.next();
    }

    public static String getSsn()
    {
        System.out.println("eisagete ssn");
        return in.next();
    }

    public static double getBalance(){
        System.out.println("eisagete balance");
        String s = in.next();
        if (isInt(s)) return Double.parseDouble(s);
        return -1;
    }


    private static boolean isInt(String s)
    {
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }


    public static void main(String[] args)  {
        int choice = 0;

        AccountDTO accountDTO;



        do {
            printMenu();
            choice = getChoice();

            switch (choice) {
                case 1:


                        service.insertAccount();


                    break;
                case 2:
                    try{
                        int id = getId();
                        service.deleteAccount(id);
                    }catch (AccountNotExistException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try{
                        accountDTO =  new AccountDTO(getId(), getIban(), getLastname(), getFirstname(), getSsn(), getBalance());
                        Optional<Account> account = service.updateAccount(accountDTO);

                        account.ifPresent(c -> System.out.println("old account " + c + "was updated"));
                    }catch (AccountNotExistException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try{
                        int id = getId();
                        Optional<Account> account = service.getOneAccount(id);
                        account.ifPresent(System.out::println);
                    }catch (AccountNotExistException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    try{
//                        int id = getId();
                        Optional<Account> account = service.deposit(getId(),getBalance());
                        account.ifPresent(System.out::println);
                    }catch (AccountNotExistException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    try{
//                        int id = getId();
                        Optional<Account> account = service.withdrow(getId(),getBalance());
                        account.ifPresent(System.out::println);
                    }catch (AccountNotExistException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;




                case 7:
                    List<Account> accounts = service.getAllAccount();
                    accounts.forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("epileksate eksodo");
                    break;
                default:
                    System.out.println("epilekste metaksi 1-6");
                    break;
            }

        }while (choice != 8);
    }
}
