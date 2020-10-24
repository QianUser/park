package com.park.cloud.common.domain.po.meb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MebBindVehicleInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MebBindVehicleInfoPOExample() {
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

        public Criteria andMebBindVehicleInfoIdIsNull() {
            addCriterion("meb_bind_vehicle_info_id is null");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdIsNotNull() {
            addCriterion("meb_bind_vehicle_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdEqualTo(Integer value) {
            addCriterion("meb_bind_vehicle_info_id =", value, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdNotEqualTo(Integer value) {
            addCriterion("meb_bind_vehicle_info_id <>", value, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdGreaterThan(Integer value) {
            addCriterion("meb_bind_vehicle_info_id >", value, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meb_bind_vehicle_info_id >=", value, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdLessThan(Integer value) {
            addCriterion("meb_bind_vehicle_info_id <", value, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("meb_bind_vehicle_info_id <=", value, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdIn(List<Integer> values) {
            addCriterion("meb_bind_vehicle_info_id in", values, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdNotIn(List<Integer> values) {
            addCriterion("meb_bind_vehicle_info_id not in", values, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("meb_bind_vehicle_info_id between", value1, value2, "mebBindVehicleInfoId");
            return (Criteria) this;
        }

        public Criteria andMebBindVehicleInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meb_bind_vehicle_info_id not between", value1, value2, "mebBindVehicleInfoId");
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

        public Criteria andViNumberIsNull() {
            addCriterion("vi_number is null");
            return (Criteria) this;
        }

        public Criteria andViNumberIsNotNull() {
            addCriterion("vi_number is not null");
            return (Criteria) this;
        }

        public Criteria andViNumberEqualTo(String value) {
            addCriterion("vi_number =", value, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberNotEqualTo(String value) {
            addCriterion("vi_number <>", value, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberGreaterThan(String value) {
            addCriterion("vi_number >", value, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberGreaterThanOrEqualTo(String value) {
            addCriterion("vi_number >=", value, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberLessThan(String value) {
            addCriterion("vi_number <", value, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberLessThanOrEqualTo(String value) {
            addCriterion("vi_number <=", value, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberLike(String value) {
            addCriterion("vi_number like", value, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberNotLike(String value) {
            addCriterion("vi_number not like", value, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberIn(List<String> values) {
            addCriterion("vi_number in", values, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberNotIn(List<String> values) {
            addCriterion("vi_number not in", values, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberBetween(String value1, String value2) {
            addCriterion("vi_number between", value1, value2, "viNumber");
            return (Criteria) this;
        }

        public Criteria andViNumberNotBetween(String value1, String value2) {
            addCriterion("vi_number not between", value1, value2, "viNumber");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andBindStatusIsNull() {
            addCriterion("bind_status is null");
            return (Criteria) this;
        }

        public Criteria andBindStatusIsNotNull() {
            addCriterion("bind_status is not null");
            return (Criteria) this;
        }

        public Criteria andBindStatusEqualTo(Integer value) {
            addCriterion("bind_status =", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotEqualTo(Integer value) {
            addCriterion("bind_status <>", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusGreaterThan(Integer value) {
            addCriterion("bind_status >", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_status >=", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusLessThan(Integer value) {
            addCriterion("bind_status <", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusLessThanOrEqualTo(Integer value) {
            addCriterion("bind_status <=", value, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusIn(List<Integer> values) {
            addCriterion("bind_status in", values, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotIn(List<Integer> values) {
            addCriterion("bind_status not in", values, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusBetween(Integer value1, Integer value2) {
            addCriterion("bind_status between", value1, value2, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andBindStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_status not between", value1, value2, "bindStatus");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateIsNull() {
            addCriterion("unbundling_date is null");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateIsNotNull() {
            addCriterion("unbundling_date is not null");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateEqualTo(Date value) {
            addCriterion("unbundling_date =", value, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateNotEqualTo(Date value) {
            addCriterion("unbundling_date <>", value, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateGreaterThan(Date value) {
            addCriterion("unbundling_date >", value, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("unbundling_date >=", value, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateLessThan(Date value) {
            addCriterion("unbundling_date <", value, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateLessThanOrEqualTo(Date value) {
            addCriterion("unbundling_date <=", value, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateIn(List<Date> values) {
            addCriterion("unbundling_date in", values, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateNotIn(List<Date> values) {
            addCriterion("unbundling_date not in", values, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateBetween(Date value1, Date value2) {
            addCriterion("unbundling_date between", value1, value2, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andUnbundlingDateNotBetween(Date value1, Date value2) {
            addCriterion("unbundling_date not between", value1, value2, "unbundlingDate");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticIsNull() {
            addCriterion("is_automatic is null");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticIsNotNull() {
            addCriterion("is_automatic is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticEqualTo(Integer value) {
            addCriterion("is_automatic =", value, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticNotEqualTo(Integer value) {
            addCriterion("is_automatic <>", value, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticGreaterThan(Integer value) {
            addCriterion("is_automatic >", value, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_automatic >=", value, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticLessThan(Integer value) {
            addCriterion("is_automatic <", value, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticLessThanOrEqualTo(Integer value) {
            addCriterion("is_automatic <=", value, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticIn(List<Integer> values) {
            addCriterion("is_automatic in", values, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticNotIn(List<Integer> values) {
            addCriterion("is_automatic not in", values, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBetween(Integer value1, Integer value2) {
            addCriterion("is_automatic between", value1, value2, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticNotBetween(Integer value1, Integer value2) {
            addCriterion("is_automatic not between", value1, value2, "isAutomatic");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponIsNull() {
            addCriterion("is_auto_coupon is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponIsNotNull() {
            addCriterion("is_auto_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponEqualTo(Integer value) {
            addCriterion("is_auto_coupon =", value, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponNotEqualTo(Integer value) {
            addCriterion("is_auto_coupon <>", value, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponGreaterThan(Integer value) {
            addCriterion("is_auto_coupon >", value, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_auto_coupon >=", value, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponLessThan(Integer value) {
            addCriterion("is_auto_coupon <", value, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponLessThanOrEqualTo(Integer value) {
            addCriterion("is_auto_coupon <=", value, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponIn(List<Integer> values) {
            addCriterion("is_auto_coupon in", values, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponNotIn(List<Integer> values) {
            addCriterion("is_auto_coupon not in", values, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponBetween(Integer value1, Integer value2) {
            addCriterion("is_auto_coupon between", value1, value2, "isAutoCoupon");
            return (Criteria) this;
        }

        public Criteria andIsAutoCouponNotBetween(Integer value1, Integer value2) {
            addCriterion("is_auto_coupon not between", value1, value2, "isAutoCoupon");
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