package enumeratedtypes;

public class EnumOrder {
    Currency currency;

    public EnumOrder(Currency currency) { this.currency = currency;}

    public static void main(String[] args) {
        EnumOrder
                plain = new EnumOrder(Currency.RUB),
                greenChile = new EnumOrder(Currency.EUR),
                jalapeno = new EnumOrder(Currency.AFN);

        plain.describe();
        greenChile.describe();
        jalapeno.describe();

    }

    public void describe() {
        System.out.print("This Currency is ");
        switch(currency) {
            case RUB: System.out.println("not spicy at all.");
                break;
            case AFN:
            case EUR: System.out.println("a little hot.");
                break;
            case GBP:
            case AMD:
            case AOA:
            default: System.out.println("maybe too hot.");
        }
    }

}
