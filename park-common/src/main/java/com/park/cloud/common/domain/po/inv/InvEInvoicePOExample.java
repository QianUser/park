package com.park.cloud.common.domain.po.inv;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvEInvoicePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvEInvoicePOExample() {
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

        public Criteria andEInvoiceIdIsNull() {
            addCriterion("e_invoice_id is null");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdIsNotNull() {
            addCriterion("e_invoice_id is not null");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdEqualTo(Integer value) {
            addCriterion("e_invoice_id =", value, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdNotEqualTo(Integer value) {
            addCriterion("e_invoice_id <>", value, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdGreaterThan(Integer value) {
            addCriterion("e_invoice_id >", value, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_invoice_id >=", value, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdLessThan(Integer value) {
            addCriterion("e_invoice_id <", value, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_invoice_id <=", value, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdIn(List<Integer> values) {
            addCriterion("e_invoice_id in", values, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdNotIn(List<Integer> values) {
            addCriterion("e_invoice_id not in", values, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdBetween(Integer value1, Integer value2) {
            addCriterion("e_invoice_id between", value1, value2, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_invoice_id not between", value1, value2, "eInvoiceId");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeIsNull() {
            addCriterion("e_invoice_code is null");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeIsNotNull() {
            addCriterion("e_invoice_code is not null");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeEqualTo(String value) {
            addCriterion("e_invoice_code =", value, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeNotEqualTo(String value) {
            addCriterion("e_invoice_code <>", value, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeGreaterThan(String value) {
            addCriterion("e_invoice_code >", value, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("e_invoice_code >=", value, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeLessThan(String value) {
            addCriterion("e_invoice_code <", value, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeLessThanOrEqualTo(String value) {
            addCriterion("e_invoice_code <=", value, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeLike(String value) {
            addCriterion("e_invoice_code like", value, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeNotLike(String value) {
            addCriterion("e_invoice_code not like", value, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeIn(List<String> values) {
            addCriterion("e_invoice_code in", values, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeNotIn(List<String> values) {
            addCriterion("e_invoice_code not in", values, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeBetween(String value1, String value2) {
            addCriterion("e_invoice_code between", value1, value2, "eInvoiceCode");
            return (Criteria) this;
        }

        public Criteria andEInvoiceCodeNotBetween(String value1, String value2) {
            addCriterion("e_invoice_code not between", value1, value2, "eInvoiceCode");
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

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberIsNull() {
            addCriterion("tax_payer_number is null");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberIsNotNull() {
            addCriterion("tax_payer_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberEqualTo(String value) {
            addCriterion("tax_payer_number =", value, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberNotEqualTo(String value) {
            addCriterion("tax_payer_number <>", value, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberGreaterThan(String value) {
            addCriterion("tax_payer_number >", value, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tax_payer_number >=", value, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberLessThan(String value) {
            addCriterion("tax_payer_number <", value, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberLessThanOrEqualTo(String value) {
            addCriterion("tax_payer_number <=", value, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberLike(String value) {
            addCriterion("tax_payer_number like", value, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberNotLike(String value) {
            addCriterion("tax_payer_number not like", value, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberIn(List<String> values) {
            addCriterion("tax_payer_number in", values, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberNotIn(List<String> values) {
            addCriterion("tax_payer_number not in", values, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberBetween(String value1, String value2) {
            addCriterion("tax_payer_number between", value1, value2, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andTaxPayerNumberNotBetween(String value1, String value2) {
            addCriterion("tax_payer_number not between", value1, value2, "taxPayerNumber");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceIsNull() {
            addCriterion("einvoice_price is null");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceIsNotNull() {
            addCriterion("einvoice_price is not null");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceEqualTo(BigDecimal value) {
            addCriterion("einvoice_price =", value, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceNotEqualTo(BigDecimal value) {
            addCriterion("einvoice_price <>", value, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceGreaterThan(BigDecimal value) {
            addCriterion("einvoice_price >", value, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("einvoice_price >=", value, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceLessThan(BigDecimal value) {
            addCriterion("einvoice_price <", value, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("einvoice_price <=", value, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceIn(List<BigDecimal> values) {
            addCriterion("einvoice_price in", values, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceNotIn(List<BigDecimal> values) {
            addCriterion("einvoice_price not in", values, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("einvoice_price between", value1, value2, "einvoicePrice");
            return (Criteria) this;
        }

        public Criteria andEinvoicePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("einvoice_price not between", value1, value2, "einvoicePrice");
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

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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

        public Criteria andEmailStatusIsNull() {
            addCriterion("email_status is null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNotNull() {
            addCriterion("email_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusEqualTo(Integer value) {
            addCriterion("email_status =", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotEqualTo(Integer value) {
            addCriterion("email_status <>", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThan(Integer value) {
            addCriterion("email_status >", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_status >=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThan(Integer value) {
            addCriterion("email_status <", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("email_status <=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIn(List<Integer> values) {
            addCriterion("email_status in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotIn(List<Integer> values) {
            addCriterion("email_status not in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusBetween(Integer value1, Integer value2) {
            addCriterion("email_status between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("email_status not between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andEInvoiceTypeIsNull() {
            addCriterion("e_invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeIsNotNull() {
            addCriterion("e_invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeEqualTo(Integer value) {
            addCriterion("e_invoice_type =", value, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeNotEqualTo(Integer value) {
            addCriterion("e_invoice_type <>", value, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeGreaterThan(Integer value) {
            addCriterion("e_invoice_type >", value, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_invoice_type >=", value, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeLessThan(Integer value) {
            addCriterion("e_invoice_type <", value, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("e_invoice_type <=", value, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeIn(List<Integer> values) {
            addCriterion("e_invoice_type in", values, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeNotIn(List<Integer> values) {
            addCriterion("e_invoice_type not in", values, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeBetween(Integer value1, Integer value2) {
            addCriterion("e_invoice_type between", value1, value2, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andEInvoiceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("e_invoice_type not between", value1, value2, "eInvoiceType");
            return (Criteria) this;
        }

        public Criteria andWechatStatusIsNull() {
            addCriterion("wechat_status is null");
            return (Criteria) this;
        }

        public Criteria andWechatStatusIsNotNull() {
            addCriterion("wechat_status is not null");
            return (Criteria) this;
        }

        public Criteria andWechatStatusEqualTo(Integer value) {
            addCriterion("wechat_status =", value, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusNotEqualTo(Integer value) {
            addCriterion("wechat_status <>", value, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusGreaterThan(Integer value) {
            addCriterion("wechat_status >", value, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_status >=", value, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusLessThan(Integer value) {
            addCriterion("wechat_status <", value, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_status <=", value, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusIn(List<Integer> values) {
            addCriterion("wechat_status in", values, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusNotIn(List<Integer> values) {
            addCriterion("wechat_status not in", values, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusBetween(Integer value1, Integer value2) {
            addCriterion("wechat_status between", value1, value2, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andWechatStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_status not between", value1, value2, "wechatStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusIsNull() {
            addCriterion("zfb_status is null");
            return (Criteria) this;
        }

        public Criteria andZfbStatusIsNotNull() {
            addCriterion("zfb_status is not null");
            return (Criteria) this;
        }

        public Criteria andZfbStatusEqualTo(Integer value) {
            addCriterion("zfb_status =", value, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusNotEqualTo(Integer value) {
            addCriterion("zfb_status <>", value, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusGreaterThan(Integer value) {
            addCriterion("zfb_status >", value, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("zfb_status >=", value, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusLessThan(Integer value) {
            addCriterion("zfb_status <", value, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusLessThanOrEqualTo(Integer value) {
            addCriterion("zfb_status <=", value, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusIn(List<Integer> values) {
            addCriterion("zfb_status in", values, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusNotIn(List<Integer> values) {
            addCriterion("zfb_status not in", values, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusBetween(Integer value1, Integer value2) {
            addCriterion("zfb_status between", value1, value2, "zfbStatus");
            return (Criteria) this;
        }

        public Criteria andZfbStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("zfb_status not between", value1, value2, "zfbStatus");
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