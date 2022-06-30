package com.Project;

public class Book {
	public long BOOK_ID;
	public  String BOOK_NAME;
	public  String AUTHOR_NAME;
	public  String BOOK_DISCRIPTION;
	public  int BOOK_PRICE;
	public  String ISBN_NUMBER;
	
	
	
	@Override
	public String toString() {
		return "Book [BOOK_ID=" + BOOK_ID + ", BOOK_NAME=" + BOOK_NAME + ", AUTHOR_NAME=" + AUTHOR_NAME
				+ ", BOOK_DISCRIPTION=" + BOOK_DISCRIPTION + ", BOOK_PRICE=" + BOOK_PRICE + ", ISBN_NUMBER="
				+ ISBN_NUMBER + "]";
	}

	public static void main(String[] args) {
		

	}

	public long getBOOK_ID() {
		return BOOK_ID;
	}

	public void setBOOK_ID(long bOOK_ID) {
		BOOK_ID = bOOK_ID;
	}

	public String getBOOK_NAME() {
		return BOOK_NAME;
	}

	public void setBOOK_NAME(String bOOK_NAME) {
		BOOK_NAME = bOOK_NAME;
	}

	public String getAUTHOR_NAME() {
		return AUTHOR_NAME;
	}

	public void setAUTHOR_NAME(String aUTHOR_NAME) {
		AUTHOR_NAME = aUTHOR_NAME;
	}

	public String getBOOK_DISCRIPTION() {
		return BOOK_DISCRIPTION;
	}

	public void setBOOK_DISCRIPTION(String bOOK_DISCRIPTION) {
		BOOK_DISCRIPTION = bOOK_DISCRIPTION;
	}

	public int getBOOK_PRICE() {
		return BOOK_PRICE;
	}

	public void setBOOK_PRICE(int bOOK_PRICE) {
		BOOK_PRICE = bOOK_PRICE;
	}

	public String getISBN_NUMBER() {
		return ISBN_NUMBER;
	}

	public void setISBN_NUMBER(String iSBN_NUMBER) {
		ISBN_NUMBER = iSBN_NUMBER;
	}

	public Book(long bOOK_ID, String bOOK_NAME, String aUTHOR_NAME, String bOOK_DISCRIPTION, int bOOK_PRICE,
			String iSBN_NUMBER) {
		super();
		this.BOOK_ID = bOOK_ID;
		this.BOOK_NAME = bOOK_NAME;
		this.AUTHOR_NAME = aUTHOR_NAME;
		this.BOOK_DISCRIPTION = bOOK_DISCRIPTION;
		this.BOOK_PRICE = bOOK_PRICE;
		this.ISBN_NUMBER = iSBN_NUMBER;
	}

}