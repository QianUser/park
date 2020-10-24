package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TraMonthlyTicketOrderPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraMonthlyTicketOrderPOExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMonthlyTicketOrderNoIsNull() {
            addCriterion("monthly_ticket_order_no is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoIsNotNull() {
            addCriterion("monthly_ticket_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoEqualTo(String value) {
            addCriterion("monthly_ticket_order_no =", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoNotEqualTo(String value) {
            addCriterion("monthly_ticket_order_no <>", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoGreaterThan(String value) {
            addCriterion("monthly_ticket_order_no >", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("monthly_ticket_order_no >=", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoLessThan(String value) {
            addCriterion("monthly_ticket_order_no <", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoLessThanOrEqualTo(String value) {
            addCriterion("monthly_ticket_order_no <=", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoLike(String value) {
            addCriterion("monthly_ticket_order_no like", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoNotLike(String value) {
            addCriterion("monthly_ticket_order_no not like", value, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoIn(List<String> values) {
            addCriterion("monthly_ticket_order_no in", values, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoNotIn(List<String> values) {
            addCriterion("monthly_ticket_order_no not in", values, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoBetween(String value1, String value2) {
            addCriterion("monthly_ticket_order_no between", value1, value2, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyTicketOrderNoNotBetween(String value1, String value2) {
            addCriterion("monthly_ticket_order_no not between", value1, value2, "monthlyTicketOrderNo");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdIsNull() {
            addCriterion("monthly_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdIsNotNull() {
            addCriterion("monthly_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdEqualTo(Integer value) {
            addCriterion("monthly_rate_id =", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdNotEqualTo(Integer value) {
            addCriterion("monthly_rate_id <>", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdGreaterThan(Integer value) {
            addCriterion("monthly_rate_id >", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_rate_id >=", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdLessThan(Integer value) {
            addCriterion("monthly_rate_id <", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_rate_id <=", value, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdIn(List<Integer> values) {
            addCriterion("monthly_rate_id in", values, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdNotIn(List<Integer> values) {
            addCriterion("monthly_rate_id not in", values, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdBetween(Integer value1, Integer value2) {
            addCriterion("monthly_rate_id between", value1, value2, "monthlyRateId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_rate_id not between", value1, value2, "monthlyRateId");
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

        public Criteria andMonthNumIsNull() {
            addCriterion("month_num is null");
            return (Criteria) this;
        }

        public Criteria andMonthNumIsNotNull() {
            addCriterion("month_num is not null");
            return (Criteria) this;
        }

        public Criteria andMonthNumEqualTo(Integer value) {
            addCriterion("month_num =", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumNotEqualTo(Integer value) {
            addCriterion("month_num <>", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumGreaterThan(Integer value) {
            addCriterion("month_num >", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_num >=", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumLessThan(Integer value) {
            addCriterion("month_num <", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumLessThanOrEqualTo(Integer value) {
            addCriterion("month_num <=", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumIn(List<Integer> values) {
            addCriterion("month_num in", values, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumNotIn(List<Integer> values) {
            addCriterion("month_num not in", values, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumBetween(Integer value1, Integer value2) {
            addCriterion("month_num between", value1, value2, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumNotBetween(Integer value1, Integer value2) {
            addCriterion("month_num not between", value1, value2, "monthNum");
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

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIsNull() {
            addCriterion("payer_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIsNotNull() {
            addCriterion("payer_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoEqualTo(String value) {
            addCriterion("payer_trade_no =", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotEqualTo(String value) {
            addCriterion("payer_trade_no <>", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoGreaterThan(String value) {
            addCriterion("payer_trade_no >", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("payer_trade_no >=", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLessThan(String value) {
            addCriterion("payer_trade_no <", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLessThanOrEqualTo(String value) {
            addCriterion("payer_trade_no <=", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLike(String value) {
            addCriterion("payer_trade_no like", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotLike(String value) {
            addCriterion("payer_trade_no not like", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIn(List<String> values) {
            addCriterion("payer_trade_no in", values, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotIn(List<String> values) {
            addCriterion("payer_trade_no not in", values, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoBetween(String value1, String value2) {
            addCriterion("payer_trade_no between", value1, value2, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotBetween(String value1, String value2) {
            addCriterion("payer_trade_no not between", value1, value2, "payerTradeNo");
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

        public Criteria andOrderTypeEqualTo(Byte value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Byte value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Byte value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Byte value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Byte> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Byte> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
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