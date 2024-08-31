package com.juzipi.springbootinit.model.entity;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * 题目
 * * @author juzipi
 *
 * @TableName question
 */
@TableName(value = "question")
@Data
public class Question implements Serializable {
	/**
	 * id
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private Long id;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 内容
	 */
	private String content;
	
	/**
	 * 标签列表（json 数组）
	 */
	private String tags;
	
	/**
	 * 推荐答案
	 */
	private String answer;
	
	/**
	 * 创建用户 id
	 */
	private Long userId;
	
	/**
	 * 编辑时间
	 */
	private Date editTime;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
	/**
	 * 是否删除
	 */
	@TableLogic
	private Integer isDelete;
	
	@TableField(exist = false)
	private static final long serialVersionUID = 1L;
}