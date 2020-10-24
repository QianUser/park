package com.park.cloud.common.domain.po.dict;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictSectionPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictSectionPOExample() {
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

        public Criteria andSectionNameIsNull() {
            addCriterion("section_name is null");
            return (Criteria) this;
        }

        public Criteria andSectionNameIsNotNull() {
            addCriterion("section_name is not null");
            return (Criteria) this;
        }

        public Criteria andSectionNameEqualTo(String value) {
            addCriterion("section_name =", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotEqualTo(String value) {
            addCriterion("section_name <>", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameGreaterThan(String value) {
            addCriterion("section_name >", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("section_name >=", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLessThan(String value) {
            addCriterion("section_name <", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLessThanOrEqualTo(String value) {
            addCriterion("section_name <=", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameLike(String value) {
            addCriterion("section_name like", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotLike(String value) {
            addCriterion("section_name not like", value, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameIn(List<String> values) {
            addCriterion("section_name in", values, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotIn(List<String> values) {
            addCriterion("section_name not in", values, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameBetween(String value1, String value2) {
            addCriterion("section_name between", value1, value2, "sectionName");
            return (Criteria) this;
        }

        public Criteria andSectionNameNotBetween(String value1, String value2) {
            addCriterion("section_name not between", value1, value2, "sectionName");
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

        public Criteria andSectionMoldIsNull() {
            addCriterion("section_mold is null");
            return (Criteria) this;
        }

        public Criteria andSectionMoldIsNotNull() {
            addCriterion("section_mold is not null");
            return (Criteria) this;
        }

        public Criteria andSectionMoldEqualTo(Integer value) {
            addCriterion("section_mold =", value, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldNotEqualTo(Integer value) {
            addCriterion("section_mold <>", value, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldGreaterThan(Integer value) {
            addCriterion("section_mold >", value, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_mold >=", value, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldLessThan(Integer value) {
            addCriterion("section_mold <", value, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldLessThanOrEqualTo(Integer value) {
            addCriterion("section_mold <=", value, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldIn(List<Integer> values) {
            addCriterion("section_mold in", values, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldNotIn(List<Integer> values) {
            addCriterion("section_mold not in", values, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldBetween(Integer value1, Integer value2) {
            addCriterion("section_mold between", value1, value2, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionMoldNotBetween(Integer value1, Integer value2) {
            addCriterion("section_mold not between", value1, value2, "sectionMold");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeIsNull() {
            addCriterion("section_longitude is null");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeIsNotNull() {
            addCriterion("section_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeEqualTo(String value) {
            addCriterion("section_longitude =", value, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeNotEqualTo(String value) {
            addCriterion("section_longitude <>", value, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeGreaterThan(String value) {
            addCriterion("section_longitude >", value, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("section_longitude >=", value, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeLessThan(String value) {
            addCriterion("section_longitude <", value, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeLessThanOrEqualTo(String value) {
            addCriterion("section_longitude <=", value, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeLike(String value) {
            addCriterion("section_longitude like", value, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeNotLike(String value) {
            addCriterion("section_longitude not like", value, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeIn(List<String> values) {
            addCriterion("section_longitude in", values, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeNotIn(List<String> values) {
            addCriterion("section_longitude not in", values, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeBetween(String value1, String value2) {
            addCriterion("section_longitude between", value1, value2, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLongitudeNotBetween(String value1, String value2) {
            addCriterion("section_longitude not between", value1, value2, "sectionLongitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeIsNull() {
            addCriterion("section_latitude is null");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeIsNotNull() {
            addCriterion("section_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeEqualTo(String value) {
            addCriterion("section_latitude =", value, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeNotEqualTo(String value) {
            addCriterion("section_latitude <>", value, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeGreaterThan(String value) {
            addCriterion("section_latitude >", value, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("section_latitude >=", value, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeLessThan(String value) {
            addCriterion("section_latitude <", value, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeLessThanOrEqualTo(String value) {
            addCriterion("section_latitude <=", value, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeLike(String value) {
            addCriterion("section_latitude like", value, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeNotLike(String value) {
            addCriterion("section_latitude not like", value, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeIn(List<String> values) {
            addCriterion("section_latitude in", values, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeNotIn(List<String> values) {
            addCriterion("section_latitude not in", values, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeBetween(String value1, String value2) {
            addCriterion("section_latitude between", value1, value2, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionLatitudeNotBetween(String value1, String value2) {
            addCriterion("section_latitude not between", value1, value2, "sectionLatitude");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkIsNull() {
            addCriterion("section_remark is null");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkIsNotNull() {
            addCriterion("section_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkEqualTo(String value) {
            addCriterion("section_remark =", value, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkNotEqualTo(String value) {
            addCriterion("section_remark <>", value, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkGreaterThan(String value) {
            addCriterion("section_remark >", value, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("section_remark >=", value, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkLessThan(String value) {
            addCriterion("section_remark <", value, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkLessThanOrEqualTo(String value) {
            addCriterion("section_remark <=", value, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkLike(String value) {
            addCriterion("section_remark like", value, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkNotLike(String value) {
            addCriterion("section_remark not like", value, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkIn(List<String> values) {
            addCriterion("section_remark in", values, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkNotIn(List<String> values) {
            addCriterion("section_remark not in", values, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkBetween(String value1, String value2) {
            addCriterion("section_remark between", value1, value2, "sectionRemark");
            return (Criteria) this;
        }

        public Criteria andSectionRemarkNotBetween(String value1, String value2) {
            addCriterion("section_remark not between", value1, value2, "sectionRemark");
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

        public Criteria andBottomDirectionIsNull() {
            addCriterion("bottom_direction is null");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionIsNotNull() {
            addCriterion("bottom_direction is not null");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionEqualTo(String value) {
            addCriterion("bottom_direction =", value, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionNotEqualTo(String value) {
            addCriterion("bottom_direction <>", value, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionGreaterThan(String value) {
            addCriterion("bottom_direction >", value, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("bottom_direction >=", value, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionLessThan(String value) {
            addCriterion("bottom_direction <", value, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionLessThanOrEqualTo(String value) {
            addCriterion("bottom_direction <=", value, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionLike(String value) {
            addCriterion("bottom_direction like", value, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionNotLike(String value) {
            addCriterion("bottom_direction not like", value, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionIn(List<String> values) {
            addCriterion("bottom_direction in", values, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionNotIn(List<String> values) {
            addCriterion("bottom_direction not in", values, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionBetween(String value1, String value2) {
            addCriterion("bottom_direction between", value1, value2, "bottomDirection");
            return (Criteria) this;
        }

        public Criteria andBottomDirectionNotBetween(String value1, String value2) {
            addCriterion("bottom_direction not between", value1, value2, "bottomDirection");
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

        public Criteria andPoliceSectionCodeIsNull() {
            addCriterion("police_section_code is null");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeIsNotNull() {
            addCriterion("police_section_code is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeEqualTo(String value) {
            addCriterion("police_section_code =", value, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeNotEqualTo(String value) {
            addCriterion("police_section_code <>", value, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeGreaterThan(String value) {
            addCriterion("police_section_code >", value, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("police_section_code >=", value, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeLessThan(String value) {
            addCriterion("police_section_code <", value, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeLessThanOrEqualTo(String value) {
            addCriterion("police_section_code <=", value, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeLike(String value) {
            addCriterion("police_section_code like", value, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeNotLike(String value) {
            addCriterion("police_section_code not like", value, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeIn(List<String> values) {
            addCriterion("police_section_code in", values, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeNotIn(List<String> values) {
            addCriterion("police_section_code not in", values, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeBetween(String value1, String value2) {
            addCriterion("police_section_code between", value1, value2, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionCodeNotBetween(String value1, String value2) {
            addCriterion("police_section_code not between", value1, value2, "policeSectionCode");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameIsNull() {
            addCriterion("police_section_name is null");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameIsNotNull() {
            addCriterion("police_section_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameEqualTo(String value) {
            addCriterion("police_section_name =", value, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameNotEqualTo(String value) {
            addCriterion("police_section_name <>", value, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameGreaterThan(String value) {
            addCriterion("police_section_name >", value, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("police_section_name >=", value, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameLessThan(String value) {
            addCriterion("police_section_name <", value, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameLessThanOrEqualTo(String value) {
            addCriterion("police_section_name <=", value, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameLike(String value) {
            addCriterion("police_section_name like", value, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameNotLike(String value) {
            addCriterion("police_section_name not like", value, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameIn(List<String> values) {
            addCriterion("police_section_name in", values, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameNotIn(List<String> values) {
            addCriterion("police_section_name not in", values, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameBetween(String value1, String value2) {
            addCriterion("police_section_name between", value1, value2, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andPoliceSectionNameNotBetween(String value1, String value2) {
            addCriterion("police_section_name not between", value1, value2, "policeSectionName");
            return (Criteria) this;
        }

        public Criteria andBerthFormIsNull() {
            addCriterion("berth_form is null");
            return (Criteria) this;
        }

        public Criteria andBerthFormIsNotNull() {
            addCriterion("berth_form is not null");
            return (Criteria) this;
        }

        public Criteria andBerthFormEqualTo(Integer value) {
            addCriterion("berth_form =", value, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormNotEqualTo(Integer value) {
            addCriterion("berth_form <>", value, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormGreaterThan(Integer value) {
            addCriterion("berth_form >", value, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormGreaterThanOrEqualTo(Integer value) {
            addCriterion("berth_form >=", value, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormLessThan(Integer value) {
            addCriterion("berth_form <", value, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormLessThanOrEqualTo(Integer value) {
            addCriterion("berth_form <=", value, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormIn(List<Integer> values) {
            addCriterion("berth_form in", values, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormNotIn(List<Integer> values) {
            addCriterion("berth_form not in", values, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormBetween(Integer value1, Integer value2) {
            addCriterion("berth_form between", value1, value2, "berthForm");
            return (Criteria) this;
        }

        public Criteria andBerthFormNotBetween(Integer value1, Integer value2) {
            addCriterion("berth_form not between", value1, value2, "berthForm");
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

        public Criteria andTotalBerthNoIsNull() {
            addCriterion("total_berth_no is null");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoIsNotNull() {
            addCriterion("total_berth_no is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoEqualTo(Integer value) {
            addCriterion("total_berth_no =", value, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoNotEqualTo(Integer value) {
            addCriterion("total_berth_no <>", value, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoGreaterThan(Integer value) {
            addCriterion("total_berth_no >", value, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_berth_no >=", value, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoLessThan(Integer value) {
            addCriterion("total_berth_no <", value, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoLessThanOrEqualTo(Integer value) {
            addCriterion("total_berth_no <=", value, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoIn(List<Integer> values) {
            addCriterion("total_berth_no in", values, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoNotIn(List<Integer> values) {
            addCriterion("total_berth_no not in", values, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoBetween(Integer value1, Integer value2) {
            addCriterion("total_berth_no between", value1, value2, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andTotalBerthNoNotBetween(Integer value1, Integer value2) {
            addCriterion("total_berth_no not between", value1, value2, "totalBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoIsNull() {
            addCriterion("current_berth_no is null");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoIsNotNull() {
            addCriterion("current_berth_no is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoEqualTo(Integer value) {
            addCriterion("current_berth_no =", value, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoNotEqualTo(Integer value) {
            addCriterion("current_berth_no <>", value, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoGreaterThan(Integer value) {
            addCriterion("current_berth_no >", value, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_berth_no >=", value, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoLessThan(Integer value) {
            addCriterion("current_berth_no <", value, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoLessThanOrEqualTo(Integer value) {
            addCriterion("current_berth_no <=", value, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoIn(List<Integer> values) {
            addCriterion("current_berth_no in", values, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoNotIn(List<Integer> values) {
            addCriterion("current_berth_no not in", values, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoBetween(Integer value1, Integer value2) {
            addCriterion("current_berth_no between", value1, value2, "currentBerthNo");
            return (Criteria) this;
        }

        public Criteria andCurrentBerthNoNotBetween(Integer value1, Integer value2) {
            addCriterion("current_berth_no not between", value1, value2, "currentBerthNo");
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