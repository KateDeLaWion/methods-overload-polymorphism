public class methodOverload {

    public static int keychains = 0;

    static void buyKeychain(){
        keychains++;
        System.out.println("You bought a keychain!");
        System.out.println("You have " + keychains + " Keychains in your cart.");
    }

    static void buyKeychain(int quantity){
        keychains += quantity;
        System.out.println("You bought " + quantity + " keychains!");
        System.out.println("You have " + keychains + " Keychains in your cart.");
    }



}
