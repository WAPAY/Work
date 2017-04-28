package model;

public class Ayft {
	private Integer wsid;//文书id
	private String wsah;//文书案号
	private String ajlb;//案件类别：民事等
    private Integer aycj;//案由层级 1234等
    private String yjaymc;//一级案由名称
    private String yjaydm;//一级案由代码
    private String ejaymc;//二级案由名称
    private String ejaydm;//二级案由代码
    private String sjaymc;//三级案由名称
    private String sjaydm;//三级案由代码
    private String sijaymc;//四级案由名称
    private String sijaydm;//四级案由代码
    private String flyj;//法律依据(以；隔开)
	
    public Integer getWsid() {
		return wsid;
	}
	public void setWsid(Integer wsid) {
		this.wsid = wsid;
	}
	public String getWsah() {
		return wsah;
	}
	public void setWsah(String wsah) {
		this.wsah = wsah;
	}
	public String getAjlb() {
		return ajlb;
	}
	public void setAjlb(String ajlb) {
		this.ajlb = ajlb;
	}
	public Integer getAycj() {
		return aycj;
	}
	public void setAycj(Integer aycj) {
		this.aycj = aycj;
	}
	public String getYjaymc() {
		return yjaymc;
	}
	public void setYjaymc(String yjaymc) {
		this.yjaymc = yjaymc;
	}
	public String getYjaydm() {
		return yjaydm;
	}
	public void setYjaydm(String yjaydm) {
		this.yjaydm = yjaydm;
	}
	public String getEjaymc() {
		return ejaymc;
	}
	public void setEjaymc(String ejaymc) {
		this.ejaymc = ejaymc;
	}
	public String getEjaydm() {
		return ejaydm;
	}
	public void setEjaydm(String ejaydm) {
		this.ejaydm = ejaydm;
	}
	public String getSjaymc() {
		return sjaymc;
	}
	public void setSjaymc(String sjaymc) {
		this.sjaymc = sjaymc;
	}
	public String getSjaydm() {
		return sjaydm;
	}
	public void setSjaydm(String sjaydm) {
		this.sjaydm = sjaydm;
	}
	public String getSijaymc() {
		return sijaymc;
	}
	public void setSijaymc(String sijaymc) {
		this.sijaymc = sijaymc;
	}
	public String getSijaydm() {
		return sijaydm;
	}
	public void setSijaydm(String sijaydm) {
		this.sijaydm = sijaydm;
	}
	public String getFlyj() {
		return flyj;
	}
	public void setFlyj(String flyj) {
		this.flyj = flyj;
	}
    
    

}
