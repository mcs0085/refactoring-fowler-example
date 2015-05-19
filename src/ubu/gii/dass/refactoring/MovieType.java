package ubu.gii.dass.refactoring;

public abstract class MovieType {
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	public static final int CHILDRENS = 2;
	
	public abstract int getTypeCode();

	double getCharge(Rental rental) {
		double thisAmount=0;
		switch (rental.getMovie().getPriceCode()) {
		case MovieType.REGULAR:
			thisAmount += 2;
			if (rental.getDaysRented() > 2)
				thisAmount += (rental.getDaysRented() - 2) * 1.5;
			break;
		case MovieType.NEW_RELEASE:
			thisAmount += rental.getDaysRented() * 3;
			break;
		case MovieType.CHILDRENS:
			thisAmount += 1.5;
			if (rental.getDaysRented() > 3)
				thisAmount += (rental.getDaysRented() - 3) * 1.5;
			break;
		}
		return thisAmount;
	}

	public int getFrecuentRenterPoints(Rental rental) {
		int frequentRenterPoints=0;
		frequentRenterPoints++;
		// add bonus for a two day new release rental
		if ((rental.getMovie().getPriceCode() == MovieType.NEW_RELEASE)
				&& rental.getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}
	
}
