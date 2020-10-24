package com.park.cloud.common.domain.po.dict;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictParkingCityPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictParkingCityPOExample() {
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

        public Criteria andParkingIdIsNull() {
            addCriterion("parking_id is null");
            return (Criteria) this;
        }

        public Criteria andParkingIdIsNotNull() {
            addCriterion("parking_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkingIdEqualTo(Integer value) {
            addCriterion("parking_id =", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotEqualTo(Integer value) {
            addCriterion("parking_id <>", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdGreaterThan(Integer value) {
            addCriterion("parking_id >", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_id >=", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLessThan(Integer value) {
            addCriterion("parking_id <", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLessThanOrEqualTo(Integer value) {
            addCriterion("parking_id <=", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdIn(List<Integer> values) {
            addCriterion("parking_id in", values, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotIn(List<Integer> values) {
            addCriterion("parking_id not in", values, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdBetween(Integer value1, Integer value2) {
            addCriterion("parking_id between", value1, value2, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_id not between", value1, value2, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingNameIsNull() {
            addCriterion("parking_name is null");
            return (Criteria) this;
        }

        public Criteria andParkingNameIsNotNull() {
            addCriterion("parking_name is not null");
            return (Criteria) this;
        }

        public Criteria andParkingNameEqualTo(String value) {
            addCriterion("parking_name =", value, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameNotEqualTo(String value) {
            addCriterion("parking_name <>", value, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameGreaterThan(String value) {
            addCriterion("parking_name >", value, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameGreaterThanOrEqualTo(String value) {
            addCriterion("parking_name >=", value, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameLessThan(String value) {
            addCriterion("parking_name <", value, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameLessThanOrEqualTo(String value) {
            addCriterion("parking_name <=", value, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameLike(String value) {
            addCriterion("parking_name like", value, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameNotLike(String value) {
            addCriterion("parking_name not like", value, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameIn(List<String> values) {
            addCriterion("parking_name in", values, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameNotIn(List<String> values) {
            addCriterion("parking_name not in", values, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameBetween(String value1, String value2) {
            addCriterion("parking_name between", value1, value2, "parkingName");
            return (Criteria) this;
        }

        public Criteria andParkingNameNotBetween(String value1, String value2) {
            addCriterion("parking_name not between", value1, value2, "parkingName");
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

        public Criteria andSectionIdIsNull() {
            addCriterion("section_id is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("section_id is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(Integer value) {
            addCriterion("section_id =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Integer value) {
            addCriterion("section_id <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Integer value) {
            addCriterion("section_id >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_id >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Integer value) {
            addCriterion("section_id <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("section_id <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<Integer> values) {
            addCriterion("section_id in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<Integer> values) {
            addCriterion("section_id not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("section_id between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("section_id not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitIsNull() {
            addCriterion("monthly_ticket_limit is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitIsNotNull() {
            addCriterion("monthly_ticket_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitEqualTo(Integer value) {
            addCriterion("monthly_ticket_limit =", value, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitNotEqualTo(Integer value) {
            addCriterion("monthly_ticket_limit <>", value, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitGreaterThan(Integer value) {
            addCriterion("monthly_ticket_limit >", value, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_ticket_limit >=", value, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitLessThan(Integer value) {
            addCriterion("monthly_ticket_limit <", value, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_ticket_limit <=", value, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitIn(List<Integer> values) {
            addCriterion("monthly_ticket_limit in", values, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitNotIn(List<Integer> values) {
            addCriterion("monthly_ticket_limit not in", values, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitBetween(Integer value1, Integer value2) {
            addCriterion("monthly_ticket_limit between", value1, value2, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_ticket_limit not between", value1, value2, "monthlyTicketLimit");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceIsNull() {
            addCriterion("monthly_ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceIsNotNull() {
            addCriterion("monthly_ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceEqualTo(Integer value) {
            addCriterion("monthly_ticket_price =", value, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceNotEqualTo(Integer value) {
            addCriterion("monthly_ticket_price <>", value, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceGreaterThan(Integer value) {
            addCriterion("monthly_ticket_price >", value, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_ticket_price >=", value, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceLessThan(Integer value) {
            addCriterion("monthly_ticket_price <", value, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_ticket_price <=", value, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceIn(List<Integer> values) {
            addCriterion("monthly_ticket_price in", values, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceNotIn(List<Integer> values) {
            addCriterion("monthly_ticket_price not in", values, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceBetween(Integer value1, Integer value2) {
            addCriterion("monthly_ticket_price between", value1, value2, "monthlyTicketPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_ticket_price not between", value1, value2, "monthlyTicketPrice");
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

        public Criteria andParkingUserIsNull() {
            addCriterion("parking_user is null");
            return (Criteria) this;
        }

        public Criteria andParkingUserIsNotNull() {
            addCriterion("parking_user is not null");
            return (Criteria) this;
        }

        public Criteria andParkingUserEqualTo(String value) {
            addCriterion("parking_user =", value, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserNotEqualTo(String value) {
            addCriterion("parking_user <>", value, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserGreaterThan(String value) {
            addCriterion("parking_user >", value, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserGreaterThanOrEqualTo(String value) {
            addCriterion("parking_user >=", value, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserLessThan(String value) {
            addCriterion("parking_user <", value, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserLessThanOrEqualTo(String value) {
            addCriterion("parking_user <=", value, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserLike(String value) {
            addCriterion("parking_user like", value, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserNotLike(String value) {
            addCriterion("parking_user not like", value, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserIn(List<String> values) {
            addCriterion("parking_user in", values, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserNotIn(List<String> values) {
            addCriterion("parking_user not in", values, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserBetween(String value1, String value2) {
            addCriterion("parking_user between", value1, value2, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingUserNotBetween(String value1, String value2) {
            addCriterion("parking_user not between", value1, value2, "parkingUser");
            return (Criteria) this;
        }

        public Criteria andParkingPwdIsNull() {
            addCriterion("parking_pwd is null");
            return (Criteria) this;
        }

        public Criteria andParkingPwdIsNotNull() {
            addCriterion("parking_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andParkingPwdEqualTo(String value) {
            addCriterion("parking_pwd =", value, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdNotEqualTo(String value) {
            addCriterion("parking_pwd <>", value, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdGreaterThan(String value) {
            addCriterion("parking_pwd >", value, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdGreaterThanOrEqualTo(String value) {
            addCriterion("parking_pwd >=", value, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdLessThan(String value) {
            addCriterion("parking_pwd <", value, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdLessThanOrEqualTo(String value) {
            addCriterion("parking_pwd <=", value, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdLike(String value) {
            addCriterion("parking_pwd like", value, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdNotLike(String value) {
            addCriterion("parking_pwd not like", value, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdIn(List<String> values) {
            addCriterion("parking_pwd in", values, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdNotIn(List<String> values) {
            addCriterion("parking_pwd not in", values, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdBetween(String value1, String value2) {
            addCriterion("parking_pwd between", value1, value2, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingPwdNotBetween(String value1, String value2) {
            addCriterion("parking_pwd not between", value1, value2, "parkingPwd");
            return (Criteria) this;
        }

        public Criteria andParkingMoldIsNull() {
            addCriterion("parking_mold is null");
            return (Criteria) this;
        }

        public Criteria andParkingMoldIsNotNull() {
            addCriterion("parking_mold is not null");
            return (Criteria) this;
        }

        public Criteria andParkingMoldEqualTo(Integer value) {
            addCriterion("parking_mold =", value, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldNotEqualTo(Integer value) {
            addCriterion("parking_mold <>", value, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldGreaterThan(Integer value) {
            addCriterion("parking_mold >", value, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_mold >=", value, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldLessThan(Integer value) {
            addCriterion("parking_mold <", value, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldLessThanOrEqualTo(Integer value) {
            addCriterion("parking_mold <=", value, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldIn(List<Integer> values) {
            addCriterion("parking_mold in", values, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldNotIn(List<Integer> values) {
            addCriterion("parking_mold not in", values, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldBetween(Integer value1, Integer value2) {
            addCriterion("parking_mold between", value1, value2, "parkingMold");
            return (Criteria) this;
        }

        public Criteria andParkingMoldNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_mold not between", value1, value2, "parkingMold");
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

        public Criteria andSeationAddressIsNull() {
            addCriterion("seation_address is null");
            return (Criteria) this;
        }

        public Criteria andSeationAddressIsNotNull() {
            addCriterion("seation_address is not null");
            return (Criteria) this;
        }

        public Criteria andSeationAddressEqualTo(String value) {
            addCriterion("seation_address =", value, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressNotEqualTo(String value) {
            addCriterion("seation_address <>", value, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressGreaterThan(String value) {
            addCriterion("seation_address >", value, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("seation_address >=", value, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressLessThan(String value) {
            addCriterion("seation_address <", value, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressLessThanOrEqualTo(String value) {
            addCriterion("seation_address <=", value, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressLike(String value) {
            addCriterion("seation_address like", value, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressNotLike(String value) {
            addCriterion("seation_address not like", value, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressIn(List<String> values) {
            addCriterion("seation_address in", values, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressNotIn(List<String> values) {
            addCriterion("seation_address not in", values, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressBetween(String value1, String value2) {
            addCriterion("seation_address between", value1, value2, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andSeationAddressNotBetween(String value1, String value2) {
            addCriterion("seation_address not between", value1, value2, "seationAddress");
            return (Criteria) this;
        }

        public Criteria andManagementUnitIsNull() {
            addCriterion("management_unit is null");
            return (Criteria) this;
        }

        public Criteria andManagementUnitIsNotNull() {
            addCriterion("management_unit is not null");
            return (Criteria) this;
        }

        public Criteria andManagementUnitEqualTo(String value) {
            addCriterion("management_unit =", value, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitNotEqualTo(String value) {
            addCriterion("management_unit <>", value, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitGreaterThan(String value) {
            addCriterion("management_unit >", value, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitGreaterThanOrEqualTo(String value) {
            addCriterion("management_unit >=", value, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitLessThan(String value) {
            addCriterion("management_unit <", value, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitLessThanOrEqualTo(String value) {
            addCriterion("management_unit <=", value, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitLike(String value) {
            addCriterion("management_unit like", value, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitNotLike(String value) {
            addCriterion("management_unit not like", value, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitIn(List<String> values) {
            addCriterion("management_unit in", values, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitNotIn(List<String> values) {
            addCriterion("management_unit not in", values, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitBetween(String value1, String value2) {
            addCriterion("management_unit between", value1, value2, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andManagementUnitNotBetween(String value1, String value2) {
            addCriterion("management_unit not between", value1, value2, "managementUnit");
            return (Criteria) this;
        }

        public Criteria andParkingTelIsNull() {
            addCriterion("parking_tel is null");
            return (Criteria) this;
        }

        public Criteria andParkingTelIsNotNull() {
            addCriterion("parking_tel is not null");
            return (Criteria) this;
        }

        public Criteria andParkingTelEqualTo(String value) {
            addCriterion("parking_tel =", value, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelNotEqualTo(String value) {
            addCriterion("parking_tel <>", value, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelGreaterThan(String value) {
            addCriterion("parking_tel >", value, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelGreaterThanOrEqualTo(String value) {
            addCriterion("parking_tel >=", value, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelLessThan(String value) {
            addCriterion("parking_tel <", value, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelLessThanOrEqualTo(String value) {
            addCriterion("parking_tel <=", value, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelLike(String value) {
            addCriterion("parking_tel like", value, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelNotLike(String value) {
            addCriterion("parking_tel not like", value, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelIn(List<String> values) {
            addCriterion("parking_tel in", values, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelNotIn(List<String> values) {
            addCriterion("parking_tel not in", values, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelBetween(String value1, String value2) {
            addCriterion("parking_tel between", value1, value2, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andParkingTelNotBetween(String value1, String value2) {
            addCriterion("parking_tel not between", value1, value2, "parkingTel");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNull() {
            addCriterion("img_path is null");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNotNull() {
            addCriterion("img_path is not null");
            return (Criteria) this;
        }

        public Criteria andImgPathEqualTo(String value) {
            addCriterion("img_path =", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotEqualTo(String value) {
            addCriterion("img_path <>", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThan(String value) {
            addCriterion("img_path >", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("img_path >=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThan(String value) {
            addCriterion("img_path <", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThanOrEqualTo(String value) {
            addCriterion("img_path <=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLike(String value) {
            addCriterion("img_path like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotLike(String value) {
            addCriterion("img_path not like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathIn(List<String> values) {
            addCriterion("img_path in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotIn(List<String> values) {
            addCriterion("img_path not in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathBetween(String value1, String value2) {
            addCriterion("img_path between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotBetween(String value1, String value2) {
            addCriterion("img_path not between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoIsNull() {
            addCriterion("total_parking_no is null");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoIsNotNull() {
            addCriterion("total_parking_no is not null");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoEqualTo(Integer value) {
            addCriterion("total_parking_no =", value, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoNotEqualTo(Integer value) {
            addCriterion("total_parking_no <>", value, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoGreaterThan(Integer value) {
            addCriterion("total_parking_no >", value, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_parking_no >=", value, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoLessThan(Integer value) {
            addCriterion("total_parking_no <", value, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoLessThanOrEqualTo(Integer value) {
            addCriterion("total_parking_no <=", value, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoIn(List<Integer> values) {
            addCriterion("total_parking_no in", values, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoNotIn(List<Integer> values) {
            addCriterion("total_parking_no not in", values, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoBetween(Integer value1, Integer value2) {
            addCriterion("total_parking_no between", value1, value2, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andTotalParkingNoNotBetween(Integer value1, Integer value2) {
            addCriterion("total_parking_no not between", value1, value2, "totalParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoIsNull() {
            addCriterion("fixture_parking_no is null");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoIsNotNull() {
            addCriterion("fixture_parking_no is not null");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoEqualTo(Integer value) {
            addCriterion("fixture_parking_no =", value, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoNotEqualTo(Integer value) {
            addCriterion("fixture_parking_no <>", value, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoGreaterThan(Integer value) {
            addCriterion("fixture_parking_no >", value, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("fixture_parking_no >=", value, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoLessThan(Integer value) {
            addCriterion("fixture_parking_no <", value, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoLessThanOrEqualTo(Integer value) {
            addCriterion("fixture_parking_no <=", value, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoIn(List<Integer> values) {
            addCriterion("fixture_parking_no in", values, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoNotIn(List<Integer> values) {
            addCriterion("fixture_parking_no not in", values, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoBetween(Integer value1, Integer value2) {
            addCriterion("fixture_parking_no between", value1, value2, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andFixtureParkingNoNotBetween(Integer value1, Integer value2) {
            addCriterion("fixture_parking_no not between", value1, value2, "fixtureParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoIsNull() {
            addCriterion("current_parking_no is null");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoIsNotNull() {
            addCriterion("current_parking_no is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoEqualTo(Integer value) {
            addCriterion("current_parking_no =", value, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoNotEqualTo(Integer value) {
            addCriterion("current_parking_no <>", value, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoGreaterThan(Integer value) {
            addCriterion("current_parking_no >", value, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_parking_no >=", value, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoLessThan(Integer value) {
            addCriterion("current_parking_no <", value, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoLessThanOrEqualTo(Integer value) {
            addCriterion("current_parking_no <=", value, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoIn(List<Integer> values) {
            addCriterion("current_parking_no in", values, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoNotIn(List<Integer> values) {
            addCriterion("current_parking_no not in", values, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoBetween(Integer value1, Integer value2) {
            addCriterion("current_parking_no between", value1, value2, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andCurrentParkingNoNotBetween(Integer value1, Integer value2) {
            addCriterion("current_parking_no not between", value1, value2, "currentParkingNo");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andParkCodeIsNull() {
            addCriterion("park_code is null");
            return (Criteria) this;
        }

        public Criteria andParkCodeIsNotNull() {
            addCriterion("park_code is not null");
            return (Criteria) this;
        }

        public Criteria andParkCodeEqualTo(String value) {
            addCriterion("park_code =", value, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeNotEqualTo(String value) {
            addCriterion("park_code <>", value, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeGreaterThan(String value) {
            addCriterion("park_code >", value, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("park_code >=", value, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeLessThan(String value) {
            addCriterion("park_code <", value, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeLessThanOrEqualTo(String value) {
            addCriterion("park_code <=", value, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeLike(String value) {
            addCriterion("park_code like", value, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeNotLike(String value) {
            addCriterion("park_code not like", value, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeIn(List<String> values) {
            addCriterion("park_code in", values, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeNotIn(List<String> values) {
            addCriterion("park_code not in", values, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeBetween(String value1, String value2) {
            addCriterion("park_code between", value1, value2, "parkCode");
            return (Criteria) this;
        }

        public Criteria andParkCodeNotBetween(String value1, String value2) {
            addCriterion("park_code not between", value1, value2, "parkCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoIsNull() {
            addCriterion("strategy_info is null");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoIsNotNull() {
            addCriterion("strategy_info is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoEqualTo(String value) {
            addCriterion("strategy_info =", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoNotEqualTo(String value) {
            addCriterion("strategy_info <>", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoGreaterThan(String value) {
            addCriterion("strategy_info >", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_info >=", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoLessThan(String value) {
            addCriterion("strategy_info <", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoLessThanOrEqualTo(String value) {
            addCriterion("strategy_info <=", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoLike(String value) {
            addCriterion("strategy_info like", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoNotLike(String value) {
            addCriterion("strategy_info not like", value, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoIn(List<String> values) {
            addCriterion("strategy_info in", values, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoNotIn(List<String> values) {
            addCriterion("strategy_info not in", values, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoBetween(String value1, String value2) {
            addCriterion("strategy_info between", value1, value2, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andStrategyInfoNotBetween(String value1, String value2) {
            addCriterion("strategy_info not between", value1, value2, "strategyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andSaturationIsNull() {
            addCriterion("saturation is null");
            return (Criteria) this;
        }

        public Criteria andSaturationIsNotNull() {
            addCriterion("saturation is not null");
            return (Criteria) this;
        }

        public Criteria andSaturationEqualTo(BigDecimal value) {
            addCriterion("saturation =", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationNotEqualTo(BigDecimal value) {
            addCriterion("saturation <>", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationGreaterThan(BigDecimal value) {
            addCriterion("saturation >", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("saturation >=", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationLessThan(BigDecimal value) {
            addCriterion("saturation <", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("saturation <=", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationIn(List<BigDecimal> values) {
            addCriterion("saturation in", values, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationNotIn(List<BigDecimal> values) {
            addCriterion("saturation not in", values, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("saturation between", value1, value2, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("saturation not between", value1, value2, "saturation");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Integer value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Integer value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Integer value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Integer value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Integer> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Integer> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkIsNull() {
            addCriterion("parking_remark is null");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkIsNotNull() {
            addCriterion("parking_remark is not null");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkEqualTo(String value) {
            addCriterion("parking_remark =", value, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkNotEqualTo(String value) {
            addCriterion("parking_remark <>", value, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkGreaterThan(String value) {
            addCriterion("parking_remark >", value, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("parking_remark >=", value, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkLessThan(String value) {
            addCriterion("parking_remark <", value, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkLessThanOrEqualTo(String value) {
            addCriterion("parking_remark <=", value, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkLike(String value) {
            addCriterion("parking_remark like", value, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkNotLike(String value) {
            addCriterion("parking_remark not like", value, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkIn(List<String> values) {
            addCriterion("parking_remark in", values, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkNotIn(List<String> values) {
            addCriterion("parking_remark not in", values, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkBetween(String value1, String value2) {
            addCriterion("parking_remark between", value1, value2, "parkingRemark");
            return (Criteria) this;
        }

        public Criteria andParkingRemarkNotBetween(String value1, String value2) {
            addCriterion("parking_remark not between", value1, value2, "parkingRemark");
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