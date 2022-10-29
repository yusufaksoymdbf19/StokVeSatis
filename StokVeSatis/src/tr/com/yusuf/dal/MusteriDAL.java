package tr.com.yusuf.dal;
import java.util.List;
import tr.com.yusuf.core.ObjectHelper;
import tr.com.yusuf.interfaces.DALInterfaces;
public class MusteriDAL<MusteriContract> extends ObjectHelper implements DALInterfaces<MusteriContract>{
	@Override
	public  void insert(MusteriContract entity) {
		
	}
	@Override
	public List<MusteriContract> getAll(){
		return null;
	}
	@Override
	public MusteriContract delete(MusteriContract entity) {
		return null;
	}
	@Override
	public void update(MusteriContract entity) {
		
	}
	@Override
	public List<MusteriContract> getById(int id){
		return null;
	}
	
}
