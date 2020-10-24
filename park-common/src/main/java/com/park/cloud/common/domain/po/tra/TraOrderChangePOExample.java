package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraOrderChangePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraOrderChangePOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andChangeOrderIdIsNull() {
            addCriterion("change_order_id is null");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdIsNotNull() {
            addCriterion("change_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdEqualTo(Integer value) {
            addCriterion("change_order_id =", value, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdNotEqualTo(Integer value) {
            addCriterion("change_order_id <>", value, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdGreaterThan(Integer value) {
            addCriterion("change_order_id >", value, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_order_id >=", value, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdLessThan(Integer value) {
            addCriterion("change_order_id <", value, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("change_order_id <=", value, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdIn(List<Integer> values) {
            addCriterion("change_order_id in", values, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdNotIn(List<Integer> values) {
            addCriterion("change_order_id not in", values, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("change_order_id between", value1, value2, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andChangeOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("change_order_id not between", value1, value2, "changeOrderId");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeIsNull() {
            addCriterion("bargain_order_code is null");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeIsNotNull() {
            addCriterion("bargain_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeEqualTo(String value) {
            addCriterion("bargain_order_code =", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeNotEqualTo(String value) {
            addCriterion("bargain_order_code <>", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeGreaterThan(String value) {
            addCriterion("bargain_order_code >", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bargain_order_code >=", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeLessThan(String value) {
            addCriterion("bargain_order_code <", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("bargain_order_code <=", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeLike(String value) {
            addCriterion("bargain_order_code like", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeNotLike(String value) {
            addCriterion("bargain_order_code not like", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeIn(List<String> values) {
            addCriterion("bargain_order_code in", values, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeNotIn(List<String> values) {
            addCriterion("bargain_order_code not in", values, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeBetween(String value1, String value2) {
            addCriterion("bargain_order_code between", value1, value2, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeNotBetween(String value1, String value2) {
            addCriterion("bargain_order_code not between", value1, value2, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeIsNull() {
            addCriterion("old_start_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeIsNotNull() {
            addCriterion("old_start_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeEqualTo(Date value) {
            addCriterion("old_start_parking_time =", value, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeNotEqualTo(Date value) {
            addCriterion("old_start_parking_time <>", value, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeGreaterThan(Date value) {
            addCriterion("old_start_parking_time >", value, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("old_start_parking_time >=", value, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeLessThan(Date value) {
            addCriterion("old_start_parking_time <", value, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeLessThanOrEqualTo(Date value) {
            addCriterion("old_start_parking_time <=", value, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeIn(List<Date> values) {
            addCriterion("old_start_parking_time in", values, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeNotIn(List<Date> values) {
            addCriterion("old_start_parking_time not in", values, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeBetween(Date value1, Date value2) {
            addCriterion("old_start_parking_time between", value1, value2, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldStartParkingTimeNotBetween(Date value1, Date value2) {
            addCriterion("old_start_parking_time not between", value1, value2, "oldStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeIsNull() {
            addCriterion("old_end_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeIsNotNull() {
            addCriterion("old_end_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeEqualTo(Date value) {
            addCriterion("old_end_parking_time =", value, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeNotEqualTo(Date value) {
            addCriterion("old_end_parking_time <>", value, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeGreaterThan(Date value) {
            addCriterion("old_end_parking_time >", value, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("old_end_parking_time >=", value, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeLessThan(Date value) {
            addCriterion("old_end_parking_time <", value, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeLessThanOrEqualTo(Date value) {
            addCriterion("old_end_parking_time <=", value, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeIn(List<Date> values) {
            addCriterion("old_end_parking_time in", values, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeNotIn(List<Date> values) {
            addCriterion("old_end_parking_time not in", values, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeBetween(Date value1, Date value2) {
            addCriterion("old_end_parking_time between", value1, value2, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldEndParkingTimeNotBetween(Date value1, Date value2) {
            addCriterion("old_end_parking_time not between", value1, value2, "oldEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceIsNull() {
            addCriterion("old_arrears_price is null");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceIsNotNull() {
            addCriterion("old_arrears_price is not null");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceEqualTo(Integer value) {
            addCriterion("old_arrears_price =", value, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceNotEqualTo(Integer value) {
            addCriterion("old_arrears_price <>", value, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceGreaterThan(Integer value) {
            addCriterion("old_arrears_price >", value, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_arrears_price >=", value, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceLessThan(Integer value) {
            addCriterion("old_arrears_price <", value, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("old_arrears_price <=", value, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceIn(List<Integer> values) {
            addCriterion("old_arrears_price in", values, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceNotIn(List<Integer> values) {
            addCriterion("old_arrears_price not in", values, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceBetween(Integer value1, Integer value2) {
            addCriterion("old_arrears_price between", value1, value2, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andOldArrearsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("old_arrears_price not between", value1, value2, "oldArrearsPrice");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeIsNull() {
            addCriterion("start_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeIsNotNull() {
            addCriterion("start_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeEqualTo(Date value) {
            addCriterion("start_parking_time =", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeNotEqualTo(Date value) {
            addCriterion("start_parking_time <>", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeGreaterThan(Date value) {
            addCriterion("start_parking_time >", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_parking_time >=", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeLessThan(Date value) {
            addCriterion("start_parking_time <", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_parking_time <=", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeIn(List<Date> values) {
            addCriterion("start_parking_time in", values, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeNotIn(List<Date> values) {
            addCriterion("start_parking_time not in", values, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeBetween(Date value1, Date value2) {
            addCriterion("start_parking_time between", value1, value2, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_parking_time not between", value1, value2, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeIsNull() {
            addCriterion("end_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeIsNotNull() {
            addCriterion("end_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeEqualTo(Date value) {
            addCriterion("end_parking_time =", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeNotEqualTo(Date value) {
            addCriterion("end_parking_time <>", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeGreaterThan(Date value) {
            addCriterion("end_parking_time >", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_parking_time >=", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeLessThan(Date value) {
            addCriterion("end_parking_time <", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_parking_time <=", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeIn(List<Date> values) {
            addCriterion("end_parking_time in", values, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeNotIn(List<Date> values) {
            addCriterion("end_parking_time not in", values, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeBetween(Date value1, Date value2) {
            addCriterion("end_parking_time between", value1, value2, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_parking_time not between", value1, value2, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceIsNull() {
            addCriterion("arrears_price is null");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceIsNotNull() {
            addCriterion("arrears_price is not null");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceEqualTo(Integer value) {
            addCriterion("arrears_price =", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotEqualTo(Integer value) {
            addCriterion("arrears_price <>", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceGreaterThan(Integer value) {
            addCriterion("arrears_price >", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrears_price >=", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceLessThan(Integer value) {
            addCriterion("arrears_price <", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("arrears_price <=", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceIn(List<Integer> values) {
            addCriterion("arrears_price in", values, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotIn(List<Integer> values) {
            addCriterion("arrears_price not in", values, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceBetween(Integer value1, Integer value2) {
            addCriterion("arrears_price between", value1, value2, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("arrears_price not between", value1, value2, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNull() {
            addCriterion("sys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNotNull() {
            addCriterion("sys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdEqualTo(Integer value) {
            addCriterion("sys_user_id =", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotEqualTo(Integer value) {
            addCriterion("sys_user_id <>", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThan(Integer value) {
            addCriterion("sys_user_id >", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_user_id >=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThan(Integer value) {
            addCriterion("sys_user_id <", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_user_id <=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIn(List<Integer> values) {
            addCriterion("sys_user_id in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotIn(List<Integer> values) {
            addCriterion("sys_user_id not in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_user_id between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_user_id not between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }
    }
}