package cn.tyrone.wallet.core;

import java.io.Serializable;
import java.util.Date;

public class BaseBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6096899334181047873L;
	
	private String id;	// 主键
	private String createUser;	// 创建人编号
	private Date createTime;	// 创建时间
	private String modifyUser;	// 修改人编号
	private Date modifyTime;	// 修改时间
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
