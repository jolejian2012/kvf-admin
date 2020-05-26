package com.kalvin.kvf;

import com.kalvin.kvf.modules.workflow.service.IWorkFlowService;
import com.kalvin.kvf.modules.workflow.vo.UserVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class KvfAdminApplicationTests extends BaseJunitTest {

    @Autowired
    private IWorkFlowService workFlowService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void addUser() {
        UserVO userVO = new UserVO();
        userVO.setUserId("2");
        userVO.setUserName("jolejian");
        userVO.setEmail("jianchuanbao@hotmail.com");
        userVO.setJobTitle("技术经理");
        userVO.setDeptId("7");
        userVO.setDeptName("技术中心");
        System.out.println(userVO.getGroupId());

        workFlowService.addUser(userVO);
    }
}
