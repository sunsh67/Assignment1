package Assignment4;

/*2. Implement Class MusicAlbum which encapsulated a music Album, each album has a string variable albumTitle and
 *  a String variable singer representing the name of singer, 
 * double variable price representing the price of album, objects of this class 
 * are Initialized using all of its instance variables.
The class has accessor methods for all its Variables and a mutator method for price.*/
public class MusicAlbum {

	
	private String albumTitle;
	private String singer;
	private double price;
	
	public MusicAlbum(String albumTitle,String singer,double price){
		this.albumTitle=albumTitle;
		this.singer=singer;
		this.price=price;
		
	}
	/*mutator method for price*/
	public void setPrice(double price){
		this.price=price;
	}
	/*assessor for albumTitle*/
	public String getAlbumTitle(){
		return this.albumTitle;
	}
	/*assessor for singer*/
	public String getSinger(){
		return this.singer;
	}
	/*assessor for price*/
	public double getPrice(){
		return this.price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MusicAlbum album=new MusicAlbum("This Town","Niall Horan",16.5);
		album.setPrice(18.5);
		System.out.print(album.getAlbumTitle()+" "+album.getSinger()+" "+album.getPrice());
	}

}
