package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraRefundOrderPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraRefundOrderPOExample() {
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

        public Criteria andRefundOrderIdIsNull() {
            addCriterion("refund_order_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdIsNotNull() {
            addCriterion("refund_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdEqualTo(Long value) {
            addCriterion("refund_order_id =", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotEqualTo(Long value) {
            addCriterion("refund_order_id <>", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdGreaterThan(Long value) {
            addCriterion("refund_order_id >", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_order_id >=", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdLessThan(Long value) {
            addCriterion("refund_order_id <", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("refund_order_id <=", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdIn(List<Long> values) {
            addCriterion("refund_order_id in", values, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotIn(List<Long> values) {
            addCriterion("refund_order_id not in", values, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdBetween(Long value1, Long value2) {
            addCriterion("refund_order_id between", value1, value2, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("refund_order_id not between", value1, value2, "refundOrderId");
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

        public Criteria andOrderPaymentIdIsNull() {
            addCriterion("order_payment_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdIsNotNull() {
            addCriterion("order_payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdEqualTo(Integer value) {
            addCriterion("order_payment_id =", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdNotEqualTo(Integer value) {
            addCriterion("order_payment_id <>", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdGreaterThan(Integer value) {
            addCriterion("order_payment_id >", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_payment_id >=", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdLessThan(Integer value) {
            addCriterion("order_payment_id <", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_payment_id <=", value, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdIn(List<Integer> values) {
            addCriterion("order_payment_id in", values, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdNotIn(List<Integer> values) {
            addCriterion("order_payment_id not in", values, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("order_payment_id between", value1, value2, "orderPaymentId");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_payment_id not between", value1, value2, "orderPaymentId");
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

        public Criteria andRefundOrderCodeIsNull() {
            addCriterion("refund_order_code is null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeIsNotNull() {
            addCriterion("refund_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeEqualTo(String value) {
            addCriterion("refund_order_code =", value, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeNotEqualTo(String value) {
            addCriterion("refund_order_code <>", value, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeGreaterThan(String value) {
            addCriterion("refund_order_code >", value, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("refund_order_code >=", value, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeLessThan(String value) {
            addCriterion("refund_order_code <", value, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("refund_order_code <=", value, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeLike(String value) {
            addCriterion("refund_order_code like", value, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeNotLike(String value) {
            addCriterion("refund_order_code not like", value, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeIn(List<String> values) {
            addCriterion("refund_order_code in", values, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeNotIn(List<String> values) {
            addCriterion("refund_order_code not in", values, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeBetween(String value1, String value2) {
            addCriterion("refund_order_code between", value1, value2, "refundOrderCode");
            return (Criteria) this;
        }

        public Criteria andRefundOrderCodeNotBetween(String value1, String value2) {
            addCriterion("refund_order_code not between", value1, value2, "refundOrderCode");
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

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
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

        public Criteria andRefundStatusEqualTo(Integer value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Integer value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Integer value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Integer value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Integer> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Integer> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
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

        public Criteria andRefundTypeIsNull() {
            addCriterion("refund_type is null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNotNull() {
            addCriterion("refund_type is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeEqualTo(Integer value) {
            addCriterion("refund_type =", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotEqualTo(Integer value) {
            addCriterion("refund_type <>", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThan(Integer value) {
            addCriterion("refund_type >", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_type >=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThan(Integer value) {
            addCriterion("refund_type <", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThanOrEqualTo(Integer value) {
            addCriterion("refund_type <=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIn(List<Integer> values) {
            addCriterion("refund_type in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotIn(List<Integer> values) {
            addCriterion("refund_type not in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeBetween(Integer value1, Integer value2) {
            addCriterion("refund_type between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_type not between", value1, value2, "refundType");
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

        public Criteria andSysUserIdIsNull() {
            addCriterion("sys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNotNull() {
            addCriterion("sys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdEqualTo(String value) {
            addCriterion("sys_user_id =", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotEqualTo(String value) {
            addCriterion("sys_user_id <>", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThan(String value) {
            addCriterion("sys_user_id >", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_id >=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThan(String value) {
            addCriterion("sys_user_id <", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThanOrEqualTo(String value) {
            addCriterion("sys_user_id <=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLike(String value) {
            addCriterion("sys_user_id like", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotLike(String value) {
            addCriterion("sys_user_id not like", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIn(List<String> values) {
            addCriterion("sys_user_id in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotIn(List<String> values) {
            addCriterion("sys_user_id not in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdBetween(String value1, String value2) {
            addCriterion("sys_user_id between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotBetween(String value1, String value2) {
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