package tr.com.yusuf.dal;
import tr.com.yusuf.interfaces.DALInterfaces;
import tr.com.yusuf.core.ObjectHelper;
import java.util.List;
public class AccountsDAL<AccountsContract> extends ObjectHelper implements DALInterfaces<AccountsContract> {
	@Override
	public void insert(AccountsContract entity) {
		
	}
	@Override 
	public List<AccountsContract> getAll(){
		return null;
	}
	@Override
	public AccountsContract delete(AccountsContract entity) {
		return null;
	}
	@Override
	public void update(AccountsContract entity) {
		
	}
	@Override
	public List<AccountsContract> getById(int id){
		return null;
	}
}
