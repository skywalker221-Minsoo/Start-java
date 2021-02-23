package DB;

public class PurchaseVO {
	int perchaseNum;
	String clientId;
	String cardCompany;
	String cardNum;
	int price;
	String movieId;

	public int getPerchaseNum() {
		return perchaseNum;
	}

	public void setPerchaseNum(int perchaseNum) {
		this.perchaseNum = perchaseNum;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getCardCompany() {
		return cardCompany;
	}

	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

}
