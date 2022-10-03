package gr.aueb.elearn.chapter15.soaarraylist.fontend;

import gr.aueb.elearn.chapter15.soaarraylist.dao.ContactDAOImpl;
import gr.aueb.elearn.chapter15.soaarraylist.dao.IContactDao;
import gr.aueb.elearn.chapter15.soaarraylist.dto.ContactDTO;
import gr.aueb.elearn.chapter15.soaarraylist.model.Contact;
import gr.aueb.elearn.chapter15.soaarraylist.service.ContactServiceImpl;
import gr.aueb.elearn.chapter15.soaarraylist.service.IContactService;
import gr.aueb.elearn.chapter15.soaarraylist.service.exception.ContactAlreadyExistsException;
import gr.aueb.elearn.chapter15.soaarraylist.service.exception.ContactNotExistException;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class main {
    private static final Scanner in = new Scanner(System.in);
    private static final IContactDao contactDAO = new ContactDAOImpl();
    private static final IContactService service = new ContactServiceImpl(contactDAO);


    public static void printMenu()
    {
        System.out.println("Epilekste ena apo ta parakatw!");
        System.out.println("1. Eisagogh epafhs");
        System.out.println("2. Diagrafh epafhs");
        System.out.println("3. Enhmerwsh epafhs");
        System.out.println("4. Anazitish epafhs me kodiko");
        System.out.println("5. Ektiposh epafwn");
        System.out.println("6. Eksodos");
    }

    public static int getChoice()
    {
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
        return -1;
    }

    public static String getFirstname()
    {
        System.out.println("eisagete onoma");
        return in.next();
    }

    public static String getLastname()
    {
        System.out.println("eisagete epwnimo");
        return in.next();
    }

    public static int getId(){
        System.out.println("eisagete id");
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
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

    public static void main(String[] args) {
        int choice = 0;
        ContactDTO contactDTO;

        do {
            printMenu();
            choice = getChoice();


            switch (choice)
            {
                case 1:
                    try {
                        contactDTO = new ContactDTO(getId(),getFirstname(),getLastname());
                        service.insertContact(contactDTO);
                    }catch (ContactAlreadyExistsException e)
                    {
                        System.out.println("Contact already exist");
                    }
                    break;
                case 2:
                    try{
                        int id = getId();
                        service.deleteContact(id);
                    }catch (ContactNotExistException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try{
                        contactDTO = new ContactDTO(getId(),getFirstname(),getLastname());
                        Optional<Contact> contact = service.updateContact(contactDTO);

                        contact.ifPresent(c -> System.out.println("old contact " + c + "was updated"));
                    }catch (ContactNotExistException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try{
                        int id = getId();
                        Optional<Contact> contact = service.getOneContact(id);
                        contact.ifPresent(System.out::println);
                    }catch (ContactNotExistException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                        List<Contact> contacts = service.getAllContacts();
                        contacts.forEach(System.out::println);
                        break;
                case 6:
                    System.out.println("epileksate eksodo");
                    break;
                default:
                    System.out.println("epilekste metaksi 1-6");
                    break;
            }
        }while (choice != 6);
    }

}
