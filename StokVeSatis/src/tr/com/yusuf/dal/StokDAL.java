package tr.com.yusuf.dal;
import tr.com.yusuf.core.ObjectHelper;
import tr.com.yusuf.interfaces.DALInterfaces;
import java.util.List;
public class StokDAL<StokContract> extends ObjectHelper implements DALInterfaces<StokContract>{
	@Override
	public void insert(StokContract entity) {
		
	}
	@Override
	public List<StokContract> getById(int id){
		return null;
	}
	@Override
	public List<StokContract> getAll(){
		return null;
	}
	public StokContract delete(StokContract entity) {
		return null;
	}
	public void update(StokContract entity) {
	
	}
	
}
