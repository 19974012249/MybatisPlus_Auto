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
public class Com_comment_reply implements Serializable {


    /**
     * 评价ID
     */
    private Long comment_id;

    /**
     * 用户ID
     */
    private Long user_id;

    /**
     * 被回复人ID（如：回复张三，此处即为张三的ID）
     */
    private Long replyuser_id;

    /**
     * 回复内容
     */
    private String content;

    /**
     * 点赞数
     */
    private Integer prase_count;

    /**
     * 回复时间
     */
    private LocalDateTime createtime;

    public Long getComment_id() {
        return comment_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }
    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public Long getReplyuser_id() {
        return replyuser_id;
    }

    public void setReplyuser_id(Long replyuser_id) {
        this.replyuser_id = replyuser_id;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public String toString() {
        return "Com_comment_reply{" +
            "comment_id=" + comment_id +
            ", user_id=" + user_id +
            ", replyuser_id=" + replyuser_id +
            ", content=" + content +
            ", prase_count=" + prase_count +
            ", createtime=" + createtime +
        "}";
    }
}
