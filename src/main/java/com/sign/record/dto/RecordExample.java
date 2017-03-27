package com.sign.record.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public RecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andFixedhoursIsNull() {
            addCriterion("fixedhours is null");
            return (Criteria) this;
        }

        public Criteria andFixedhoursIsNotNull() {
            addCriterion("fixedhours is not null");
            return (Criteria) this;
        }

        public Criteria andFixedhoursEqualTo(String value) {
            addCriterion("fixedhours =", value, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursNotEqualTo(String value) {
            addCriterion("fixedhours <>", value, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursGreaterThan(String value) {
            addCriterion("fixedhours >", value, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursGreaterThanOrEqualTo(String value) {
            addCriterion("fixedhours >=", value, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursLessThan(String value) {
            addCriterion("fixedhours <", value, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursLessThanOrEqualTo(String value) {
            addCriterion("fixedhours <=", value, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursLike(String value) {
            addCriterion("fixedhours like", value, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursNotLike(String value) {
            addCriterion("fixedhours not like", value, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursIn(List<String> values) {
            addCriterion("fixedhours in", values, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursNotIn(List<String> values) {
            addCriterion("fixedhours not in", values, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursBetween(String value1, String value2) {
            addCriterion("fixedhours between", value1, value2, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andFixedhoursNotBetween(String value1, String value2) {
            addCriterion("fixedhours not between", value1, value2, "fixedhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursIsNull() {
            addCriterion("actualhours is null");
            return (Criteria) this;
        }

        public Criteria andActualhoursIsNotNull() {
            addCriterion("actualhours is not null");
            return (Criteria) this;
        }

        public Criteria andActualhoursEqualTo(String value) {
            addCriterion("actualhours =", value, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursNotEqualTo(String value) {
            addCriterion("actualhours <>", value, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursGreaterThan(String value) {
            addCriterion("actualhours >", value, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursGreaterThanOrEqualTo(String value) {
            addCriterion("actualhours >=", value, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursLessThan(String value) {
            addCriterion("actualhours <", value, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursLessThanOrEqualTo(String value) {
            addCriterion("actualhours <=", value, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursLike(String value) {
            addCriterion("actualhours like", value, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursNotLike(String value) {
            addCriterion("actualhours not like", value, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursIn(List<String> values) {
            addCriterion("actualhours in", values, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursNotIn(List<String> values) {
            addCriterion("actualhours not in", values, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursBetween(String value1, String value2) {
            addCriterion("actualhours between", value1, value2, "actualhours");
            return (Criteria) this;
        }

        public Criteria andActualhoursNotBetween(String value1, String value2) {
            addCriterion("actualhours not between", value1, value2, "actualhours");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hours_record
     *
     * @mbggenerated do_not_delete_during_merge Tue Feb 28 14:40:52 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_hours_record
     *
     * @mbggenerated Tue Feb 28 14:40:52 CST 2017
     */
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