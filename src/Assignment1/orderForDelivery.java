package Assignment1;

/*Description : A consumer is going to order a delivery through phone calls.*/
/*objects:
 * Object:Consumer
 *        State:name, gender, phoneNumber, address, email
 *        Behavior:askInformationOfProduct(), placeOrder(), payForOrder()
 *        
 * Object:ShoppingService
 *        State:employeeID, emplyeeName, department 
 *        Behavior:searchProduct(), isProductInStock(), cancelOrder(), confirmOder()
 *
 *Object:Product
 *       State:quantity, name, size, productID, isInStock
 *            
 * Object:PhoneOrder
 *       State:orderID, isApproved, isPaid, product
 */


class Consumer{
	/*State*/
	String name;
	String gender;
	String phoneNumber;
	String address;
	String email;
	/*Behavior*/
	void askInformationOfProduct(Product product){};
	PhoneOrder placeOrder(Product product){return null;};
	void payForOrder(PhoneOrder order ){};
}
class ShoppingService{
	/*State*/
	String employeeName;
	int employeeID;
	String department;
	/*Behavior*/
	void searchProduct(Product product){};
	boolean isProductInStock(Product product){return true;};
	void cancelOder(PhoneOrder order){};
	void confirmlOrder(PhoneOrder order){};
	}

class Product{
	/*State*/
	int quantity;
	String name;
	String size;
	long productID;
	boolean isInStock;
		}

class PhoneOrder{
	   /*State*/
	   long orderID;
	   boolean isApproved;
	   boolean isPaid;
	   Product product;
	  }

public class orderForDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Consumer tom=new Consumer();
     tom.phoneNumber="6172596770";
     tom.address="220 11TH AVE ,SEATTLE,WA,98102";
     Product oven=new Product();
     tom.askInformationOfProduct(oven);
     ShoppingService ikea=new ShoppingService();
     ikea.employeeID=201;
     ikea.department="Kitchen";
     ikea.searchProduct(oven);
     if(ikea.isProductInStock(oven)==true){
    	 PhoneOrder order=tom.placeOrder(oven);
    	 order.isApproved=true;
    	 tom.payForOrder(order);
    	 if(order.isPaid==true)
    	 ikea.confirmlOrder(order);
     }else{
    	 PhoneOrder order=tom.placeOrder(oven);
    	 order.isApproved=false;
    	 ikea.cancelOder(order);	 
     }
	}

}
