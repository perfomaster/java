public class userScript {
    public static void main(String[] args) {
        vendor vm = new vendor();
        vm.addProduct(new product("Яблоко", 20));
        vm.addProduct(new product("Груша", 30));
        vm.addProduct(new drink("Lipton", 40, 0.5, drinkType.COLDTEA));
        vm.addProduct(new choco("Аленка", 40, 50));

        System.out.println(vm);

    }
}