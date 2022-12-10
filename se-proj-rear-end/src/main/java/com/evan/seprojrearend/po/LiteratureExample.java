package com.evan.seprojrearend.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LiteratureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiteratureExample() {
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

        public Criteria andLiteratureIdIsNull() {
            addCriterion("LITERATURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdIsNotNull() {
            addCriterion("LITERATURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdEqualTo(BigDecimal value) {
            addCriterion("LITERATURE_ID =", value, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdNotEqualTo(BigDecimal value) {
            addCriterion("LITERATURE_ID <>", value, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdGreaterThan(BigDecimal value) {
            addCriterion("LITERATURE_ID >", value, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LITERATURE_ID >=", value, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdLessThan(BigDecimal value) {
            addCriterion("LITERATURE_ID <", value, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LITERATURE_ID <=", value, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdIn(List<BigDecimal> values) {
            addCriterion("LITERATURE_ID in", values, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdNotIn(List<BigDecimal> values) {
            addCriterion("LITERATURE_ID not in", values, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LITERATURE_ID between", value1, value2, "literatureId");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LITERATURE_ID not between", value1, value2, "literatureId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("SCHOOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("SCHOOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(BigDecimal value) {
            addCriterion("SCHOOL_ID =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(BigDecimal value) {
            addCriterion("SCHOOL_ID <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(BigDecimal value) {
            addCriterion("SCHOOL_ID >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHOOL_ID >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(BigDecimal value) {
            addCriterion("SCHOOL_ID <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHOOL_ID <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<BigDecimal> values) {
            addCriterion("SCHOOL_ID in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<BigDecimal> values) {
            addCriterion("SCHOOL_ID not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHOOL_ID between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHOOL_ID not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameIsNull() {
            addCriterion("AUTO_INCREMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameIsNotNull() {
            addCriterion("AUTO_INCREMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameEqualTo(String value) {
            addCriterion("AUTO_INCREMENT_NAME =", value, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameNotEqualTo(String value) {
            addCriterion("AUTO_INCREMENT_NAME <>", value, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameGreaterThan(String value) {
            addCriterion("AUTO_INCREMENT_NAME >", value, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_INCREMENT_NAME >=", value, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameLessThan(String value) {
            addCriterion("AUTO_INCREMENT_NAME <", value, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameLessThanOrEqualTo(String value) {
            addCriterion("AUTO_INCREMENT_NAME <=", value, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameLike(String value) {
            addCriterion("AUTO_INCREMENT_NAME like", value, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameNotLike(String value) {
            addCriterion("AUTO_INCREMENT_NAME not like", value, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameIn(List<String> values) {
            addCriterion("AUTO_INCREMENT_NAME in", values, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameNotIn(List<String> values) {
            addCriterion("AUTO_INCREMENT_NAME not in", values, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameBetween(String value1, String value2) {
            addCriterion("AUTO_INCREMENT_NAME between", value1, value2, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNameNotBetween(String value1, String value2) {
            addCriterion("AUTO_INCREMENT_NAME not between", value1, value2, "autoIncrementName");
            return (Criteria) this;
        }

        public Criteria andExperimentIdIsNull() {
            addCriterion("EXPERIMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andExperimentIdIsNotNull() {
            addCriterion("EXPERIMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExperimentIdEqualTo(BigDecimal value) {
            addCriterion("EXPERIMENT_ID =", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotEqualTo(BigDecimal value) {
            addCriterion("EXPERIMENT_ID <>", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdGreaterThan(BigDecimal value) {
            addCriterion("EXPERIMENT_ID >", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPERIMENT_ID >=", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdLessThan(BigDecimal value) {
            addCriterion("EXPERIMENT_ID <", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPERIMENT_ID <=", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdIn(List<BigDecimal> values) {
            addCriterion("EXPERIMENT_ID in", values, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotIn(List<BigDecimal> values) {
            addCriterion("EXPERIMENT_ID not in", values, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPERIMENT_ID between", value1, value2, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPERIMENT_ID not between", value1, value2, "experimentId");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(BigDecimal value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(BigDecimal value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(BigDecimal value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(BigDecimal value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<BigDecimal> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<BigDecimal> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARK not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressIsNull() {
            addCriterion("LITERTURE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressIsNotNull() {
            addCriterion("LITERTURE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressEqualTo(String value) {
            addCriterion("LITERTURE_ADDRESS =", value, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressNotEqualTo(String value) {
            addCriterion("LITERTURE_ADDRESS <>", value, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressGreaterThan(String value) {
            addCriterion("LITERTURE_ADDRESS >", value, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressGreaterThanOrEqualTo(String value) {
            addCriterion("LITERTURE_ADDRESS >=", value, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressLessThan(String value) {
            addCriterion("LITERTURE_ADDRESS <", value, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressLessThanOrEqualTo(String value) {
            addCriterion("LITERTURE_ADDRESS <=", value, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressLike(String value) {
            addCriterion("LITERTURE_ADDRESS like", value, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressNotLike(String value) {
            addCriterion("LITERTURE_ADDRESS not like", value, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressIn(List<String> values) {
            addCriterion("LITERTURE_ADDRESS in", values, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressNotIn(List<String> values) {
            addCriterion("LITERTURE_ADDRESS not in", values, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressBetween(String value1, String value2) {
            addCriterion("LITERTURE_ADDRESS between", value1, value2, "litertureAddress");
            return (Criteria) this;
        }

        public Criteria andLitertureAddressNotBetween(String value1, String value2) {
            addCriterion("LITERTURE_ADDRESS not between", value1, value2, "litertureAddress");
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