package com.training;

public class Book {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;  // if pointing to same location
		
		if (obj == null)
			return false;  // Cautios property
		
		if(this.getClass()!= obj.getClass())   // this.getClass() is equivalent to getclass()
			return false;     // it is checking if same class or not
		
		Book bk = (Book)obj;
		return bk.bookNumber==this.bookNumber && 
				bk.price==this.price &&
				bk.bookName.equals(this.bookName); // this.bookname has the String(an object only) value; this is not recursion, instead it goes to StringClass
			// TODO Auto-generated method stub
		
	}
	
	private int bookNumber;
	public int getBookNumber() {
		return bookNumber;
	}
	
	public void setBookNumber(int bookNumber) {
	
		if (bookNumber<100 || bookNumber>1000)
		{
		//	throw new RuntimeException("Book Number should be 100 - 1000");
		
		try{
			throw new Exception("Book Number Should be 100- 1000");
		} catch(Exception e) {
			
			System.out.println("Book Number Error"+ e.getMessage());
		}
		}
		
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	// throws => declaration whereas throw => forcible throw.
	public Book(int bookNumber, String bookName, double price) throws Exception {
		super();
		
		if(bookNumber<100 || bookNumber>1000)
		{
			throw new Exception("Book Number Should be 100- 1000");
		}
		
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String bookName;
	private double price;
}
