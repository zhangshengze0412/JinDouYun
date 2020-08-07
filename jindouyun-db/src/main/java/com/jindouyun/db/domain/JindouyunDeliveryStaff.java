package com.jindouyun.db.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class JindouyunDeliveryStaff implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jindouyun_delivery_staff.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jindouyun_delivery_staff.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jindouyun_delivery_staff.today_status
     *
     * @mbg.generated
     */
    private Short todayStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jindouyun_delivery_staff.work_type
     *
     * @mbg.generated
     */
    private Byte workType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jindouyun_delivery_staff.work_status
     *
     * @mbg.generated
     */
    private Short workStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jindouyun_delivery_staff.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jindouyun_delivery_staff.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jindouyun_delivery_staff.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jindouyun_delivery_staff.id
     *
     * @return the value of jindouyun_delivery_staff.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jindouyun_delivery_staff.id
     *
     * @param id the value for jindouyun_delivery_staff.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jindouyun_delivery_staff.user_id
     *
     * @return the value of jindouyun_delivery_staff.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jindouyun_delivery_staff.user_id
     *
     * @param userId the value for jindouyun_delivery_staff.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jindouyun_delivery_staff.today_status
     *
     * @return the value of jindouyun_delivery_staff.today_status
     *
     * @mbg.generated
     */
    public Short getTodayStatus() {
        return todayStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jindouyun_delivery_staff.today_status
     *
     * @param todayStatus the value for jindouyun_delivery_staff.today_status
     *
     * @mbg.generated
     */
    public void setTodayStatus(Short todayStatus) {
        this.todayStatus = todayStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jindouyun_delivery_staff.work_type
     *
     * @return the value of jindouyun_delivery_staff.work_type
     *
     * @mbg.generated
     */
    public Byte getWorkType() {
        return workType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jindouyun_delivery_staff.work_type
     *
     * @param workType the value for jindouyun_delivery_staff.work_type
     *
     * @mbg.generated
     */
    public void setWorkType(Byte workType) {
        this.workType = workType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jindouyun_delivery_staff.work_status
     *
     * @return the value of jindouyun_delivery_staff.work_status
     *
     * @mbg.generated
     */
    public Short getWorkStatus() {
        return workStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jindouyun_delivery_staff.work_status
     *
     * @param workStatus the value for jindouyun_delivery_staff.work_status
     *
     * @mbg.generated
     */
    public void setWorkStatus(Short workStatus) {
        this.workStatus = workStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jindouyun_delivery_staff.add_time
     *
     * @return the value of jindouyun_delivery_staff.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jindouyun_delivery_staff.add_time
     *
     * @param addTime the value for jindouyun_delivery_staff.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jindouyun_delivery_staff.update_time
     *
     * @return the value of jindouyun_delivery_staff.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jindouyun_delivery_staff.update_time
     *
     * @param updateTime the value for jindouyun_delivery_staff.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jindouyun_delivery_staff.deleted
     *
     * @return the value of jindouyun_delivery_staff.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jindouyun_delivery_staff.deleted
     *
     * @param deleted the value for jindouyun_delivery_staff.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", IS_DELETED=").append(IS_DELETED);
        sb.append(", NOT_DELETED=").append(NOT_DELETED);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", todayStatus=").append(todayStatus);
        sb.append(", workType=").append(workType);
        sb.append(", workStatus=").append(workStatus);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
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
        JindouyunDeliveryStaff other = (JindouyunDeliveryStaff) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTodayStatus() == null ? other.getTodayStatus() == null : this.getTodayStatus().equals(other.getTodayStatus()))
            && (this.getWorkType() == null ? other.getWorkType() == null : this.getWorkType().equals(other.getWorkType()))
            && (this.getWorkStatus() == null ? other.getWorkStatus() == null : this.getWorkStatus().equals(other.getWorkStatus()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTodayStatus() == null) ? 0 : getTodayStatus().hashCode());
        result = prime * result + ((getWorkType() == null) ? 0 : getWorkType().hashCode());
        result = prime * result + ((getWorkStatus() == null) ? 0 : getWorkStatus().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table jindouyun_delivery_staff
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        userId("user_id", "userId", "INTEGER", false),
        todayStatus("today_status", "todayStatus", "SMALLINT", false),
        workType("work_type", "workType", "TINYINT", false),
        workStatus("work_status", "workStatus", "SMALLINT", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jindouyun_delivery_staff
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}