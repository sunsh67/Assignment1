package Assignment4;


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
