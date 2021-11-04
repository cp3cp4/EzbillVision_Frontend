package com.backend.Domain;

import java.io.Serializable;
import java.util.Date;

public class Map implements Serializable {

    private String latlng;

    public String getLatlng(){
        return latlng;
    }

    public void setLatlng(String latlng){
        this.latlng = latlng;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column map.MID
     *
     * @mbggenerated
     */
    private Integer mid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column map.buildName
     *
     * @mbggenerated
     */
    private String buildname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column map.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column map.lastTime
     *
     * @mbggenerated
     */
    private Date lasttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table map
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column map.MID
     *
     * @return the value of map.MID
     *
     * @mbggenerated
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column map.MID
     *
     * @param mid the value for map.MID
     *
     * @mbggenerated
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column map.buildName
     *
     * @return the value of map.buildName
     *
     * @mbggenerated
     */
    public String getBuildname() {
        return buildname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column map.buildName
     *
     * @param buildname the value for map.buildName
     *
     * @mbggenerated
     */
    public void setBuildname(String buildname) {
        this.buildname = buildname == null ? null : buildname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column map.address
     *
     * @return the value of map.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column map.address
     *
     * @param address the value for map.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column map.lastTime
     *
     * @return the value of map.lastTime
     *
     * @mbggenerated
     */
    public Date getLasttime() {
        return lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column map.lastTime
     *
     * @param lasttime the value for map.lastTime
     *
     * @mbggenerated
     */
    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map
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
        Map other = (Map) that;
        return (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getBuildname() == null ? other.getBuildname() == null : this.getBuildname().equals(other.getBuildname()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getBuildname() == null) ? 0 : getBuildname().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table map
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mid=").append(mid);
        sb.append(", buildname=").append(buildname);
        sb.append(", address=").append(address);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}