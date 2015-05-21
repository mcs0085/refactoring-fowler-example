package ubu.gii.dass.refactoring;

public abstract class MovieType {
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	public static final int CHILDRENS = 2;
		
	public abstract int getTypeCode();
	
	public abstract double getCharge(Rental rental);

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
