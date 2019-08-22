package com.j1904.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderTableExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOcreattimeIsNull() {
            addCriterion("ocreatTime is null");
            return (Criteria) this;
        }

        public Criteria andOcreattimeIsNotNull() {
            addCriterion("ocreatTime is not null");
            return (Criteria) this;
        }

        public Criteria andOcreattimeEqualTo(Date value) {
            addCriterion("ocreatTime =", value, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeNotEqualTo(Date value) {
            addCriterion("ocreatTime <>", value, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeGreaterThan(Date value) {
            addCriterion("ocreatTime >", value, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ocreatTime >=", value, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeLessThan(Date value) {
            addCriterion("ocreatTime <", value, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeLessThanOrEqualTo(Date value) {
            addCriterion("ocreatTime <=", value, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeIn(List<Date> values) {
            addCriterion("ocreatTime in", values, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeNotIn(List<Date> values) {
            addCriterion("ocreatTime not in", values, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeBetween(Date value1, Date value2) {
            addCriterion("ocreatTime between", value1, value2, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcreattimeNotBetween(Date value1, Date value2) {
            addCriterion("ocreatTime not between", value1, value2, "ocreattime");
            return (Criteria) this;
        }

        public Criteria andOcustomernameIsNull() {
            addCriterion("ocustomerName is null");
            return (Criteria) this;
        }

        public Criteria andOcustomernameIsNotNull() {
            addCriterion("ocustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andOcustomernameEqualTo(String value) {
            addCriterion("ocustomerName =", value, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameNotEqualTo(String value) {
            addCriterion("ocustomerName <>", value, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameGreaterThan(String value) {
            addCriterion("ocustomerName >", value, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("ocustomerName >=", value, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameLessThan(String value) {
            addCriterion("ocustomerName <", value, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameLessThanOrEqualTo(String value) {
            addCriterion("ocustomerName <=", value, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameLike(String value) {
            addCriterion("ocustomerName like", value, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameNotLike(String value) {
            addCriterion("ocustomerName not like", value, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameIn(List<String> values) {
            addCriterion("ocustomerName in", values, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameNotIn(List<String> values) {
            addCriterion("ocustomerName not in", values, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameBetween(String value1, String value2) {
            addCriterion("ocustomerName between", value1, value2, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomernameNotBetween(String value1, String value2) {
            addCriterion("ocustomerName not between", value1, value2, "ocustomername");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneIsNull() {
            addCriterion("ocustomerPhone is null");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneIsNotNull() {
            addCriterion("ocustomerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneEqualTo(String value) {
            addCriterion("ocustomerPhone =", value, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneNotEqualTo(String value) {
            addCriterion("ocustomerPhone <>", value, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneGreaterThan(String value) {
            addCriterion("ocustomerPhone >", value, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ocustomerPhone >=", value, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneLessThan(String value) {
            addCriterion("ocustomerPhone <", value, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneLessThanOrEqualTo(String value) {
            addCriterion("ocustomerPhone <=", value, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneLike(String value) {
            addCriterion("ocustomerPhone like", value, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneNotLike(String value) {
            addCriterion("ocustomerPhone not like", value, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneIn(List<String> values) {
            addCriterion("ocustomerPhone in", values, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneNotIn(List<String> values) {
            addCriterion("ocustomerPhone not in", values, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneBetween(String value1, String value2) {
            addCriterion("ocustomerPhone between", value1, value2, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomerphoneNotBetween(String value1, String value2) {
            addCriterion("ocustomerPhone not between", value1, value2, "ocustomerphone");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressIsNull() {
            addCriterion("ocustomerAddress is null");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressIsNotNull() {
            addCriterion("ocustomerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressEqualTo(String value) {
            addCriterion("ocustomerAddress =", value, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressNotEqualTo(String value) {
            addCriterion("ocustomerAddress <>", value, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressGreaterThan(String value) {
            addCriterion("ocustomerAddress >", value, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("ocustomerAddress >=", value, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressLessThan(String value) {
            addCriterion("ocustomerAddress <", value, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressLessThanOrEqualTo(String value) {
            addCriterion("ocustomerAddress <=", value, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressLike(String value) {
            addCriterion("ocustomerAddress like", value, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressNotLike(String value) {
            addCriterion("ocustomerAddress not like", value, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressIn(List<String> values) {
            addCriterion("ocustomerAddress in", values, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressNotIn(List<String> values) {
            addCriterion("ocustomerAddress not in", values, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressBetween(String value1, String value2) {
            addCriterion("ocustomerAddress between", value1, value2, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOcustomeraddressNotBetween(String value1, String value2) {
            addCriterion("ocustomerAddress not between", value1, value2, "ocustomeraddress");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameIsNull() {
            addCriterion("ogoodsName is null");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameIsNotNull() {
            addCriterion("ogoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameEqualTo(String value) {
            addCriterion("ogoodsName =", value, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameNotEqualTo(String value) {
            addCriterion("ogoodsName <>", value, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameGreaterThan(String value) {
            addCriterion("ogoodsName >", value, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("ogoodsName >=", value, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameLessThan(String value) {
            addCriterion("ogoodsName <", value, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameLessThanOrEqualTo(String value) {
            addCriterion("ogoodsName <=", value, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameLike(String value) {
            addCriterion("ogoodsName like", value, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameNotLike(String value) {
            addCriterion("ogoodsName not like", value, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameIn(List<String> values) {
            addCriterion("ogoodsName in", values, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameNotIn(List<String> values) {
            addCriterion("ogoodsName not in", values, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameBetween(String value1, String value2) {
            addCriterion("ogoodsName between", value1, value2, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsnameNotBetween(String value1, String value2) {
            addCriterion("ogoodsName not between", value1, value2, "ogoodsname");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceIsNull() {
            addCriterion("ogoodsUnitprice is null");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceIsNotNull() {
            addCriterion("ogoodsUnitprice is not null");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceEqualTo(Double value) {
            addCriterion("ogoodsUnitprice =", value, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceNotEqualTo(Double value) {
            addCriterion("ogoodsUnitprice <>", value, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceGreaterThan(Double value) {
            addCriterion("ogoodsUnitprice >", value, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ogoodsUnitprice >=", value, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceLessThan(Double value) {
            addCriterion("ogoodsUnitprice <", value, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceLessThanOrEqualTo(Double value) {
            addCriterion("ogoodsUnitprice <=", value, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceIn(List<Double> values) {
            addCriterion("ogoodsUnitprice in", values, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceNotIn(List<Double> values) {
            addCriterion("ogoodsUnitprice not in", values, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceBetween(Double value1, Double value2) {
            addCriterion("ogoodsUnitprice between", value1, value2, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOgoodsunitpriceNotBetween(Double value1, Double value2) {
            addCriterion("ogoodsUnitprice not between", value1, value2, "ogoodsunitprice");
            return (Criteria) this;
        }

        public Criteria andOremarksIsNull() {
            addCriterion("oremarks is null");
            return (Criteria) this;
        }

        public Criteria andOremarksIsNotNull() {
            addCriterion("oremarks is not null");
            return (Criteria) this;
        }

        public Criteria andOremarksEqualTo(String value) {
            addCriterion("oremarks =", value, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksNotEqualTo(String value) {
            addCriterion("oremarks <>", value, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksGreaterThan(String value) {
            addCriterion("oremarks >", value, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksGreaterThanOrEqualTo(String value) {
            addCriterion("oremarks >=", value, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksLessThan(String value) {
            addCriterion("oremarks <", value, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksLessThanOrEqualTo(String value) {
            addCriterion("oremarks <=", value, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksLike(String value) {
            addCriterion("oremarks like", value, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksNotLike(String value) {
            addCriterion("oremarks not like", value, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksIn(List<String> values) {
            addCriterion("oremarks in", values, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksNotIn(List<String> values) {
            addCriterion("oremarks not in", values, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksBetween(String value1, String value2) {
            addCriterion("oremarks between", value1, value2, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOremarksNotBetween(String value1, String value2) {
            addCriterion("oremarks not between", value1, value2, "oremarks");
            return (Criteria) this;
        }

        public Criteria andOstateIsNull() {
            addCriterion("ostate is null");
            return (Criteria) this;
        }

        public Criteria andOstateIsNotNull() {
            addCriterion("ostate is not null");
            return (Criteria) this;
        }

        public Criteria andOstateEqualTo(Integer value) {
            addCriterion("ostate =", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotEqualTo(Integer value) {
            addCriterion("ostate <>", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThan(Integer value) {
            addCriterion("ostate >", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ostate >=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThan(Integer value) {
            addCriterion("ostate <", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThanOrEqualTo(Integer value) {
            addCriterion("ostate <=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateIn(List<Integer> values) {
            addCriterion("ostate in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotIn(List<Integer> values) {
            addCriterion("ostate not in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateBetween(Integer value1, Integer value2) {
            addCriterion("ostate between", value1, value2, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ostate not between", value1, value2, "ostate");
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