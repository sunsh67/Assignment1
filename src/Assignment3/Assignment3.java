package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Finish assignments, try bonus. Deadline: Before the next class.
 * 
 * @author Jia
 */
public class Assignment3 {
	// assignments
    Scanner scanner=new Scanner(System.in);
	public static void main(String []agrs){
		Scanner scanner=new Scanner(System.in);
		int n=Integer.MIN_VALUE;
		Assignment3 test=new Assignment3();
		String s="";
		while(true){
		System.out.println("Please choose one for testing:1.findPowerOfThree   2.countDigits    3.printNumbers");
	    System.out.println("                              4.generatePascalsTriangle 5.reverseVowels  6.lengthOfLastWord");
	    System.out.println("                              7.reverseString2  8.checkMessage");
		int i=scanner.nextInt();
		switch(i){
		case 1:test.findPowerOfThree(n);break;case 2:test.countDigits(n);break;case 3:test.printNumbers(n);break;
		case 4:test.generatePascalsTriangle(n);break;case 5:test.reverseVowels(s);break;case 6:test.lengthOfLastWord(s);break;
		case 7:test.reverseString2(s);break;case 8:test.checkMessage(s);break;default:break;
		}
		}
	}
	/**
	 * Write a method to find N numbers which are power of three. e.g. n=4,
	 * return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n) {
		System.out.println("Please enter n to find the power of three:");
		n=this.scanner.nextInt();
	    int []arr=new int[n];
		int temp=1;
		for(int i=0;i<n;i++){
			arr[i]=temp;
			temp*=3;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	/**
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n) {
		System.out.println("Please enter n :");
		n=this.scanner.nextInt();
		int count=String.valueOf(n).length();
		System.out.println(n%count);
		return n%count;
	}

	/**
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
	 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
	 * 6
	 */
	public void printNumbers(int n) {
		System.out.println("Please enter integer n :");
		n=this.scanner.nextInt();
		if(n%2==0){
			for(int i=0;i<2*n;i+=2){
				System.out.print(i+" ");
				
			}
		}else{
			for(int i=1;i<2*n;i+=2){
				System.out.print(i+" ");
			}
		}System.out.println();//for menu
	}

	/**
	 * Given numRows, generate the first numRows of Pascal's triangle. For
	 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
	 * [1,4,6,4,1]
	 */
	public int[][] generatePascalsTriangle(int n) {
		System.out.println("Please enter numRows n >0:");
		n=this.scanner.nextInt();
		int[][] triangle=new int[n][2*n-1];
		int row,col;
		for( row=0;row<n;row++){
			for(col=0;col<(2*n-1);col++){
				triangle[row][col]=0;//initialize
				if(row==0&&col==n-1||row==n-1&&(col==0||col==2*n-2)){ triangle[row][col]=1;}
				else if(row>=1&&col>=1&&col<2*n-2){
					triangle[row][col]=triangle[row-1][col-1]+triangle[row-1][col+1];
				}
				if(triangle[row][col]==0) System.out.print("  ");
		        else System.out.print(triangle[row][col]+" ");
				}
				System.out.println();
				}       
			return triangle;
	}

	/**
	 * Write a function that takes a string as input and reverse only the vowels
	 * of a string. For example: Given s = "hello", return "holle".
	 */
	public String reverseVowels(String s) {
		System.out.println("Please input a word :");
		s=this.scanner.next();
		int left=0;
		int right=s.length()-1;
		char temp;
		char[] c=s.toCharArray();	
		while(left<right){
			if(this.isVowel(c[left])&&this.isVowel(c[right])){
			temp=c[left];
			c[left++]=c[right];
			c[right--]=temp;
			}else if(this.isVowel(c[left])){
				right--;
			}else {
				left++;
			}
		}
		System.out.println(c);
		return new String(c);}
	
	private boolean isVowel(char c){
		
	 return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
		
	}
	
	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {
		System.out.println("Please input a string:");
		str=this.scanner.nextLine();
		String []s=str.split(" ");
		if(s==null||s.length==0){return 0;}
        System.out.println("the last waord is "+s[s.length-1]+" , whose length is "+s[s.length-1].length());
		return s[s.length-1].length();
	}

	/**
	 * Reverse a string by words. Do not use 'split' function. e.g. "I like
	 * soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {
		System.out.println("Please input a string:");
		str=" "+this.scanner.nextLine()+" ";
		int last=str.length();
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)==' '){
			reverse+=str.substring(i+1, last);
			last=i+1;
			}
		}
		System.out.println("-------->"+reverse);
		return reverse;
	}

	// Bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many
	 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
	 * changed some characters of the massage. Write a method to count how many
	 * characters were changed. For example, "SOSSOSSOS" might be changed to
	 * "SOSSUSSOP", then your method should return 2. The message was consisted
	 * by "SOS" so its length will be multiple of 3. You could assume the
	 * message only contains upper letter.
	 */
	public int checkMessage(String message) {
		System.out.println("The message from Mars should be:");
		message=this.scanner.next();
		int change=0;
		String []st=new String[message.length()/3];
		for(int i=0,j=0;i<=message.length()&&i+3<=message.length()&&j<message.length()/3;i+=3,j++){
			st[j]=message.substring(i, i+3);}
		for(int i=0;i<st.length;i++){
			if(st[i].charAt(0)!='S') change++;
			if(st[i].charAt(1)!='O') change++;
		    if(st[i].charAt(2)!='S') change++;}
		System.out.println("The number of changed characters is "+change);
		return change;
	}
}