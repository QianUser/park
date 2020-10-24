package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 巡检员
 */
@Data
@ApiModel
public class SysPdaUserExportVO implements Serializable {
    @ColumnWidth(16)
    @ExcelProperty(value = "巡检员名称")
    private String pdaUserName;

    @ColumnWidth(14)
    @ExcelProperty(value = "手机号码")
    private String pdaUserMobileNumber;

    @ColumnWidth(18)
    @ExcelProperty(value = "用户真实姓名")
    private String pdaUserTrueName;

    @ColumnWidth(18)
    @ExcelProperty(value = "用户电子邮箱")
    private String pdaUserEmail;

    @ColumnWidth(18)
    @ExcelProperty(value = "用户所属中队")
    private String pdaUserTeamName;

    @ColumnWidth(14)
    @ExcelProperty(value = "用户状态")
    private String pdaUserStatus;

    public void setPdsUserStatusStr(Byte status) {
        switch(status) {
            case 0:
                this.pdaUserStatus = "已锁定";
                break;
            case 1:
                this.pdaUserStatus = "启用中";
                break;
            default:
                break;
        }
    }
}
