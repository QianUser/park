package com.park.cloud.common.domain.po.rep;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepParkRefundByDayPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepParkRefundByDayPOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayIsNull() {
            addCriterion("statistics_day is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayIsNotNull() {
            addCriterion("statistics_day is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayEqualTo(String value) {
            addCriterion("statistics_day =", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayNotEqualTo(String value) {
            addCriterion("statistics_day <>", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayGreaterThan(String value) {
            addCriterion("statistics_day >", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_day >=", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayLessThan(String value) {
            addCriterion("statistics_day <", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayLessThanOrEqualTo(String value) {
            addCriterion("statistics_day <=", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayLike(String value) {
            addCriterion("statistics_day like", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayNotLike(String value) {
            addCriterion("statistics_day not like", value, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayIn(List<String> values) {
            addCriterion("statistics_day in", values, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayNotIn(List<String> values) {
            addCriterion("statistics_day not in", values, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayBetween(String value1, String value2) {
            addCriterion("statistics_day between", value1, value2, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andStatisticsDayNotBetween(String value1, String value2) {
            addCriterion("statistics_day not between", value1, value2, "statisticsDay");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCantonIdIsNull() {
            addCriterion("canton_id is null");
            return (Criteria) this;
        }

        public Criteria andCantonIdIsNotNull() {
            addCriterion("canton_id is not null");
            return (Criteria) this;
        }

        public Criteria andCantonIdEqualTo(Integer value) {
            addCriterion("canton_id =", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdNotEqualTo(Integer value) {
            addCriterion("canton_id <>", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdGreaterThan(Integer value) {
            addCriterion("canton_id >", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("canton_id >=", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdLessThan(Integer value) {
            addCriterion("canton_id <", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdLessThanOrEqualTo(Integer value) {
            addCriterion("canton_id <=", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdIn(List<Integer> values) {
            addCriterion("canton_id in", values, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdNotIn(List<Integer> values) {
            addCriterion("canton_id not in", values, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdBetween(Integer value1, Integer value2) {
            addCriterion("canton_id between", value1, value2, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("canton_id not between", value1, value2, "cantonId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdIsNull() {
            addCriterion("parking_section_id is null");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdIsNotNull() {
            addCriterion("parking_section_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdEqualTo(Integer value) {
            addCriterion("parking_section_id =", value, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdNotEqualTo(Integer value) {
            addCriterion("parking_section_id <>", value, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdGreaterThan(Integer value) {
            addCriterion("parking_section_id >", value, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_section_id >=", value, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdLessThan(Integer value) {
            addCriterion("parking_section_id <", value, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("parking_section_id <=", value, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdIn(List<Integer> values) {
            addCriterion("parking_section_id in", values, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdNotIn(List<Integer> values) {
            addCriterion("parking_section_id not in", values, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("parking_section_id between", value1, value2, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_section_id not between", value1, value2, "parkingSectionId");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameIsNull() {
            addCriterion("parking_section_name is null");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameIsNotNull() {
            addCriterion("parking_section_name is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameEqualTo(String value) {
            addCriterion("parking_section_name =", value, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameNotEqualTo(String value) {
            addCriterion("parking_section_name <>", value, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameGreaterThan(String value) {
            addCriterion("parking_section_name >", value, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("parking_section_name >=", value, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameLessThan(String value) {
            addCriterion("parking_section_name <", value, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameLessThanOrEqualTo(String value) {
            addCriterion("parking_section_name <=", value, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameLike(String value) {
            addCriterion("parking_section_name like", value, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameNotLike(String value) {
            addCriterion("parking_section_name not like", value, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameIn(List<String> values) {
            addCriterion("parking_section_name in", values, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameNotIn(List<String> values) {
            addCriterion("parking_section_name not in", values, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameBetween(String value1, String value2) {
            addCriterion("parking_section_name between", value1, value2, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingSectionNameNotBetween(String value1, String value2) {
            addCriterion("parking_section_name not between", value1, value2, "parkingSectionName");
            return (Criteria) this;
        }

        public Criteria andParkingTypeIsNull() {
            addCriterion("parking_type is null");
            return (Criteria) this;
        }

        public Criteria andParkingTypeIsNotNull() {
            addCriterion("parking_type is not null");
            return (Criteria) this;
        }

        public Criteria andParkingTypeEqualTo(Integer value) {
            addCriterion("parking_type =", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeNotEqualTo(Integer value) {
            addCriterion("parking_type <>", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeGreaterThan(Integer value) {
            addCriterion("parking_type >", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_type >=", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeLessThan(Integer value) {
            addCriterion("parking_type <", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeLessThanOrEqualTo(Integer value) {
            addCriterion("parking_type <=", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeIn(List<Integer> values) {
            addCriterion("parking_type in", values, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeNotIn(List<Integer> values) {
            addCriterion("parking_type not in", values, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeBetween(Integer value1, Integer value2) {
            addCriterion("parking_type between", value1, value2, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_type not between", value1, value2, "parkingType");
            return (Criteria) this;
        }

        public Criteria andRefundNumIsNull() {
            addCriterion("refund_num is null");
            return (Criteria) this;
        }

        public Criteria andRefundNumIsNotNull() {
            addCriterion("refund_num is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNumEqualTo(Integer value) {
            addCriterion("refund_num =", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotEqualTo(Integer value) {
            addCriterion("refund_num <>", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumGreaterThan(Integer value) {
            addCriterion("refund_num >", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_num >=", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumLessThan(Integer value) {
            addCriterion("refund_num <", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumLessThanOrEqualTo(Integer value) {
            addCriterion("refund_num <=", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumIn(List<Integer> values) {
            addCriterion("refund_num in", values, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotIn(List<Integer> values) {
            addCriterion("refund_num not in", values, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumBetween(Integer value1, Integer value2) {
            addCriterion("refund_num between", value1, value2, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_num not between", value1, value2, "refundNum");
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