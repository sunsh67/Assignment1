package Assignment1;


/*Description : A tourist wants to book a house on Airbnb app.*/
/*objects:
 * Object:Tourist
 *        State:name, gender, age, phoneNumber, country, address, job, email
 *        Behavior:browseList(), findHouse(), placeOrderForHouse(), payForOrder()
 *        
 * Object:Airbnb
 *        State:CollectionOfHouses
 *        Behavior:displayHouses(), sendOrderToOwner(), sendResultToTourist(), cancelOrder()
 *
 *Object:Owner
 *       State:name, gender, age, address, houseOwned, country, job, email, phoneNumber
 *       Behavior:approveOrder(), provideTouristWithHouse()
 *       
 *Object:House
 *       State:name, address, price, isAvailable, owner
 *       Behavior:getName(), getAddress(),getPrice(), getIsAvailable(), getOwner()
 *        
 * Object:Order
 *       State:orderID, isApproved, isPaid
 */
class Tourist{
	/*State*/
	String name;
	String address;
	String gender;
	int age;
	long phoneNumber;
	String contry;
	String job;
	String email;
	/*Behavior*/
	void browseList(House houses[]) {};
	House findHouse(){return null;};
	Order placeOrderForHouse(House house) {return null;};
	void payForOrder(double price){};	
}

class Airbnb{
	/*State*/
	House[] houses;
	/*Behavior*/
	House[] displayHouses(){return houses;};
	void sendOderToOwner(Order order){};
	void sendResultToTourist(Order order){};
	void cancelOrder(Order order){};
}

class Owner{
	/*State*/
	String name;
	String address;
	String gender;
	int age;
	long phoneNumber;
	String contry;
	String job;
	String email;
	House houseOwned;
	/*Behavior*/
	boolean approveOrder(Order order){return true;};
	void provideTouristWithHouse(House house){};
	
}
class House{
	/*State*/
	String name;
	String address;
	double price;
	boolean isAvailable;
	Owner owner;
	
	/*Behavior*/
	String getName(){return name;};
	String getAddress(){return address;};
	double getPrice(){return price;};
	boolean getIsAvailable(){return true;};	
	Owner getOwner(){return owner;};
}

class Order{
   /*State*/
   long orderID;
   boolean isApproved;
   boolean isPaid;
   
}


public class bookingAnAirbnb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Airbnb airbnb = new Airbnb();
     House[] houses=airbnb.displayHouses();
     Tourist tourist=new Tourist();
     tourist.browseList(houses); 
     House house= tourist.findHouse();
     while(house.getIsAvailable())
     {
     Order order=tourist.placeOrderForHouse(house);
     airbnb.sendOderToOwner(order);
     Owner owner=house.getOwner();
     if(owner.approveOrder(order)){
    	 order.isApproved=true;
    	 airbnb.sendResultToTourist(order);
    	 tourist.payForOrder(house.getPrice());   
    	 if(order.isPaid==true)
    	 owner.provideTouristWithHouse(house);
    	 }else{
    		 airbnb.sendResultToTourist(order);
    		 airbnb.cancelOrder(order);
    	 }
     }   
	}
}
