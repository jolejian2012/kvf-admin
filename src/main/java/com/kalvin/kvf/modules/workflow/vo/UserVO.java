package com.kalvin.kvf.modules.workflow.vo;

import cn.hutool.crypto.SecureUtil;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * Activiti 用户
 */

@Data
@ToString
@Accessors(chain = true)
public class UserVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;
    private String userName;
    private String email;
    private String jobTitle;

    private String deptId;
    private String deptName;

    public String getGroupId() {
        return deptId + "_" + SecureUtil.md5(jobTitle);
    }

    public String getGroupName() {
        return deptName + "_" + jobTitle;
    }

    public String getGroupType() {
        return deptName;
    }
}
