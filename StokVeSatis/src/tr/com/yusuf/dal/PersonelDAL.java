package tr.com.yusuf.dal;
import tr.com.yusuf.core.ObjectHelper;
import java.util.List;
import tr.com.yusuf.interfaces.DALInterfaces;
public class PersonelDAL<PersonelContract> extends ObjectHelper implements DALInterfaces<PersonelContract> {
	@Override
	public void insert(PersonelContract entity) {
		
	}
	@Override
	public List<PersonelContract> getAll(){
		return null;
	}
	@Override
	public PersonelContract delete(PersonelContract entity) {
		return null;
	}
	@Override
	public void update(PersonelContract entity) {
		
	}
	@Override
	public List<PersonelContract> getById(int id){
		return null;
	}
}
