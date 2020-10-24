package com.park.cloud.common.domain.po.tra;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraPricingStrategyPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraPricingStrategyPOExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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


        public Criteria andPricingStrategyIdIsNull() {
            addCriterion("Pricing_strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdIsNotNull() {
            addCriterion("Pricing_strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdEqualTo(Integer value) {
            addCriterion("Pricing_strategy_id =", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdNotEqualTo(Integer value) {
            addCriterion("Pricing_strategy_id <>", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdGreaterThan(Integer value) {
            addCriterion("Pricing_strategy_id >", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pricing_strategy_id >=", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdLessThan(Integer value) {
            addCriterion("Pricing_strategy_id <", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdLessThanOrEqualTo(Integer value) {
            addCriterion("Pricing_strategy_id <=", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdIn(List<Integer> values) {
            addCriterion("Pricing_strategy_id in", values, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdNotIn(List<Integer> values) {
            addCriterion("Pricing_strategy_id not in", values, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdBetween(Integer value1, Integer value2) {
            addCriterion("Pricing_strategy_id between", value1, value2, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Pricing_strategy_id not between", value1, value2, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameIsNull() {
            addCriterion("pricing_strategy_name is null");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameIsNotNull() {
            addCriterion("pricing_strategy_name is not null");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameEqualTo(String value) {
            addCriterion("pricing_strategy_name =", value, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameNotEqualTo(String value) {
            addCriterion("pricing_strategy_name <>", value, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameGreaterThan(String value) {
            addCriterion("pricing_strategy_name >", value, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameGreaterThanOrEqualTo(String value) {
            addCriterion("pricing_strategy_name >=", value, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameLessThan(String value) {
            addCriterion("pricing_strategy_name <", value, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameLessThanOrEqualTo(String value) {
            addCriterion("pricing_strategy_name <=", value, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameLike(String value) {
            addCriterion("pricing_strategy_name like", value, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameNotLike(String value) {
            addCriterion("pricing_strategy_name not like", value, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameIn(List<String> values) {
            addCriterion("pricing_strategy_name in", values, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameNotIn(List<String> values) {
            addCriterion("pricing_strategy_name not in", values, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameBetween(String value1, String value2) {
            addCriterion("pricing_strategy_name between", value1, value2, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyNameNotBetween(String value1, String value2) {
            addCriterion("pricing_strategy_name not between", value1, value2, "pricingStrategyName");
            return (Criteria) this;
        }

        public Criteria andFreeDurationIsNull() {
            addCriterion("free_duration is null");
            return (Criteria) this;
        }

        public Criteria andFreeDurationIsNotNull() {
            addCriterion("free_duration is not null");
            return (Criteria) this;
        }

        public Criteria andFreeDurationEqualTo(Integer value) {
            addCriterion("free_duration =", value, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationNotEqualTo(Integer value) {
            addCriterion("free_duration <>", value, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationGreaterThan(Integer value) {
            addCriterion("free_duration >", value, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_duration >=", value, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationLessThan(Integer value) {
            addCriterion("free_duration <", value, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationLessThanOrEqualTo(Integer value) {
            addCriterion("free_duration <=", value, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationIn(List<Integer> values) {
            addCriterion("free_duration in", values, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationNotIn(List<Integer> values) {
            addCriterion("free_duration not in", values, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationBetween(Integer value1, Integer value2) {
            addCriterion("free_duration between", value1, value2, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andFreeDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("free_duration not between", value1, value2, "freeDuration");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkIsNull() {
            addCriterion("pricing_strategy_remark is null");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkIsNotNull() {
            addCriterion("pricing_strategy_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkEqualTo(String value) {
            addCriterion("pricing_strategy_remark =", value, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkNotEqualTo(String value) {
            addCriterion("pricing_strategy_remark <>", value, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkGreaterThan(String value) {
            addCriterion("pricing_strategy_remark >", value, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pricing_strategy_remark >=", value, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkLessThan(String value) {
            addCriterion("pricing_strategy_remark <", value, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkLessThanOrEqualTo(String value) {
            addCriterion("pricing_strategy_remark <=", value, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkLike(String value) {
            addCriterion("pricing_strategy_remark like", value, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkNotLike(String value) {
            addCriterion("pricing_strategy_remark not like", value, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkIn(List<String> values) {
            addCriterion("pricing_strategy_remark in", values, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkNotIn(List<String> values) {
            addCriterion("pricing_strategy_remark not in", values, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkBetween(String value1, String value2) {
            addCriterion("pricing_strategy_remark between", value1, value2, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyRemarkNotBetween(String value1, String value2) {
            addCriterion("pricing_strategy_remark not between", value1, value2, "pricingStrategyRemark");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeIsNull() {
            addCriterion("free_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeIsNotNull() {
            addCriterion("free_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEndTimeIsNull() {
            addCriterion("free_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFreeEndTimeIsNotNull() {
            addCriterion("free_end_time is not null");
            return (Criteria) this;
        }


        public Criteria andHolidayFreeStartTimeIsNull() {
            addCriterion("holiday_free_start_time is null");
            return (Criteria) this;
        }

        public Criteria andHolidayFreeStartTimeIsNotNull() {
            addCriterion("holiday_free_start_time is not null");
            return (Criteria) this;
        }



        public Criteria andHolidayFreeEndTimeIsNull() {
            addCriterion("holiday_free_end_time is null");
            return (Criteria) this;
        }

        public Criteria andHolidayFreeEndTimeIsNotNull() {
            addCriterion("holiday_free_end_time is not null");
            return (Criteria) this;
        }
        public Criteria andUpperLimitIsNull() {
            addCriterion("upper_limit is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNotNull() {
            addCriterion("upper_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitEqualTo(Integer value) {
            addCriterion("upper_limit =", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotEqualTo(Integer value) {
            addCriterion("upper_limit <>", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThan(Integer value) {
            addCriterion("upper_limit >", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("upper_limit >=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThan(Integer value) {
            addCriterion("upper_limit <", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThanOrEqualTo(Integer value) {
            addCriterion("upper_limit <=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIn(List<Integer> values) {
            addCriterion("upper_limit in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotIn(List<Integer> values) {
            addCriterion("upper_limit not in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitBetween(Integer value1, Integer value2) {
            addCriterion("upper_limit between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("upper_limit not between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNull() {
            addCriterion("limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNotNull() {
            addCriterion("limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualTo(Integer value) {
            addCriterion("limit_type =", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualTo(Integer value) {
            addCriterion("limit_type <>", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThan(Integer value) {
            addCriterion("limit_type >", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_type >=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThan(Integer value) {
            addCriterion("limit_type <", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("limit_type <=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIn(List<Integer> values) {
            addCriterion("limit_type in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotIn(List<Integer> values) {
            addCriterion("limit_type not in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeBetween(Integer value1, Integer value2) {
            addCriterion("limit_type between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_type not between", value1, value2, "limitType");
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