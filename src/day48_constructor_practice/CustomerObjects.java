package day48_constructor_practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {

        Customer cs1 = new Customer();
        System.out.println(cs1.toString()); //print with default values that are set in no-args constr
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike",2);// create object & assign values in same statement
        Customer cs3 = new Customer("John", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 2546)};

        //arrayList of Customer objects:
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Fil",1244));
        customerList.add(new Customer("Dasha", 4744));

        //print info of 1st customer object in array & arrayList
        System.out.println(todaysCustomers[0]);
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);// print toString info of all Customer objects

        // for loop
        for(int i=0; i< customerList.size(); i++){
            System.out.println(customerList.get(i));
        }

        //for each loop
        for(Customer each : customerList){
            System.out.println(each);
        }

        //print only names of Customers in the list
        customerList.forEach(each -> System.out.println(each.getName()));
        for(Customer each1 : customerList){
            System.out.println(each1.getName());
        }

    }





}
