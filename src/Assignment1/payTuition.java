package Assignment1;


/*Description :A student wants to pay his tuition through myNEU account*/
/*objects:
 * Object:NUStudent
 *        State:accountName, accountPassword, NUID, payMethod
 *        Behavior:loginMyNEU(), findBill(), addToNUPayBasket(), makeAPayment(), choosePayMethod(), payBill()
 *        
 * Object:MyNEU
 *        State:billFee
 *        Behavior:isNUStudent(), confirmPayment()
 *
 *Object:Bill
 *       State:billID, charges, isPaid
 *       Behavior:getCharges()
 *       
 */


class NUStudent{
	/*State*/
	String accountName; 
	String accountPassword;
	long NUID;
	String payMethod;
	NUStudent(String accountName,String accountPassword){
		this.accountName=accountName;
		this.accountPassword=accountPassword;
	};
	/*Behavior*/
	void loginMyNEU(String accontName,String accountPassword) {};
	Bill findBill(){return null;};
	void addToNUPayBaket(Bill bill){};
	void makeAPayment(){};
	String choosePayMethod(){return payMethod;}
	void payBill(double billFee){};
	
}

class MyNEU{
	/*State*/
	double billFee;
	/*Behavior*/
	boolean isNUStudent(NUStudent student){return true;};
	void corfirmPayment(Bill bill){};
	
}
class Bill{
	/*State*/
	int billID;
	double charges;
	boolean isPaid;
	/*Behavior*/
	double getChages(){return charges;}		
}
public class payTuition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NUStudent tim=new NUStudent("tim","000000");
        tim.payMethod="CheckingAccount";
        MyNEU myneu=new MyNEU();
        tim.loginMyNEU("tim", "000000");
        while(myneu.isNUStudent(tim)){
        	Bill tuition=tim.findBill();
        	tuition.charges=16666.5;
        	if(tuition.isPaid==false){
        		tim.addToNUPayBaket(tuition);
        		myneu.billFee=tuition.getChages();
        		tim.makeAPayment();
        		tim.choosePayMethod();
        		tim.payBill(myneu.billFee);
        		myneu.corfirmPayment(tuition);
        		tuition.isPaid=true;
        	}else{
        		tuition.isPaid=true;
        	}
        	
        }
	}

}

