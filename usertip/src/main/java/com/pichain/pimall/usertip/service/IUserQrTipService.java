package com.pichain.pimall.usertip.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pichain.pimall.usertip.common.R;
import com.pichain.pimall.usertip.model.po.UserQrTipPO;
import com.pichain.pimall.usertip.model.vo.UserQrTipVo;

public interface IUserQrTipService extends IService<UserQrTipPO> {
    /**
     * 通过userid查询
     * @param userId 用户id
     * @return  R
     * */
    R selectTipStatusByUserId(String userId);
    /**
     * 根据userid更改状态
     * @param userQrTipVo  修改信息
     * @return R
     * */
    R updateUserQrTipStatusByUserId(UserQrTipVo userQrTipVo);
}
