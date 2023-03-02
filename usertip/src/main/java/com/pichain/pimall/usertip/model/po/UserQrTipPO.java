package com.pichain.pimall.usertip.model.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_qr_tip")
public class UserQrTipPO {

    @TableId
    private Long id;

    private String userId;


    private Integer status;

}
