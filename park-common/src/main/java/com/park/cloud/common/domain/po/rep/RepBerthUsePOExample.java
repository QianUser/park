package com.park.cloud.common.domain.po.rep;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepBerthUsePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepBerthUsePOExample() {
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

        public Criteria andBerthUseIdIsNull() {
            addCriterion("berth_use_id is null");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdIsNotNull() {
            addCriterion("berth_use_id is not null");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdEqualTo(Integer value) {
            addCriterion("berth_use_id =", value, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdNotEqualTo(Integer value) {
            addCriterion("berth_use_id <>", value, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdGreaterThan(Integer value) {
            addCriterion("berth_use_id >", value, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("berth_use_id >=", value, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdLessThan(Integer value) {
            addCriterion("berth_use_id <", value, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdLessThanOrEqualTo(Integer value) {
            addCriterion("berth_use_id <=", value, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdIn(List<Integer> values) {
            addCriterion("berth_use_id in", values, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdNotIn(List<Integer> values) {
            addCriterion("berth_use_id not in", values, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdBetween(Integer value1, Integer value2) {
            addCriterion("berth_use_id between", value1, value2, "berthUseId");
            return (Criteria) this;
        }

        public Criteria andBerthUseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("berth_use_id not between", value1, value2, "berthUseId");
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

        public Criteria andApplyMethodIsNull() {
            addCriterion("apply_method is null");
            return (Criteria) this;
        }

        public Criteria andApplyMethodIsNotNull() {
            addCriterion("apply_method is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMethodEqualTo(Integer value) {
            addCriterion("apply_method =", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodNotEqualTo(Integer value) {
            addCriterion("apply_method <>", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodGreaterThan(Integer value) {
            addCriterion("apply_method >", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_method >=", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodLessThan(Integer value) {
            addCriterion("apply_method <", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodLessThanOrEqualTo(Integer value) {
            addCriterion("apply_method <=", value, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodIn(List<Integer> values) {
            addCriterion("apply_method in", values, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodNotIn(List<Integer> values) {
            addCriterion("apply_method not in", values, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodBetween(Integer value1, Integer value2) {
            addCriterion("apply_method between", value1, value2, "applyMethod");
            return (Criteria) this;
        }

        public Criteria andApplyMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_method not between", value1, value2, "applyMethod");
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

        public Criteria andTradeNumIsNull() {
            addCriterion("trade_num is null");
            return (Criteria) this;
        }

        public Criteria andTradeNumIsNotNull() {
            addCriterion("trade_num is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNumEqualTo(Integer value) {
            addCriterion("trade_num =", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotEqualTo(Integer value) {
            addCriterion("trade_num <>", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumGreaterThan(Integer value) {
            addCriterion("trade_num >", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_num >=", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLessThan(Integer value) {
            addCriterion("trade_num <", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLessThanOrEqualTo(Integer value) {
            addCriterion("trade_num <=", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumIn(List<Integer> values) {
            addCriterion("trade_num in", values, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotIn(List<Integer> values) {
            addCriterion("trade_num not in", values, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumBetween(Integer value1, Integer value2) {
            addCriterion("trade_num between", value1, value2, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_num not between", value1, value2, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andPayNumRateIsNull() {
            addCriterion("pay_num_rate is null");
            return (Criteria) this;
        }

        public Criteria andPayNumRateIsNotNull() {
            addCriterion("pay_num_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPayNumRateEqualTo(BigDecimal value) {
            addCriterion("pay_num_rate =", value, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateNotEqualTo(BigDecimal value) {
            addCriterion("pay_num_rate <>", value, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateGreaterThan(BigDecimal value) {
            addCriterion("pay_num_rate >", value, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_num_rate >=", value, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateLessThan(BigDecimal value) {
            addCriterion("pay_num_rate <", value, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_num_rate <=", value, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateIn(List<BigDecimal> values) {
            addCriterion("pay_num_rate in", values, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateNotIn(List<BigDecimal> values) {
            addCriterion("pay_num_rate not in", values, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_num_rate between", value1, value2, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayNumRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_num_rate not between", value1, value2, "payNumRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(Integer value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(Integer value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(Integer value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(Integer value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(Integer value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<Integer> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<Integer> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(Integer value1, Integer value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceIsNull() {
            addCriterion("arrears_price is null");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceIsNotNull() {
            addCriterion("arrears_price is not null");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceEqualTo(Integer value) {
            addCriterion("arrears_price =", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotEqualTo(Integer value) {
            addCriterion("arrears_price <>", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceGreaterThan(Integer value) {
            addCriterion("arrears_price >", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrears_price >=", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceLessThan(Integer value) {
            addCriterion("arrears_price <", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("arrears_price <=", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceIn(List<Integer> values) {
            addCriterion("arrears_price in", values, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotIn(List<Integer> values) {
            addCriterion("arrears_price not in", values, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceBetween(Integer value1, Integer value2) {
            addCriterion("arrears_price between", value1, value2, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("arrears_price not between", value1, value2, "arrearsPrice");
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

        public Criteria andPayPriceRateIsNull() {
            addCriterion("pay_price_rate is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateIsNotNull() {
            addCriterion("pay_price_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateEqualTo(BigDecimal value) {
            addCriterion("pay_price_rate =", value, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateNotEqualTo(BigDecimal value) {
            addCriterion("pay_price_rate <>", value, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateGreaterThan(BigDecimal value) {
            addCriterion("pay_price_rate >", value, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price_rate >=", value, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateLessThan(BigDecimal value) {
            addCriterion("pay_price_rate <", value, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price_rate <=", value, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateIn(List<BigDecimal> values) {
            addCriterion("pay_price_rate in", values, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateNotIn(List<BigDecimal> values) {
            addCriterion("pay_price_rate not in", values, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price_rate between", value1, value2, "payPriceRate");
            return (Criteria) this;
        }

        public Criteria andPayPriceRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price_rate not between", value1, value2, "payPriceRate");
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