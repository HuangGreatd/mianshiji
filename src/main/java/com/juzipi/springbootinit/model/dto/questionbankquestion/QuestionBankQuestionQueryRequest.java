package com.juzipi.springbootinit.model.dto.questionbankquestion;

import com.juzipi.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 查询题库题目关联请求
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionBankQuestionQueryRequest extends PageRequest implements Serializable {
    
    /**
     * 题库 id
     */
    private Long questionBankId;
    
    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}