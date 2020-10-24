package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraMonthlyRenewalPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraMonthlyRenewalPOExample() {
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

        public Criteria andMonthlyRenewalIdIsNull() {
            addCriterion("monthly_renewal_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdIsNotNull() {
            addCriterion("monthly_renewal_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdEqualTo(Integer value) {
            addCriterion("monthly_renewal_id =", value, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdNotEqualTo(Integer value) {
            addCriterion("monthly_renewal_id <>", value, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdGreaterThan(Integer value) {
            addCriterion("monthly_renewal_id >", value, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_renewal_id >=", value, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdLessThan(Integer value) {
            addCriterion("monthly_renewal_id <", value, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_renewal_id <=", value, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdIn(List<Integer> values) {
            addCriterion("monthly_renewal_id in", values, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdNotIn(List<Integer> values) {
            addCriterion("monthly_renewal_id not in", values, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdBetween(Integer value1, Integer value2) {
            addCriterion("monthly_renewal_id between", value1, value2, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRenewalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_renewal_id not between", value1, value2, "monthlyRenewalId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoIsNull() {
            addCriterion("monthly_ticket_order_no is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoIsNotNull() {
            addCriterion("monthly_ticket_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoEqualTo(String value) {
            addCriterion("monthly_ticket_order_no =", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoNotEqualTo(String value) {
            addCriterion("monthly_ticket_order_no <>", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoGreaterThan(String value) {
            addCriterion("monthly_ticket_order_no >", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("monthly_ticket_order_no >=", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoLessThan(String value) {
            addCriterion("monthly_ticket_order_no <", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoLessThanOrEqualTo(String value) {
            addCriterion("monthly_ticket_order_no <=", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoLike(String value) {
            addCriterion("monthly_ticket_order_no like", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoNotLike(String value) {
            addCriterion("monthly_ticket_order_no not like", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoIn(List<String> values) {
            addCriterion("monthly_ticket_order_no in", values, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoNotIn(List<String> values) {
            addCriterion("monthly_ticket_order_no not in", values, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoBetween(String value1, String value2) {
            addCriterion("monthly_ticket_order_no between", value1, value2, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoNotBetween(String value1, String value2) {
            addCriterion("monthly_ticket_order_no not between", value1, value2, "monthlyTicketOrderNo");
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

        public Criteria andMonthlyTicketUserIdIsNull() {
            addCriterion("monthly_ticket_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdIsNotNull() {
            addCriterion("monthly_ticket_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdEqualTo(Integer value) {
            addCriterion("monthly_ticket_user_id =", value, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdNotEqualTo(Integer value) {
            addCriterion("monthly_ticket_user_id <>", value, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdGreaterThan(Integer value) {
            addCriterion("monthly_ticket_user_id >", value, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_ticket_user_id >=", value, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdLessThan(Integer value) {
            addCriterion("monthly_ticket_user_id <", value, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_ticket_user_id <=", value, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdIn(List<Integer> values) {
            addCriterion("monthly_ticket_user_id in", values, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdNotIn(List<Integer> values) {
            addCriterion("monthly_ticket_user_id not in", values, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdBetween(Integer value1, Integer value2) {
            addCriterion("monthly_ticket_user_id between", value1, value2, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_ticket_user_id not between", value1, value2, "monthlyTicketUserId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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