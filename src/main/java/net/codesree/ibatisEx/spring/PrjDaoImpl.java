package net.codesree.ibatisEx.spring;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import net.codesree.ibatisEx.model.Prj;
import net.codesree.ibatisEx.dao.IPrjDao;

public class PrjDaoImpl extends SqlMapClientDaoSupport implements IPrjDao {

  public List<Prj> selectAllPrjs() {
	SqlMapClientTemplate template=getSqlMapClientTemplate();
	return (List<Prj>) template.queryForList("selectAllPrjs");
  }
  
  public Prj selectPrjById(String prjId) {
    SqlMapClientTemplate template=getSqlMapClientTemplate(); 
    Object objPrj=template.queryForObject("selectPrjById",prjId);
    return objPrj instanceof Prj?((Prj) objPrj):null;
  }
  
  public void insertPrj(Prj nayaPrj) {
	SqlMapClientTemplate template=getSqlMapClientTemplate();
	template.insert("insertPrj",nayaPrj);
  }
  
  public void deletePrj(String prjId) {
    SqlMapClientTemplate template=getSqlMapClientTemplate();
    template.delete("deletePrj",prjId);
  }
  
  public void updatePrj(Prj prjWithNewVals) {
	SqlMapClientTemplate template=getSqlMapClientTemplate();
	template.update("updatePrj",prjWithNewVals);
  }

}
