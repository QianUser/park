package com.park.cloud.common.domain.po.inv;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvEinvoiceDetailsPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvEinvoiceDetailsPOExample() {
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

        public Criteria andEinvoiceDetailsIdIsNull() {
            addCriterion("einvoice_details_id is null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdIsNotNull() {
            addCriterion("einvoice_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdEqualTo(Integer value) {
            addCriterion("einvoice_details_id =", value, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdNotEqualTo(Integer value) {
            addCriterion("einvoice_details_id <>", value, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdGreaterThan(Integer value) {
            addCriterion("einvoice_details_id >", value, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("einvoice_details_id >=", value, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdLessThan(Integer value) {
            addCriterion("einvoice_details_id <", value, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("einvoice_details_id <=", value, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdIn(List<Integer> values) {
            addCriterion("einvoice_details_id in", values, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdNotIn(List<Integer> values) {
            addCriterion("einvoice_details_id not in", values, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("einvoice_details_id between", value1, value2, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("einvoice_details_id not between", value1, value2, "einvoiceDetailsId");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeIsNull() {
            addCriterion("einvoice_code is null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeIsNotNull() {
            addCriterion("einvoice_code is not null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeEqualTo(String value) {
            addCriterion("einvoice_code =", value, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeNotEqualTo(String value) {
            addCriterion("einvoice_code <>", value, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeGreaterThan(String value) {
            addCriterion("einvoice_code >", value, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("einvoice_code >=", value, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeLessThan(String value) {
            addCriterion("einvoice_code <", value, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeLessThanOrEqualTo(String value) {
            addCriterion("einvoice_code <=", value, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeLike(String value) {
            addCriterion("einvoice_code like", value, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeNotLike(String value) {
            addCriterion("einvoice_code not like", value, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeIn(List<String> values) {
            addCriterion("einvoice_code in", values, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeNotIn(List<String> values) {
            addCriterion("einvoice_code not in", values, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeBetween(String value1, String value2) {
            addCriterion("einvoice_code between", value1, value2, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEinvoiceCodeNotBetween(String value1, String value2) {
            addCriterion("einvoice_code not between", value1, value2, "einvoiceCode");
            return (Criteria) this;
        }

        public Criteria andDetailsNameIsNull() {
            addCriterion("details_name is null");
            return (Criteria) this;
        }

        public Criteria andDetailsNameIsNotNull() {
            addCriterion("details_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsNameEqualTo(String value) {
            addCriterion("details_name =", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameNotEqualTo(String value) {
            addCriterion("details_name <>", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameGreaterThan(String value) {
            addCriterion("details_name >", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameGreaterThanOrEqualTo(String value) {
            addCriterion("details_name >=", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameLessThan(String value) {
            addCriterion("details_name <", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameLessThanOrEqualTo(String value) {
            addCriterion("details_name <=", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameLike(String value) {
            addCriterion("details_name like", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameNotLike(String value) {
            addCriterion("details_name not like", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameIn(List<String> values) {
            addCriterion("details_name in", values, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameNotIn(List<String> values) {
            addCriterion("details_name not in", values, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameBetween(String value1, String value2) {
            addCriterion("details_name between", value1, value2, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameNotBetween(String value1, String value2) {
            addCriterion("details_name not between", value1, value2, "detailsName");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceIsNull() {
            addCriterion("unit_total_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceIsNotNull() {
            addCriterion("unit_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceEqualTo(BigDecimal value) {
            addCriterion("unit_total_price =", value, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_total_price <>", value, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_total_price >", value, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_total_price >=", value, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceLessThan(BigDecimal value) {
            addCriterion("unit_total_price <", value, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_total_price <=", value, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceIn(List<BigDecimal> values) {
            addCriterion("unit_total_price in", values, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_total_price not in", values, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_total_price between", value1, value2, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_total_price not between", value1, value2, "unitTotalPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIsNull() {
            addCriterion("tax_price is null");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIsNotNull() {
            addCriterion("tax_price is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPriceEqualTo(BigDecimal value) {
            addCriterion("tax_price =", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotEqualTo(BigDecimal value) {
            addCriterion("tax_price <>", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceGreaterThan(BigDecimal value) {
            addCriterion("tax_price >", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_price >=", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceLessThan(BigDecimal value) {
            addCriterion("tax_price <", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_price <=", value, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceIn(List<BigDecimal> values) {
            addCriterion("tax_price in", values, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotIn(List<BigDecimal> values) {
            addCriterion("tax_price not in", values, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_price between", value1, value2, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_price not between", value1, value2, "taxPrice");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
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