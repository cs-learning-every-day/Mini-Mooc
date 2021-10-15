package com.xmchx.servicebase.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 *  
 */
@Data
public class MemberDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;//会员id
    private String mobile;//手机号
    private String nickname;//昵称
}