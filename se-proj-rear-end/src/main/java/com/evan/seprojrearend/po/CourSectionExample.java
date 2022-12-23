package com.evan.seprojrearend.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CourSectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourSectionExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("COURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("COURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(BigDecimal value) {
            addCriterion("COURSE_ID >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(BigDecimal value) {
            addCriterion("COURSE_ID <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<BigDecimal> values) {
            addCriterion("COURSE_ID in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<BigDecimal> values) {
            addCriterion("COURSE_ID not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COURSE_ID between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COURSE_ID not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andSectionTimeIsNull() {
            addCriterion("SECTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSectionTimeIsNotNull() {
            addCriterion("SECTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSectionTimeEqualTo(String value) {
            addCriterion("SECTION_TIME =", value, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeNotEqualTo(String value) {
            addCriterion("SECTION_TIME <>", value, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeGreaterThan(String value) {
            addCriterion("SECTION_TIME >", value, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SECTION_TIME >=", value, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeLessThan(String value) {
            addCriterion("SECTION_TIME <", value, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeLessThanOrEqualTo(String value) {
            addCriterion("SECTION_TIME <=", value, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeLike(String value) {
            addCriterion("SECTION_TIME like", value, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeNotLike(String value) {
            addCriterion("SECTION_TIME not like", value, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeIn(List<String> values) {
            addCriterion("SECTION_TIME in", values, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeNotIn(List<String> values) {
            addCriterion("SECTION_TIME not in", values, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeBetween(String value1, String value2) {
            addCriterion("SECTION_TIME between", value1, value2, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andSectionTimeNotBetween(String value1, String value2) {
            addCriterion("SECTION_TIME not between", value1, value2, "sectionTime");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIsNull() {
            addCriterion("IS_COMPLETE is null");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIsNotNull() {
            addCriterion("IS_COMPLETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsCompleteEqualTo(BigDecimal value) {
            addCriterion("IS_COMPLETE =", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotEqualTo(BigDecimal value) {
            addCriterion("IS_COMPLETE <>", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteGreaterThan(BigDecimal value) {
            addCriterion("IS_COMPLETE >", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_COMPLETE >=", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteLessThan(BigDecimal value) {
            addCriterion("IS_COMPLETE <", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_COMPLETE <=", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIn(List<BigDecimal> values) {
            addCriterion("IS_COMPLETE in", values, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotIn(List<BigDecimal> values) {
            addCriterion("IS_COMPLETE not in", values, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_COMPLETE between", value1, value2, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_COMPLETE not between", value1, value2, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(BigDecimal value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(BigDecimal value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(BigDecimal value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(BigDecimal value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<BigDecimal> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<BigDecimal> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
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