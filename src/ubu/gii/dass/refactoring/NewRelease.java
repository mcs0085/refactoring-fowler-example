package ubu.gii.dass.refactoring;

public class NewRelease extends MovieType{
	private int type;
	
	public NewRelease(int priceCode) {
		type=priceCode;
	}

	@Override
	public int getTypeCode() {
		return MovieType.NEW_RELEASE;
	}

	@Override
	public double getCharge(Rental rental) {
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

}
