package Assignment1;

/*Description : A student is driving home from school.*/
/*objects:
 * Object:Student
 *        State:name
 *        Behavior:drive()
 *        
 * Object:Origin
 *        State:originAddress
 *        Behavior:setOriginAddress(), getOriginAddress()
 *
 *Object:Destination
 *       State:desAddress
 *       Behavior:setDesAddress(), getDesAddress()
 *       
 *Object:Vehicle
 *       State:type
 *       Behavior:setType(), getType()
 *        
 * Object:MapGuide
 *       State:route
 *       Behavior:setRoutePlan(), getRoutePlan()
 */

class Student{
	/*State*/
	String name;
	/*Behavior*/
	void drive(String route){};
	}
class Origin{
	/*State*/
	String originAddress;
	/*Behavior*/
    String getOriginAddress() {
		return originAddress;}
	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;}	
}
class Destination{
	/*State*/
	String desAddress;
	/*Behavior*/
    String getDesAddress() {return desAddress;}
     void setDesAddress(String desAddress) {
		this.desAddress = desAddress;}}

class Vehicle{
	/*State*/
	String type;
	/*Behavior*/
    String getType() {
		return type;}
	void setType(String type) {
		this.type = type;}}

class MapGuide{
	/*State*/
	String route;
	/*Behavior*/
	void setRoutePlan(Origin origin, Destination destination, Vehicle vehicle){};
	String getRoutePlan() {return route;}
}


public class driveHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		Origin origin = new Origin();
		origin.setOriginAddress("school");
		Destination des=new Destination();
		des.setDesAddress("home");
		Vehicle vehicle=new Vehicle();
		vehicle.setType("car");
		MapGuide mapGuide=new MapGuide();
		mapGuide.setRoutePlan(origin, des, vehicle);
		while(mapGuide.getRoutePlan()!=null){
			student.drive(mapGuide.getRoutePlan());
		}
			
	}

}
