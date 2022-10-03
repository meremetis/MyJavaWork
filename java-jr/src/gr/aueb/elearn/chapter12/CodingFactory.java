package gr.aueb.elearn.chapter12;

/**
 * Singleton class - Coding factory, the one and only!
 * Coding Factory is an intance-controlled class.
 */
public class CodingFactory {

    //This is the one and only CodingFactory instance;
    private  static final CodingFactory CF = new CodingFactory();

    /**
     * No other instances of this class should be available
     */

    private CodingFactory(){};

    /**
     * Static Factory method that returnes a pre-constructed instance.
     *
     * @return
     *      a single pre-constructed instance
     */

    public static CodingFactory getCodingFactory() {
        return CF;
    }

    /**
     * the public API of this class allows for reistrations
     *
     */

    public void register(){
        System.out.println("register now");
    }
}


