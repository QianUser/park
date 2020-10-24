package com.park.cloud.common.domain.po.rep;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepParkOperateByMonthPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepParkOperateByMonthPOExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andParkingTypeEqualTo(String value) {
            addCriterion("parking_type =", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeNotEqualTo(String value) {
            addCriterion("parking_type <>", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeGreaterThan(String value) {
            addCriterion("parking_type >", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("parking_type >=", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeLessThan(String value) {
            addCriterion("parking_type <", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeLessThanOrEqualTo(String value) {
            addCriterion("parking_type <=", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeLike(String value) {
            addCriterion("parking_type like", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeNotLike(String value) {
            addCriterion("parking_type not like", value, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeIn(List<String> values) {
            addCriterion("parking_type in", values, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeNotIn(List<String> values) {
            addCriterion("parking_type not in", values, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeBetween(String value1, String value2) {
            addCriterion("parking_type between", value1, value2, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkingTypeNotBetween(String value1, String value2) {
            addCriterion("parking_type not between", value1, value2, "parkingType");
            return (Criteria) this;
        }

        public Criteria andParkNumIsNull() {
            addCriterion("park_num is null");
            return (Criteria) this;
        }

        public Criteria andParkNumIsNotNull() {
            addCriterion("park_num is not null");
            return (Criteria) this;
        }

        public Criteria andParkNumEqualTo(Integer value) {
            addCriterion("park_num =", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotEqualTo(Integer value) {
            addCriterion("park_num <>", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumGreaterThan(Integer value) {
            addCriterion("park_num >", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_num >=", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumLessThan(Integer value) {
            addCriterion("park_num <", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumLessThanOrEqualTo(Integer value) {
            addCriterion("park_num <=", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumIn(List<Integer> values) {
            addCriterion("park_num in", values, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotIn(List<Integer> values) {
            addCriterion("park_num not in", values, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumBetween(Integer value1, Integer value2) {
            addCriterion("park_num between", value1, value2, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("park_num not between", value1, value2, "parkNum");
            return (Criteria) this;
        }

        public Criteria andTradEnumIsNull() {
            addCriterion("trad_enum is null");
            return (Criteria) this;
        }

        public Criteria andTradEnumIsNotNull() {
            addCriterion("trad_enum is not null");
            return (Criteria) this;
        }

        public Criteria andTradEnumEqualTo(Integer value) {
            addCriterion("trad_enum =", value, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumNotEqualTo(Integer value) {
            addCriterion("trad_enum <>", value, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumGreaterThan(Integer value) {
            addCriterion("trad_enum >", value, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("trad_enum >=", value, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumLessThan(Integer value) {
            addCriterion("trad_enum <", value, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumLessThanOrEqualTo(Integer value) {
            addCriterion("trad_enum <=", value, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumIn(List<Integer> values) {
            addCriterion("trad_enum in", values, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumNotIn(List<Integer> values) {
            addCriterion("trad_enum not in", values, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumBetween(Integer value1, Integer value2) {
            addCriterion("trad_enum between", value1, value2, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andTradEnumNotBetween(Integer value1, Integer value2) {
            addCriterion("trad_enum not between", value1, value2, "tradEnum");
            return (Criteria) this;
        }

        public Criteria andPayNumIsNull() {
            addCriterion("pay_num is null");
            return (Criteria) this;
        }

        public Criteria andPayNumIsNotNull() {
            addCriterion("pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andPayNumEqualTo(Integer value) {
            addCriterion("pay_num =", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotEqualTo(Integer value) {
            addCriterion("pay_num <>", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThan(Integer value) {
            addCriterion("pay_num >", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_num >=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThan(Integer value) {
            addCriterion("pay_num <", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("pay_num <=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumIn(List<Integer> values) {
            addCriterion("pay_num in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotIn(List<Integer> values) {
            addCriterion("pay_num not in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumBetween(Integer value1, Integer value2) {
            addCriterion("pay_num between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_num not between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumIsNull() {
            addCriterion("arrears_num is null");
            return (Criteria) this;
        }

        public Criteria andArrearsNumIsNotNull() {
            addCriterion("arrears_num is not null");
            return (Criteria) this;
        }

        public Criteria andArrearsNumEqualTo(Integer value) {
            addCriterion("arrears_num =", value, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumNotEqualTo(Integer value) {
            addCriterion("arrears_num <>", value, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumGreaterThan(Integer value) {
            addCriterion("arrears_num >", value, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrears_num >=", value, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumLessThan(Integer value) {
            addCriterion("arrears_num <", value, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumLessThanOrEqualTo(Integer value) {
            addCriterion("arrears_num <=", value, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumIn(List<Integer> values) {
            addCriterion("arrears_num in", values, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumNotIn(List<Integer> values) {
            addCriterion("arrears_num not in", values, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumBetween(Integer value1, Integer value2) {
            addCriterion("arrears_num between", value1, value2, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andArrearsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("arrears_num not between", value1, value2, "arrearsNum");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceIsNull() {
            addCriterion("receivable_price is null");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceIsNotNull() {
            addCriterion("receivable_price is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceEqualTo(Integer value) {
            addCriterion("receivable_price =", value, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceNotEqualTo(Integer value) {
            addCriterion("receivable_price <>", value, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceGreaterThan(Integer value) {
            addCriterion("receivable_price >", value, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("receivable_price >=", value, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceLessThan(Integer value) {
            addCriterion("receivable_price <", value, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceLessThanOrEqualTo(Integer value) {
            addCriterion("receivable_price <=", value, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceIn(List<Integer> values) {
            addCriterion("receivable_price in", values, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceNotIn(List<Integer> values) {
            addCriterion("receivable_price not in", values, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceBetween(Integer value1, Integer value2) {
            addCriterion("receivable_price between", value1, value2, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceivablePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("receivable_price not between", value1, value2, "receivablePrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceIsNull() {
            addCriterion("receipt_price is null");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceIsNotNull() {
            addCriterion("receipt_price is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceEqualTo(Integer value) {
            addCriterion("receipt_price =", value, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceNotEqualTo(Integer value) {
            addCriterion("receipt_price <>", value, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceGreaterThan(Integer value) {
            addCriterion("receipt_price >", value, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("receipt_price >=", value, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceLessThan(Integer value) {
            addCriterion("receipt_price <", value, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceLessThanOrEqualTo(Integer value) {
            addCriterion("receipt_price <=", value, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceIn(List<Integer> values) {
            addCriterion("receipt_price in", values, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceNotIn(List<Integer> values) {
            addCriterion("receipt_price not in", values, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceBetween(Integer value1, Integer value2) {
            addCriterion("receipt_price between", value1, value2, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andReceiptPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("receipt_price not between", value1, value2, "receiptPrice");
            return (Criteria) this;
        }

        public Criteria andPayRatioIsNull() {
            addCriterion("pay_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPayRatioIsNotNull() {
            addCriterion("pay_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPayRatioEqualTo(BigDecimal value) {
            addCriterion("pay_ratio =", value, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioNotEqualTo(BigDecimal value) {
            addCriterion("pay_ratio <>", value, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioGreaterThan(BigDecimal value) {
            addCriterion("pay_ratio >", value, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_ratio >=", value, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioLessThan(BigDecimal value) {
            addCriterion("pay_ratio <", value, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_ratio <=", value, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioIn(List<BigDecimal> values) {
            addCriterion("pay_ratio in", values, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioNotIn(List<BigDecimal> values) {
            addCriterion("pay_ratio not in", values, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_ratio between", value1, value2, "payRatio");
            return (Criteria) this;
        }

        public Criteria andPayRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_ratio not between", value1, value2, "payRatio");
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