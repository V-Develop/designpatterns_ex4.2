import java.util.Scanner;

public class CustomerApplication {
    public static void main(String[] args) {
        ICustomerServe customer = getCustomerTypeFromUser();
        if (customer != null) {
            System.out.println(sendMail(customer));
            System.out.println(sendBrochure(customer));
        }
    }

    public static ICustomerServe getCustomerTypeFromUser() {
        ICustomerServe customer = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                customer = CustomerFactory.createCustomerServe("Regular");
                break;
            case 2:
                customer = CustomerFactory.createCustomerServe("Mountain");
                break;
            case 3:
                customer = CustomerFactory.createCustomerServe("Delinquent");
                break;
        }
        inp.close();
        return customer;
    }

    public static String sendMail(ICustomerServe customer) {
        return customer.mailNotification();
    }

    public static String sendBrochure(ICustomerServe customer) {
        return customer.brochureNotification();
    }
}
