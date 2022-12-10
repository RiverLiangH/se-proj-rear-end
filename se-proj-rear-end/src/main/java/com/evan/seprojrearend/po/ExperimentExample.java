package com.evan.seprojrearend.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExperimentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperimentExample() {
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

        public Criteria andExperimentNameIsNull() {
            addCriterion("EXPERIMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExperimentNameIsNotNull() {
            addCriterion("EXPERIMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExperimentNameEqualTo(String value) {
            addCriterion("EXPERIMENT_NAME =", value, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameNotEqualTo(String value) {
            addCriterion("EXPERIMENT_NAME <>", value, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameGreaterThan(String value) {
            addCriterion("EXPERIMENT_NAME >", value, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXPERIMENT_NAME >=", value, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameLessThan(String value) {
            addCriterion("EXPERIMENT_NAME <", value, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameLessThanOrEqualTo(String value) {
            addCriterion("EXPERIMENT_NAME <=", value, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameLike(String value) {
            addCriterion("EXPERIMENT_NAME like", value, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameNotLike(String value) {
            addCriterion("EXPERIMENT_NAME not like", value, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameIn(List<String> values) {
            addCriterion("EXPERIMENT_NAME in", values, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameNotIn(List<String> values) {
            addCriterion("EXPERIMENT_NAME not in", values, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameBetween(String value1, String value2) {
            addCriterion("EXPERIMENT_NAME between", value1, value2, "experimentName");
            return (Criteria) this;
        }

        public Criteria andExperimentNameNotBetween(String value1, String value2) {
            addCriterion("EXPERIMENT_NAME not between", value1, value2, "experimentName");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNull() {
            addCriterion("SECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("SECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(BigDecimal value) {
            addCriterion("SECTION_ID =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(BigDecimal value) {
            addCriterion("SECTION_ID <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(BigDecimal value) {
            addCriterion("SECTION_ID >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SECTION_ID >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(BigDecimal value) {
            addCriterion("SECTION_ID <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SECTION_ID <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<BigDecimal> values) {
            addCriterion("SECTION_ID in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<BigDecimal> values) {
            addCriterion("SECTION_ID not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECTION_ID between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECTION_ID not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(BigDecimal value) {
            addCriterion("TEACHER_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(BigDecimal value) {
            addCriterion("TEACHER_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(BigDecimal value) {
            addCriterion("TEACHER_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEACHER_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(BigDecimal value) {
            addCriterion("TEACHER_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEACHER_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<BigDecimal> values) {
            addCriterion("TEACHER_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<BigDecimal> values) {
            addCriterion("TEACHER_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEACHER_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEACHER_ID not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(BigDecimal value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(BigDecimal value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(BigDecimal value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(BigDecimal value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<BigDecimal> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<BigDecimal> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
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