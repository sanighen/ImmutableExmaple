package main;

import exchanger.Currency;

public class Application {

	public static void main(String[] args) {

		Currency todaysCurrency = new Currency("EUR", "MDL", 17.50f, "2020-01-01");
		Currency tomorrowsCurrency = todaysCurrency.setDate("2020-01-02").setValue(18.00f);

		System.out.println("Today currency: " + todaysCurrency);
		System.out.println("Tomorrow currency:  " + tomorrowsCurrency);

		/*
		 * А если для tomorrowsCurrency понадобилось бы изменить и коэффициент на 18.00f
		 * - как это выглядело бы в коде?
		 * Ответ:	Currency tomorrowsCurrency = todaysCurrency.setDate("2020-01-02").setValue(18.00f);
		 */

	}

}
