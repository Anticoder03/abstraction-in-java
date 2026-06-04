package day8;

public interface InternationalBank extends Bank{
	String TYPE = "International";
	double FOREX_CHARGE = 0.025;
	double SWIFT_TRANSFER_FEE = 500.0;
	int MAX_FOREIGN_TRANSACTIONS_PER_DAY = 10;
}
