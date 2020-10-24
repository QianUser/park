package com.park.cloud.common.domain.po.opm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpmPeccancyFinePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpmPeccancyFinePOExample() {
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

        public Criteria andPeccFineIdIsNull() {
            addCriterion("pecc_fine_id is null");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdIsNotNull() {
            addCriterion("pecc_fine_id is not null");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdEqualTo(Long value) {
            addCriterion("pecc_fine_id =", value, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdNotEqualTo(Long value) {
            addCriterion("pecc_fine_id <>", value, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdGreaterThan(Long value) {
            addCriterion("pecc_fine_id >", value, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pecc_fine_id >=", value, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdLessThan(Long value) {
            addCriterion("pecc_fine_id <", value, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdLessThanOrEqualTo(Long value) {
            addCriterion("pecc_fine_id <=", value, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdIn(List<Long> values) {
            addCriterion("pecc_fine_id in", values, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdNotIn(List<Long> values) {
            addCriterion("pecc_fine_id not in", values, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdBetween(Long value1, Long value2) {
            addCriterion("pecc_fine_id between", value1, value2, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccFineIdNotBetween(Long value1, Long value2) {
            addCriterion("pecc_fine_id not between", value1, value2, "peccFineId");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeIsNull() {
            addCriterion("pecc_pice_code is null");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeIsNotNull() {
            addCriterion("pecc_pice_code is not null");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeEqualTo(String value) {
            addCriterion("pecc_pice_code =", value, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeNotEqualTo(String value) {
            addCriterion("pecc_pice_code <>", value, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeGreaterThan(String value) {
            addCriterion("pecc_pice_code >", value, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pecc_pice_code >=", value, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeLessThan(String value) {
            addCriterion("pecc_pice_code <", value, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeLessThanOrEqualTo(String value) {
            addCriterion("pecc_pice_code <=", value, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeLike(String value) {
            addCriterion("pecc_pice_code like", value, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeNotLike(String value) {
            addCriterion("pecc_pice_code not like", value, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeIn(List<String> values) {
            addCriterion("pecc_pice_code in", values, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeNotIn(List<String> values) {
            addCriterion("pecc_pice_code not in", values, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeBetween(String value1, String value2) {
            addCriterion("pecc_pice_code between", value1, value2, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andPeccPiceCodeNotBetween(String value1, String value2) {
            addCriterion("pecc_pice_code not between", value1, value2, "peccPiceCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeIsNull() {
            addCriterion("in_peccancy_code is null");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeIsNotNull() {
            addCriterion("in_peccancy_code is not null");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeEqualTo(String value) {
            addCriterion("in_peccancy_code =", value, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeNotEqualTo(String value) {
            addCriterion("in_peccancy_code <>", value, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeGreaterThan(String value) {
            addCriterion("in_peccancy_code >", value, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("in_peccancy_code >=", value, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeLessThan(String value) {
            addCriterion("in_peccancy_code <", value, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeLessThanOrEqualTo(String value) {
            addCriterion("in_peccancy_code <=", value, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeLike(String value) {
            addCriterion("in_peccancy_code like", value, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeNotLike(String value) {
            addCriterion("in_peccancy_code not like", value, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeIn(List<String> values) {
            addCriterion("in_peccancy_code in", values, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeNotIn(List<String> values) {
            addCriterion("in_peccancy_code not in", values, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeBetween(String value1, String value2) {
            addCriterion("in_peccancy_code between", value1, value2, "inPeccancyCode");
            return (Criteria) this;
        }

        public Criteria andInPeccancyCodeNotBetween(String value1, String value2) {
            addCriterion("in_peccancy_code not between", value1, value2, "inPeccancyCode");
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

        public Criteria andInPeccancyPlateNumberIsNull() {
            addCriterion("in_peccancy_plate_number is null");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberIsNotNull() {
            addCriterion("in_peccancy_plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberEqualTo(Integer value) {
            addCriterion("in_peccancy_plate_number =", value, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberNotEqualTo(Integer value) {
            addCriterion("in_peccancy_plate_number <>", value, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberGreaterThan(Integer value) {
            addCriterion("in_peccancy_plate_number >", value, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_peccancy_plate_number >=", value, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberLessThan(Integer value) {
            addCriterion("in_peccancy_plate_number <", value, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberLessThanOrEqualTo(Integer value) {
            addCriterion("in_peccancy_plate_number <=", value, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberIn(List<Integer> values) {
            addCriterion("in_peccancy_plate_number in", values, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberNotIn(List<Integer> values) {
            addCriterion("in_peccancy_plate_number not in", values, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberBetween(Integer value1, Integer value2) {
            addCriterion("in_peccancy_plate_number between", value1, value2, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andInPeccancyPlateNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("in_peccancy_plate_number not between", value1, value2, "inPeccancyPlateNumber");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeIsNull() {
            addCriterion("berth_start_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeIsNotNull() {
            addCriterion("berth_start_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeEqualTo(Date value) {
            addCriterion("berth_start_parking_time =", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeNotEqualTo(Date value) {
            addCriterion("berth_start_parking_time <>", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeGreaterThan(Date value) {
            addCriterion("berth_start_parking_time >", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("berth_start_parking_time >=", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeLessThan(Date value) {
            addCriterion("berth_start_parking_time <", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeLessThanOrEqualTo(Date value) {
            addCriterion("berth_start_parking_time <=", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeIn(List<Date> values) {
            addCriterion("berth_start_parking_time in", values, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeNotIn(List<Date> values) {
            addCriterion("berth_start_parking_time not in", values, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeBetween(Date value1, Date value2) {
            addCriterion("berth_start_parking_time between", value1, value2, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeNotBetween(Date value1, Date value2) {
            addCriterion("berth_start_parking_time not between", value1, value2, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeIsNull() {
            addCriterion("berth_end_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeIsNotNull() {
            addCriterion("berth_end_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeEqualTo(Date value) {
            addCriterion("berth_end_parking_time =", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeNotEqualTo(Date value) {
            addCriterion("berth_end_parking_time <>", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeGreaterThan(Date value) {
            addCriterion("berth_end_parking_time >", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("berth_end_parking_time >=", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeLessThan(Date value) {
            addCriterion("berth_end_parking_time <", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeLessThanOrEqualTo(Date value) {
            addCriterion("berth_end_parking_time <=", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeIn(List<Date> values) {
            addCriterion("berth_end_parking_time in", values, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeNotIn(List<Date> values) {
            addCriterion("berth_end_parking_time not in", values, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeBetween(Date value1, Date value2) {
            addCriterion("berth_end_parking_time between", value1, value2, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeNotBetween(Date value1, Date value2) {
            addCriterion("berth_end_parking_time not between", value1, value2, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andFineStatusIsNull() {
            addCriterion("fine_status is null");
            return (Criteria) this;
        }

        public Criteria andFineStatusIsNotNull() {
            addCriterion("fine_status is not null");
            return (Criteria) this;
        }

        public Criteria andFineStatusEqualTo(Integer value) {
            addCriterion("fine_status =", value, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusNotEqualTo(Integer value) {
            addCriterion("fine_status <>", value, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusGreaterThan(Integer value) {
            addCriterion("fine_status >", value, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("fine_status >=", value, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusLessThan(Integer value) {
            addCriterion("fine_status <", value, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusLessThanOrEqualTo(Integer value) {
            addCriterion("fine_status <=", value, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusIn(List<Integer> values) {
            addCriterion("fine_status in", values, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusNotIn(List<Integer> values) {
            addCriterion("fine_status not in", values, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusBetween(Integer value1, Integer value2) {
            addCriterion("fine_status between", value1, value2, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andFineStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("fine_status not between", value1, value2, "fineStatus");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Integer value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Integer value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Integer value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Integer value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Integer value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Integer> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Integer> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Integer value1, Integer value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andPeccDateIsNull() {
            addCriterion("pecc_date is null");
            return (Criteria) this;
        }

        public Criteria andPeccDateIsNotNull() {
            addCriterion("pecc_date is not null");
            return (Criteria) this;
        }

        public Criteria andPeccDateEqualTo(Date value) {
            addCriterion("pecc_date =", value, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateNotEqualTo(Date value) {
            addCriterion("pecc_date <>", value, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateGreaterThan(Date value) {
            addCriterion("pecc_date >", value, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pecc_date >=", value, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateLessThan(Date value) {
            addCriterion("pecc_date <", value, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateLessThanOrEqualTo(Date value) {
            addCriterion("pecc_date <=", value, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateIn(List<Date> values) {
            addCriterion("pecc_date in", values, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateNotIn(List<Date> values) {
            addCriterion("pecc_date not in", values, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateBetween(Date value1, Date value2) {
            addCriterion("pecc_date between", value1, value2, "peccDate");
            return (Criteria) this;
        }

        public Criteria andPeccDateNotBetween(Date value1, Date value2) {
            addCriterion("pecc_date not between", value1, value2, "peccDate");
            return (Criteria) this;
        }

        public Criteria andParkDurationIsNull() {
            addCriterion("park_duration is null");
            return (Criteria) this;
        }

        public Criteria andParkDurationIsNotNull() {
            addCriterion("park_duration is not null");
            return (Criteria) this;
        }

        public Criteria andParkDurationEqualTo(String value) {
            addCriterion("park_duration =", value, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationNotEqualTo(String value) {
            addCriterion("park_duration <>", value, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationGreaterThan(String value) {
            addCriterion("park_duration >", value, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationGreaterThanOrEqualTo(String value) {
            addCriterion("park_duration >=", value, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationLessThan(String value) {
            addCriterion("park_duration <", value, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationLessThanOrEqualTo(String value) {
            addCriterion("park_duration <=", value, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationLike(String value) {
            addCriterion("park_duration like", value, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationNotLike(String value) {
            addCriterion("park_duration not like", value, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationIn(List<String> values) {
            addCriterion("park_duration in", values, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationNotIn(List<String> values) {
            addCriterion("park_duration not in", values, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationBetween(String value1, String value2) {
            addCriterion("park_duration between", value1, value2, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andParkDurationNotBetween(String value1, String value2) {
            addCriterion("park_duration not between", value1, value2, "parkDuration");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
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

        public Criteria andArrearsPriceIsNull() {
            addCriterion("arrears_price is null");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceIsNotNull() {
            addCriterion("arrears_price is not null");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceEqualTo(BigDecimal value) {
            addCriterion("arrears_price =", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotEqualTo(BigDecimal value) {
            addCriterion("arrears_price <>", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceGreaterThan(BigDecimal value) {
            addCriterion("arrears_price >", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("arrears_price >=", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceLessThan(BigDecimal value) {
            addCriterion("arrears_price <", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("arrears_price <=", value, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceIn(List<BigDecimal> values) {
            addCriterion("arrears_price in", values, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotIn(List<BigDecimal> values) {
            addCriterion("arrears_price not in", values, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arrears_price between", value1, value2, "arrearsPrice");
            return (Criteria) this;
        }

        public Criteria andArrearsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arrears_price not between", value1, value2, "arrearsPrice");
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

        public Criteria andParkUserIdIsNull() {
            addCriterion("park_user_id is null");
            return (Criteria) this;
        }

        public Criteria andParkUserIdIsNotNull() {
            addCriterion("park_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkUserIdEqualTo(String value) {
            addCriterion("park_user_id =", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotEqualTo(String value) {
            addCriterion("park_user_id <>", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdGreaterThan(String value) {
            addCriterion("park_user_id >", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("park_user_id >=", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLessThan(String value) {
            addCriterion("park_user_id <", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLessThanOrEqualTo(String value) {
            addCriterion("park_user_id <=", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLike(String value) {
            addCriterion("park_user_id like", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotLike(String value) {
            addCriterion("park_user_id not like", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdIn(List<String> values) {
            addCriterion("park_user_id in", values, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotIn(List<String> values) {
            addCriterion("park_user_id not in", values, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdBetween(String value1, String value2) {
            addCriterion("park_user_id between", value1, value2, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotBetween(String value1, String value2) {
            addCriterion("park_user_id not between", value1, value2, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberIsNull() {
            addCriterion("is_free_plate_number is null");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberIsNotNull() {
            addCriterion("is_free_plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberEqualTo(Integer value) {
            addCriterion("is_free_plate_number =", value, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberNotEqualTo(Integer value) {
            addCriterion("is_free_plate_number <>", value, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberGreaterThan(Integer value) {
            addCriterion("is_free_plate_number >", value, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_free_plate_number >=", value, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberLessThan(Integer value) {
            addCriterion("is_free_plate_number <", value, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberLessThanOrEqualTo(Integer value) {
            addCriterion("is_free_plate_number <=", value, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberIn(List<Integer> values) {
            addCriterion("is_free_plate_number in", values, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberNotIn(List<Integer> values) {
            addCriterion("is_free_plate_number not in", values, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberBetween(Integer value1, Integer value2) {
            addCriterion("is_free_plate_number between", value1, value2, "isFreePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIsFreePlateNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("is_free_plate_number not between", value1, value2, "isFreePlateNumber");
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