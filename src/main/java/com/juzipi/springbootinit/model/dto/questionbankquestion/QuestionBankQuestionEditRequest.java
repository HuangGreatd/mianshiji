package com.juzipi.springbootinit.model.dto.questionbankquestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 编辑题库题目关联请求
 *
 */
@Data
public class QuestionBankQuestionEditRequest implements Serializable {
    
    /**
     * id
     */
    private Long id;
    
    /**
     * id
     */
    private Long notId;
    
    /**
     * 题库 id
     */
    private Long questionBankId;
    
    /**
     * 题目 id
     */
    private Long questionId;
    
    /**
     * 创建用户 id
     */
    private Long userId;
    
    
    private static final long serialVersionUID = 1L;
}