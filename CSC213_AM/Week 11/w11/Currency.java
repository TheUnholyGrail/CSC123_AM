package w11;

import java.util.Objects;

public class Currency {
	//Fields
	private String countryCode = null;
	private String description = null;
	private Double convRate = 0.00;
	//Constructor
	public Currency(String cc, String d, Double cr) {
		countryCode = cc;
		description = d;
		convRate = cr;
	}
	//Getters and Setters
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getConvRate() {
		return convRate;
	}
	public void setConvRate(Double convRate) {
		this.convRate = convRate;
	}
	
	public double converToUSD(double amount, double usdRate) {
		return amount * usdRate;
	}
	//Other
	@Override
	public String toString() {
		return "Currency [countryCode=" + countryCode + ", description=" + description + ", convRate=" + convRate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(convRate, countryCode, description);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		return Objects.equals(convRate, other.convRate) && Objects.equals(countryCode, other.countryCode)
				&& Objects.equals(description, other.description);
	}
	
	
}
