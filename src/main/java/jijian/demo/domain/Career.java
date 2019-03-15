package jijian.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Career implements Serializable {
    /**
     * 主键
     */
    private Long pkId;

    /**
     * 用户id
     */
    private String openId;

    /**
     * 进攻
     */
    private Integer attack;

    /**
     * 防守
     */
    private Integer defend;

    /**
     * 反击
     */
    private Integer counterattack;

    /**
     * 胜利场次
     */
    private Integer victory;

    /**
     * 总场次
     */
    private Integer total;

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

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefend() {
        return defend;
    }

    public void setDefend(Integer defend) {
        this.defend = defend;
    }

    public Integer getCounterattack() {
        return counterattack;
    }

    public void setCounterattack(Integer counterattack) {
        this.counterattack = counterattack;
    }

    public Integer getVictory() {
        return victory;
    }

    public void setVictory(Integer victory) {
        this.victory = victory;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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
        Career other = (Career) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getAttack() == null ? other.getAttack() == null : this.getAttack().equals(other.getAttack()))
            && (this.getDefend() == null ? other.getDefend() == null : this.getDefend().equals(other.getDefend()))
            && (this.getCounterattack() == null ? other.getCounterattack() == null : this.getCounterattack().equals(other.getCounterattack()))
            && (this.getVictory() == null ? other.getVictory() == null : this.getVictory().equals(other.getVictory()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkId() == null) ? 0 : getPkId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getAttack() == null) ? 0 : getAttack().hashCode());
        result = prime * result + ((getDefend() == null) ? 0 : getDefend().hashCode());
        result = prime * result + ((getCounterattack() == null) ? 0 : getCounterattack().hashCode());
        result = prime * result + ((getVictory() == null) ? 0 : getVictory().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
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
        sb.append(", attack=").append(attack);
        sb.append(", defend=").append(defend);
        sb.append(", counterattack=").append(counterattack);
        sb.append(", victory=").append(victory);
        sb.append(", total=").append(total);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}