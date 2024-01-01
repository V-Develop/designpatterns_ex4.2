public class Delinquent implements ICustomerServe {
    @Override
    public String mailNotification() {
        return "Delinquent Customer Mail";
    }

    @Override
    public String brochureNotification() {
        return "Delinquent Customer Brochure";
    }
}
