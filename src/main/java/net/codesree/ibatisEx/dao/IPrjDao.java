package net.codesree.ibatisEx.dao;

import java.util.List;
import java.io.Serializable;

import net.codesree.ibatisEx.model.Prj;

public interface IPrjDao extends Serializable {
  public List<Prj> selectAllPrjs();
  public Prj selectPrjById(String prjId);
  public void insertPrj(Prj nayaPrj);
  public void deletePrj(String prjId);
  public void updatePrj(Prj prjWithNewVals);
}
