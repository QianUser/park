package com.park.cloud.common.domain.po.inv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvEinvoiceResultPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvEinvoiceResultPOExample() {
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

        public Criteria andEinvoiceResultidIsNull() {
            addCriterion("einvoice_resultid is null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidIsNotNull() {
            addCriterion("einvoice_resultid is not null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidEqualTo(Integer value) {
            addCriterion("einvoice_resultid =", value, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidNotEqualTo(Integer value) {
            addCriterion("einvoice_resultid <>", value, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidGreaterThan(Integer value) {
            addCriterion("einvoice_resultid >", value, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("einvoice_resultid >=", value, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidLessThan(Integer value) {
            addCriterion("einvoice_resultid <", value, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidLessThanOrEqualTo(Integer value) {
            addCriterion("einvoice_resultid <=", value, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidIn(List<Integer> values) {
            addCriterion("einvoice_resultid in", values, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidNotIn(List<Integer> values) {
            addCriterion("einvoice_resultid not in", values, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidBetween(Integer value1, Integer value2) {
            addCriterion("einvoice_resultid between", value1, value2, "einvoiceResultid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceResultidNotBetween(Integer value1, Integer value2) {
            addCriterion("einvoice_resultid not between", value1, value2, "einvoiceResultid");
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

        public Criteria andFpqqlshIsNull() {
            addCriterion("fpqqlsh is null");
            return (Criteria) this;
        }

        public Criteria andFpqqlshIsNotNull() {
            addCriterion("fpqqlsh is not null");
            return (Criteria) this;
        }

        public Criteria andFpqqlshEqualTo(String value) {
            addCriterion("fpqqlsh =", value, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshNotEqualTo(String value) {
            addCriterion("fpqqlsh <>", value, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshGreaterThan(String value) {
            addCriterion("fpqqlsh >", value, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshGreaterThanOrEqualTo(String value) {
            addCriterion("fpqqlsh >=", value, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshLessThan(String value) {
            addCriterion("fpqqlsh <", value, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshLessThanOrEqualTo(String value) {
            addCriterion("fpqqlsh <=", value, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshLike(String value) {
            addCriterion("fpqqlsh like", value, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshNotLike(String value) {
            addCriterion("fpqqlsh not like", value, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshIn(List<String> values) {
            addCriterion("fpqqlsh in", values, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshNotIn(List<String> values) {
            addCriterion("fpqqlsh not in", values, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshBetween(String value1, String value2) {
            addCriterion("fpqqlsh between", value1, value2, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpqqlshNotBetween(String value1, String value2) {
            addCriterion("fpqqlsh not between", value1, value2, "fpqqlsh");
            return (Criteria) this;
        }

        public Criteria andFpDmIsNull() {
            addCriterion("fp_dm is null");
            return (Criteria) this;
        }

        public Criteria andFpDmIsNotNull() {
            addCriterion("fp_dm is not null");
            return (Criteria) this;
        }

        public Criteria andFpDmEqualTo(String value) {
            addCriterion("fp_dm =", value, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmNotEqualTo(String value) {
            addCriterion("fp_dm <>", value, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmGreaterThan(String value) {
            addCriterion("fp_dm >", value, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmGreaterThanOrEqualTo(String value) {
            addCriterion("fp_dm >=", value, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmLessThan(String value) {
            addCriterion("fp_dm <", value, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmLessThanOrEqualTo(String value) {
            addCriterion("fp_dm <=", value, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmLike(String value) {
            addCriterion("fp_dm like", value, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmNotLike(String value) {
            addCriterion("fp_dm not like", value, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmIn(List<String> values) {
            addCriterion("fp_dm in", values, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmNotIn(List<String> values) {
            addCriterion("fp_dm not in", values, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmBetween(String value1, String value2) {
            addCriterion("fp_dm between", value1, value2, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpDmNotBetween(String value1, String value2) {
            addCriterion("fp_dm not between", value1, value2, "fpDm");
            return (Criteria) this;
        }

        public Criteria andFpHmIsNull() {
            addCriterion("fp_hm is null");
            return (Criteria) this;
        }

        public Criteria andFpHmIsNotNull() {
            addCriterion("fp_hm is not null");
            return (Criteria) this;
        }

        public Criteria andFpHmEqualTo(String value) {
            addCriterion("fp_hm =", value, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmNotEqualTo(String value) {
            addCriterion("fp_hm <>", value, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmGreaterThan(String value) {
            addCriterion("fp_hm >", value, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmGreaterThanOrEqualTo(String value) {
            addCriterion("fp_hm >=", value, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmLessThan(String value) {
            addCriterion("fp_hm <", value, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmLessThanOrEqualTo(String value) {
            addCriterion("fp_hm <=", value, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmLike(String value) {
            addCriterion("fp_hm like", value, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmNotLike(String value) {
            addCriterion("fp_hm not like", value, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmIn(List<String> values) {
            addCriterion("fp_hm in", values, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmNotIn(List<String> values) {
            addCriterion("fp_hm not in", values, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmBetween(String value1, String value2) {
            addCriterion("fp_hm between", value1, value2, "fpHm");
            return (Criteria) this;
        }

        public Criteria andFpHmNotBetween(String value1, String value2) {
            addCriterion("fp_hm not between", value1, value2, "fpHm");
            return (Criteria) this;
        }

        public Criteria andKprqIsNull() {
            addCriterion("kprq is null");
            return (Criteria) this;
        }

        public Criteria andKprqIsNotNull() {
            addCriterion("kprq is not null");
            return (Criteria) this;
        }

        public Criteria andKprqEqualTo(String value) {
            addCriterion("kprq =", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotEqualTo(String value) {
            addCriterion("kprq <>", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqGreaterThan(String value) {
            addCriterion("kprq >", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqGreaterThanOrEqualTo(String value) {
            addCriterion("kprq >=", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLessThan(String value) {
            addCriterion("kprq <", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLessThanOrEqualTo(String value) {
            addCriterion("kprq <=", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLike(String value) {
            addCriterion("kprq like", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotLike(String value) {
            addCriterion("kprq not like", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqIn(List<String> values) {
            addCriterion("kprq in", values, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotIn(List<String> values) {
            addCriterion("kprq not in", values, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqBetween(String value1, String value2) {
            addCriterion("kprq between", value1, value2, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotBetween(String value1, String value2) {
            addCriterion("kprq not between", value1, value2, "kprq");
            return (Criteria) this;
        }

        public Criteria andKplxIsNull() {
            addCriterion("kplx is null");
            return (Criteria) this;
        }

        public Criteria andKplxIsNotNull() {
            addCriterion("kplx is not null");
            return (Criteria) this;
        }

        public Criteria andKplxEqualTo(Integer value) {
            addCriterion("kplx =", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxNotEqualTo(Integer value) {
            addCriterion("kplx <>", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxGreaterThan(Integer value) {
            addCriterion("kplx >", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxGreaterThanOrEqualTo(Integer value) {
            addCriterion("kplx >=", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxLessThan(Integer value) {
            addCriterion("kplx <", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxLessThanOrEqualTo(Integer value) {
            addCriterion("kplx <=", value, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxIn(List<Integer> values) {
            addCriterion("kplx in", values, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxNotIn(List<Integer> values) {
            addCriterion("kplx not in", values, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxBetween(Integer value1, Integer value2) {
            addCriterion("kplx between", value1, value2, "kplx");
            return (Criteria) this;
        }

        public Criteria andKplxNotBetween(Integer value1, Integer value2) {
            addCriterion("kplx not between", value1, value2, "kplx");
            return (Criteria) this;
        }

        public Criteria andCzdmIsNull() {
            addCriterion("czdm is null");
            return (Criteria) this;
        }

        public Criteria andCzdmIsNotNull() {
            addCriterion("czdm is not null");
            return (Criteria) this;
        }

        public Criteria andCzdmEqualTo(String value) {
            addCriterion("czdm =", value, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmNotEqualTo(String value) {
            addCriterion("czdm <>", value, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmGreaterThan(String value) {
            addCriterion("czdm >", value, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmGreaterThanOrEqualTo(String value) {
            addCriterion("czdm >=", value, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmLessThan(String value) {
            addCriterion("czdm <", value, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmLessThanOrEqualTo(String value) {
            addCriterion("czdm <=", value, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmLike(String value) {
            addCriterion("czdm like", value, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmNotLike(String value) {
            addCriterion("czdm not like", value, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmIn(List<String> values) {
            addCriterion("czdm in", values, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmNotIn(List<String> values) {
            addCriterion("czdm not in", values, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmBetween(String value1, String value2) {
            addCriterion("czdm between", value1, value2, "czdm");
            return (Criteria) this;
        }

        public Criteria andCzdmNotBetween(String value1, String value2) {
            addCriterion("czdm not between", value1, value2, "czdm");
            return (Criteria) this;
        }

        public Criteria andJymIsNull() {
            addCriterion("jym is null");
            return (Criteria) this;
        }

        public Criteria andJymIsNotNull() {
            addCriterion("jym is not null");
            return (Criteria) this;
        }

        public Criteria andJymEqualTo(String value) {
            addCriterion("jym =", value, "jym");
            return (Criteria) this;
        }

        public Criteria andJymNotEqualTo(String value) {
            addCriterion("jym <>", value, "jym");
            return (Criteria) this;
        }

        public Criteria andJymGreaterThan(String value) {
            addCriterion("jym >", value, "jym");
            return (Criteria) this;
        }

        public Criteria andJymGreaterThanOrEqualTo(String value) {
            addCriterion("jym >=", value, "jym");
            return (Criteria) this;
        }

        public Criteria andJymLessThan(String value) {
            addCriterion("jym <", value, "jym");
            return (Criteria) this;
        }

        public Criteria andJymLessThanOrEqualTo(String value) {
            addCriterion("jym <=", value, "jym");
            return (Criteria) this;
        }

        public Criteria andJymLike(String value) {
            addCriterion("jym like", value, "jym");
            return (Criteria) this;
        }

        public Criteria andJymNotLike(String value) {
            addCriterion("jym not like", value, "jym");
            return (Criteria) this;
        }

        public Criteria andJymIn(List<String> values) {
            addCriterion("jym in", values, "jym");
            return (Criteria) this;
        }

        public Criteria andJymNotIn(List<String> values) {
            addCriterion("jym not in", values, "jym");
            return (Criteria) this;
        }

        public Criteria andJymBetween(String value1, String value2) {
            addCriterion("jym between", value1, value2, "jym");
            return (Criteria) this;
        }

        public Criteria andJymNotBetween(String value1, String value2) {
            addCriterion("jym not between", value1, value2, "jym");
            return (Criteria) this;
        }

        public Criteria andPdfFileIsNull() {
            addCriterion("pdf_file is null");
            return (Criteria) this;
        }

        public Criteria andPdfFileIsNotNull() {
            addCriterion("pdf_file is not null");
            return (Criteria) this;
        }

        public Criteria andPdfFileEqualTo(String value) {
            addCriterion("pdf_file =", value, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileNotEqualTo(String value) {
            addCriterion("pdf_file <>", value, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileGreaterThan(String value) {
            addCriterion("pdf_file >", value, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_file >=", value, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileLessThan(String value) {
            addCriterion("pdf_file <", value, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileLessThanOrEqualTo(String value) {
            addCriterion("pdf_file <=", value, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileLike(String value) {
            addCriterion("pdf_file like", value, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileNotLike(String value) {
            addCriterion("pdf_file not like", value, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileIn(List<String> values) {
            addCriterion("pdf_file in", values, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileNotIn(List<String> values) {
            addCriterion("pdf_file not in", values, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileBetween(String value1, String value2) {
            addCriterion("pdf_file between", value1, value2, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfFileNotBetween(String value1, String value2) {
            addCriterion("pdf_file not between", value1, value2, "pdfFile");
            return (Criteria) this;
        }

        public Criteria andPdfUrlIsNull() {
            addCriterion("pdf_url is null");
            return (Criteria) this;
        }

        public Criteria andPdfUrlIsNotNull() {
            addCriterion("pdf_url is not null");
            return (Criteria) this;
        }

        public Criteria andPdfUrlEqualTo(String value) {
            addCriterion("pdf_url =", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlNotEqualTo(String value) {
            addCriterion("pdf_url <>", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlGreaterThan(String value) {
            addCriterion("pdf_url >", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_url >=", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlLessThan(String value) {
            addCriterion("pdf_url <", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlLessThanOrEqualTo(String value) {
            addCriterion("pdf_url <=", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlLike(String value) {
            addCriterion("pdf_url like", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlNotLike(String value) {
            addCriterion("pdf_url not like", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlIn(List<String> values) {
            addCriterion("pdf_url in", values, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlNotIn(List<String> values) {
            addCriterion("pdf_url not in", values, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlBetween(String value1, String value2) {
            addCriterion("pdf_url between", value1, value2, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlNotBetween(String value1, String value2) {
            addCriterion("pdf_url not between", value1, value2, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNull() {
            addCriterion("return_msg is null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNotNull() {
            addCriterion("return_msg is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgEqualTo(String value) {
            addCriterion("return_msg =", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotEqualTo(String value) {
            addCriterion("return_msg <>", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThan(String value) {
            addCriterion("return_msg >", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThanOrEqualTo(String value) {
            addCriterion("return_msg >=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThan(String value) {
            addCriterion("return_msg <", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThanOrEqualTo(String value) {
            addCriterion("return_msg <=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLike(String value) {
            addCriterion("return_msg like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotLike(String value) {
            addCriterion("return_msg not like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIn(List<String> values) {
            addCriterion("return_msg in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotIn(List<String> values) {
            addCriterion("return_msg not in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgBetween(String value1, String value2) {
            addCriterion("return_msg between", value1, value2, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotBetween(String value1, String value2) {
            addCriterion("return_msg not between", value1, value2, "returnMsg");
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

        public Criteria andReturnMessageIsNull() {
            addCriterion("return_message is null");
            return (Criteria) this;
        }

        public Criteria andReturnMessageIsNotNull() {
            addCriterion("return_message is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMessageEqualTo(String value) {
            addCriterion("return_message =", value, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageNotEqualTo(String value) {
            addCriterion("return_message <>", value, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageGreaterThan(String value) {
            addCriterion("return_message >", value, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageGreaterThanOrEqualTo(String value) {
            addCriterion("return_message >=", value, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageLessThan(String value) {
            addCriterion("return_message <", value, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageLessThanOrEqualTo(String value) {
            addCriterion("return_message <=", value, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageLike(String value) {
            addCriterion("return_message like", value, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageNotLike(String value) {
            addCriterion("return_message not like", value, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageIn(List<String> values) {
            addCriterion("return_message in", values, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageNotIn(List<String> values) {
            addCriterion("return_message not in", values, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageBetween(String value1, String value2) {
            addCriterion("return_message between", value1, value2, "returnMessage");
            return (Criteria) this;
        }

        public Criteria andReturnMessageNotBetween(String value1, String value2) {
            addCriterion("return_message not between", value1, value2, "returnMessage");
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