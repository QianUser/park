package com.park.cloud.common.domain.po.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictBerthCityPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictBerthCityPOExample() {
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

        public Criteria andBerthIdIsNull() {
            addCriterion("berth_id is null");
            return (Criteria) this;
        }

        public Criteria andBerthIdIsNotNull() {
            addCriterion("berth_id is not null");
            return (Criteria) this;
        }

        public Criteria andBerthIdEqualTo(Integer value) {
            addCriterion("berth_id =", value, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdNotEqualTo(Integer value) {
            addCriterion("berth_id <>", value, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdGreaterThan(Integer value) {
            addCriterion("berth_id >", value, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("berth_id >=", value, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdLessThan(Integer value) {
            addCriterion("berth_id <", value, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdLessThanOrEqualTo(Integer value) {
            addCriterion("berth_id <=", value, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdIn(List<Integer> values) {
            addCriterion("berth_id in", values, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdNotIn(List<Integer> values) {
            addCriterion("berth_id not in", values, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdBetween(Integer value1, Integer value2) {
            addCriterion("berth_id between", value1, value2, "berthId");
            return (Criteria) this;
        }

        public Criteria andBerthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("berth_id not between", value1, value2, "berthId");
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

        public Criteria andSnCodeIsNull() {
            addCriterion("sn_code is null");
            return (Criteria) this;
        }

        public Criteria andSnCodeIsNotNull() {
            addCriterion("sn_code is not null");
            return (Criteria) this;
        }

        public Criteria andSnCodeEqualTo(String value) {
            addCriterion("sn_code =", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeNotEqualTo(String value) {
            addCriterion("sn_code <>", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeGreaterThan(String value) {
            addCriterion("sn_code >", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sn_code >=", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeLessThan(String value) {
            addCriterion("sn_code <", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeLessThanOrEqualTo(String value) {
            addCriterion("sn_code <=", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeLike(String value) {
            addCriterion("sn_code like", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeNotLike(String value) {
            addCriterion("sn_code not like", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeIn(List<String> values) {
            addCriterion("sn_code in", values, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeNotIn(List<String> values) {
            addCriterion("sn_code not in", values, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeBetween(String value1, String value2) {
            addCriterion("sn_code between", value1, value2, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeNotBetween(String value1, String value2) {
            addCriterion("sn_code not between", value1, value2, "snCode");
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

        public Criteria andLineDirectionIsNull() {
            addCriterion("line_direction is null");
            return (Criteria) this;
        }

        public Criteria andLineDirectionIsNotNull() {
            addCriterion("line_direction is not null");
            return (Criteria) this;
        }

        public Criteria andLineDirectionEqualTo(Integer value) {
            addCriterion("line_direction =", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionNotEqualTo(Integer value) {
            addCriterion("line_direction <>", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionGreaterThan(Integer value) {
            addCriterion("line_direction >", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_direction >=", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionLessThan(Integer value) {
            addCriterion("line_direction <", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("line_direction <=", value, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionIn(List<Integer> values) {
            addCriterion("line_direction in", values, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionNotIn(List<Integer> values) {
            addCriterion("line_direction not in", values, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionBetween(Integer value1, Integer value2) {
            addCriterion("line_direction between", value1, value2, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andLineDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("line_direction not between", value1, value2, "lineDirection");
            return (Criteria) this;
        }

        public Criteria andBerthStatusIsNull() {
            addCriterion("berth_status is null");
            return (Criteria) this;
        }

        public Criteria andBerthStatusIsNotNull() {
            addCriterion("berth_status is not null");
            return (Criteria) this;
        }

        public Criteria andBerthStatusEqualTo(Integer value) {
            addCriterion("berth_status =", value, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusNotEqualTo(Integer value) {
            addCriterion("berth_status <>", value, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusGreaterThan(Integer value) {
            addCriterion("berth_status >", value, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("berth_status >=", value, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusLessThan(Integer value) {
            addCriterion("berth_status <", value, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusLessThanOrEqualTo(Integer value) {
            addCriterion("berth_status <=", value, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusIn(List<Integer> values) {
            addCriterion("berth_status in", values, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusNotIn(List<Integer> values) {
            addCriterion("berth_status not in", values, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusBetween(Integer value1, Integer value2) {
            addCriterion("berth_status between", value1, value2, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andBerthStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("berth_status not between", value1, value2, "berthStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusIsNull() {
            addCriterion("park_status is null");
            return (Criteria) this;
        }

        public Criteria andParkStatusIsNotNull() {
            addCriterion("park_status is not null");
            return (Criteria) this;
        }

        public Criteria andParkStatusEqualTo(Integer value) {
            addCriterion("park_status =", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusNotEqualTo(Integer value) {
            addCriterion("park_status <>", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusGreaterThan(Integer value) {
            addCriterion("park_status >", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_status >=", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusLessThan(Integer value) {
            addCriterion("park_status <", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusLessThanOrEqualTo(Integer value) {
            addCriterion("park_status <=", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusIn(List<Integer> values) {
            addCriterion("park_status in", values, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusNotIn(List<Integer> values) {
            addCriterion("park_status not in", values, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusBetween(Integer value1, Integer value2) {
            addCriterion("park_status between", value1, value2, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("park_status not between", value1, value2, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateIsNull() {
            addCriterion("status_updte_date is null");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateIsNotNull() {
            addCriterion("status_updte_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateEqualTo(Date value) {
            addCriterion("status_updte_date =", value, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateNotEqualTo(Date value) {
            addCriterion("status_updte_date <>", value, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateGreaterThan(Date value) {
            addCriterion("status_updte_date >", value, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("status_updte_date >=", value, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateLessThan(Date value) {
            addCriterion("status_updte_date <", value, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateLessThanOrEqualTo(Date value) {
            addCriterion("status_updte_date <=", value, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateIn(List<Date> values) {
            addCriterion("status_updte_date in", values, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateNotIn(List<Date> values) {
            addCriterion("status_updte_date not in", values, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateBetween(Date value1, Date value2) {
            addCriterion("status_updte_date between", value1, value2, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andStatusUpdteDateNotBetween(Date value1, Date value2) {
            addCriterion("status_updte_date not between", value1, value2, "statusUpdteDate");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeIsNull() {
            addCriterion("berth_longitude is null");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeIsNotNull() {
            addCriterion("berth_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeEqualTo(String value) {
            addCriterion("berth_longitude =", value, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeNotEqualTo(String value) {
            addCriterion("berth_longitude <>", value, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeGreaterThan(String value) {
            addCriterion("berth_longitude >", value, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("berth_longitude >=", value, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeLessThan(String value) {
            addCriterion("berth_longitude <", value, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeLessThanOrEqualTo(String value) {
            addCriterion("berth_longitude <=", value, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeLike(String value) {
            addCriterion("berth_longitude like", value, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeNotLike(String value) {
            addCriterion("berth_longitude not like", value, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeIn(List<String> values) {
            addCriterion("berth_longitude in", values, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeNotIn(List<String> values) {
            addCriterion("berth_longitude not in", values, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeBetween(String value1, String value2) {
            addCriterion("berth_longitude between", value1, value2, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLongitudeNotBetween(String value1, String value2) {
            addCriterion("berth_longitude not between", value1, value2, "berthLongitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeIsNull() {
            addCriterion("berth_latitude is null");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeIsNotNull() {
            addCriterion("berth_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeEqualTo(String value) {
            addCriterion("berth_latitude =", value, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeNotEqualTo(String value) {
            addCriterion("berth_latitude <>", value, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeGreaterThan(String value) {
            addCriterion("berth_latitude >", value, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("berth_latitude >=", value, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeLessThan(String value) {
            addCriterion("berth_latitude <", value, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeLessThanOrEqualTo(String value) {
            addCriterion("berth_latitude <=", value, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeLike(String value) {
            addCriterion("berth_latitude like", value, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeNotLike(String value) {
            addCriterion("berth_latitude not like", value, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeIn(List<String> values) {
            addCriterion("berth_latitude in", values, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeNotIn(List<String> values) {
            addCriterion("berth_latitude not in", values, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeBetween(String value1, String value2) {
            addCriterion("berth_latitude between", value1, value2, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andBerthLatitudeNotBetween(String value1, String value2) {
            addCriterion("berth_latitude not between", value1, value2, "berthLatitude");
            return (Criteria) this;
        }

        public Criteria andSetPositionIsNull() {
            addCriterion("set_position is null");
            return (Criteria) this;
        }

        public Criteria andSetPositionIsNotNull() {
            addCriterion("set_position is not null");
            return (Criteria) this;
        }

        public Criteria andSetPositionEqualTo(Integer value) {
            addCriterion("set_position =", value, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionNotEqualTo(Integer value) {
            addCriterion("set_position <>", value, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionGreaterThan(Integer value) {
            addCriterion("set_position >", value, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_position >=", value, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionLessThan(Integer value) {
            addCriterion("set_position <", value, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionLessThanOrEqualTo(Integer value) {
            addCriterion("set_position <=", value, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionIn(List<Integer> values) {
            addCriterion("set_position in", values, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionNotIn(List<Integer> values) {
            addCriterion("set_position not in", values, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionBetween(Integer value1, Integer value2) {
            addCriterion("set_position between", value1, value2, "setPosition");
            return (Criteria) this;
        }

        public Criteria andSetPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("set_position not between", value1, value2, "setPosition");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkIsNull() {
            addCriterion("berth_remark is null");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkIsNotNull() {
            addCriterion("berth_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkEqualTo(String value) {
            addCriterion("berth_remark =", value, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkNotEqualTo(String value) {
            addCriterion("berth_remark <>", value, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkGreaterThan(String value) {
            addCriterion("berth_remark >", value, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("berth_remark >=", value, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkLessThan(String value) {
            addCriterion("berth_remark <", value, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkLessThanOrEqualTo(String value) {
            addCriterion("berth_remark <=", value, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkLike(String value) {
            addCriterion("berth_remark like", value, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkNotLike(String value) {
            addCriterion("berth_remark not like", value, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkIn(List<String> values) {
            addCriterion("berth_remark in", values, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkNotIn(List<String> values) {
            addCriterion("berth_remark not in", values, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkBetween(String value1, String value2) {
            addCriterion("berth_remark between", value1, value2, "berthRemark");
            return (Criteria) this;
        }

        public Criteria andBerthRemarkNotBetween(String value1, String value2) {
            addCriterion("berth_remark not between", value1, value2, "berthRemark");
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

        public Criteria andUseWayIsNull() {
            addCriterion("use_way is null");
            return (Criteria) this;
        }

        public Criteria andUseWayIsNotNull() {
            addCriterion("use_way is not null");
            return (Criteria) this;
        }

        public Criteria andUseWayEqualTo(Integer value) {
            addCriterion("use_way =", value, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayNotEqualTo(Integer value) {
            addCriterion("use_way <>", value, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayGreaterThan(Integer value) {
            addCriterion("use_way >", value, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_way >=", value, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayLessThan(Integer value) {
            addCriterion("use_way <", value, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayLessThanOrEqualTo(Integer value) {
            addCriterion("use_way <=", value, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayIn(List<Integer> values) {
            addCriterion("use_way in", values, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayNotIn(List<Integer> values) {
            addCriterion("use_way not in", values, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayBetween(Integer value1, Integer value2) {
            addCriterion("use_way between", value1, value2, "useWay");
            return (Criteria) this;
        }

        public Criteria andUseWayNotBetween(Integer value1, Integer value2) {
            addCriterion("use_way not between", value1, value2, "useWay");
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