package company;
import java.util.*;

/*
Create a class Bill with below attributes:
billNo- int
name - String
typeOfConnection - String
billAmount - double
status – boolean

where billNo is the bill number, name is the name of the customer, typeOfConnection is the type of the
connection (prepaid, postpaid), billAmount is the bill amount and status is whether the bill is paid or not (if
paid then value is TRUE else value is FALSE).
The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - findBillWithMaxBillAmountBasedOnStatus and
getCountWithTypeOfConnection in Solution class.

findBillWithMaxBillAmountBasedOnStatus method:
This method will take an array of Bill objects and a boolean parameter as parameters.
The method will return bill object array in ascending order of their bill number from the array of Bill objects
whose bill Amount is maximum in the array with the status attribute that matches with the input parameter.
If no Bill with the given status is present in the array of Bill objects, then the method should return null.

getCountWithTypeOfConnection method:
This method will take two input parameters - array of Bill objects and string parameter ( for type of
connection).
The method will return the count of bills from array of bill objects for the given type of connection.
If no bill with the given type of connection is present in the array of bill objects, then the method should
return 0.

Note :
Two bill object can have the same bill amount.
All the searches should be case insensitive.
The above mentioned static methods should be called from the main method.
For findBillWithMaxBillAmountBasedOnStatus method - The main method should print the billNo followed
by # and name from the returned Bill object array if the returned value is not null.
If the returned value is null then it should print "There are no bill with the given status".

For getCountWithTypeOfConnection method - The main method should print the count of bills as it is, if the
returned value is greater than 0, otherwise it should print "There are no bills with given type of connection".
Before calling these static methods in main, use Scanner to read the number of object and objects to read the
TCS IPA QUESTION ANSWER
values of Bill objects referring attributes in the above mentioned attribute sequence.
Next, read the value for status and typeOfConnection.
Consider below sample input and output:
Input:
4
111
Aman Mittal
Prepaid
914.25
true
222
Rekha Kumar
Prepaid
1425.75
false
333
Samyra Gupta
Prepaid
1305.00
true
444
Mohit Saxena
Postpaid
1300.50
false
false
Prepaid
Output:
222#Rekha Kumar
3
*/
class Bill{
    private int billNo;
    private String name;
    private String typeOfConnection;
    private double billAmount;
    private boolean status;

    public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status){
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfConnection() {
        return typeOfConnection;
    }

    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
public class ipa7 {
    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill[] arr, boolean parameter) {
        Bill[] arr2 = new Bill[0];
        double maxAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isStatus() == parameter && arr[i].getBillAmount() > maxAmount) {
                maxAmount = arr[i].getBillAmount();
            }
        }
        if (maxAmount == 0)
            return null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isStatus() == parameter && arr[i].getBillAmount() == maxAmount) {
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i];
            }
        }

        for (int i = 0; i < arr2.length-1; i++) {
            for (int j = 0; j < arr2.length-i-1; j++) {
                if (arr2[j].getBillNo() > arr2[j+1].getBillNo()){
                    Bill temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
        return arr2;
    }

    public static int getCountWithTypeOfConnection(Bill[] arr, String typeOfConnection){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getTypeOfConnection().equalsIgnoreCase(typeOfConnection))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        Bill[] arr = new Bill[len];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();

            arr[i] = new Bill(a,b,c,d,e);
        }

        boolean x = sc.nextBoolean();sc.nextLine();
        String typeOfConnection = sc.nextLine();
        Bill[] arr2 = findBillWithMaxBillAmountBasedOnStatus(arr, x);

        if (arr2 == null)
            System.out.println("There are no bill with the given status");
        else{
            for(int i = 0; i< arr2.length; i++){
                System.out.println(arr2[i].getBillNo()+"#"+arr2[i].getName());
            }
        }

        int count = getCountWithTypeOfConnection(arr, typeOfConnection);

        if (count == 0)
            System.out.println("There are no bills with given type of connection");
        else
            System.out.println(count);

    }
}
