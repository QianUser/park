package com.park.cloud.common.domain.po.inv;

import java.util.ArrayList;
import java.util.List;

public class InvEinvoiceBargainOrderPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvEinvoiceBargainOrderPOExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
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