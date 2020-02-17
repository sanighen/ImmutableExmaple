package exchanger;

public final class Currency {

	private String baseCode;
	private String code;
	private Float value;
	private String date;

	public Currency(String baseCode, String code, Float value, String date) {
		this.baseCode = baseCode;
		this.code = code;
		this.value = value;
		this.date = date;
	}

	@Override
	public final String toString() {
		return "Currency [baseCode=" + baseCode + ", code=" + code + ", value=" + value + ", date=" + date + "]";
	}

	public final String getBaseCode() {
		return baseCode;
	}

	public final Currency setBaseCode(String baseCode) {
		Currency obj = new Currency(baseCode, this.code, this.value, this.date);
		return obj;
	}

	public final String getCode() {
		return code;
	}

	public final Currency setCode(String code) {
		Currency obj = new Currency(this.baseCode, code, this.value, this.date);
		return obj;
	}

	public final Float getValue() {
		return value;
	}

	public final Currency setValue(Float value) {
		Currency obj = new Currency(this.baseCode, this.code, value, this.date);
		return obj;
	}

	public final String getDate() {
		return date;
	}

	public final Currency setDate(String date) {
		Currency obj = new Currency(this.baseCode, this.code, this.value, date);
		return obj;
	}

}
