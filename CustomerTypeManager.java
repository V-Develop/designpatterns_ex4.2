public class CustomerTypeManager {
    private ICustomerServe customerServe;

    public void setCustomerServe(ICustomerServe customerServe) {
        this.customerServe = customerServe;
    }

    public void perform() {
        customerServe.mailNotification();
        customerServe.brochureNotification();
    }
}
