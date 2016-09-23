package Assignment1;



/*Description : A tourist is trying to find the cheapest flight to LA.*/
/*objects:
 * Object:FlightTourist
 *        State:name, age, phoneNumber, address, email, whenToFly, fromWhere, toWhere
 *        Behavior:fillOutBasicInformatin(), browseList(), selectFilterInPrice(), findCheapest(), placeOrder(), payForOrder()
 *        
 * Object:BookingWebsite
 *        State:ArrengementsOfFlights
 *        Behavior:displayFlights(), displayFlightsOnOrder()
 *       
 *Object:Flight
 *       State:flightID, isAvailable, price
 *       Behavior:getPrice(), getIsAvailable()
 *       
 * Object:FlightOrder
 *       State:orderID, isApproved
 */

class FlightTourist{
	/*State*/
	String name;
	String address;
	int age;
	long phoneNumber;
	String email;
	String whenToFly;
	String fromWhere;
	String toWhere;
	/*Behavior*/
	void fillOutBasicInformation(String whentoFly,String fromWhere,String toWhere){}
	void browseWebsite(BookingWebsite website){};
	void seletFileterInPrice(Flight []flights){};
	Flight findCheapest(Flight []flights){return null;};
	FlightOrder placeOrder(Flight flight) {return null;};
	void payForOrder(double price){};	
}

class BookingWebsite{
	/*State*/
	Flight[] flights;
	/*Behavior*/
	Flight[] displayFlights(){return flights;};
	Flight[] displayFlightsOnOrder(){return flights;}
}
class Flight{
	/*State*/
	long flightID;
	double price;
	boolean isAvailable;
	/*Behavior*/
	double getPrice(){return price;};
	boolean getIsAvailable(){return true;};	
	
}

class FlightOrder{
	long OrderID;
	boolean isApproved;
	
}
public class travellingToLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingWebsite studentUniverse=new BookingWebsite();
		FlightTourist nick=new FlightTourist();
		nick.whenToFly="28/09/2016";
		nick.fromWhere="SEA";
		nick.toWhere="LAX";
		nick.fillOutBasicInformation("28/09/2016", "SEA", "LAX");
		nick.browseWebsite(studentUniverse);
		Flight[] flightsToLA=studentUniverse.displayFlights();
		while(flightsToLA!=null){
		nick.seletFileterInPrice(flightsToLA);
		flightsToLA=studentUniverse.displayFlightsOnOrder();
	    Flight cheapest=nick.findCheapest(flightsToLA);
			if(cheapest.getIsAvailable()==true){
				FlightOrder orderLA=nick.placeOrder(cheapest);
				nick.payForOrder(cheapest.getPrice());
				orderLA.isApproved=true;
			}}	
		}

	}


