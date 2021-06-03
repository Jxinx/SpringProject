package tech.jxinx.springboot.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("roleinfo")
public class RoleInfo {

	private String roleid; // 角色ID

	private String rolename; // 角色名称

	private String remark; // 备注

	private String updateby; // 更新者

    private String createby; // 录入者

    private Date createdate; // 录入时间

    private Date updatedate; // 更新时间

    private Short activeflag; // 是否有效

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid == null ? null : roleid.trim();
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getUpdateby() {
		return updateby;
	}

	public void setUpdateby(String updateby) {
		this.updateby = updateby == null ? null : updateby.trim();
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby == null ? null : createby.trim();
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Short getActiveflag() {
		return activeflag;
	}

	public void setActiveflag(Short activeflag) {
		this.activeflag = activeflag;
	}

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleid='" + roleid + '\'' +
                ", rolename='" + rolename + '\'' +
                ", remark='" + remark + '\'' +
                ", updateby='" + updateby + '\'' +
                ", createby='" + createby + '\'' +
                ", createdate=" + createdate +
                ", updatedate=" + updatedate +
                ", activeflag=" + activeflag +
                '}';
    }
}