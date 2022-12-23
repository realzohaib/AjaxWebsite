package Pack;

public class BankDAOFactory {
	public static BankDAO createBankDAO() {
		return( new BankDAOImpl());
	}
}
