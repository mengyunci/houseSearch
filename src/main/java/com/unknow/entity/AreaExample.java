package com.unknow.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andAreaSerialIsNull() {
            addCriterion("area_serial is null");
            return (Criteria) this;
        }

        public Criteria andAreaSerialIsNotNull() {
            addCriterion("area_serial is not null");
            return (Criteria) this;
        }

        public Criteria andAreaSerialEqualTo(String value) {
            addCriterion("area_serial =", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialNotEqualTo(String value) {
            addCriterion("area_serial <>", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialGreaterThan(String value) {
            addCriterion("area_serial >", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialGreaterThanOrEqualTo(String value) {
            addCriterion("area_serial >=", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialLessThan(String value) {
            addCriterion("area_serial <", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialLessThanOrEqualTo(String value) {
            addCriterion("area_serial <=", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialLike(String value) {
            addCriterion("area_serial like", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialNotLike(String value) {
            addCriterion("area_serial not like", value, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialIn(List<String> values) {
            addCriterion("area_serial in", values, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialNotIn(List<String> values) {
            addCriterion("area_serial not in", values, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialBetween(String value1, String value2) {
            addCriterion("area_serial between", value1, value2, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaSerialNotBetween(String value1, String value2) {
            addCriterion("area_serial not between", value1, value2, "areaSerial");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaMemoIsNull() {
            addCriterion("area_memo is null");
            return (Criteria) this;
        }

        public Criteria andAreaMemoIsNotNull() {
            addCriterion("area_memo is not null");
            return (Criteria) this;
        }

        public Criteria andAreaMemoEqualTo(String value) {
            addCriterion("area_memo =", value, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoNotEqualTo(String value) {
            addCriterion("area_memo <>", value, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoGreaterThan(String value) {
            addCriterion("area_memo >", value, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoGreaterThanOrEqualTo(String value) {
            addCriterion("area_memo >=", value, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoLessThan(String value) {
            addCriterion("area_memo <", value, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoLessThanOrEqualTo(String value) {
            addCriterion("area_memo <=", value, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoLike(String value) {
            addCriterion("area_memo like", value, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoNotLike(String value) {
            addCriterion("area_memo not like", value, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoIn(List<String> values) {
            addCriterion("area_memo in", values, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoNotIn(List<String> values) {
            addCriterion("area_memo not in", values, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoBetween(String value1, String value2) {
            addCriterion("area_memo between", value1, value2, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andAreaMemoNotBetween(String value1, String value2) {
            addCriterion("area_memo not between", value1, value2, "areaMemo");
            return (Criteria) this;
        }

        public Criteria andBuildingCountIsNull() {
            addCriterion("building_count is null");
            return (Criteria) this;
        }

        public Criteria andBuildingCountIsNotNull() {
            addCriterion("building_count is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingCountEqualTo(Integer value) {
            addCriterion("building_count =", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountNotEqualTo(Integer value) {
            addCriterion("building_count <>", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountGreaterThan(Integer value) {
            addCriterion("building_count >", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_count >=", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountLessThan(Integer value) {
            addCriterion("building_count <", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountLessThanOrEqualTo(Integer value) {
            addCriterion("building_count <=", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountIn(List<Integer> values) {
            addCriterion("building_count in", values, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountNotIn(List<Integer> values) {
            addCriterion("building_count not in", values, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountBetween(Integer value1, Integer value2) {
            addCriterion("building_count between", value1, value2, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("building_count not between", value1, value2, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountIsNull() {
            addCriterion("house_count is null");
            return (Criteria) this;
        }

        public Criteria andHouseCountIsNotNull() {
            addCriterion("house_count is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCountEqualTo(Long value) {
            addCriterion("house_count =", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountNotEqualTo(Long value) {
            addCriterion("house_count <>", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountGreaterThan(Long value) {
            addCriterion("house_count >", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountGreaterThanOrEqualTo(Long value) {
            addCriterion("house_count >=", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountLessThan(Long value) {
            addCriterion("house_count <", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountLessThanOrEqualTo(Long value) {
            addCriterion("house_count <=", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountIn(List<Long> values) {
            addCriterion("house_count in", values, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountNotIn(List<Long> values) {
            addCriterion("house_count not in", values, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountBetween(Long value1, Long value2) {
            addCriterion("house_count between", value1, value2, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountNotBetween(Long value1, Long value2) {
            addCriterion("house_count not between", value1, value2, "houseCount");
            return (Criteria) this;
        }

        public Criteria andJzmjIsNull() {
            addCriterion("jzmj is null");
            return (Criteria) this;
        }

        public Criteria andJzmjIsNotNull() {
            addCriterion("jzmj is not null");
            return (Criteria) this;
        }

        public Criteria andJzmjEqualTo(BigDecimal value) {
            addCriterion("jzmj =", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotEqualTo(BigDecimal value) {
            addCriterion("jzmj <>", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThan(BigDecimal value) {
            addCriterion("jzmj >", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jzmj >=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThan(BigDecimal value) {
            addCriterion("jzmj <", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jzmj <=", value, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjIn(List<BigDecimal> values) {
            addCriterion("jzmj in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotIn(List<BigDecimal> values) {
            addCriterion("jzmj not in", values, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jzmj between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andJzmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jzmj not between", value1, value2, "jzmj");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeIsNull() {
            addCriterion("area_zhcode is null");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeIsNotNull() {
            addCriterion("area_zhcode is not null");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeEqualTo(String value) {
            addCriterion("area_zhcode =", value, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeNotEqualTo(String value) {
            addCriterion("area_zhcode <>", value, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeGreaterThan(String value) {
            addCriterion("area_zhcode >", value, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_zhcode >=", value, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeLessThan(String value) {
            addCriterion("area_zhcode <", value, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeLessThanOrEqualTo(String value) {
            addCriterion("area_zhcode <=", value, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeLike(String value) {
            addCriterion("area_zhcode like", value, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeNotLike(String value) {
            addCriterion("area_zhcode not like", value, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeIn(List<String> values) {
            addCriterion("area_zhcode in", values, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeNotIn(List<String> values) {
            addCriterion("area_zhcode not in", values, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeBetween(String value1, String value2) {
            addCriterion("area_zhcode between", value1, value2, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaZhcodeNotBetween(String value1, String value2) {
            addCriterion("area_zhcode not between", value1, value2, "areaZhcode");
            return (Criteria) this;
        }

        public Criteria andAreaOldIsNull() {
            addCriterion("area_old is null");
            return (Criteria) this;
        }

        public Criteria andAreaOldIsNotNull() {
            addCriterion("area_old is not null");
            return (Criteria) this;
        }

        public Criteria andAreaOldEqualTo(String value) {
            addCriterion("area_old =", value, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldNotEqualTo(String value) {
            addCriterion("area_old <>", value, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldGreaterThan(String value) {
            addCriterion("area_old >", value, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldGreaterThanOrEqualTo(String value) {
            addCriterion("area_old >=", value, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldLessThan(String value) {
            addCriterion("area_old <", value, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldLessThanOrEqualTo(String value) {
            addCriterion("area_old <=", value, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldLike(String value) {
            addCriterion("area_old like", value, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldNotLike(String value) {
            addCriterion("area_old not like", value, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldIn(List<String> values) {
            addCriterion("area_old in", values, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldNotIn(List<String> values) {
            addCriterion("area_old not in", values, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldBetween(String value1, String value2) {
            addCriterion("area_old between", value1, value2, "areaOld");
            return (Criteria) this;
        }

        public Criteria andAreaOldNotBetween(String value1, String value2) {
            addCriterion("area_old not between", value1, value2, "areaOld");
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