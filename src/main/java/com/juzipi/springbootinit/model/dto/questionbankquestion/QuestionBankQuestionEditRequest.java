package com.juzipi.springbootinit.model.dto.questionbankquestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 编辑题库题目关联请求
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
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