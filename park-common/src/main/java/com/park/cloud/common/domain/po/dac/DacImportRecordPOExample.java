package com.park.cloud.common.domain.po.dac;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DacImportRecordPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DacImportRecordPOExample() {
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

        public Criteria andEntranceNameIsNull() {
            addCriterion("entrance_name is null");
            return (Criteria) this;
        }

        public Criteria andEntranceNameIsNotNull() {
            addCriterion("entrance_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceNameEqualTo(String value) {
            addCriterion("entrance_name =", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameNotEqualTo(String value) {
            addCriterion("entrance_name <>", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameGreaterThan(String value) {
            addCriterion("entrance_name >", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameGreaterThanOrEqualTo(String value) {
            addCriterion("entrance_name >=", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameLessThan(String value) {
            addCriterion("entrance_name <", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameLessThanOrEqualTo(String value) {
            addCriterion("entrance_name <=", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameLike(String value) {
            addCriterion("entrance_name like", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameNotLike(String value) {
            addCriterion("entrance_name not like", value, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameIn(List<String> values) {
            addCriterion("entrance_name in", values, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameNotIn(List<String> values) {
            addCriterion("entrance_name not in", values, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameBetween(String value1, String value2) {
            addCriterion("entrance_name between", value1, value2, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceNameNotBetween(String value1, String value2) {
            addCriterion("entrance_name not between", value1, value2, "entranceName");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIsNull() {
            addCriterion("entrance_time is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIsNotNull() {
            addCriterion("entrance_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeEqualTo(Date value) {
            addCriterion("entrance_time =", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotEqualTo(Date value) {
            addCriterion("entrance_time <>", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeGreaterThan(Date value) {
            addCriterion("entrance_time >", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entrance_time >=", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLessThan(Date value) {
            addCriterion("entrance_time <", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLessThanOrEqualTo(Date value) {
            addCriterion("entrance_time <=", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIn(List<Date> values) {
            addCriterion("entrance_time in", values, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotIn(List<Date> values) {
            addCriterion("entrance_time not in", values, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeBetween(Date value1, Date value2) {
            addCriterion("entrance_time between", value1, value2, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotBetween(Date value1, Date value2) {
            addCriterion("entrance_time not between", value1, value2, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andExitStatusIsNull() {
            addCriterion("exit_status is null");
            return (Criteria) this;
        }

        public Criteria andExitStatusIsNotNull() {
            addCriterion("exit_status is not null");
            return (Criteria) this;
        }

        public Criteria andExitStatusEqualTo(Integer value) {
            addCriterion("exit_status =", value, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusNotEqualTo(Integer value) {
            addCriterion("exit_status <>", value, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusGreaterThan(Integer value) {
            addCriterion("exit_status >", value, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exit_status >=", value, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusLessThan(Integer value) {
            addCriterion("exit_status <", value, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exit_status <=", value, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusIn(List<Integer> values) {
            addCriterion("exit_status in", values, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusNotIn(List<Integer> values) {
            addCriterion("exit_status not in", values, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusBetween(Integer value1, Integer value2) {
            addCriterion("exit_status between", value1, value2, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exit_status not between", value1, value2, "exitStatus");
            return (Criteria) this;
        }

        public Criteria andExitNameIsNull() {
            addCriterion("exit_name is null");
            return (Criteria) this;
        }

        public Criteria andExitNameIsNotNull() {
            addCriterion("exit_name is not null");
            return (Criteria) this;
        }

        public Criteria andExitNameEqualTo(String value) {
            addCriterion("exit_name =", value, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameNotEqualTo(String value) {
            addCriterion("exit_name <>", value, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameGreaterThan(String value) {
            addCriterion("exit_name >", value, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameGreaterThanOrEqualTo(String value) {
            addCriterion("exit_name >=", value, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameLessThan(String value) {
            addCriterion("exit_name <", value, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameLessThanOrEqualTo(String value) {
            addCriterion("exit_name <=", value, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameLike(String value) {
            addCriterion("exit_name like", value, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameNotLike(String value) {
            addCriterion("exit_name not like", value, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameIn(List<String> values) {
            addCriterion("exit_name in", values, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameNotIn(List<String> values) {
            addCriterion("exit_name not in", values, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameBetween(String value1, String value2) {
            addCriterion("exit_name between", value1, value2, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitNameNotBetween(String value1, String value2) {
            addCriterion("exit_name not between", value1, value2, "exitName");
            return (Criteria) this;
        }

        public Criteria andExitTimeIsNull() {
            addCriterion("exit_time is null");
            return (Criteria) this;
        }

        public Criteria andExitTimeIsNotNull() {
            addCriterion("exit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExitTimeEqualTo(Date value) {
            addCriterion("exit_time =", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotEqualTo(Date value) {
            addCriterion("exit_time <>", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeGreaterThan(Date value) {
            addCriterion("exit_time >", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exit_time >=", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeLessThan(Date value) {
            addCriterion("exit_time <", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeLessThanOrEqualTo(Date value) {
            addCriterion("exit_time <=", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeIn(List<Date> values) {
            addCriterion("exit_time in", values, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotIn(List<Date> values) {
            addCriterion("exit_time not in", values, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeBetween(Date value1, Date value2) {
            addCriterion("exit_time between", value1, value2, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotBetween(Date value1, Date value2) {
            addCriterion("exit_time not between", value1, value2, "exitTime");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("plate_number not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateTypeIsNull() {
            addCriterion("plate_type is null");
            return (Criteria) this;
        }

        public Criteria andPlateTypeIsNotNull() {
            addCriterion("plate_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlateTypeEqualTo(Integer value) {
            addCriterion("plate_type =", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotEqualTo(Integer value) {
            addCriterion("plate_type <>", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeGreaterThan(Integer value) {
            addCriterion("plate_type >", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("plate_type >=", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeLessThan(Integer value) {
            addCriterion("plate_type <", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("plate_type <=", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeIn(List<Integer> values) {
            addCriterion("plate_type in", values, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotIn(List<Integer> values) {
            addCriterion("plate_type not in", values, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeBetween(Integer value1, Integer value2) {
            addCriterion("plate_type between", value1, value2, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("plate_type not between", value1, value2, "plateType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("charge_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(Integer value) {
            addCriterion("charge_type =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(Integer value) {
            addCriterion("charge_type <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(Integer value) {
            addCriterion("charge_type >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_type >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(Integer value) {
            addCriterion("charge_type <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("charge_type <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<Integer> values) {
            addCriterion("charge_type in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<Integer> values) {
            addCriterion("charge_type not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(Integer value1, Integer value2) {
            addCriterion("charge_type between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_type not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(Integer value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(Integer value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(Integer value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(Integer value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(Integer value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<Integer> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<Integer> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(Integer value1, Integer value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andInImgPathIsNull() {
            addCriterion("in_img_path is null");
            return (Criteria) this;
        }

        public Criteria andInImgPathIsNotNull() {
            addCriterion("in_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andInImgPathEqualTo(String value) {
            addCriterion("in_img_path =", value, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathNotEqualTo(String value) {
            addCriterion("in_img_path <>", value, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathGreaterThan(String value) {
            addCriterion("in_img_path >", value, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("in_img_path >=", value, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathLessThan(String value) {
            addCriterion("in_img_path <", value, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathLessThanOrEqualTo(String value) {
            addCriterion("in_img_path <=", value, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathLike(String value) {
            addCriterion("in_img_path like", value, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathNotLike(String value) {
            addCriterion("in_img_path not like", value, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathIn(List<String> values) {
            addCriterion("in_img_path in", values, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathNotIn(List<String> values) {
            addCriterion("in_img_path not in", values, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathBetween(String value1, String value2) {
            addCriterion("in_img_path between", value1, value2, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andInImgPathNotBetween(String value1, String value2) {
            addCriterion("in_img_path not between", value1, value2, "inImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathIsNull() {
            addCriterion("out_img_path is null");
            return (Criteria) this;
        }

        public Criteria andOutImgPathIsNotNull() {
            addCriterion("out_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andOutImgPathEqualTo(String value) {
            addCriterion("out_img_path =", value, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathNotEqualTo(String value) {
            addCriterion("out_img_path <>", value, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathGreaterThan(String value) {
            addCriterion("out_img_path >", value, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("out_img_path >=", value, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathLessThan(String value) {
            addCriterion("out_img_path <", value, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathLessThanOrEqualTo(String value) {
            addCriterion("out_img_path <=", value, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathLike(String value) {
            addCriterion("out_img_path like", value, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathNotLike(String value) {
            addCriterion("out_img_path not like", value, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathIn(List<String> values) {
            addCriterion("out_img_path in", values, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathNotIn(List<String> values) {
            addCriterion("out_img_path not in", values, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathBetween(String value1, String value2) {
            addCriterion("out_img_path between", value1, value2, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andOutImgPathNotBetween(String value1, String value2) {
            addCriterion("out_img_path not between", value1, value2, "outImgPath");
            return (Criteria) this;
        }

        public Criteria andSpaceNoIsNull() {
            addCriterion("space_no is null");
            return (Criteria) this;
        }

        public Criteria andSpaceNoIsNotNull() {
            addCriterion("space_no is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceNoEqualTo(Integer value) {
            addCriterion("space_no =", value, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoNotEqualTo(Integer value) {
            addCriterion("space_no <>", value, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoGreaterThan(Integer value) {
            addCriterion("space_no >", value, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("space_no >=", value, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoLessThan(Integer value) {
            addCriterion("space_no <", value, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoLessThanOrEqualTo(Integer value) {
            addCriterion("space_no <=", value, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoIn(List<Integer> values) {
            addCriterion("space_no in", values, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoNotIn(List<Integer> values) {
            addCriterion("space_no not in", values, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoBetween(Integer value1, Integer value2) {
            addCriterion("space_no between", value1, value2, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andSpaceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("space_no not between", value1, value2, "spaceNo");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeIsNull() {
            addCriterion("in_reaction_type is null");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeIsNotNull() {
            addCriterion("in_reaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeEqualTo(Integer value) {
            addCriterion("in_reaction_type =", value, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeNotEqualTo(Integer value) {
            addCriterion("in_reaction_type <>", value, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeGreaterThan(Integer value) {
            addCriterion("in_reaction_type >", value, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_reaction_type >=", value, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeLessThan(Integer value) {
            addCriterion("in_reaction_type <", value, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("in_reaction_type <=", value, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeIn(List<Integer> values) {
            addCriterion("in_reaction_type in", values, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeNotIn(List<Integer> values) {
            addCriterion("in_reaction_type not in", values, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeBetween(Integer value1, Integer value2) {
            addCriterion("in_reaction_type between", value1, value2, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInReactionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("in_reaction_type not between", value1, value2, "inReactionType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeIsNull() {
            addCriterion("in_machine_up_type is null");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeIsNotNull() {
            addCriterion("in_machine_up_type is not null");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeEqualTo(Integer value) {
            addCriterion("in_machine_up_type =", value, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeNotEqualTo(Integer value) {
            addCriterion("in_machine_up_type <>", value, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeGreaterThan(Integer value) {
            addCriterion("in_machine_up_type >", value, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_machine_up_type >=", value, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeLessThan(Integer value) {
            addCriterion("in_machine_up_type <", value, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("in_machine_up_type <=", value, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeIn(List<Integer> values) {
            addCriterion("in_machine_up_type in", values, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeNotIn(List<Integer> values) {
            addCriterion("in_machine_up_type not in", values, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeBetween(Integer value1, Integer value2) {
            addCriterion("in_machine_up_type between", value1, value2, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andInMachineUpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("in_machine_up_type not between", value1, value2, "inMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeIsNull() {
            addCriterion("out_reaction_type is null");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeIsNotNull() {
            addCriterion("out_reaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeEqualTo(Integer value) {
            addCriterion("out_reaction_type =", value, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeNotEqualTo(Integer value) {
            addCriterion("out_reaction_type <>", value, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeGreaterThan(Integer value) {
            addCriterion("out_reaction_type >", value, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_reaction_type >=", value, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeLessThan(Integer value) {
            addCriterion("out_reaction_type <", value, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("out_reaction_type <=", value, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeIn(List<Integer> values) {
            addCriterion("out_reaction_type in", values, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeNotIn(List<Integer> values) {
            addCriterion("out_reaction_type not in", values, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeBetween(Integer value1, Integer value2) {
            addCriterion("out_reaction_type between", value1, value2, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutReactionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("out_reaction_type not between", value1, value2, "outReactionType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeIsNull() {
            addCriterion("out_machine_up_type is null");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeIsNotNull() {
            addCriterion("out_machine_up_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeEqualTo(Integer value) {
            addCriterion("out_machine_up_type =", value, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeNotEqualTo(Integer value) {
            addCriterion("out_machine_up_type <>", value, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeGreaterThan(Integer value) {
            addCriterion("out_machine_up_type >", value, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_machine_up_type >=", value, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeLessThan(Integer value) {
            addCriterion("out_machine_up_type <", value, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("out_machine_up_type <=", value, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeIn(List<Integer> values) {
            addCriterion("out_machine_up_type in", values, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeNotIn(List<Integer> values) {
            addCriterion("out_machine_up_type not in", values, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeBetween(Integer value1, Integer value2) {
            addCriterion("out_machine_up_type between", value1, value2, "outMachineUpType");
            return (Criteria) this;
        }

        public Criteria andOutMachineUpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("out_machine_up_type not between", value1, value2, "outMachineUpType");
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

        public Criteria andAddUserEqualTo(String value) {
            addCriterion("add_user =", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotEqualTo(String value) {
            addCriterion("add_user <>", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThan(String value) {
            addCriterion("add_user >", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThanOrEqualTo(String value) {
            addCriterion("add_user >=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThan(String value) {
            addCriterion("add_user <", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThanOrEqualTo(String value) {
            addCriterion("add_user <=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLike(String value) {
            addCriterion("add_user like", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotLike(String value) {
            addCriterion("add_user not like", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserIn(List<String> values) {
            addCriterion("add_user in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotIn(List<String> values) {
            addCriterion("add_user not in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserBetween(String value1, String value2) {
            addCriterion("add_user between", value1, value2, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotBetween(String value1, String value2) {
            addCriterion("add_user not between", value1, value2, "addUser");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("app_key is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("app_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("app_key =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("app_key <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("app_key >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_key >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("app_key <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("app_key <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("app_key like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("app_key not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("app_key in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("app_key not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("app_key between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("app_key not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeIsNull() {
            addCriterion("bargain_order_code is null");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeIsNotNull() {
            addCriterion("bargain_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeEqualTo(String value) {
            addCriterion("bargain_order_code =", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeNotEqualTo(String value) {
            addCriterion("bargain_order_code <>", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeGreaterThan(String value) {
            addCriterion("bargain_order_code >", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bargain_order_code >=", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeLessThan(String value) {
            addCriterion("bargain_order_code <", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("bargain_order_code <=", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeLike(String value) {
            addCriterion("bargain_order_code like", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeNotLike(String value) {
            addCriterion("bargain_order_code not like", value, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeIn(List<String> values) {
            addCriterion("bargain_order_code in", values, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeNotIn(List<String> values) {
            addCriterion("bargain_order_code not in", values, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeBetween(String value1, String value2) {
            addCriterion("bargain_order_code between", value1, value2, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andBargainOrderCodeNotBetween(String value1, String value2) {
            addCriterion("bargain_order_code not between", value1, value2, "bargainOrderCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeIsNull() {
            addCriterion("park_stop_code is null");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeIsNotNull() {
            addCriterion("park_stop_code is not null");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeEqualTo(String value) {
            addCriterion("park_stop_code =", value, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeNotEqualTo(String value) {
            addCriterion("park_stop_code <>", value, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeGreaterThan(String value) {
            addCriterion("park_stop_code >", value, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("park_stop_code >=", value, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeLessThan(String value) {
            addCriterion("park_stop_code <", value, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeLessThanOrEqualTo(String value) {
            addCriterion("park_stop_code <=", value, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeLike(String value) {
            addCriterion("park_stop_code like", value, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeNotLike(String value) {
            addCriterion("park_stop_code not like", value, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeIn(List<String> values) {
            addCriterion("park_stop_code in", values, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeNotIn(List<String> values) {
            addCriterion("park_stop_code not in", values, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeBetween(String value1, String value2) {
            addCriterion("park_stop_code between", value1, value2, "parkStopCode");
            return (Criteria) this;
        }

        public Criteria andParkStopCodeNotBetween(String value1, String value2) {
            addCriterion("park_stop_code not between", value1, value2, "parkStopCode");
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