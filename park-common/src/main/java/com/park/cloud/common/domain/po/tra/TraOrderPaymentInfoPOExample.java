package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraOrderPaymentInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraOrderPaymentInfoPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
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

        public Criteria andOrderPaymentIdIsNull() {
            addCriterion("order_payment_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdIsNotNull() {
            addCriterion("order_payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdEqualTo(Long value) {
            addCriterion("order_payment_id =", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdNotEqualTo(Long value) {
            addCriterion("order_payment_id <>", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdGreaterThan(Long value) {
            addCriterion("order_payment_id >", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_payment_id >=", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdLessThan(Long value) {
            addCriterion("order_payment_id <", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("order_payment_id <=", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdIn(List<Long> values) {
            addCriterion("order_payment_id in", values, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdNotIn(List<Long> values) {
            addCriterion("order_payment_id not in", values, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdBetween(Long value1, Long value2) {
            addCriterion("order_payment_id between", value1, value2, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("order_payment_id not between", value1, value2, "orderPaymentId");
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

        public Criteria andParkUserIdIsNull() {
            addCriterion("park_user_id is null");
            return (Criteria) this;
        }

        public Criteria andParkUserIdIsNotNull() {
            addCriterion("park_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkUserIdEqualTo(String value) {
            addCriterion("park_user_id =", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotEqualTo(String value) {
            addCriterion("park_user_id <>", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdGreaterThan(String value) {
            addCriterion("park_user_id >", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("park_user_id >=", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLessThan(String value) {
            addCriterion("park_user_id <", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLessThanOrEqualTo(String value) {
            addCriterion("park_user_id <=", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLike(String value) {
            addCriterion("park_user_id like", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotLike(String value) {
            addCriterion("park_user_id not like", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdIn(List<String> values) {
            addCriterion("park_user_id in", values, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotIn(List<String> values) {
            addCriterion("park_user_id not in", values, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdBetween(String value1, String value2) {
            addCriterion("park_user_id between", value1, value2, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotBetween(String value1, String value2) {
            addCriterion("park_user_id not between", value1, value2, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andApplyDurationIsNull() {
            addCriterion("apply_duration is null");
            return (Criteria) this;
        }

        public Criteria andApplyDurationIsNotNull() {
            addCriterion("apply_duration is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDurationEqualTo(Integer value) {
            addCriterion("apply_duration =", value, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationNotEqualTo(Integer value) {
            addCriterion("apply_duration <>", value, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationGreaterThan(Integer value) {
            addCriterion("apply_duration >", value, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_duration >=", value, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationLessThan(Integer value) {
            addCriterion("apply_duration <", value, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationLessThanOrEqualTo(Integer value) {
            addCriterion("apply_duration <=", value, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationIn(List<Integer> values) {
            addCriterion("apply_duration in", values, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationNotIn(List<Integer> values) {
            addCriterion("apply_duration not in", values, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationBetween(Integer value1, Integer value2) {
            addCriterion("apply_duration between", value1, value2, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andApplyDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_duration not between", value1, value2, "applyDuration");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(Integer value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(Integer value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(Integer value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(Integer value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(Integer value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<Integer> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<Integer> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(Integer value1, Integer value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andApplyMethodIsNull() {
            addCriterion("apply_method is null");
            return (Criteria) this;
        }

        public Criteria andApplyMethodIsNotNull() {
            addCriterion("apply_method is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMethodEqualTo(Integer value) {
            addCriterion("apply_method =", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodNotEqualTo(Integer value) {
            addCriterion("apply_method <>", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodGreaterThan(Integer value) {
            addCriterion("apply_method >", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_method >=", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodLessThan(Integer value) {
            addCriterion("apply_method <", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodLessThanOrEqualTo(Integer value) {
            addCriterion("apply_method <=", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodIn(List<Integer> values) {
            addCriterion("apply_method in", values, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodNotIn(List<Integer> values) {
            addCriterion("apply_method not in", values, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodBetween(Integer value1, Integer value2) {
            addCriterion("apply_method between", value1, value2, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_method not between", value1, value2, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(Integer value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(Integer value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(Integer value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(Integer value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<Integer> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<Integer> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(Integer value1, Integer value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
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

        public Criteria andBerthCodeIsNull() {
            addCriterion("berth_code is null");
            return (Criteria) this;
        }

        public Criteria andBerthCodeIsNotNull() {
            addCriterion("berth_code is not null");
            return (Criteria) this;
        }

        public Criteria andBerthCodeEqualTo(String value) {
            addCriterion("berth_code =", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeNotEqualTo(String value) {
            addCriterion("berth_code <>", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeGreaterThan(String value) {
            addCriterion("berth_code >", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("berth_code >=", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeLessThan(String value) {
            addCriterion("berth_code <", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeLessThanOrEqualTo(String value) {
            addCriterion("berth_code <=", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeLike(String value) {
            addCriterion("berth_code like", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeNotLike(String value) {
            addCriterion("berth_code not like", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeIn(List<String> values) {
            addCriterion("berth_code in", values, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeNotIn(List<String> values) {
            addCriterion("berth_code not in", values, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeBetween(String value1, String value2) {
            addCriterion("berth_code between", value1, value2, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeNotBetween(String value1, String value2) {
            addCriterion("berth_code not between", value1, value2, "berthCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeIsNull() {
            addCriterion("apply_in_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeIsNotNull() {
            addCriterion("apply_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeEqualTo(Date value) {
            addCriterion("apply_in_time =", value, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeNotEqualTo(Date value) {
            addCriterion("apply_in_time <>", value, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeGreaterThan(Date value) {
            addCriterion("apply_in_time >", value, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_in_time >=", value, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeLessThan(Date value) {
            addCriterion("apply_in_time <", value, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_in_time <=", value, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeIn(List<Date> values) {
            addCriterion("apply_in_time in", values, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeNotIn(List<Date> values) {
            addCriterion("apply_in_time not in", values, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeBetween(Date value1, Date value2) {
            addCriterion("apply_in_time between", value1, value2, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andApplyInTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_in_time not between", value1, value2, "applyInTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNull() {
            addCriterion("payment_code is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNotNull() {
            addCriterion("payment_code is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeEqualTo(String value) {
            addCriterion("payment_code =", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotEqualTo(String value) {
            addCriterion("payment_code <>", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThan(String value) {
            addCriterion("payment_code >", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_code >=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThan(String value) {
            addCriterion("payment_code <", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThanOrEqualTo(String value) {
            addCriterion("payment_code <=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLike(String value) {
            addCriterion("payment_code like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotLike(String value) {
            addCriterion("payment_code not like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIn(List<String> values) {
            addCriterion("payment_code in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotIn(List<String> values) {
            addCriterion("payment_code not in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeBetween(String value1, String value2) {
            addCriterion("payment_code between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotBetween(String value1, String value2) {
            addCriterion("payment_code not between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeIsNull() {
            addCriterion("bargain_order_type is null");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeIsNotNull() {
            addCriterion("bargain_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeEqualTo(Integer value) {
            addCriterion("bargain_order_type =", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeNotEqualTo(Integer value) {
            addCriterion("bargain_order_type <>", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeGreaterThan(Integer value) {
            addCriterion("bargain_order_type >", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bargain_order_type >=", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeLessThan(Integer value) {
            addCriterion("bargain_order_type <", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bargain_order_type <=", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeIn(List<Integer> values) {
            addCriterion("bargain_order_type in", values, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeNotIn(List<Integer> values) {
            addCriterion("bargain_order_type not in", values, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("bargain_order_type between", value1, value2, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bargain_order_type not between", value1, value2, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIsNull() {
            addCriterion("payer_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIsNotNull() {
            addCriterion("payer_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoEqualTo(String value) {
            addCriterion("payer_trade_no =", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotEqualTo(String value) {
            addCriterion("payer_trade_no <>", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoGreaterThan(String value) {
            addCriterion("payer_trade_no >", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("payer_trade_no >=", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLessThan(String value) {
            addCriterion("payer_trade_no <", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLessThanOrEqualTo(String value) {
            addCriterion("payer_trade_no <=", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLike(String value) {
            addCriterion("payer_trade_no like", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotLike(String value) {
            addCriterion("payer_trade_no not like", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIn(List<String> values) {
            addCriterion("payer_trade_no in", values, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotIn(List<String> values) {
            addCriterion("payer_trade_no not in", values, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoBetween(String value1, String value2) {
            addCriterion("payer_trade_no between", value1, value2, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotBetween(String value1, String value2) {
            addCriterion("payer_trade_no not between", value1, value2, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Byte value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Byte value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Byte value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Byte value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Byte value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Byte> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Byte> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Byte value1, Byte value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIsNull() {
            addCriterion("refund_price is null");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIsNotNull() {
            addCriterion("refund_price is not null");
            return (Criteria) this;
        }

        public Criteria andRefundPriceEqualTo(Integer value) {
            addCriterion("refund_price =", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotEqualTo(Integer value) {
            addCriterion("refund_price <>", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceGreaterThan(Integer value) {
            addCriterion("refund_price >", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_price >=", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceLessThan(Integer value) {
            addCriterion("refund_price <", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceLessThanOrEqualTo(Integer value) {
            addCriterion("refund_price <=", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIn(List<Integer> values) {
            addCriterion("refund_price in", values, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotIn(List<Integer> values) {
            addCriterion("refund_price not in", values, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceBetween(Integer value1, Integer value2) {
            addCriterion("refund_price between", value1, value2, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_price not between", value1, value2, "refundPrice");
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
    }
}