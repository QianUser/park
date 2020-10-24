package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;

public class TraBargainOrderPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraBargainOrderPOExample() {
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

        public Criteria andTraBargainOrderIdIsNull() {
            addCriterion("tra_bargain_order_id is null");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdIsNotNull() {
            addCriterion("tra_bargain_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdEqualTo(Long value) {
            addCriterion("tra_bargain_order_id =", value, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdNotEqualTo(Long value) {
            addCriterion("tra_bargain_order_id <>", value, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdGreaterThan(Long value) {
            addCriterion("tra_bargain_order_id >", value, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tra_bargain_order_id >=", value, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdLessThan(Long value) {
            addCriterion("tra_bargain_order_id <", value, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("tra_bargain_order_id <=", value, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdIn(List<Long> values) {
            addCriterion("tra_bargain_order_id in", values, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdNotIn(List<Long> values) {
            addCriterion("tra_bargain_order_id not in", values, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdBetween(Long value1, Long value2) {
            addCriterion("tra_bargain_order_id between", value1, value2, "traBargainOrderId");
            return (Criteria) this;
        }

        public Criteria andTraBargainOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("tra_bargain_order_id not between", value1, value2, "traBargainOrderId");
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

        public Criteria andMobileNumberIsNull() {
            addCriterion("mobile_number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("mobile_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("mobile_number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("mobile_number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("mobile_number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("mobile_number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("mobile_number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("mobile_number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("mobile_number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("mobile_number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("mobile_number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("mobile_number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("mobile_number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andRfidCodeIsNull() {
            addCriterion("rfid_code is null");
            return (Criteria) this;
        }

        public Criteria andRfidCodeIsNotNull() {
            addCriterion("rfid_code is not null");
            return (Criteria) this;
        }

        public Criteria andRfidCodeEqualTo(String value) {
            addCriterion("rfid_code =", value, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeNotEqualTo(String value) {
            addCriterion("rfid_code <>", value, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeGreaterThan(String value) {
            addCriterion("rfid_code >", value, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rfid_code >=", value, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeLessThan(String value) {
            addCriterion("rfid_code <", value, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeLessThanOrEqualTo(String value) {
            addCriterion("rfid_code <=", value, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeLike(String value) {
            addCriterion("rfid_code like", value, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeNotLike(String value) {
            addCriterion("rfid_code not like", value, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeIn(List<String> values) {
            addCriterion("rfid_code in", values, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeNotIn(List<String> values) {
            addCriterion("rfid_code not in", values, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeBetween(String value1, String value2) {
            addCriterion("rfid_code between", value1, value2, "rfidCode");
            return (Criteria) this;
        }

        public Criteria andRfidCodeNotBetween(String value1, String value2) {
            addCriterion("rfid_code not between", value1, value2, "rfidCode");
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

        public Criteria andStartParkingTimeIsNull() {
            addCriterion("start_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeIsNotNull() {
            addCriterion("start_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeEqualTo(LocalDateTime value) {
            addCriterion("start_parking_time =", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeNotEqualTo(LocalDateTime value) {
            addCriterion("start_parking_time <>", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeGreaterThan(LocalDateTime value) {
            addCriterion("start_parking_time >", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("start_parking_time >=", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeLessThan(LocalDateTime value) {
            addCriterion("start_parking_time <", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("start_parking_time <=", value, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeIn(List<LocalDateTime> values) {
            addCriterion("start_parking_time in", values, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeNotIn(List<LocalDateTime> values) {
            addCriterion("start_parking_time not in", values, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("start_parking_time between", value1, value2, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andStartParkingTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("start_parking_time not between", value1, value2, "startParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeIsNull() {
            addCriterion("end_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeIsNotNull() {
            addCriterion("end_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeEqualTo(LocalDateTime value) {
            addCriterion("end_parking_time =", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeNotEqualTo(LocalDateTime value) {
            addCriterion("end_parking_time <>", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeGreaterThan(LocalDateTime value) {
            addCriterion("end_parking_time >", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_parking_time >=", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeLessThan(LocalDateTime value) {
            addCriterion("end_parking_time <", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_parking_time <=", value, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeIn(List<LocalDateTime> values) {
            addCriterion("end_parking_time in", values, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeNotIn(List<LocalDateTime> values) {
            addCriterion("end_parking_time not in", values, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_parking_time between", value1, value2, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andEndParkingTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_parking_time not between", value1, value2, "endParkingTime");
            return (Criteria) this;
        }

        public Criteria andActualDurationIsNull() {
            addCriterion("actual_duration is null");
            return (Criteria) this;
        }

        public Criteria andActualDurationIsNotNull() {
            addCriterion("actual_duration is not null");
            return (Criteria) this;
        }

        public Criteria andActualDurationEqualTo(Integer value) {
            addCriterion("actual_duration =", value, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationNotEqualTo(Integer value) {
            addCriterion("actual_duration <>", value, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationGreaterThan(Integer value) {
            addCriterion("actual_duration >", value, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_duration >=", value, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationLessThan(Integer value) {
            addCriterion("actual_duration <", value, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationLessThanOrEqualTo(Integer value) {
            addCriterion("actual_duration <=", value, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationIn(List<Integer> values) {
            addCriterion("actual_duration in", values, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationNotIn(List<Integer> values) {
            addCriterion("actual_duration not in", values, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationBetween(Integer value1, Integer value2) {
            addCriterion("actual_duration between", value1, value2, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_duration not between", value1, value2, "actualDuration");
            return (Criteria) this;
        }

        public Criteria andActualPriceIsNull() {
            addCriterion("actual_price is null");
            return (Criteria) this;
        }

        public Criteria andActualPriceIsNotNull() {
            addCriterion("actual_price is not null");
            return (Criteria) this;
        }

        public Criteria andActualPriceEqualTo(Integer value) {
            addCriterion("actual_price =", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotEqualTo(Integer value) {
            addCriterion("actual_price <>", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceGreaterThan(Integer value) {
            addCriterion("actual_price >", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_price >=", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLessThan(Integer value) {
            addCriterion("actual_price <", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLessThanOrEqualTo(Integer value) {
            addCriterion("actual_price <=", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceIn(List<Integer> values) {
            addCriterion("actual_price in", values, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotIn(List<Integer> values) {
            addCriterion("actual_price not in", values, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceBetween(Integer value1, Integer value2) {
            addCriterion("actual_price between", value1, value2, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_price not between", value1, value2, "actualPrice");
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(LocalDateTime value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(LocalDateTime value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(LocalDateTime value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<LocalDateTime> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<LocalDateTime> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationIsNull() {
            addCriterion("applyActual_duration is null");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationIsNotNull() {
            addCriterion("applyActual_duration is not null");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationEqualTo(Integer value) {
            addCriterion("applyActual_duration =", value, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationNotEqualTo(Integer value) {
            addCriterion("applyActual_duration <>", value, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationGreaterThan(Integer value) {
            addCriterion("applyActual_duration >", value, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("applyActual_duration >=", value, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationLessThan(Integer value) {
            addCriterion("applyActual_duration <", value, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationLessThanOrEqualTo(Integer value) {
            addCriterion("applyActual_duration <=", value, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationIn(List<Integer> values) {
            addCriterion("applyActual_duration in", values, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationNotIn(List<Integer> values) {
            addCriterion("applyActual_duration not in", values, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationBetween(Integer value1, Integer value2) {
            addCriterion("applyActual_duration between", value1, value2, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyactualDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("applyActual_duration not between", value1, value2, "applyactualDuration");
            return (Criteria) this;
        }

        public Criteria andApplyPriceIsNull() {
            addCriterion("apply_price is null");
            return (Criteria) this;
        }

        public Criteria andApplyPriceIsNotNull() {
            addCriterion("apply_price is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPriceEqualTo(Integer value) {
            addCriterion("apply_price =", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceNotEqualTo(Integer value) {
            addCriterion("apply_price <>", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceGreaterThan(Integer value) {
            addCriterion("apply_price >", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_price >=", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceLessThan(Integer value) {
            addCriterion("apply_price <", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("apply_price <=", value, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceIn(List<Integer> values) {
            addCriterion("apply_price in", values, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceNotIn(List<Integer> values) {
            addCriterion("apply_price not in", values, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceBetween(Integer value1, Integer value2) {
            addCriterion("apply_price between", value1, value2, "applyPrice");
            return (Criteria) this;
        }

        public Criteria andApplyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_price not between", value1, value2, "applyPrice");
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

        public Criteria andBerthStartParkingTimeIsNull() {
            addCriterion("berth_start_parking_time is null");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeIsNotNull() {
            addCriterion("berth_start_parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeEqualTo(LocalDateTime value) {
            addCriterion("berth_start_parking_time =", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeNotEqualTo(LocalDateTime value) {
            addCriterion("berth_start_parking_time <>", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeGreaterThan(LocalDateTime value) {
            addCriterion("berth_start_parking_time >", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("berth_start_parking_time >=", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeLessThan(LocalDateTime value) {
            addCriterion("berth_start_parking_time <", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("berth_start_parking_time <=", value, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeIn(List<LocalDateTime> values) {
            addCriterion("berth_start_parking_time in", values, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeNotIn(List<LocalDateTime> values) {
            addCriterion("berth_start_parking_time not in", values, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("berth_start_parking_time between", value1, value2, "berthStartParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartParkingTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
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

        public Criteria andBerthEndParkingTimeEqualTo(LocalDateTime value) {
            addCriterion("berth_end_parking_time =", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeNotEqualTo(LocalDateTime value) {
            addCriterion("berth_end_parking_time <>", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeGreaterThan(LocalDateTime value) {
            addCriterion("berth_end_parking_time >", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("berth_end_parking_time >=", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeLessThan(LocalDateTime value) {
            addCriterion("berth_end_parking_time <", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("berth_end_parking_time <=", value, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeIn(List<LocalDateTime> values) {
            addCriterion("berth_end_parking_time in", values, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeNotIn(List<LocalDateTime> values) {
            addCriterion("berth_end_parking_time not in", values, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("berth_end_parking_time between", value1, value2, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthEndParkingTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("berth_end_parking_time not between", value1, value2, "berthEndParkingTime");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagIsNull() {
            addCriterion("berth_start_error_flag is null");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagIsNotNull() {
            addCriterion("berth_start_error_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagEqualTo(Integer value) {
            addCriterion("berth_start_error_flag =", value, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagNotEqualTo(Integer value) {
            addCriterion("berth_start_error_flag <>", value, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagGreaterThan(Integer value) {
            addCriterion("berth_start_error_flag >", value, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("berth_start_error_flag >=", value, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagLessThan(Integer value) {
            addCriterion("berth_start_error_flag <", value, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagLessThanOrEqualTo(Integer value) {
            addCriterion("berth_start_error_flag <=", value, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagIn(List<Integer> values) {
            addCriterion("berth_start_error_flag in", values, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagNotIn(List<Integer> values) {
            addCriterion("berth_start_error_flag not in", values, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagBetween(Integer value1, Integer value2) {
            addCriterion("berth_start_error_flag between", value1, value2, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthStartErrorFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("berth_start_error_flag not between", value1, value2, "berthStartErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagIsNull() {
            addCriterion("berth_end_error_flag is null");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagIsNotNull() {
            addCriterion("berth_end_error_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagEqualTo(Integer value) {
            addCriterion("berth_end_error_flag =", value, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagNotEqualTo(Integer value) {
            addCriterion("berth_end_error_flag <>", value, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagGreaterThan(Integer value) {
            addCriterion("berth_end_error_flag >", value, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("berth_end_error_flag >=", value, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagLessThan(Integer value) {
            addCriterion("berth_end_error_flag <", value, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagLessThanOrEqualTo(Integer value) {
            addCriterion("berth_end_error_flag <=", value, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagIn(List<Integer> values) {
            addCriterion("berth_end_error_flag in", values, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagNotIn(List<Integer> values) {
            addCriterion("berth_end_error_flag not in", values, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagBetween(Integer value1, Integer value2) {
            addCriterion("berth_end_error_flag between", value1, value2, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andBerthEndErrorFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("berth_end_error_flag not between", value1, value2, "berthEndErrorFlag");
            return (Criteria) this;
        }

        public Criteria andParkTimeIsNull() {
            addCriterion("park_time is null");
            return (Criteria) this;
        }

        public Criteria andParkTimeIsNotNull() {
            addCriterion("park_time is not null");
            return (Criteria) this;
        }

        public Criteria andParkTimeEqualTo(Integer value) {
            addCriterion("park_time =", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotEqualTo(Integer value) {
            addCriterion("park_time <>", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeGreaterThan(Integer value) {
            addCriterion("park_time >", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_time >=", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeLessThan(Integer value) {
            addCriterion("park_time <", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeLessThanOrEqualTo(Integer value) {
            addCriterion("park_time <=", value, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeIn(List<Integer> values) {
            addCriterion("park_time in", values, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotIn(List<Integer> values) {
            addCriterion("park_time not in", values, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeBetween(Integer value1, Integer value2) {
            addCriterion("park_time between", value1, value2, "parkTime");
            return (Criteria) this;
        }

        public Criteria andParkTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("park_time not between", value1, value2, "parkTime");
            return (Criteria) this;
        }

        public Criteria andProposalFormIsNull() {
            addCriterion("proposal_form is null");
            return (Criteria) this;
        }

        public Criteria andProposalFormIsNotNull() {
            addCriterion("proposal_form is not null");
            return (Criteria) this;
        }

        public Criteria andProposalFormEqualTo(Integer value) {
            addCriterion("proposal_form =", value, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormNotEqualTo(Integer value) {
            addCriterion("proposal_form <>", value, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormGreaterThan(Integer value) {
            addCriterion("proposal_form >", value, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormGreaterThanOrEqualTo(Integer value) {
            addCriterion("proposal_form >=", value, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormLessThan(Integer value) {
            addCriterion("proposal_form <", value, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormLessThanOrEqualTo(Integer value) {
            addCriterion("proposal_form <=", value, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormIn(List<Integer> values) {
            addCriterion("proposal_form in", values, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormNotIn(List<Integer> values) {
            addCriterion("proposal_form not in", values, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormBetween(Integer value1, Integer value2) {
            addCriterion("proposal_form between", value1, value2, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andProposalFormNotBetween(Integer value1, Integer value2) {
            addCriterion("proposal_form not between", value1, value2, "proposalForm");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(LocalDateTime value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(LocalDateTime value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(LocalDateTime value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(LocalDateTime value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<LocalDateTime> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<LocalDateTime> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeIsNull() {
            addCriterion("bargain_order_type is null");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeIsNotNull() {
            addCriterion("bargain_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeEqualTo(Integer value) {
            addCriterion("bargain_order_type =", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeNotEqualTo(Integer value) {
            addCriterion("bargain_order_type <>", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeGreaterThan(Integer value) {
            addCriterion("bargain_order_type >", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bargain_order_type >=", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeLessThan(Integer value) {
            addCriterion("bargain_order_type <", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bargain_order_type <=", value, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeIn(List<Integer> values) {
            addCriterion("bargain_order_type in", values, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeNotIn(List<Integer> values) {
            addCriterion("bargain_order_type not in", values, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("bargain_order_type between", value1, value2, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andBargainOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bargain_order_type not between", value1, value2, "bargainOrderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoIsNull() {
            addCriterion("park_order_no is null");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoIsNotNull() {
            addCriterion("park_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoEqualTo(String value) {
            addCriterion("park_order_no =", value, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoNotEqualTo(String value) {
            addCriterion("park_order_no <>", value, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoGreaterThan(String value) {
            addCriterion("park_order_no >", value, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("park_order_no >=", value, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoLessThan(String value) {
            addCriterion("park_order_no <", value, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoLessThanOrEqualTo(String value) {
            addCriterion("park_order_no <=", value, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoLike(String value) {
            addCriterion("park_order_no like", value, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoNotLike(String value) {
            addCriterion("park_order_no not like", value, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoIn(List<String> values) {
            addCriterion("park_order_no in", values, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoNotIn(List<String> values) {
            addCriterion("park_order_no not in", values, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoBetween(String value1, String value2) {
            addCriterion("park_order_no between", value1, value2, "parkOrderNo");
            return (Criteria) this;
        }

        public Criteria andParkOrderNoNotBetween(String value1, String value2) {
            addCriterion("park_order_no not between", value1, value2, "parkOrderNo");
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

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusIsNull() {
            addCriterion("leave_status is null");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusIsNotNull() {
            addCriterion("leave_status is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusEqualTo(Integer value) {
            addCriterion("leave_status =", value, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusNotEqualTo(Integer value) {
            addCriterion("leave_status <>", value, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusGreaterThan(Integer value) {
            addCriterion("leave_status >", value, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_status >=", value, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusLessThan(Integer value) {
            addCriterion("leave_status <", value, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("leave_status <=", value, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusIn(List<Integer> values) {
            addCriterion("leave_status in", values, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusNotIn(List<Integer> values) {
            addCriterion("leave_status not in", values, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusBetween(Integer value1, Integer value2) {
            addCriterion("leave_status between", value1, value2, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_status not between", value1, value2, "leaveStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusIsNull() {
            addCriterion("notity_status is null");
            return (Criteria) this;
        }

        public Criteria andNotityStatusIsNotNull() {
            addCriterion("notity_status is not null");
            return (Criteria) this;
        }

        public Criteria andNotityStatusEqualTo(Integer value) {
            addCriterion("notity_status =", value, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusNotEqualTo(Integer value) {
            addCriterion("notity_status <>", value, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusGreaterThan(Integer value) {
            addCriterion("notity_status >", value, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("notity_status >=", value, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusLessThan(Integer value) {
            addCriterion("notity_status <", value, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("notity_status <=", value, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusIn(List<Integer> values) {
            addCriterion("notity_status in", values, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusNotIn(List<Integer> values) {
            addCriterion("notity_status not in", values, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusBetween(Integer value1, Integer value2) {
            addCriterion("notity_status between", value1, value2, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andNotityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("notity_status not between", value1, value2, "notityStatus");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeIsNull() {
            addCriterion("park_out_time is null");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeIsNotNull() {
            addCriterion("park_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeEqualTo(Integer value) {
            addCriterion("park_out_time =", value, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeNotEqualTo(Integer value) {
            addCriterion("park_out_time <>", value, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeGreaterThan(Integer value) {
            addCriterion("park_out_time >", value, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_out_time >=", value, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeLessThan(Integer value) {
            addCriterion("park_out_time <", value, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeLessThanOrEqualTo(Integer value) {
            addCriterion("park_out_time <=", value, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeIn(List<Integer> values) {
            addCriterion("park_out_time in", values, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeNotIn(List<Integer> values) {
            addCriterion("park_out_time not in", values, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeBetween(Integer value1, Integer value2) {
            addCriterion("park_out_time between", value1, value2, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andParkOutTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("park_out_time not between", value1, value2, "parkOutTime");
            return (Criteria) this;
        }

        public Criteria andPayChargeIsNull() {
            addCriterion("pay_charge is null");
            return (Criteria) this;
        }

        public Criteria andPayChargeIsNotNull() {
            addCriterion("pay_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPayChargeEqualTo(Float value) {
            addCriterion("pay_charge =", value, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeNotEqualTo(Float value) {
            addCriterion("pay_charge <>", value, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeGreaterThan(Float value) {
            addCriterion("pay_charge >", value, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_charge >=", value, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeLessThan(Float value) {
            addCriterion("pay_charge <", value, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeLessThanOrEqualTo(Float value) {
            addCriterion("pay_charge <=", value, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeIn(List<Float> values) {
            addCriterion("pay_charge in", values, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeNotIn(List<Float> values) {
            addCriterion("pay_charge not in", values, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeBetween(Float value1, Float value2) {
            addCriterion("pay_charge between", value1, value2, "payCharge");
            return (Criteria) this;
        }

        public Criteria andPayChargeNotBetween(Float value1, Float value2) {
            addCriterion("pay_charge not between", value1, value2, "payCharge");
            return (Criteria) this;
        }

        public Criteria andFreeTypeIsNull() {
            addCriterion("free_type is null");
            return (Criteria) this;
        }

        public Criteria andFreeTypeIsNotNull() {
            addCriterion("free_type is not null");
            return (Criteria) this;
        }

        public Criteria andFreeTypeEqualTo(String value) {
            addCriterion("free_type =", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeNotEqualTo(String value) {
            addCriterion("free_type <>", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeGreaterThan(String value) {
            addCriterion("free_type >", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("free_type >=", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeLessThan(String value) {
            addCriterion("free_type <", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeLessThanOrEqualTo(String value) {
            addCriterion("free_type <=", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeLike(String value) {
            addCriterion("free_type like", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeNotLike(String value) {
            addCriterion("free_type not like", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeIn(List<String> values) {
            addCriterion("free_type in", values, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeNotIn(List<String> values) {
            addCriterion("free_type not in", values, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeBetween(String value1, String value2) {
            addCriterion("free_type between", value1, value2, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeNotBetween(String value1, String value2) {
            addCriterion("free_type not between", value1, value2, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIsNull() {
            addCriterion("free_charge is null");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIsNotNull() {
            addCriterion("free_charge is not null");
            return (Criteria) this;
        }

        public Criteria andFreeChargeEqualTo(Float value) {
            addCriterion("free_charge =", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotEqualTo(Float value) {
            addCriterion("free_charge <>", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeGreaterThan(Float value) {
            addCriterion("free_charge >", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeGreaterThanOrEqualTo(Float value) {
            addCriterion("free_charge >=", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeLessThan(Float value) {
            addCriterion("free_charge <", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeLessThanOrEqualTo(Float value) {
            addCriterion("free_charge <=", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIn(List<Float> values) {
            addCriterion("free_charge in", values, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotIn(List<Float> values) {
            addCriterion("free_charge not in", values, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeBetween(Float value1, Float value2) {
            addCriterion("free_charge between", value1, value2, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotBetween(Float value1, Float value2) {
            addCriterion("free_charge not between", value1, value2, "freeCharge");
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

        public Criteria andDiscountChargeIsNull() {
            addCriterion("discount_charge is null");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeIsNotNull() {
            addCriterion("discount_charge is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeEqualTo(Float value) {
            addCriterion("discount_charge =", value, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeNotEqualTo(Float value) {
            addCriterion("discount_charge <>", value, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeGreaterThan(Float value) {
            addCriterion("discount_charge >", value, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeGreaterThanOrEqualTo(Float value) {
            addCriterion("discount_charge >=", value, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeLessThan(Float value) {
            addCriterion("discount_charge <", value, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeLessThanOrEqualTo(Float value) {
            addCriterion("discount_charge <=", value, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeIn(List<Float> values) {
            addCriterion("discount_charge in", values, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeNotIn(List<Float> values) {
            addCriterion("discount_charge not in", values, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeBetween(Float value1, Float value2) {
            addCriterion("discount_charge between", value1, value2, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountChargeNotBetween(Float value1, Float value2) {
            addCriterion("discount_charge not between", value1, value2, "discountCharge");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeIsNull() {
            addCriterion("discount_time is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeIsNotNull() {
            addCriterion("discount_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeEqualTo(Integer value) {
            addCriterion("discount_time =", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeNotEqualTo(Integer value) {
            addCriterion("discount_time <>", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeGreaterThan(Integer value) {
            addCriterion("discount_time >", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_time >=", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeLessThan(Integer value) {
            addCriterion("discount_time <", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeLessThanOrEqualTo(Integer value) {
            addCriterion("discount_time <=", value, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeIn(List<Integer> values) {
            addCriterion("discount_time in", values, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeNotIn(List<Integer> values) {
            addCriterion("discount_time not in", values, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeBetween(Integer value1, Integer value2) {
            addCriterion("discount_time between", value1, value2, "discountTime");
            return (Criteria) this;
        }

        public Criteria andDiscountTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_time not between", value1, value2, "discountTime");
            return (Criteria) this;
        }

        public Criteria andCarioIdIsNull() {
            addCriterion("cario_id is null");
            return (Criteria) this;
        }

        public Criteria andCarioIdIsNotNull() {
            addCriterion("cario_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarioIdEqualTo(Integer value) {
            addCriterion("cario_id =", value, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdNotEqualTo(Integer value) {
            addCriterion("cario_id <>", value, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdGreaterThan(Integer value) {
            addCriterion("cario_id >", value, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cario_id >=", value, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdLessThan(Integer value) {
            addCriterion("cario_id <", value, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdLessThanOrEqualTo(Integer value) {
            addCriterion("cario_id <=", value, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdIn(List<Integer> values) {
            addCriterion("cario_id in", values, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdNotIn(List<Integer> values) {
            addCriterion("cario_id not in", values, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdBetween(Integer value1, Integer value2) {
            addCriterion("cario_id between", value1, value2, "carioId");
            return (Criteria) this;
        }

        public Criteria andCarioIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cario_id not between", value1, value2, "carioId");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(LocalDateTime value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(LocalDateTime value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(LocalDateTime value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(LocalDateTime value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<LocalDateTime> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<LocalDateTime> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
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