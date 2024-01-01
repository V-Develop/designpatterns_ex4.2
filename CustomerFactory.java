public class CustomerFactory {
    public static ICustomerServe createCustomerServe(String type) {
        if (type.equals("Regular")) {
            return new Regular();
        } else if (type.equals("Mountain")) {
            return new Mountain();
        } else if (type.equals("Delinquent")) {
            return new Delinquent();
        }
        return null;
    }
}
