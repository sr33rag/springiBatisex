package net.codesree;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.codesree.ibatisEx.dao.IPrjDao;
import net.codesree.ibatisEx.model.Prj;

public class App {
  public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	IPrjDao prjDao=(IPrjDao) context.getBean("IPrjDao");
	
	System.out.println("\nInserting New Prj");
	Prj nayaPrj=new Prj();
	nayaPrj.setIid("prj023");
	nayaPrj.setCname("kuchbhinaam");
	nayaPrj.setCdesc("kuchbhidesc");
	prjDao.insertPrj(nayaPrj);
	
	List<Prj> prjs=prjDao.selectAllPrjs();
	System.out.println("After selectAllPrjs():\n");
	System.out.println(prjs+"\n");
	
	Prj selectedPrj=prjDao.selectPrjById("prj002");
	System.out.println("After selectPrjById(prj002):\n");
	System.out.println(selectedPrj+"\n");
	
	System.out.println("Updating Prj(prj003):");
	Prj modPrj=prjs.get(3);
	modPrj.setCname("somejunkname");
	modPrj.setCdesc("somejunkdec");
	prjDao.updatePrj(modPrj);
	
	System.out.println("\nDeleting Prj(prj002)");
	prjDao.deletePrj("prj002");
  }
}
