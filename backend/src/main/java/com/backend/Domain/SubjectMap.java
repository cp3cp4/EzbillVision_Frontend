package com.backend.Domain;

import java.io.Serializable;
import java.util.Date;

public class SubjectMap implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subjmap.SMID
     *
     * @mbggenerated
     */
    private Integer smid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subjmap.subjID
     *
     * @mbggenerated
     */
    private Integer subjid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subjmap.addrID
     *
     * @mbggenerated
     */
    private Integer addrid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subjmap.type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subjmap.lastTime
     *
     * @mbggenerated
     */
    private Date lasttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subjmap
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subjmap.SMID
     *
     * @return the value of subjmap.SMID
     *
     * @mbggenerated
     */
    public Integer getSmid() {
        return smid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subjmap.SMID
     *
     * @param smid the value for subjmap.SMID
     *
     * @mbggenerated
     */
    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subjmap.subjID
     *
     * @return the value of subjmap.subjID
     *
     * @mbggenerated
     */
    public Integer getSubjid() {
        return subjid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subjmap.subjID
     *
     * @param subjid the value for subjmap.subjID
     *
     * @mbggenerated
     */
    public void setSubjid(Integer subjid) {
        this.subjid = subjid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subjmap.addrID
     *
     * @return the value of subjmap.addrID
     *
     * @mbggenerated
     */
    public Integer getAddrid() {
        return addrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subjmap.addrID
     *
     * @param addrid the value for subjmap.addrID
     *
     * @mbggenerated
     */
    public void setAddrid(Integer addrid) {
        this.addrid = addrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subjmap.type
     *
     * @return the value of subjmap.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subjmap.type
     *
     * @param type the value for subjmap.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subjmap.lastTime
     *
     * @return the value of subjmap.lastTime
     *
     * @mbggenerated
     */
    public Date getLasttime() {
        return lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subjmap.lastTime
     *
     * @param lasttime the value for subjmap.lastTime
     *
     * @mbggenerated
     */
    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subjmap
     *
     * @mbggenerated
     */
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
        SubjectMap other = (SubjectMap) that;
        return (this.getSmid() == null ? other.getSmid() == null : this.getSmid().equals(other.getSmid()))
            && (this.getSubjid() == null ? other.getSubjid() == null : this.getSubjid().equals(other.getSubjid()))
            && (this.getAddrid() == null ? other.getAddrid() == null : this.getAddrid().equals(other.getAddrid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subjmap
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSmid() == null) ? 0 : getSmid().hashCode());
        result = prime * result + ((getSubjid() == null) ? 0 : getSubjid().hashCode());
        result = prime * result + ((getAddrid() == null) ? 0 : getAddrid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subjmap
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", smid=").append(smid);
        sb.append(", subjid=").append(subjid);
        sb.append(", addrid=").append(addrid);
        sb.append(", type=").append(type);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}