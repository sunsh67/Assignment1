package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Assignment for your lecture 2. Please finish all the questions under
 * 'Assignment'. Please try the two questions under 'Bonus'. Please write some
 * tests as practice. When you are writing tests, you should think about what
 * situations might cause error? like 0,-1... 
 * 
 */

class Person {
	int age;
	boolean gender;// false --> male, true --> female

	Person(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
}

public class Assignment2 {
	// Assignment
	Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 test=new Assignment2();
		Person person=new Person(0,false);
		int n=0;
		String s="";
		int []nums=new int[20];
		Scanner scanner=new Scanner(System.in);
		while(true){
		System.out.println("please choose one function for testing: 1:personType   2:WeirNumber   3:isPrime     4:fibonacciNumber");
		System.out.println("                                        5:reverseString   6:findTheLargestTwo   7:isUgly    8:moveZero");
		System.out.println("                                        9:addDigits");
		int i=scanner.nextInt();
		switch(i){
		case 1: test.personType(person);break;
		case 2:test.weirdNumber(n);break;
		case 3:test.isPrime(n);break;
		case 4:test.fibonacciNumber(n);break;
		case 5:test.reverseString(s);break;
		case 6:test.findTheLargestTwo(nums);break;
		case 7:test.isUgly(n);break;
		case 8:test.moveZeroes(nums);break;
		case 9:test.addDigits(n);break;
		
		}	
		}
		

	}
	
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year 
	 * Toddler : If the age is less than 3 and greater than 1 
	 * Pre Schooler : If the age is less than 5 and greater than 3 
	 * KG Girl : If the age is greater than 5 and less than 6 and the
	 * gender is female 
	 * KG Boy : If the age is greater than 5 and less than 6
	 * and the gender is male
	 */
	public void personType(Person person) {
    System.out.println("Please input the age :");
    int age=this.scanner.nextInt();
    person.age=age;
    System.out.println("Please input the gender:(male/female) ");
    String temp=this.scanner.next();
    if (temp.equals("male")){
    	person.gender=false;
    }else{person.gender=true; }
    if(person.age<1){System.out.println("The person is infant");}
    else if(person.age>=1&&person.age<3){System.out.println("The person is Todder");}
    else if(person.age>=3&&person.age<5){System.out.println("The person is Pre School");}
    else if(person.age>=5&&person.age<6){
    	if(person.gender==false){System.out.println("The person is KG Boy");}else{
    		System.out.println("The person is KG Girl");
    	}
    }}

	/**
	 * Given an integer N as input, check the following: If N is odd, print
	 * "Weird". If N is even and, in between the range of 2 and 5(inclusive),
	 * print "Not Weird". If N is even and, in between the range of 6 and
	 * 20(inclusive), print "Weird". If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n) {
    System.out.println("Please input integer N:");
    n=this.scanner.nextInt();
    if(n%2==0){
    	if(n>=2&&n<=5){ System.out.println("Not Weird");}
    	if(n>=6&&n<=20){System.out.println("Weird");}
    	if(n>20){System.out.println("Not Weird");}
    }else{
    	System.out.println("Weird");
    }
	}

	/**
	 * Write a method to determine whether a number is prime
	 */
	public void isPrime(int n) {
		
		 System.out.println("Please enter a number:");
		  n=this.scanner.nextInt();
		  if(n<=1){
			  System.out.println("Invaild number, and "+n+" is not prime number. Please re-enter a number");
			  return;
		  }
		  boolean prime=true;
		  for(int i=2;i<n;i++) {
			  if(n%i==0){
				  prime=false;
			  }
		  }
		  if(prime==false){
			  System.out.println(n+" is NOT prime number");
		  }else{
			  System.out.println(n+" is prime number");
		  }
	}

	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 */
	public int[] fibonacciNumber(int n) {
		 System.out.println("Please enter a number n:");
		 n=this.scanner.nextInt();
		 int[] fNumbers=new int[n];
		 int i;
		 for(i=0;i<n;i++){
			 if(i<=1){
				 fNumbers[i]=1;
			 }else{
				 fNumbers[i]= fNumbers[i-1]+ fNumbers[i-2];
			 }
		 }
		 System.out.println(Arrays.toString(fNumbers));
		return fNumbers;
	}

	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Given s = "hello", return "olleh".
	 */
	public String reverseString(String s) {
		 System.out.println("Please enter a String :");
		 String original=this.scanner.next();
		 char []c=original.toCharArray();
		 for(int i=c.length-1;i>=0;i--){
			 s+=c[i];
		 }
		 System.out.println(s);
		return s;
	}

	/**
	 * Given an array of nums, write a function to find the largest two integer.
	 */
	public int[] findTheLargestTwo(int[] nums) {
		System.out.println("Please enter no. of numbers you want in array :");
		int n=this.scanner.nextInt();
		System.out.println("Please enter the numbers :");
		for(int i=0;i<n;i++){
			nums[i]=this.scanner.nextInt();
		}
		int []max=new int [2];
		max[0]=0;
		max[1]=0;
		for(int i=0;i<n;i++){
			if(max[0]<nums[i]){
				max[1]=max[0];
				max[0]=nums[i];
			}else if(max[1]<nums[i]){
				max[1]=nums[i];
			}
		}
		System.out.println("The largest two integer are :");
		System.out.println(Arrays.toString(max));
		return max;
	}

	/**
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. For
	 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
	 * should be [1, 3, 12, 0, 0].
	 */
	public void moveZeroes(int[] nums) {
		System.out.println("Please enter no. of numbers you want in array to move:");
		int n=this.scanner.nextInt();
		int []move=new int[n];//for print
		System.out.println("Please enter the numbers :");
		int i=0,j=0;
		for(;i<n;i++){
			nums[i]=this.scanner.nextInt();
		}
        /*move*/
		for(i=0;i<n;i++){
			if(nums[i]!=0){
				nums[j]=nums[i];
				j++;
			}
		}
		for(;j<n;j++){
			nums[j]=0;
		}
		for(i=0;i<n;i++){
			move[i]=nums[i];
		}
       System.out.println(Arrays.toString(move));
	}

	// Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the
	 * result has only one digit. For example: Given n = 38, the process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		System.out.println("Please give a non-negative number n:");
		n=this.scanner.nextInt();
		if(n<0){
			System.out.println("Invaild Input, try n>0");
		}
		if(n>=0){
			while(n/10>0){
				int sum=0;
				while(n>0){
					sum+=n%10;
					n=n/10;
				}
				n=sum;
			}
			System.out.println(n+" has only one digit");}
		return n;
	
		
	}

	/**
	 * Write a program to check whether a given number is an ugly number. Ugly
	 * numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	 * another prime factor 7. Note that 1 is typically treated as an ugly
	 * number.
	 */
	public boolean isUgly(int n) {
		System.out.println("Please give a number n:");
		n=this.scanner.nextInt();
		int temp=n;
		if(n<=0){
			System.out.println("Invaild input, try n>=1");
		}
		if(n==1){
			System.out.println("1 is an ugly number");	
		}
		
		while(n%2==0) n=n/2;
		while(n%3==0) n=n/3;
		while(n%5==0) n=n/5;
		
		if(n==1) {System.out.println(temp+" is an ugly number");}else{
			System.out.println(temp+" is NOT an ugly number");
		}
			
		return n==1;
	
}
}


