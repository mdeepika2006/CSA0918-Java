import java.util.*;
import java.lang.*;

public class CO2AT2{

    public static void main(String[] args) {

        // String (Immutable)

        String customerName = "Deepika";

        String updatedName = customerName + " Murugan";

        System.out.println("----- STRING -----");
        System.out.println("Original Name : " + customerName);
        System.out.println("Updated Name  : " + updatedName);

        System.out.println();


        // StringBuilder (Mutable)

        StringBuilder orderDetails = new StringBuilder();

        orderDetails.append("Product: Laptop");
        orderDetails.append(", Quantity: 1");
        orderDetails.append(", Price: 50000");

        System.out.println("----- STRINGBUILDER -----");
        System.out.println(orderDetails);

        System.out.println();


        // StringBuffer (Mutable and Thread-safe)

        StringBuffer transaction = new StringBuffer();

        transaction.append("Payment Started");
        transaction.append(" -> Payment Verified");
        transaction.append(" -> Order Confirmed");

        System.out.println("----- STRINGBUFFER -----");
        System.out.println(transaction);

        System.out.println();


        // Decision Matrix

        System.out.println("----- DECISION MATRIX -----");

        System.out.println("Immutability");
        System.out.println("String        : Immutable");
        System.out.println("StringBuilder : Mutable");
        System.out.println("StringBuffer  : Mutable");

        System.out.println();

        System.out.println("Thread Safety");
        System.out.println("String        : Thread-safe");
        System.out.println("StringBuilder : Not thread-safe");
        System.out.println("StringBuffer  : Thread-safe");

        System.out.println();

        System.out.println("Memory Usage");
        System.out.println("String        : High");
        System.out.println("StringBuilder : Low");
        System.out.println("StringBuffer  : Low");

        System.out.println();

        System.out.println("Industrial Use");
        System.out.println("String        : Customer names, passwords");
        System.out.println("StringBuilder : HTML, JSON, reports");
        System.out.println("StringBuffer  : Banking and logging");

        System.out.println();

        System.out.println("Recommendation");
        System.out.println("Use String for fixed data.");
        System.out.println("Use StringBuilder for faster execution.");
        System.out.println("Use StringBuffer for thread-safe applications.");
    }
}