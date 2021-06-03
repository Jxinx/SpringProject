package tech.jxinx.springboot.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jxinx
 * @since 2021-06-03
 */
public class Resumeinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "resumeid", type = IdType.ID_WORKER)
    private String resumeid;

    private String sourceresumeid;

    private String username;

    private String sex;

    private String borndate;

    private String age;

    private String marital;

    private String email;

    private String jobtypeid;

    private String address;

    private String telphoneia;

    private String telphonearea;

    private String telephone;

    private String livecityid;

    private String homepage;

    private String idtype;

    private String id;

    private String accountcityid;

    private String accountaddress;

    private String salary;

    private String basesalary;

    private String yearbonus;

    private String workyears;

    private String postcode;

    private String jobstatus;

    private String corptelia;

    private String corptelarea;

    private String corptelz;

    private String corptelf;

    private String keyword;

    private String height;

    private String politics;

    private String qqcode;

    private String national;

    private String hometelia;

    private String hometelarea;

    private String hometelno;

    private String educationbg;

    private String postcodenow;

    private String postids;

    private String startworkyear;

    private String joblb;

    private String companynow;

    private String titlenow;

    private Long resumeLevelId;

    private Integer isdownload;

    private Integer isverify;

    private String telephoneimage;

    private String emailimage;

    private String imageflg;

    private String updateby;

    private String createby;

    private Date createdate;

    private Date updatedate;

    private Integer activeflag;


    @TableField("sourceId")
    private String sourceId;


    private String channel;


    private String indate;


    private String url;


    private String headimg;


    private String headimgflag;


    private String resumename;


    private String dutynow;

    private String sourcewho;


    private String filepath;


    public String getResumeid() {
        return resumeid;
    }

    public void setResumeid(String resumeid) {
        this.resumeid = resumeid;
    }

    public String getSourceresumeid() {
        return sourceresumeid;
    }

    public void setSourceresumeid(String sourceresumeid) {
        this.sourceresumeid = sourceresumeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBorndate() {
        return borndate;
    }

    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobtypeid() {
        return jobtypeid;
    }

    public void setJobtypeid(String jobtypeid) {
        this.jobtypeid = jobtypeid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphoneia() {
        return telphoneia;
    }

    public void setTelphoneia(String telphoneia) {
        this.telphoneia = telphoneia;
    }

    public String getTelphonearea() {
        return telphonearea;
    }

    public void setTelphonearea(String telphonearea) {
        this.telphonearea = telphonearea;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLivecityid() {
        return livecityid;
    }

    public void setLivecityid(String livecityid) {
        this.livecityid = livecityid;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountcityid() {
        return accountcityid;
    }

    public void setAccountcityid(String accountcityid) {
        this.accountcityid = accountcityid;
    }

    public String getAccountaddress() {
        return accountaddress;
    }

    public void setAccountaddress(String accountaddress) {
        this.accountaddress = accountaddress;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(String basesalary) {
        this.basesalary = basesalary;
    }

    public String getYearbonus() {
        return yearbonus;
    }

    public void setYearbonus(String yearbonus) {
        this.yearbonus = yearbonus;
    }

    public String getWorkyears() {
        return workyears;
    }

    public void setWorkyears(String workyears) {
        this.workyears = workyears;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus;
    }

    public String getCorptelia() {
        return corptelia;
    }

    public void setCorptelia(String corptelia) {
        this.corptelia = corptelia;
    }

    public String getCorptelarea() {
        return corptelarea;
    }

    public void setCorptelarea(String corptelarea) {
        this.corptelarea = corptelarea;
    }

    public String getCorptelz() {
        return corptelz;
    }

    public void setCorptelz(String corptelz) {
        this.corptelz = corptelz;
    }

    public String getCorptelf() {
        return corptelf;
    }

    public void setCorptelf(String corptelf) {
        this.corptelf = corptelf;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getQqcode() {
        return qqcode;
    }

    public void setQqcode(String qqcode) {
        this.qqcode = qqcode;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getHometelia() {
        return hometelia;
    }

    public void setHometelia(String hometelia) {
        this.hometelia = hometelia;
    }

    public String getHometelarea() {
        return hometelarea;
    }

    public void setHometelarea(String hometelarea) {
        this.hometelarea = hometelarea;
    }

    public String getHometelno() {
        return hometelno;
    }

    public void setHometelno(String hometelno) {
        this.hometelno = hometelno;
    }

    public String getEducationbg() {
        return educationbg;
    }

    public void setEducationbg(String educationbg) {
        this.educationbg = educationbg;
    }

    public String getPostcodenow() {
        return postcodenow;
    }

    public void setPostcodenow(String postcodenow) {
        this.postcodenow = postcodenow;
    }

    public String getPostids() {
        return postids;
    }

    public void setPostids(String postids) {
        this.postids = postids;
    }

    public String getStartworkyear() {
        return startworkyear;
    }

    public void setStartworkyear(String startworkyear) {
        this.startworkyear = startworkyear;
    }

    public String getJoblb() {
        return joblb;
    }

    public void setJoblb(String joblb) {
        this.joblb = joblb;
    }

    public String getCompanynow() {
        return companynow;
    }

    public void setCompanynow(String companynow) {
        this.companynow = companynow;
    }

    public String getTitlenow() {
        return titlenow;
    }

    public void setTitlenow(String titlenow) {
        this.titlenow = titlenow;
    }

    public Long getResumeLevelId() {
        return resumeLevelId;
    }

    public void setResumeLevelId(Long resumeLevelId) {
        this.resumeLevelId = resumeLevelId;
    }

    public Integer getIsdownload() {
        return isdownload;
    }

    public void setIsdownload(Integer isdownload) {
        this.isdownload = isdownload;
    }

    public Integer getIsverify() {
        return isverify;
    }

    public void setIsverify(Integer isverify) {
        this.isverify = isverify;
    }

    public String getTelephoneimage() {
        return telephoneimage;
    }

    public void setTelephoneimage(String telephoneimage) {
        this.telephoneimage = telephoneimage;
    }

    public String getEmailimage() {
        return emailimage;
    }

    public void setEmailimage(String emailimage) {
        this.emailimage = emailimage;
    }

    public String getImageflg() {
        return imageflg;
    }

    public void setImageflg(String imageflg) {
        this.imageflg = imageflg;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Integer getActiveflag() {
        return activeflag;
    }

    public void setActiveflag(Integer activeflag) {
        this.activeflag = activeflag;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getHeadimgflag() {
        return headimgflag;
    }

    public void setHeadimgflag(String headimgflag) {
        this.headimgflag = headimgflag;
    }

    public String getResumename() {
        return resumename;
    }

    public void setResumename(String resumename) {
        this.resumename = resumename;
    }

    public String getDutynow() {
        return dutynow;
    }

    public void setDutynow(String dutynow) {
        this.dutynow = dutynow;
    }

    public String getSourcewho() {
        return sourcewho;
    }

    public void setSourcewho(String sourcewho) {
        this.sourcewho = sourcewho;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        return "Resumeinfo{" +
        "resumeid=" + resumeid +
        ", sourceresumeid=" + sourceresumeid +
        ", username=" + username +
        ", sex=" + sex +
        ", borndate=" + borndate +
        ", age=" + age +
        ", marital=" + marital +
        ", email=" + email +
        ", jobtypeid=" + jobtypeid +
        ", address=" + address +
        ", telphoneia=" + telphoneia +
        ", telphonearea=" + telphonearea +
        ", telephone=" + telephone +
        ", livecityid=" + livecityid +
        ", homepage=" + homepage +
        ", idtype=" + idtype +
        ", id=" + id +
        ", accountcityid=" + accountcityid +
        ", accountaddress=" + accountaddress +
        ", salary=" + salary +
        ", basesalary=" + basesalary +
        ", yearbonus=" + yearbonus +
        ", workyears=" + workyears +
        ", postcode=" + postcode +
        ", jobstatus=" + jobstatus +
        ", corptelia=" + corptelia +
        ", corptelarea=" + corptelarea +
        ", corptelz=" + corptelz +
        ", corptelf=" + corptelf +
        ", keyword=" + keyword +
        ", height=" + height +
        ", politics=" + politics +
        ", qqcode=" + qqcode +
        ", national=" + national +
        ", hometelia=" + hometelia +
        ", hometelarea=" + hometelarea +
        ", hometelno=" + hometelno +
        ", educationbg=" + educationbg +
        ", postcodenow=" + postcodenow +
        ", postids=" + postids +
        ", startworkyear=" + startworkyear +
        ", joblb=" + joblb +
        ", companynow=" + companynow +
        ", titlenow=" + titlenow +
        ", resumeLevelId=" + resumeLevelId +
        ", isdownload=" + isdownload +
        ", isverify=" + isverify +
        ", telephoneimage=" + telephoneimage +
        ", emailimage=" + emailimage +
        ", imageflg=" + imageflg +
        ", updateby=" + updateby +
        ", createby=" + createby +
        ", createdate=" + createdate +
        ", updatedate=" + updatedate +
        ", activeflag=" + activeflag +
        ", sourceId=" + sourceId +
        ", channel=" + channel +
        ", indate=" + indate +
        ", url=" + url +
        ", headimg=" + headimg +
        ", headimgflag=" + headimgflag +
        ", resumename=" + resumename +
        ", dutynow=" + dutynow +
        ", sourcewho=" + sourcewho +
        ", filepath=" + filepath +
        "}";
    }
}
