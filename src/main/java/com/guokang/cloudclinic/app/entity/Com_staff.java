package com.guokang.cloudclinic.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 企业员工表
 * </p>
 *
 * @author 周炜
 * @since 2021-09-12
 */
public class Com_staff implements Serializable {


    /**
     * 自增ID
     */
    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staff_id;

    /**
     * 企业ID
     */
    private Integer company_id;

    /**
     * 员工姓名（可能跟会员表冗余）
     */
    private String staff_name;

    /**
     * 员工性别（可能跟会员表冗余）
     */
    private Integer staff_gender;

    /**
     * 员工证件类型，默认为身份证
     */
    private Integer staff_id_type;

    /**
     * 员工手机号
     */
    private String staff_mobile;

    /**
     * 是否已婚： 0 - 否， 1 - 是
     */
    private Integer staff_is_married;

    /**
     * 员工证件号
     */
    private String staff_id_number;

    /**
     * 员工职位：董事长、董秘、高管、中层、员工
     */
    private Integer staff_job_title;

    /**
     * 员工工号
     */
    private String staff_job_number;

    /**
     * 员工所属的组ID
     */
    private Integer staff_group_id;

    /**
     * 所在组
     */
    private String staff_group;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 员工状态： 0 -正常， 离职，黑名单
     */
    private Integer staff_status;

    /**
     * 所关联会员表的ID，可存在多个员工关联到一个会员的情况。
     */
    private Integer member_id;

    /**
     * 是否删除：0:未删除，1：已删除是否删除
     */
    private Integer is_delete;

    /**
     * 创建时间
     */
    private LocalDateTime created_time;

    /**
     * 创建人
     */
    private String created_by;

    /**
     * 更新时间
     */
    private LocalDateTime updated_time;

    /**
     * 更新人
     */
    private String updated_by;

    /**
     * 出生日期
     */
    private LocalDate staff_birthday;

    /**
     * 离职员工前的会员id
     */
    private Integer old_member_id;

    /**
     * 员工标签，多个用逗号分割
     */
    private String staff_tags;

    /**
     * 年龄，已经删掉了，现在加上是为了问诊的测试，代码还没有合并
     */
    private Integer staff_age;

    /**
     * 创建类型，1：卡密认证创建
     */
    private Integer created_type;

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }
    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }
    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }
    public Integer getStaff_gender() {
        return staff_gender;
    }

    public void setStaff_gender(Integer staff_gender) {
        this.staff_gender = staff_gender;
    }
    public Integer getStaff_id_type() {
        return staff_id_type;
    }

    public void setStaff_id_type(Integer staff_id_type) {
        this.staff_id_type = staff_id_type;
    }
    public String getStaff_mobile() {
        return staff_mobile;
    }

    public void setStaff_mobile(String staff_mobile) {
        this.staff_mobile = staff_mobile;
    }
    public Integer getStaff_is_married() {
        return staff_is_married;
    }

    public void setStaff_is_married(Integer staff_is_married) {
        this.staff_is_married = staff_is_married;
    }
    public String getStaff_id_number() {
        return staff_id_number;
    }

    public void setStaff_id_number(String staff_id_number) {
        this.staff_id_number = staff_id_number;
    }
    public Integer getStaff_job_title() {
        return staff_job_title;
    }

    public void setStaff_job_title(Integer staff_job_title) {
        this.staff_job_title = staff_job_title;
    }
    public String getStaff_job_number() {
        return staff_job_number;
    }

    public void setStaff_job_number(String staff_job_number) {
        this.staff_job_number = staff_job_number;
    }
    public Integer getStaff_group_id() {
        return staff_group_id;
    }

    public void setStaff_group_id(Integer staff_group_id) {
        this.staff_group_id = staff_group_id;
    }
    public String getStaff_group() {
        return staff_group;
    }

    public void setStaff_group(String staff_group) {
        this.staff_group = staff_group;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public Integer getStaff_status() {
        return staff_status;
    }

    public void setStaff_status(Integer staff_status) {
        this.staff_status = staff_status;
    }
    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }
    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
    public LocalDateTime getCreated_time() {
        return created_time;
    }

    public void setCreated_time(LocalDateTime created_time) {
        this.created_time = created_time;
    }
    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
    public LocalDateTime getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(LocalDateTime updated_time) {
        this.updated_time = updated_time;
    }
    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }
    public LocalDate getStaff_birthday() {
        return staff_birthday;
    }

    public void setStaff_birthday(LocalDate staff_birthday) {
        this.staff_birthday = staff_birthday;
    }
    public Integer getOld_member_id() {
        return old_member_id;
    }

    public void setOld_member_id(Integer old_member_id) {
        this.old_member_id = old_member_id;
    }
    public String getStaff_tags() {
        return staff_tags;
    }

    public void setStaff_tags(String staff_tags) {
        this.staff_tags = staff_tags;
    }
    public Integer getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(Integer staff_age) {
        this.staff_age = staff_age;
    }
    public Integer getCreated_type() {
        return created_type;
    }

    public void setCreated_type(Integer created_type) {
        this.created_type = created_type;
    }

    @Override
    public String toString() {
        return "Com_staff{" +
            "staff_id=" + staff_id +
            ", company_id=" + company_id +
            ", staff_name=" + staff_name +
            ", staff_gender=" + staff_gender +
            ", staff_id_type=" + staff_id_type +
            ", staff_mobile=" + staff_mobile +
            ", staff_is_married=" + staff_is_married +
            ", staff_id_number=" + staff_id_number +
            ", staff_job_title=" + staff_job_title +
            ", staff_job_number=" + staff_job_number +
            ", staff_group_id=" + staff_group_id +
            ", staff_group=" + staff_group +
            ", remarks=" + remarks +
            ", staff_status=" + staff_status +
            ", member_id=" + member_id +
            ", is_delete=" + is_delete +
            ", created_time=" + created_time +
            ", created_by=" + created_by +
            ", updated_time=" + updated_time +
            ", updated_by=" + updated_by +
            ", staff_birthday=" + staff_birthday +
            ", old_member_id=" + old_member_id +
            ", staff_tags=" + staff_tags +
            ", staff_age=" + staff_age +
            ", created_type=" + created_type +
        "}";
    }
}
