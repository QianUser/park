package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TraMonthlyPricingRatePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraMonthlyPricingRatePOExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andMonthlyRateIdIsNull() {
            addCriterion("monthly_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdIsNotNull() {
            addCriterion("monthly_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdEqualTo(Integer value) {
            addCriterion("monthly_rate_id =", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdNotEqualTo(Integer value) {
            addCriterion("monthly_rate_id <>", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdGreaterThan(Integer value) {
            addCriterion("monthly_rate_id >", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_rate_id >=", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdLessThan(Integer value) {
            addCriterion("monthly_rate_id <", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_rate_id <=", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdIn(List<Integer> values) {
            addCriterion("monthly_rate_id in", values, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdNotIn(List<Integer> values) {
            addCriterion("monthly_rate_id not in", values, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdBetween(Integer value1, Integer value2) {
            addCriterion("monthly_rate_id between", value1, value2, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_rate_id not between", value1, value2, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdIsNull() {
            addCriterion("monthly_strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdIsNotNull() {
            addCriterion("monthly_strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdEqualTo(Integer value) {
            addCriterion("monthly_strategy_id =", value, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdNotEqualTo(Integer value) {
            addCriterion("monthly_strategy_id <>", value, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdGreaterThan(Integer value) {
            addCriterion("monthly_strategy_id >", value, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_strategy_id >=", value, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdLessThan(Integer value) {
            addCriterion("monthly_strategy_id <", value, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_strategy_id <=", value, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdIn(List<Integer> values) {
            addCriterion("monthly_strategy_id in", values, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdNotIn(List<Integer> values) {
            addCriterion("monthly_strategy_id not in", values, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdBetween(Integer value1, Integer value2) {
            addCriterion("monthly_strategy_id between", value1, value2, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyStrategyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_strategy_id not between", value1, value2, "monthlyStrategyId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeIsNull() {
            addCriterion("rate_date_type is null");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeIsNotNull() {
            addCriterion("rate_date_type is not null");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeEqualTo(Integer value) {
            addCriterion("rate_date_type =", value, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeNotEqualTo(Integer value) {
            addCriterion("rate_date_type <>", value, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeGreaterThan(Integer value) {
            addCriterion("rate_date_type >", value, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_date_type >=", value, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeLessThan(Integer value) {
            addCriterion("rate_date_type <", value, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rate_date_type <=", value, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeIn(List<Integer> values) {
            addCriterion("rate_date_type in", values, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeNotIn(List<Integer> values) {
            addCriterion("rate_date_type not in", values, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeBetween(Integer value1, Integer value2) {
            addCriterion("rate_date_type between", value1, value2, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRateDateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_date_type not between", value1, value2, "rateDateType");
            return (Criteria) this;
        }

        public Criteria andRatePriceIsNull() {
            addCriterion("rate_price is null");
            return (Criteria) this;
        }

        public Criteria andRatePriceIsNotNull() {
            addCriterion("rate_price is not null");
            return (Criteria) this;
        }

        public Criteria andRatePriceEqualTo(Integer value) {
            addCriterion("rate_price =", value, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceNotEqualTo(Integer value) {
            addCriterion("rate_price <>", value, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceGreaterThan(Integer value) {
            addCriterion("rate_price >", value, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_price >=", value, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceLessThan(Integer value) {
            addCriterion("rate_price <", value, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceLessThanOrEqualTo(Integer value) {
            addCriterion("rate_price <=", value, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceIn(List<Integer> values) {
            addCriterion("rate_price in", values, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceNotIn(List<Integer> values) {
            addCriterion("rate_price not in", values, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceBetween(Integer value1, Integer value2) {
            addCriterion("rate_price between", value1, value2, "ratePrice");
            return (Criteria) this;
        }

        public Criteria andRatePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_price not between", value1, value2, "ratePrice");
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

        public Criteria andAddUserIsNull() {
            addCriterion("add_user is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIsNotNull() {
            addCriterion("add_user is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserEqualTo(Integer value) {
            addCriterion("add_user =", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotEqualTo(Integer value) {
            addCriterion("add_user <>", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThan(Integer value) {
            addCriterion("add_user >", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_user >=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThan(Integer value) {
            addCriterion("add_user <", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThanOrEqualTo(Integer value) {
            addCriterion("add_user <=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserIn(List<Integer> values) {
            addCriterion("add_user in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotIn(List<Integer> values) {
            addCriterion("add_user not in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserBetween(Integer value1, Integer value2) {
            addCriterion("add_user between", value1, value2, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotBetween(Integer value1, Integer value2) {
            addCriterion("add_user not between", value1, value2, "addUser");
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