package com.guokang.cloudclinic.member.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 蔡诚杰
 * @since 2021-04-11
 */
public class Com_comment implements Serializable {


    /**
     * 评价ID
     */
    private Long comment_id;

    /**
     * 会员提交报告ID
     */
    private Integer report_id;

    /**
     * answerID
     */
    private Long answer_id;

    /**
     * 用户（评价）ID
     */
    private Long user_id;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 状态：0待审核，1通过，2不通过
     */
    private Integer state;

    /**
     * 点赞数
     */
    private Integer prase_count;

    /**
     * 评论时间
     */
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    private LocalDateTime updatetime;

    public Long getComment_id() {
        return comment_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }
    public Integer getReport_id() {
        return report_id;
    }

    public void setReport_id(Integer report_id) {
        this.report_id = report_id;
    }
    public Long getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Long answer_id) {
        this.answer_id = answer_id;
    }
    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public Integer getPrase_count() {
        return prase_count;
    }

    public void setPrase_count(Integer prase_count) {
        this.prase_count = prase_count;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }
    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "Com_comment{" +
            "comment_id=" + comment_id +
            ", report_id=" + report_id +
            ", answer_id=" + answer_id +
            ", user_id=" + user_id +
            ", content=" + content +
            ", state=" + state +
            ", prase_count=" + prase_count +
            ", createtime=" + createtime +
            ", updatetime=" + updatetime +
        "}";
    }
}
