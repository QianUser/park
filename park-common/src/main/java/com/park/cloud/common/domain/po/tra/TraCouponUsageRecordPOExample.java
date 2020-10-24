package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraCouponUsageRecordPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraCouponUsageRecordPOExample() {
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

        public Criteria andCurIdIsNull() {
            addCriterion("cur_id is null");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNotNull() {
            addCriterion("cur_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdEqualTo(Integer value) {
            addCriterion("cur_id =", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotEqualTo(Integer value) {
            addCriterion("cur_id <>", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThan(Integer value) {
            addCriterion("cur_id >", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_id >=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThan(Integer value) {
            addCriterion("cur_id <", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThanOrEqualTo(Integer value) {
            addCriterion("cur_id <=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdIn(List<Integer> values) {
            addCriterion("cur_id in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotIn(List<Integer> values) {
            addCriterion("cur_id not in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdBetween(Integer value1, Integer value2) {
            addCriterion("cur_id between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_id not between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeIsNull() {
            addCriterion("u_coupon_Code is null");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeIsNotNull() {
            addCriterion("u_coupon_Code is not null");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeEqualTo(String value) {
            addCriterion("u_coupon_Code =", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeNotEqualTo(String value) {
            addCriterion("u_coupon_Code <>", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeGreaterThan(String value) {
            addCriterion("u_coupon_Code >", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeGreaterThanOrEqualTo(String value) {
            addCriterion("u_coupon_Code >=", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeLessThan(String value) {
            addCriterion("u_coupon_Code <", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeLessThanOrEqualTo(String value) {
            addCriterion("u_coupon_Code <=", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeLike(String value) {
            addCriterion("u_coupon_Code like", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeNotLike(String value) {
            addCriterion("u_coupon_Code not like", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeIn(List<String> values) {
            addCriterion("u_coupon_Code in", values, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeNotIn(List<String> values) {
            addCriterion("u_coupon_Code not in", values, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeBetween(String value1, String value2) {
            addCriterion("u_coupon_Code between", value1, value2, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeNotBetween(String value1, String value2) {
            addCriterion("u_coupon_Code not between", value1, value2, "uCouponCode");
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