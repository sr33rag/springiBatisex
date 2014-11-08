package net.codesree.ibatisEx.model;

import java.io.Serializable;

public class Prj implements Serializable {

  private String iid=null;
  private String cname=null;
  private String cdesc=null;
  
  public Prj() {}
  
  public String getIid() { return this.iid; }
  public void setIid(String _iid) { this.iid=_iid; }
  
  public void setCname(String _cname) { this.cname=_cname; }
  public String getCname() { return this.cname; }
  
  public void setCdesc(String _cdesc) { this.cdesc=_cdesc; }
  public String getCdesc() { return this.cdesc; }
  
  public String toString() {
    return "Prj[id:"+getIid()+
      ",cName:"+getCname()+
      ",cDesc:"+getCdesc()+"]";
  }
}
