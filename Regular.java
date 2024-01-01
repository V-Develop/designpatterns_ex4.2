public class Regular implements ICustomerServe {
    @Override
    public String mailNotification() {
        return "Regular Customer Mail";
    }

    @Override
    public String brochureNotification() {
        return "Regular Customer Brochure";
    }
}
