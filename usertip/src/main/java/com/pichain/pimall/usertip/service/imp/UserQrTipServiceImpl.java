package com.pichain.pimall.usertip.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.pichain.pimall.usertip.common.R;
import com.pichain.pimall.usertip.mapper.UserQrTipMapper;
import com.pichain.pimall.usertip.model.po.UserQrTipPO;
import com.pichain.pimall.usertip.model.vo.UserQrTipVo;
import com.pichain.pimall.usertip.service.IUserQrTipService;
import com.pichain.pimall.usertip.utils.SnowIdUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sun.security.provider.certpath.SunCertPathBuilder;

import static com.pichain.pimall.usertip.common.Constant.User.USER_ID;
import static com.pichain.pimall.usertip.common.ReturnMsg.common.FAIL_CODE;
import static com.pichain.pimall.usertip.common.ReturnMsg.common.SUCCESS_CODE;

@Service
public class UserQrTipServiceImpl extends ServiceImpl<UserQrTipMapper, UserQrTipPO> implements IUserQrTipService   {

    @Override
    public R selectTipStatusByUserId(String userId) {
        if (!StringUtils.isEmpty(userId)){
            // 根据userid查找提示状态
            UserQrTipPO userinfo = this.baseMapper.selectOne(new QueryWrapper<UserQrTipPO>().eq(USER_ID, userId));
            if (userinfo!=null ){
                return new R(SUCCESS_CODE,"access successful!",userinfo.getStatus());
            }

            // 如果对象为null，则插入数据库
            long newId = SnowIdUtils.nextId();
            UserQrTipPO userQrTipPO = new UserQrTipPO();
            userQrTipPO.setId(newId);
            userQrTipPO.setUserId(userId);
            this.baseMapper.insert(userQrTipPO);

            // 插入情况下返回默认状态
            return new R(SUCCESS_CODE,"access successful!",1);

        }else {
            return new R(FAIL_CODE,"params error!");
        }
    }

    @Override
    public R updateUserQrTipStatusByUserId(UserQrTipVo userQrTipVo) {
        UserQrTipPO userQrTipPO = new UserQrTipPO();
        BeanUtils.copyProperties(userQrTipVo, userQrTipPO);

        //  获取传输过来 userid 和 tipStatus
        Integer tipStatus = userQrTipPO.getStatus();
        String userId = userQrTipPO.getUserId();

        // 如果userid和tipStatus存在
        if (!StringUtils.isEmpty(userId) && !StringUtils.isEmpty(tipStatus.toString())){
            this.baseMapper.update(userQrTipPO,new UpdateWrapper<UserQrTipPO>().eq(USER_ID,userId));
            return new R(SUCCESS_CODE,"access successful!");
        }else {
            return new R(FAIL_CODE,"params error!");
        }
    }

}
