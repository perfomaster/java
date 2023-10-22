package examples;
public class userScript {
    public static void main(String[] args) {
        vendor vm = new vendor();
        // ADD PRODUCT - CHOCOLATE KINDER
        vm.addProduct(new choco("KINDER", 40, 50));

        // ADD PRODUCT - CHOCOLATE KINDER
        vm.addProduct(new product("PINEAPPLE", 20));
        
        // ADD PRODUCT - CHOCOLATE KINDER
        vm.addProduct(new product("MELON", 30));
        
        // ADD PRODUCT - CHOCOLATE KINDER
        vm.addProduct(new drink("WATER", 40, 0.5, drinkType.COLDTEA));
        
        
        System.out.println(vm);

    }
}