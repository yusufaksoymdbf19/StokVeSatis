package tr.com.yusuf.dal;
import tr.com.yusuf.interfaces.DALInterfaces;
import tr.com.yusuf.core.ObjectHelper;
import java.util.List;
public class SatisDAL<SatisContract> extends ObjectHelper implements DALInterfaces<SatisContract>{
	@Override
	public void insert(SatisContract entity) {
		
	}
	@Override
	public SatisContract delete(SatisContract entity){
		return null;
	}
	@Override
	public void update(SatisContract entity) {
		
	}
	@Override
	public List<SatisContract> getAll(){
		return null;
	}
	@Override
	public List<SatisContract> getById(int id){
		return null;
	}
}
