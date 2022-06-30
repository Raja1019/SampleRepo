package org.comparator;

import java.util.Comparator;

public class AuthorComparator implements Comparator<book> {


	@Override
	public int compare(book o1, book o2) {
		// TODO Auto-generated method stub
	return o1.authorName.compareTo(o2.authorName);
	}

}
