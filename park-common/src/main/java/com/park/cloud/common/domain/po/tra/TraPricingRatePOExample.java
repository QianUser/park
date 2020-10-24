package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraPricingRatePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraPricingRatePOExample() {
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

        public Criteria andRateIdIsNull() {
            addCriterion("rate_id is null");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNotNull() {
            addCriterion("rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRateIdEqualTo(Integer value) {
            addCriterion("rate_id =", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotEqualTo(Integer value) {
            addCriterion("rate_id <>", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThan(Integer value) {
            addCriterion("rate_id >", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_id >=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThan(Integer value) {
            addCriterion("rate_id <", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThanOrEqualTo(Integer value) {
            addCriterion("rate_id <=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdIn(List<Integer> values) {
            addCriterion("rate_id in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotIn(List<Integer> values) {
            addCriterion("rate_id not in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdBetween(Integer value1, Integer value2) {
            addCriterion("rate_id between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_id not between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdIsNull() {
            addCriterion("pricing_strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdIsNotNull() {
            addCriterion("pricing_strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdEqualTo(Integer value) {
            addCriterion("pricing_strategy_id =", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdNotEqualTo(Integer value) {
            addCriterion("pricing_strategy_id <>", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdGreaterThan(Integer value) {
            addCriterion("pricing_strategy_id >", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pricing_strategy_id >=", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdLessThan(Integer value) {
            addCriterion("pricing_strategy_id <", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdLessThanOrEqualTo(Integer value) {
            addCriterion("pricing_strategy_id <=", value, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdIn(List<Integer> values) {
            addCriterion("pricing_strategy_id in", values, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdNotIn(List<Integer> values) {
            addCriterion("pricing_strategy_id not in", values, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdBetween(Integer value1, Integer value2) {
            addCriterion("pricing_strategy_id between", value1, value2, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andPricingStrategyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pricing_strategy_id not between", value1, value2, "pricingStrategyId");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteIsNull() {
            addCriterion("rate_start_minute is null");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteIsNotNull() {
            addCriterion("rate_start_minute is not null");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteEqualTo(Integer value) {
            addCriterion("rate_start_minute =", value, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteNotEqualTo(Integer value) {
            addCriterion("rate_start_minute <>", value, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteGreaterThan(Integer value) {
            addCriterion("rate_start_minute >", value, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_start_minute >=", value, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteLessThan(Integer value) {
            addCriterion("rate_start_minute <", value, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("rate_start_minute <=", value, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteIn(List<Integer> values) {
            addCriterion("rate_start_minute in", values, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteNotIn(List<Integer> values) {
            addCriterion("rate_start_minute not in", values, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteBetween(Integer value1, Integer value2) {
            addCriterion("rate_start_minute between", value1, value2, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateStartMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_start_minute not between", value1, value2, "rateStartMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteIsNull() {
            addCriterion("rate_end_minute is null");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteIsNotNull() {
            addCriterion("rate_end_minute is not null");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteEqualTo(Integer value) {
            addCriterion("rate_end_minute =", value, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteNotEqualTo(Integer value) {
            addCriterion("rate_end_minute <>", value, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteGreaterThan(Integer value) {
            addCriterion("rate_end_minute >", value, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_end_minute >=", value, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteLessThan(Integer value) {
            addCriterion("rate_end_minute <", value, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("rate_end_minute <=", value, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteIn(List<Integer> values) {
            addCriterion("rate_end_minute in", values, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteNotIn(List<Integer> values) {
            addCriterion("rate_end_minute not in", values, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteBetween(Integer value1, Integer value2) {
            addCriterion("rate_end_minute between", value1, value2, "rateEndMinute");
            return (Criteria) this;
        }

        public Criteria andRateEndMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_end_minute not between", value1, value2, "rateEndMinute");
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

        public Criteria andRateUnitIsNull() {
            addCriterion("rate_unit is null");
            return (Criteria) this;
        }

        public Criteria andRateUnitIsNotNull() {
            addCriterion("rate_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRateUnitEqualTo(Integer value) {
            addCriterion("rate_unit =", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitNotEqualTo(Integer value) {
            addCriterion("rate_unit <>", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitGreaterThan(Integer value) {
            addCriterion("rate_unit >", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_unit >=", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitLessThan(Integer value) {
            addCriterion("rate_unit <", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitLessThanOrEqualTo(Integer value) {
            addCriterion("rate_unit <=", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitIn(List<Integer> values) {
            addCriterion("rate_unit in", values, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitNotIn(List<Integer> values) {
            addCriterion("rate_unit not in", values, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitBetween(Integer value1, Integer value2) {
            addCriterion("rate_unit between", value1, value2, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_unit not between", value1, value2, "rateUnit");
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

        public Criteria andDefaultPriceIsNull() {
            addCriterion("default_price is null");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceIsNotNull() {
            addCriterion("default_price is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceEqualTo(Integer value) {
            addCriterion("default_price =", value, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceNotEqualTo(Integer value) {
            addCriterion("default_price <>", value, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceGreaterThan(Integer value) {
            addCriterion("default_price >", value, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_price >=", value, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceLessThan(Integer value) {
            addCriterion("default_price <", value, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceLessThanOrEqualTo(Integer value) {
            addCriterion("default_price <=", value, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceIn(List<Integer> values) {
            addCriterion("default_price in", values, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceNotIn(List<Integer> values) {
            addCriterion("default_price not in", values, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceBetween(Integer value1, Integer value2) {
            addCriterion("default_price between", value1, value2, "defaultPrice");
            return (Criteria) this;
        }

        public Criteria andDefaultPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("default_price not between", value1, value2, "defaultPrice");
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