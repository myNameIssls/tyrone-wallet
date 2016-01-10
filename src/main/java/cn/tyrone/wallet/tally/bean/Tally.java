package cn.tyrone.wallet.tally.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import cn.tyrone.wallet.core.BaseBean;

/**
 * 记帐信息类
 * @author Tyrone
 */
public class Tally extends BaseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1008934261308400219L;
	
    private Date tallyDate;			// 记账日期 
    private String tallyType;		// 记帐类型
    private String accountType;		// 帐目分类
    private BigDecimal money;		// 金额
    private String remark;			// 备注
    
	public Date getTallyDate() {
		return tallyDate;
	}
	public void setTallyDate(Date tallyDate) {
		this.tallyDate = tallyDate;
	}
	public String getTallyType() {
		return tallyType;
	}
	public void setTallyType(String tallyType) {
		this.tallyType = tallyType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
