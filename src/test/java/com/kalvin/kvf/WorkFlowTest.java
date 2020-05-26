package com.kalvin.kvf;

import com.kalvin.kvf.modules.generator.utils.VelocityKit;
import com.kalvin.kvf.modules.workflow.service.IWorkFlowService;
import com.kalvin.kvf.modules.workflow.service.WorkFlowServiceImpl;
import org.apache.velocity.VelocityContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 工作流测试
 */
public class WorkFlowTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(WorkFlowTest.class);

    @Autowired
    private IWorkFlowService workFlowService;

    public static void main(String[] args) throws Exception {

    }

    /**
     * 同步用户组
     */
    public static void synUserGroup() {

    }

    /**
     *
     */
    public static void synUser() {

    }
}
