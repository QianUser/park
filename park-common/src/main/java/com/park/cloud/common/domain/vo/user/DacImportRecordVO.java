package com.park.cloud.common.domain.vo.user;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/26 9:40
 */
public class DacImportRecordVO {

    @ExcelProperty(value = "停车场")
    private String parkingName;

    @ColumnWidth(18)
    @ExcelProperty(value = "车牌号")
    private String plateNumber;

    @ExcelIgnore
    private Integer plateType;

    @ColumnWidth(15)
    @ExcelProperty(value = "车辆类型")
    private String chargeType;

    @ColumnWidth(15)
    @ExcelProperty(value = "入口名称")
    private String entranceName;

    @ExcelProperty(value = "入场时间")
    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date entranceTime;

    @ExcelProperty(value = "出口名称")
    private String exitName;

    @ExcelProperty(value = "出场时间")
    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date exitTime;

    @ExcelProperty(value = "剩余车位")
    private Integer spaceNo;

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        if(this.plateNumber !=null){
            this.plateNumber = plateNumber+this.plateNumber;
        }
        this.plateNumber = plateNumber;
    }

    public Integer getPlateType() {
        return plateType;
    }

    public void setPlateType(Integer plateType) {
        if(plateType==null){
            return;
        }
        switch (plateType) {
            case 1:
                this.plateNumber = plateNumber + "(蓝牌)";
                break;
            case 2:
                this.plateNumber = plateNumber + "(绿牌)";
                break;
            case 3:
                this.plateNumber = plateNumber + "(黄牌)";
                break;
            case 4:
                this.plateNumber = plateNumber + "(其他)";
                break;
            default:
                return;
        }
    }


    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        if(chargeType==2){
            this.chargeType="月租车";
        }else {
            this.chargeType="临时车";
        }
    }

    public String getEntranceName() {
        return entranceName;
    }

    public void setEntranceName(String entranceName) {
        this.entranceName = entranceName;
    }

    public Date getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(Date entranceTime) {
        this.entranceTime = entranceTime;
    }

    public String getExitName() {
        return exitName;
    }

    public void setExitName(String exitName) {
        this.exitName = exitName;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Integer getSpaceNo() {
        return spaceNo;
    }

    public void setSpaceNo(Integer spaceNo) {
        this.spaceNo = spaceNo;
    }
}
