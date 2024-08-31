/*
Invoice number(auto),  company details(auto), price(manual), item details(manual), addresse(manual), date sent(manual), date due(manual)
*/


import java.util.*;
import java.io.FileWriter;
import java.time.ZonedDateTime;


public class InvoiceSoftware {
  static ArrayList a = new ArrayList();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start =0;
    System.out.println("Would you like to start 1-yes, 0-no");
    start = sc.nextInt();
    while(start == 1){
      onAdd();
      System.out.println("Would you like to continue 1-yes, 0-no");
      start = sc.nextInt();
    }
    System.out.println("Would you like to view 1-yes, 0-no");
    int view = sc.nextInt();
    if(view == 1){
      onView();
    }
    System.out.println("Would you like to print csv? 1-yes, 0-no");
    int csvChoice = sc.nextInt();
    if(csvChoice == 1){
      onCSV();
    }

}
  public static void onAdd(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Who is this to?");
    String addressee = sc.nextLine();
    String dateSent = ZonedDateTime.now().toLocalDate().toString();
    String dateDue = ZonedDateTime.now().plusDays(7).toLocalDate().toString();
    char choice = '0';
    System.out.println("What is item 1-PLA, 2-PLA+, 3-Coloured PLA, 0-Others");
    choice = sc.next().charAt(0);
    String item;
    double price;
    switch(choice){
      case '1': 
          item = "PLA";
          price = 1.50;
          break;
        
      case '2':
          item = "PLA +";
          price = 2.50;
          break;
        
      case '3':
          item = "Coloured PLA";
          price = 2.00;
          break;
        
      default:
        System.out.println("What is the price?");
        price=sc.nextDouble();
        System.out.println("What is the item?\n");
        sc.nextLine();
        item = sc.nextLine();
        
        
    }
    
    Invoice invoice = new Invoice(addressee, dateSent, dateDue, item, price);
    a.add(invoice);
  }

  public static void onView(){
    a.forEach(e -> {
      Invoice invoice = (Invoice) e; // Cast to Invoice
      System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
      System.out.println("Company Name: " + invoice.getCompanyName());
      System.out.println("Addressee: " + invoice.getAddressee());
      System.out.println("Date Sent: " + invoice.getDateSent());
      System.out.println("Date Due: " + invoice.getDateDue());
      System.out.println("Item Details: " + invoice.getItemDetails());
      System.out.println("Price: " + invoice.getPrice());
      System.out.println("--------------------"); // Separator
    });
  }

  public static void onCSV(){
    StringBuilder csvData = new StringBuilder();
    csvData.append("Invoice Number, Addressee, Date Sent, Date Due, Item Details, Price\n");
    
    a.forEach(e -> {
      Invoice invoice = (Invoice) e; 
      csvData.append(invoice.getInvoiceNumber() + ", " + invoice.getAddressee() + ", " + invoice.getDateSent() + ", " + invoice.getDateDue()+", " + invoice.getItemDetails() + ", " + invoice.getPrice() + "\n");
    });
    
    try (FileWriter fileWriter = new FileWriter("data.csv")) {
        fileWriter.write(csvData.toString());
        System.out.println("CSV file created successfully.");
    } catch (Exception e) {
        e.printStackTrace();
    }
  }
  
}



class Invoice{
  public static int nextInvoiceNumber = 0; // Shared counter
  private int invoiceNumber;
  public static String companyName = "ABC Company";
  private String addressee;
  private String dateSent;
  private String dateDue;
  private String itemDetails;
  private double price;

  public Invoice( String addressee, String dateSent, String dateDue, String itemDetails, double price){
    this.addressee = addressee;
    this.dateSent = dateSent;
    this.dateDue = dateDue;
    this.itemDetails = itemDetails;
    this.price = price;
    this.invoiceNumber = nextInvoiceNumber; // Assign the current counter
    nextInvoiceNumber++; // Increment the counter for the next invoice
  }


  public String getCompanyName(){
    return companyName;
  }

  public String getAddressee(){
    return addressee;
  }

  public String getDateSent(){
    return dateSent;
  }

  public String getDateDue(){
    return dateDue;
  }

  public String getItemDetails(){
    return itemDetails;
  }

  public double getPrice(){
    return price;
  }
  
  public int getInvoiceNumber() {
    return invoiceNumber;
  }
  
}