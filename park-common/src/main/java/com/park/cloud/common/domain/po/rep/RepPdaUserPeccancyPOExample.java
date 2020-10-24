package com.park.cloud.common.domain.po.rep;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepPdaUserPeccancyPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepPdaUserPeccancyPOExample() {
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

        public Criteria andPdaUserIdIsNull() {
            addCriterion("pda_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdIsNotNull() {
            addCriterion("pda_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdEqualTo(Integer value) {
            addCriterion("pda_user_id =", value, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdNotEqualTo(Integer value) {
            addCriterion("pda_user_id <>", value, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdGreaterThan(Integer value) {
            addCriterion("pda_user_id >", value, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pda_user_id >=", value, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdLessThan(Integer value) {
            addCriterion("pda_user_id <", value, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("pda_user_id <=", value, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdIn(List<Integer> values) {
            addCriterion("pda_user_id in", values, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdNotIn(List<Integer> values) {
            addCriterion("pda_user_id not in", values, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdBetween(Integer value1, Integer value2) {
            addCriterion("pda_user_id between", value1, value2, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pda_user_id not between", value1, value2, "pdaUserId");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameIsNull() {
            addCriterion("pda_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameIsNotNull() {
            addCriterion("pda_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameEqualTo(String value) {
            addCriterion("pda_user_name =", value, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameNotEqualTo(String value) {
            addCriterion("pda_user_name <>", value, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameGreaterThan(String value) {
            addCriterion("pda_user_name >", value, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("pda_user_name >=", value, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameLessThan(String value) {
            addCriterion("pda_user_name <", value, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameLessThanOrEqualTo(String value) {
            addCriterion("pda_user_name <=", value, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameLike(String value) {
            addCriterion("pda_user_name like", value, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameNotLike(String value) {
            addCriterion("pda_user_name not like", value, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameIn(List<String> values) {
            addCriterion("pda_user_name in", values, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameNotIn(List<String> values) {
            addCriterion("pda_user_name not in", values, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameBetween(String value1, String value2) {
            addCriterion("pda_user_name between", value1, value2, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPdaUserNameNotBetween(String value1, String value2) {
            addCriterion("pda_user_name not between", value1, value2, "pdaUserName");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumIsNull() {
            addCriterion("peccancy_num is null");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumIsNotNull() {
            addCriterion("peccancy_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumEqualTo(Integer value) {
            addCriterion("peccancy_num =", value, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumNotEqualTo(Integer value) {
            addCriterion("peccancy_num <>", value, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumGreaterThan(Integer value) {
            addCriterion("peccancy_num >", value, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("peccancy_num >=", value, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumLessThan(Integer value) {
            addCriterion("peccancy_num <", value, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumLessThanOrEqualTo(Integer value) {
            addCriterion("peccancy_num <=", value, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumIn(List<Integer> values) {
            addCriterion("peccancy_num in", values, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumNotIn(List<Integer> values) {
            addCriterion("peccancy_num not in", values, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumBetween(Integer value1, Integer value2) {
            addCriterion("peccancy_num between", value1, value2, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andPeccancyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("peccancy_num not between", value1, value2, "peccancyNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumIsNull() {
            addCriterion("finish_num is null");
            return (Criteria) this;
        }

        public Criteria andFinishNumIsNotNull() {
            addCriterion("finish_num is not null");
            return (Criteria) this;
        }

        public Criteria andFinishNumEqualTo(Integer value) {
            addCriterion("finish_num =", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumNotEqualTo(Integer value) {
            addCriterion("finish_num <>", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumGreaterThan(Integer value) {
            addCriterion("finish_num >", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_num >=", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumLessThan(Integer value) {
            addCriterion("finish_num <", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumLessThanOrEqualTo(Integer value) {
            addCriterion("finish_num <=", value, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumIn(List<Integer> values) {
            addCriterion("finish_num in", values, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumNotIn(List<Integer> values) {
            addCriterion("finish_num not in", values, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumBetween(Integer value1, Integer value2) {
            addCriterion("finish_num between", value1, value2, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishNumNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_num not between", value1, value2, "finishNum");
            return (Criteria) this;
        }

        public Criteria andFinishRatioIsNull() {
            addCriterion("finish_ratio is null");
            return (Criteria) this;
        }

        public Criteria andFinishRatioIsNotNull() {
            addCriterion("finish_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andFinishRatioEqualTo(BigDecimal value) {
            addCriterion("finish_ratio =", value, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioNotEqualTo(BigDecimal value) {
            addCriterion("finish_ratio <>", value, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioGreaterThan(BigDecimal value) {
            addCriterion("finish_ratio >", value, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("finish_ratio >=", value, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioLessThan(BigDecimal value) {
            addCriterion("finish_ratio <", value, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("finish_ratio <=", value, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioIn(List<BigDecimal> values) {
            addCriterion("finish_ratio in", values, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioNotIn(List<BigDecimal> values) {
            addCriterion("finish_ratio not in", values, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finish_ratio between", value1, value2, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andFinishRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("finish_ratio not between", value1, value2, "finishRatio");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeIsNull() {
            addCriterion("average_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeIsNotNull() {
            addCriterion("average_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeEqualTo(Integer value) {
            addCriterion("average_finish_time =", value, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeNotEqualTo(Integer value) {
            addCriterion("average_finish_time <>", value, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeGreaterThan(Integer value) {
            addCriterion("average_finish_time >", value, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("average_finish_time >=", value, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeLessThan(Integer value) {
            addCriterion("average_finish_time <", value, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeLessThanOrEqualTo(Integer value) {
            addCriterion("average_finish_time <=", value, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeIn(List<Integer> values) {
            addCriterion("average_finish_time in", values, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeNotIn(List<Integer> values) {
            addCriterion("average_finish_time not in", values, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeBetween(Integer value1, Integer value2) {
            addCriterion("average_finish_time between", value1, value2, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andAverageFinishTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("average_finish_time not between", value1, value2, "averageFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Integer value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Integer value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Integer value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Integer value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Integer value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Integer> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Integer> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Integer value1, Integer value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
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