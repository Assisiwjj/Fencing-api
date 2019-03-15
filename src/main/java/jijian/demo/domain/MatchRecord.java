package jijian.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MatchRecord implements Serializable {
    /**
     * 主键
     */
    private Long pkId;

    /**
     * 用户id
     */
    private String openId;

    /**
     * 红方姓名
     */
    private String redName;

    /**
     * 红方进攻
     */
    private Byte redAttack;

    /**
     * 红方防守
     */
    private Byte redDefend;

    /**
     * 红方反击
     */
    private Byte redCounterattack;

    /**
     * 绿方姓名
     */
    private String greenName;

    /**
     * 绿方进攻

     */
    private Byte greenAttack;

    /**
     * 绿方防守
     */
    private Byte greenDefend;

    /**
     * 绿方反击
     */
    private Byte greenCounterattack;

    /**
     * 是否胜利
     */
    private Boolean isVictory;

    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date gmtCreate;

    /**
     * 更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getRedName() {
        return redName;
    }

    public void setRedName(String redName) {
        this.redName = redName;
    }

    public Byte getRedAttack() {
        return redAttack;
    }

    public void setRedAttack(Byte redAttack) {
        this.redAttack = redAttack;
    }

    public Byte getRedDefend() {
        return redDefend;
    }

    public void setRedDefend(Byte redDefend) {
        this.redDefend = redDefend;
    }

    public Byte getRedCounterattack() {
        return redCounterattack;
    }

    public void setRedCounterattack(Byte redCounterattack) {
        this.redCounterattack = redCounterattack;
    }

    public String getGreenName() {
        return greenName;
    }

    public void setGreenName(String greenName) {
        this.greenName = greenName;
    }

    public Byte getGreenAttack() {
        return greenAttack;
    }

    public void setGreenAttack(Byte greenAttack) {
        this.greenAttack = greenAttack;
    }

    public Byte getGreenDefend() {
        return greenDefend;
    }

    public void setGreenDefend(Byte greenDefend) {
        this.greenDefend = greenDefend;
    }

    public Byte getGreenCounterattack() {
        return greenCounterattack;
    }

    public void setGreenCounterattack(Byte greenCounterattack) {
        this.greenCounterattack = greenCounterattack;
    }

    public Boolean getIsVictory() {
        return isVictory;
    }

    public void setIsVictory(Boolean isVictory) {
        this.isVictory = isVictory;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MatchRecord other = (MatchRecord) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getRedName() == null ? other.getRedName() == null : this.getRedName().equals(other.getRedName()))
            && (this.getRedAttack() == null ? other.getRedAttack() == null : this.getRedAttack().equals(other.getRedAttack()))
            && (this.getRedDefend() == null ? other.getRedDefend() == null : this.getRedDefend().equals(other.getRedDefend()))
            && (this.getRedCounterattack() == null ? other.getRedCounterattack() == null : this.getRedCounterattack().equals(other.getRedCounterattack()))
            && (this.getGreenName() == null ? other.getGreenName() == null : this.getGreenName().equals(other.getGreenName()))
            && (this.getGreenAttack() == null ? other.getGreenAttack() == null : this.getGreenAttack().equals(other.getGreenAttack()))
            && (this.getGreenDefend() == null ? other.getGreenDefend() == null : this.getGreenDefend().equals(other.getGreenDefend()))
            && (this.getGreenCounterattack() == null ? other.getGreenCounterattack() == null : this.getGreenCounterattack().equals(other.getGreenCounterattack()))
            && (this.getIsVictory() == null ? other.getIsVictory() == null : this.getIsVictory().equals(other.getIsVictory()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkId() == null) ? 0 : getPkId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getRedName() == null) ? 0 : getRedName().hashCode());
        result = prime * result + ((getRedAttack() == null) ? 0 : getRedAttack().hashCode());
        result = prime * result + ((getRedDefend() == null) ? 0 : getRedDefend().hashCode());
        result = prime * result + ((getRedCounterattack() == null) ? 0 : getRedCounterattack().hashCode());
        result = prime * result + ((getGreenName() == null) ? 0 : getGreenName().hashCode());
        result = prime * result + ((getGreenAttack() == null) ? 0 : getGreenAttack().hashCode());
        result = prime * result + ((getGreenDefend() == null) ? 0 : getGreenDefend().hashCode());
        result = prime * result + ((getGreenCounterattack() == null) ? 0 : getGreenCounterattack().hashCode());
        result = prime * result + ((getIsVictory() == null) ? 0 : getIsVictory().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkId=").append(pkId);
        sb.append(", openId=").append(openId);
        sb.append(", redName=").append(redName);
        sb.append(", redAttack=").append(redAttack);
        sb.append(", redDefend=").append(redDefend);
        sb.append(", redCounterattack=").append(redCounterattack);
        sb.append(", greenName=").append(greenName);
        sb.append(", greenAttack=").append(greenAttack);
        sb.append(", greenDefend=").append(greenDefend);
        sb.append(", greenCounterattack=").append(greenCounterattack);
        sb.append(", isVictory=").append(isVictory);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}