package com.park.cloud.common.domain.po.opm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpmPeccancyParkPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpmPeccancyParkPOExample() {
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

        public Criteria andPeccParkIdIsNull() {
            addCriterion("pecc_park_id is null");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdIsNotNull() {
            addCriterion("pecc_park_id is not null");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdEqualTo(Integer value) {
            addCriterion("pecc_park_id =", value, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdNotEqualTo(Integer value) {
            addCriterion("pecc_park_id <>", value, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdGreaterThan(Integer value) {
            addCriterion("pecc_park_id >", value, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pecc_park_id >=", value, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdLessThan(Integer value) {
            addCriterion("pecc_park_id <", value, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdLessThanOrEqualTo(Integer value) {
            addCriterion("pecc_park_id <=", value, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdIn(List<Integer> values) {
            addCriterion("pecc_park_id in", values, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdNotIn(List<Integer> values) {
            addCriterion("pecc_park_id not in", values, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdBetween(Integer value1, Integer value2) {
            addCriterion("pecc_park_id between", value1, value2, "peccParkId");
            return (Criteria) this;
        }

        public Criteria andPeccParkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pecc_park_id not between", value1, value2, "peccParkId");
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

        public Criteria andPeccPlateNumberIsNull() {
            addCriterion("pecc_plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberIsNotNull() {
            addCriterion("pecc_plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberEqualTo(String value) {
            addCriterion("pecc_plate_number =", value, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberNotEqualTo(String value) {
            addCriterion("pecc_plate_number <>", value, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberGreaterThan(String value) {
            addCriterion("pecc_plate_number >", value, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pecc_plate_number >=", value, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberLessThan(String value) {
            addCriterion("pecc_plate_number <", value, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("pecc_plate_number <=", value, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberLike(String value) {
            addCriterion("pecc_plate_number like", value, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberNotLike(String value) {
            addCriterion("pecc_plate_number not like", value, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberIn(List<String> values) {
            addCriterion("pecc_plate_number in", values, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberNotIn(List<String> values) {
            addCriterion("pecc_plate_number not in", values, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberBetween(String value1, String value2) {
            addCriterion("pecc_plate_number between", value1, value2, "peccPlateNumber");
            return (Criteria) this;
        }

        public Criteria andPeccPlateNumberNotBetween(String value1, String value2) {
            addCriterion("pecc_plate_number not between", value1, value2, "peccPlateNumber");
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

        public Criteria andPeccPhotoUrlIsNull() {
            addCriterion("pecc_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlIsNotNull() {
            addCriterion("pecc_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlEqualTo(String value) {
            addCriterion("pecc_photo_url =", value, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlNotEqualTo(String value) {
            addCriterion("pecc_photo_url <>", value, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlGreaterThan(String value) {
            addCriterion("pecc_photo_url >", value, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pecc_photo_url >=", value, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlLessThan(String value) {
            addCriterion("pecc_photo_url <", value, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("pecc_photo_url <=", value, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlLike(String value) {
            addCriterion("pecc_photo_url like", value, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlNotLike(String value) {
            addCriterion("pecc_photo_url not like", value, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlIn(List<String> values) {
            addCriterion("pecc_photo_url in", values, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlNotIn(List<String> values) {
            addCriterion("pecc_photo_url not in", values, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlBetween(String value1, String value2) {
            addCriterion("pecc_photo_url between", value1, value2, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("pecc_photo_url not between", value1, value2, "peccPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andPeccDescIsNull() {
            addCriterion("pecc_desc is null");
            return (Criteria) this;
        }

        public Criteria andPeccDescIsNotNull() {
            addCriterion("pecc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPeccDescEqualTo(String value) {
            addCriterion("pecc_desc =", value, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescNotEqualTo(String value) {
            addCriterion("pecc_desc <>", value, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescGreaterThan(String value) {
            addCriterion("pecc_desc >", value, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescGreaterThanOrEqualTo(String value) {
            addCriterion("pecc_desc >=", value, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescLessThan(String value) {
            addCriterion("pecc_desc <", value, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescLessThanOrEqualTo(String value) {
            addCriterion("pecc_desc <=", value, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescLike(String value) {
            addCriterion("pecc_desc like", value, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescNotLike(String value) {
            addCriterion("pecc_desc not like", value, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescIn(List<String> values) {
            addCriterion("pecc_desc in", values, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescNotIn(List<String> values) {
            addCriterion("pecc_desc not in", values, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescBetween(String value1, String value2) {
            addCriterion("pecc_desc between", value1, value2, "peccDesc");
            return (Criteria) this;
        }

        public Criteria andPeccDescNotBetween(String value1, String value2) {
            addCriterion("pecc_desc not between", value1, value2, "peccDesc");
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