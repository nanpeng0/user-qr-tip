package com.pichain.pimall.usertip.controller;

import com.pichain.pimall.usertip.common.R;
import com.pichain.pimall.usertip.model.vo.UserQrTipVo;
import com.pichain.pimall.usertip.service.IUserQrTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userqrtip")
public class UserQrTipController {

    @Autowired
    private IUserQrTipService iUserQrTipService;

    @GetMapping("/selectTipStatusByUserId")
    public R selectTipStatusByUserId(@RequestParam String userId){
        return iUserQrTipService.selectTipStatusByUserId(userId);
    }

    @PostMapping("/updateUserQrTipStatusByUserId")
    public R updateUserQrTipStatusByUserId(@RequestBody UserQrTipVo userQrTipVo){
       return iUserQrTipService.updateUserQrTipStatusByUserId(userQrTipVo);
    }

}
