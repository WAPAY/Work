package model;

import java.sql.Date;

/**
 * Created by cristph on 2017/4/7.
 */


public class Wssxb {

    private Integer wsid;//文书id
    private String wsah;//文书案号
    private String wsmc;//文书名称
    private String wslx;//文书类型
    private String xmlName;//xml文件名
    private String xmlPath;//xml路径
    private String docName;//doc文件名
    private String docPath;//doc路径
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
    private Integer fycj;//法院层级
    private String gymc;//高院名称
    private String zymc;//中院名称
    private String jcymc;//基层院名称
    private Date cprq;//裁判日期
    private String cpnf;//裁判年份
    private String spcx;//审判程序
    private String spry;//审判人员
    private String yghzgsr;//原告或者公诉人
    private String bg;//被告
    private String ygsfct;//原告是否出庭
    private String bgsfct;//被告是否出庭
    private String lsmc;//律所名称
    private String lsxm;//律师姓名
    private String flyj;//法律依据

    

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



	public String getWsmc() {
		return wsmc;
	}



	public void setWsmc(String wsmc) {
		this.wsmc = wsmc;
	}



	public String getWslx() {
		return wslx;
	}



	public void setWslx(String wslx) {
		this.wslx = wslx;
	}



	public String getXmlName() {
		return xmlName;
	}



	public void setXmlName(String xmlName) {
		this.xmlName = xmlName;
	}



	public String getXmlPath() {
		return xmlPath;
	}



	public void setXmlPath(String xmlPath) {
		this.xmlPath = xmlPath;
	}



	public String getDocName() {
		return docName;
	}



	public void setDocName(String docName) {
		this.docName = docName;
	}



	public String getDocPath() {
		return docPath;
	}



	public void setDocPath(String docPath) {
		this.docPath = docPath;
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



	public Integer getFycj() {
		return fycj;
	}



	public void setFycj(Integer fycj) {
		this.fycj = fycj;
	}



	public String getGymc() {
		return gymc;
	}



	public void setGymc(String gymc) {
		this.gymc = gymc;
	}



	public String getZymc() {
		return zymc;
	}



	public void setZymc(String zymc) {
		this.zymc = zymc;
	}



	public String getJcymc() {
		return jcymc;
	}



	public void setJcymc(String jcymc) {
		this.jcymc = jcymc;
	}



	public Date getCprq() {
		return cprq;
	}



	public void setCprq(Date cprq) {
		this.cprq = cprq;
	}



	public String getCpnf() {
		return cpnf;
	}



	public void setCpnf(String cpnf) {
		this.cpnf = cpnf;
	}



	public String getSpcx() {
		return spcx;
	}



	public void setSpcx(String spcx) {
		this.spcx = spcx;
	}



	public String getSpry() {
		return spry;
	}



	public void setSpry(String spry) {
		this.spry = spry;
	}



	public String getYghzgsr() {
		return yghzgsr;
	}



	public void setYghzgsr(String yghzgsr) {
		this.yghzgsr = yghzgsr;
	}



	public String getBg() {
		return bg;
	}



	public void setBg(String bg) {
		this.bg = bg;
	}



	public String getYgsfct() {
		return ygsfct;
	}



	public void setYgsfct(String ygsfct) {
		this.ygsfct = ygsfct;
	}



	public String getBgsfct() {
		return bgsfct;
	}



	public void setBgsfct(String bgsfct) {
		this.bgsfct = bgsfct;
	}



	public String getLsmc() {
		return lsmc;
	}



	public void setLsmc(String lsmc) {
		this.lsmc = lsmc;
	}



	public String getLsxm() {
		return lsxm;
	}



	public void setLsxm(String lsxm) {
		this.lsxm = lsxm;
	}



	public String getFlyj() {
		return flyj;
	}



	public void setFlyj(String flyj) {
		this.flyj = flyj;
	}



	@Override
    public String toString() {
        return "Wssxb{" +
                "wsid=" + wsid +
                ", wsah='" + wsah + '\'' +
                ", wsmc='" + wsmc + '\'' +
                ", wslx='" + wslx + '\'' +
                ", xmlName='" + xmlName + '\'' +
                ", xmlPath='" + xmlPath + '\'' +
                ", docName='" + docName + '\'' +
                ", docPath='" + docPath + '\'' +
                ", ajlb='" + ajlb + '\'' +
                ", aycj=" + aycj +
                ", yjaymc='" + yjaymc + '\'' +
                ", yjaydm='" + yjaydm + '\'' +
                ", ejaymc='" + ejaymc + '\'' +
                ", ejaydm='" + ejaydm + '\'' +
                ", sjaymc='" + sjaymc + '\'' +
                ", sjaydm='" + sjaydm + '\'' +
                ", sijaymc='" + sijaymc + '\'' +
                ", sijaydm='" + sijaydm + '\'' +
                ", fycj='" + fycj + '\'' +
                ", gymc='" + gymc + '\'' +
                ", zymc='" + zymc + '\'' +
                ", jcymc='" + jcymc + '\'' +
                ", cprq='" + cprq + '\'' +
                ", cpnf='" + cpnf + '\'' +
                ", spcx='" + spcx + '\'' +
                ", spry='" + spry + '\'' +
                ", yghzgsr='" + yghzgsr + '\'' +
                ", bg='" + bg + '\'' +
                ", ygsfct='" + ygsfct + '\'' +
                ", bgsfct='" + bgsfct + '\'' +
                ", lsmc='" + lsmc + '\'' +
                ", lsxm='" + lsxm + '\'' +
                ", flyj='" + flyj + '\'' +
                '}';
    }
}
