package Pack;

public interface BankDAO {
	public String fetchAll();
	public String insert(Bank b);
	public String delete(String accountno);
	String[]FetchByAccnt(String accountno);
	String update(Bank bank);
	String fetchdelete();
	String open(String accountno);
}
