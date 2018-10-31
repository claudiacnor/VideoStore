
public abstract class Movie {
	private String title;
	private String priceCode;


	public Movie(String title, String priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public abstract double determineAmount(int daysRented);

	public abstract int determineFrequentRenterPoints(int daysRented);

	public String getPriceCode() {
		return priceCode;
	}

}