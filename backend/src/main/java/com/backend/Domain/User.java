package com.backend.Domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UID
     *
     * @mbggenerated
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.course
     *
     * @mbggenerated
     */
    private String course;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastTime
     *
     * @mbggenerated
     */
    private Date lasttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.UID
     *
     * @return the value of user.UID
     *
     * @mbggenerated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.UID
     *
     * @param uid the value for user.UID
     *
     * @mbggenerated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.course
     *
     * @return the value of user.course
     *
     * @mbggenerated
     */
    public String getCourse() {
        return course;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.course
     *
     * @param course the value for user.course
     *
     * @mbggenerated
     */
    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastTime
     *
     * @return the value of user.lastTime
     *
     * @mbggenerated
     */
    public Date getLasttime() {
        return lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lastTime
     *
     * @param lasttime the value for user.lastTime
     *
     * @mbggenerated
     */
    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
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
        User other = (User) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCourse() == null ? other.getCourse() == null : this.getCourse().equals(other.getCourse()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCourse() == null) ? 0 : getCourse().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", course=").append(course);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}