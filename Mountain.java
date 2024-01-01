public class Mountain implements ICustomerServe {
    @Override
    public String mailNotification() {
        return "Mountain Customer Mail";
    }

    @Override
    public String brochureNotification() {
        return "Mountain Customer Brochure";
    }
}
